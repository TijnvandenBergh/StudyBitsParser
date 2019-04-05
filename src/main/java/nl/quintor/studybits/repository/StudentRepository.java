package nl.quintor.studybits.repository;

import nl.quintor.studybits.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Student getStudentByStudentId(String studentId);
    Student getStudentByStudentDid(String studentDid);
}
