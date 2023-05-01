package com.aurosoft.librarymanagementsystem.entity;


import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="books")
public class Book {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name="id",nullable = false)
    private Long id;


    //@Column(name = "name", nullable = false,length = 45)
    private String name;


   // @Column(name = "description", nullable = false, length = 64)
    private String description;


    //@Column(name="price",nullable = false)
    private double price;
}
