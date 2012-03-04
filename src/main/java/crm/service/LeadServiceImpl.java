package crm.service;

import crm.model.Lead;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service("leadService")
public class LeadServiceImpl implements LeadService {

    private static Logger log = Logger.getLogger("global");

    @Override
    public void createLead(Lead lead) {
        log.info("Creating lead: " + lead);
    }

}
