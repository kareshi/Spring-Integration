package crm.integration.gateways;

import crm.model.Lead;
import org.springframework.integration.annotation.Gateway;

public interface LeadGateway {

    @Gateway(requestChannel = "newLeadChannel")
    void createLead(Lead lead);

}
