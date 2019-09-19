package fr.novumligno.novumligno.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import fr.novumligno.novumligno.entities.Company;
import fr.novumligno.novumligno.repositories.CompanyRepository;;

@Component
public class Outputter implements CommandLineRunner {

    private Logger LOG = LoggerFactory.getLogger("Wilder");

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public void run(String... args) throws Exception {

        // Checke combien d'objets se trouvent dans la BDD        
        LOG.info("******************");
        LOG.info("Objects in DB : " + companyRepository.count());

        // Crée un nouvel utilisateur et l'enregistre dans la BDD
        Company Company1 = new Company("TerraSolis", "Wildeuse", 19);
        LOG.info("******************");
        LOG.info(Company1 + " has been created !");
        companyRepository.save(Company1);
        LOG.info(Company1 + " has been saved !");
    }    
}