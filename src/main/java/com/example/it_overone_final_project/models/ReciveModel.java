package com.example.it_overone_final_project.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "recive")
@Data
public class ReciveModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    @Column(name = "name")
    String name;
    @Column(name = "type")
    String type;
    @Column(name = "contact")
    String contact;
    @Column(name = "item_id")
    String item_id;
    @Column(name = "item_name")
    String item_name;

}

