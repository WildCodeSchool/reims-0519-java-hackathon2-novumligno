package fr.novumligno.novumligno.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import fr.novumligno.novumligno.entities.Company;
import fr.novumligno.novumligno.repositories.CompanyRepository;;

@Component
public class CollaboratorOutputter implements CommandLineRunner {

    @Autowired
    private Repository Repository;

    @Override
    public void run(String... args) throws Exception {


        Repository.deleteAll();


        String[][] data = new String[][]{
            {