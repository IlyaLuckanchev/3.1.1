package Practice311.SpringBoot311.repository;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "users")
@Component
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String surName;

    public User(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }


    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
}
