package fr.novumligno.novumligno.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.novumligno.novumligno.entities.Collaborator;

@Repository
public interface CollaboratorRepository extends JpaRepository<Collaborator, Long> {
}