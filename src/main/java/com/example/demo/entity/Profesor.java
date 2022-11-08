package com.example.demo.entity;


import javax.persistence.*;
import java.util.Set;

@Entity(name = "profesor")
@Table (name = "Profesor")
public class Profesor {
    public Profesor() {
    }

    @Id
    @SequenceGenerator(
            name = "profesor_sequence",
            sequenceName = "profesor_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
          strategy = GenerationType.SEQUENCE,
            generator = "profesor_sequence"

    )
    @Column(
            name = "prof_id",
            updatable = false
    )

    private Long prof_id;
    private String prof_name;
    private String prof_lastname;
    private String discipline;
    private String years_experience;
    @OneToMany(mappedBy = "profesor")
    private Set<Student> student;

    public Profesor(String prof_name, String prof_lastname, String discipline, String years_experience) {
        this.prof_name = prof_name;
        this.prof_lastname =prof_lastname;
        this.discipline = discipline;
        this.years_experience = years_experience;
    }

    public Long getProf_id() {
        return prof_id;
    }

    public void setProf_id(Long prof_id) {
        this.prof_id = prof_id;
    }

    public String getProf_name() {
        return prof_name;
    }

    public void setProf_name(String prof_name) {
        this.prof_name = prof_name;
    }
    public void setProf_lastname(String prof_lastname){
        this.prof_lastname = prof_lastname;
    }
    public String getProf_lastname (String prof_lastname){
        return prof_lastname;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public String getYears_experience() {
        return years_experience;
    }

    public void setYears_experience(String years_experience) {
        this.years_experience = years_experience;
    }



    @Override
    public String toString() {
        return "Profesor{" +
                "prof_id=" + prof_id +
                ", prof_name='" + prof_name + '\'' +
                ", discipline='" + discipline + '\'' +
                ", years_experience='" + years_experience + '\'' +
                '}';
    }
}
