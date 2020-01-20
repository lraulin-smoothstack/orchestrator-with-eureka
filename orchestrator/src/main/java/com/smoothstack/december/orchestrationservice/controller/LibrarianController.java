package com.smoothstack.december.orchestrationservice.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.smoothstack.december.orchestrationservice.entity.LibraryBranch;
import com.smoothstack.december.orchestrationservice.entity.Book;
import com.smoothstack.december.orchestrationservice.entity.BookCopy;

@RestController
@RequestMapping("/lms/librarian")
public class LibrarianController {
    
    @Autowired
    private RestTemplate restTemplate;
    
    private static final String baseUrl = "http://localhost:8081/lms/librarian";
    
    @PutMapping("/bookCopies")
    public void updateBookCopy(@RequestBody BookCopy bookCopy) {
        this.restTemplate.put(baseUrl + "/bookCopies", bookCopy);
    }
    
    @PostMapping("/bookCopies")
    public Map<String, Object> addBookCopy(@RequestBody BookCopy bookCopy) {
        return this.restTemplate.postForObject(baseUrl + "/bookCopies", bookCopy, Map.class);
    }
    
    @PutMapping("/branches")
    public void updateLibraryBranch(@RequestBody LibraryBranch branch) {
        this.restTemplate.put(baseUrl + "/branches", branch);
    }
    
    @GetMapping("/books")
    public ResponseEntity<Book[]> getBooks() {
        return this.restTemplate.getForEntity("http://localhost:8081/lms/librarian/books", Book[].class);
    }
    
    @GetMapping("/branches")
    public ResponseEntity<LibraryBranch[]> getLibraryBranches() {
        return this.restTemplate.getForEntity(baseUrl + "/branches", LibraryBranch[].class);
    }
    
    @GetMapping("/bookCopies/{branchId}")
    public ResponseEntity<BookCopy[]> getBookCopies(@PathVariable int branchId) {
        return this.restTemplate.getForEntity(baseUrl + "/bookCopies/" + branchId, BookCopy[].class);
    }
}
