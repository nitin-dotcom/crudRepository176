package com.cjc.main.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student
{
    @Id 
    private int id;
    private String name;
    private String address;
    private String email;
    private long phone;
    
}
