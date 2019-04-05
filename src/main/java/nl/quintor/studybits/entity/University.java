package nl.quintor.studybits.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    private String universitySystem;

}
