package nl.quintor.studybits.repository;

import nl.quintor.studybits.entity.University;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UniversityRepository extends JpaRepository<University, Long> {

    @Query(value = "SELECT * FROM University WHERE UNIVERSITY_NAME = ?1 ", nativeQuery = true)
    University findByName(String universityName);
}
