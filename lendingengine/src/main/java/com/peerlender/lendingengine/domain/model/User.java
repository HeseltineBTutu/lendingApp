package com.peerlender.lendingengine.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public final class User {
    @Id
    private String username;
    private  String firstName;
    private  String lastName;
    private  int age;
    private  String occupation;

}
