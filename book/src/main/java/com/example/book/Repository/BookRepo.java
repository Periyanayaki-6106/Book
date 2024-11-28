package com.example.book.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.book.Entity.Book;



public interface BookRepo extends JpaRepository<Book, Long>{

}
