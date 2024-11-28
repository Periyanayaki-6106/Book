
package com.example.book.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.book.Entity.Book;
import com.example.book.Service.BookService;


public class BookController {
	@Autowired
    private BookService bookService;

    // Get all students
    @GetMapping
    public ResponseEntity<List<Book>> getAllbooks() {
        List<Book> books = bookService.getAllBooks();
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    // Get student by id
    @GetMapping("/{id}")
    public ResponseEntity<Book> getStudentById(@PathVariable Long id) {
        Book book = bookService.getStudentById(id);
        if (book != null) {
            return new ResponseEntity<>(book, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Create a new student
    @PostMapping
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        Book createdStudent = bookService.createStudent(book);
        return new ResponseEntity<>(createdStudent, HttpStatus.CREATED);
    }


}
