package nl.quintor.studybits;

import nl.quintor.studybits.entity.Student;
import nl.quintor.studybits.entity.Transcript;
import nl.quintor.studybits.repository.ExchangePositionRepository;
import nl.quintor.studybits.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class Seeder {

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private ExchangePositionRepository exchangePositionRepository;

    @EventListener
    public void seed(ContextRefreshedEvent event) {
        seed();
    }

    public void seed() {
        if (isEmpty()) {
            Student student = new Student();
            student.setStudentId("12345678");
            student.setFirstName("Damian");
            student.setLastName("Veren");
            student.setPassword(bCryptPasswordEncoder.encode("test1234"));
            student.setStudentDid(null);
            student.setTranscript(new Transcript("Bachelor of Arts, Marketing", "enrolled", "8", false));
            studentRepository.saveAndFlush(student);
        }
    }


    private boolean isEmpty() {
        return studentRepository.count() == 0 && exchangePositionRepository.count() == 0;
    }
}
