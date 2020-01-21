package com.smoothstack.december.orchestrationservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.smoothstack.december.orchestrationservice.entity.Author;
import com.smoothstack.december.orchestrationservice.entity.Book;
import com.smoothstack.december.orchestrationservice.entity.BookCopy;
import com.smoothstack.december.orchestrationservice.entity.BookCopy.BookCopyId;
import com.smoothstack.december.orchestrationservice.entity.Genre;
import com.smoothstack.december.orchestrationservice.entity.LibraryBranch;
import com.smoothstack.december.orchestrationservice.entity.Publisher;

@RestController
@RequestMapping("/lms/librarian")
public class LibrarianController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String baseUrl = "http://localhost:8081/lms/librarian";

    @PutMapping("/bookCopies")
    public void updateBookCopy(@RequestParam Long bookId, @RequestParam Long branchId, @RequestParam Long amount) {
        BookCopy bookCopy = new BookCopy();
        bookCopy.setId(new BookCopyId(bookId, branchId));
        bookCopy.setAmount(amount);
        this.restTemplate.put(this.baseUrl + "/bookCopies", bookCopy);
    }

    @PostMapping("/bookCopies")
    public BookCopy createBookCopy(@RequestParam Long bookId, @RequestParam Long branchId, @RequestParam Long amount) {
        BookCopy bookCopy = new BookCopy();
        bookCopy.setId(new BookCopyId(bookId, branchId));
        bookCopy.setAmount(amount);
        return this.restTemplate.postForObject(baseUrl + "/bookCopies", bookCopy, BookCopy.class);
    }

    @PostMapping("/books")
    public Book createBook(@RequestParam String title, @RequestParam Long publisherId, @RequestParam Long authorId,
            @RequestParam Long genreId) {
        Publisher publisher = new Publisher();
        Book book = new Book();
        Author author = new Author();
        Genre genre = new Genre();
        publisher.setId(publisherId);
        author.setId(authorId);
        genre.setId(genreId);
        book.setPublisher(publisher);
        book.addAuthor(author);
        book.addGenre(genre);
        return this.restTemplate.postForObject(baseUrl + "/bookCopies", book, Book.class);
    }

    @PutMapping("/branches")
    public void updateLibraryBranch(@RequestParam Long branchId, @RequestParam String name,
            @RequestParam String address) {
        LibraryBranch branch = new LibraryBranch();
        branch.setId(branchId);
        branch.setName(name);
        branch.setAddress(address);
        this.restTemplate.put(baseUrl + "/branches", branch);
    }

    @GetMapping("/books")
    public Book[] getBooks() {
        return this.restTemplate.getForObject(baseUrl + "/books", Book[].class);
    }

    @GetMapping("/branches")
    public LibraryBranch[] getLibraryBranches() {
        return this.restTemplate.getForObject(baseUrl + "/branches", LibraryBranch[].class);
    }

    @GetMapping("/bookCopies/{branchId}")
    public BookCopy[] getBookCopies(@PathVariable int branchId) {
        return this.restTemplate.getForObject(baseUrl + "/bookCopies/" + branchId, BookCopy[].class);
    }

}
