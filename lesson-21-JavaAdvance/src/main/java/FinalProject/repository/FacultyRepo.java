package FinalProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import FinalProject.domain.Faculty;

@Repository
public interface FacultyRepo extends JpaRepository<Faculty, Integer> {

}
