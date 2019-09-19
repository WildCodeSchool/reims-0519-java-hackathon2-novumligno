package fr.novumligno.novumligno.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fr.novumligno.novumligno.entities.Company;
import fr.novumligno.novumligno.repositories.CompanyRepository;

@Controller
class CompanyController {

@Autowired
private CompanyRepository companyRepository;

@GetMapping("/companies")
public String company(Model model) {
    List<Company> companies = companyRepository.findAll();
    model.addAttribute("companies", companies);
    return "companies";
}









}