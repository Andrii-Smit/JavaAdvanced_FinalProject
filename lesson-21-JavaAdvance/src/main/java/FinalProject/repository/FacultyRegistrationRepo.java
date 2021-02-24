package FinalProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import FinalProject.domain.FacultyRegistration;

@Repository
public interface FacultyRegistrationRepo extends JpaRepository<FacultyRegistration, Integer> {

}
