package com.example.book.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String type;

    // Constructors, getters, and setters
    // (Getters and setters omitted for brevity)

    public Book() {
    }

    public Book(String name, String type) {
        this.name = name;
        this.type = type;
    }

}
