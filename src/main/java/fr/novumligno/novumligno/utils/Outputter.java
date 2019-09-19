package fr.novumligno.novumligno.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import fr.novumligno.novumligno.entities.Company;
import fr.novumligno.novumligno.repositories.CompanyRepository;;

@Component
public class Outputter implements CommandLineRunner {

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public void run(String... args) throws Exception {


        String[][] data = new String[][]{
            {
                "TerraSolis",
                "https://png.pngtree.com/png-clipart/20190515/original/pngtree-coffee-time-png-image_3626459.jpg",
                "Association de promotion de la multifonctionnalité via l'émergence d'innovations agricoles en Grand Est",
                "Complexe agricole du Mont Bernard, Route de Suippes, 51000 Châlons-en-Champagne",
                "http://terrasolis.fr/"
            },
            {   
                "Chambre d'agriculture de la marne",
                "https://png.pngtree.com/png-clipart/20190515/original/pngtree-coffee-time-png-image_3626459.jpg", "Organisation consulaire de représentation des agriculteurs portant des actions de développement / Marne",
                "Complexe agricole du Mont Bernard, Route de Suippes, 51000 Châlons-en-Champagne",
                "https://marne.chambre-agriculture.fr/"
            },
            {
                "Soufflet",
                "https://png.pngtree.com/png-clipart/20190515/original/pngtree-coffee-time-png-image_3626459.jpg", "Organisation consulaire de représentation des agriculteurs portant des actions de développement / Marne",
                "Organisation consulaire de représentation des agriculteurs portant des actions de développement / Marne",
                "https://www.soufflet.com"
            },

        };
        for(String[] companyData : data) {
            Company company = new Company(companyData[0], companyData[1], companyData[2], companyData[3], companyData[4]);
            companyRepository.save(company);
        }
    }    
}