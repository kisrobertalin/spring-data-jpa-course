package com.example.demo.entity;

import com.example.demo.entity.Profesor;

import javax.persistence.*;


@Entity (name = "Student")
@Table(
        name = "Student",
        uniqueConstraints = {
                @UniqueConstraint(name = "student_email_unique", columnNames = "email")}
)

public class Student{
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue (
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    @Column (
            name ="student_id",
            updatable = false
    )
    private Long id;
    @Column (
            name = "first_name",
            nullable = false,
            columnDefinition = "Text"
    )
    private String firstName;
    @Column (
            name = "last_name",
            nullable = false,
            columnDefinition = "Text"
    )
    private String lastName;
    @Column (
            name = "email",
            nullable = false,
            columnDefinition = "Text"

    )
    private String email;
    @Column (
            name = "age",
            nullable = false
    )
    private Integer age;
    @ManyToOne ()
    @JoinColumn (
            name = "prof_id"
    )
    private Profesor profesor;


    public Student(
                   String firstName,
                   String lastName,
                   String email,
                   Integer age
                 ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;


    }

    public Student() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
