package org.choongang.file.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Test11 {

    @Id
    @GeneratedValue
    private Long s;
    @Column
    private String test;
}
