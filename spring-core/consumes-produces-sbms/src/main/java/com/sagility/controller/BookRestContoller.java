package com.sagility.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sagility.model.Book;

@RestController
@RequestMapping("/bookinfo")
public class BookRestContoller {
	Map<String, Book> bookMap = new HashMap<>();

	@GetMapping(value = "/book", produces = { "application/xml", "application/json" })
	public Book getBook() {
		Book book = new Book();
		book.setBookId("101");
		book.setBookName("Core Java");
		book.setAuthorName("Nageshwar Reddy");
		book.setPublicationName("Black Book");
		return book;

	}

	@PostMapping(value = "/saveBook", consumes = { "application/xml", "application/json" })
	public ResponseEntity<String> saveBook(@RequestBody Book book) {
		bookMap.put(book.getBookId(), book);
		return new ResponseEntity<>("Record saved successfully", HttpStatus.CREATED);
	}

}
