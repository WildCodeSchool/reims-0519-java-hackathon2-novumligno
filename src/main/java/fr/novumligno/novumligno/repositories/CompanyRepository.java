package fr.novumligno.novumligno.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.novumligno.novumligno.entities.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
}