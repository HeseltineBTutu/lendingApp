package com.peerLending.profile.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id

    private String username;
    private String firstName;
    private String lastName;
    private int age;
    private String occupation;
    private LocalDate registeredSince;
}
