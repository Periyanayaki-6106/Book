package com.example.book.Service;

import java.util.List;

import com.example.book.Entity.Book;



public interface BookService {
	List<Book> getAllBooks();
	Book getStudentById(Long id);
	Book createStudent(Book book);

}
