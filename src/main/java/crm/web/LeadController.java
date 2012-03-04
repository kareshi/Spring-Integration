package crm.web;

import java.util.Date;

import crm.integration.gateways.LeadGateway;
import crm.model.Country;
import crm.model.Lead;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LeadController {

    @Autowired
    private LeadGateway leadGateway;

    @RequestMapping(value = "/lead/form.html", method = RequestMethod.GET)
    public void getForm(Model model) {
        model.addAttribute(Country.getCountries());
        model.addAttribute(new Lead());
    }

    @RequestMapping(value = "/lead/form.html", method = RequestMethod.POST)
    public String postForm(Lead lead) {
        lead.setDateCreated(new Date());
        leadGateway.createLead(lead);
        return "redirect:form.html?created=true";
    }
}

