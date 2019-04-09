package nl.quintor.studybits.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class University {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String universityName;

    @Column
    @Value("${studybits.systemname}")
    private String universitySystem;

}
