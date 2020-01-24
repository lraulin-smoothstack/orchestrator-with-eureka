package com.smoothstack.december.orchestrationservice.controller;

import com.smoothstack.december.orchestrationservice.entity.Book;
import com.smoothstack.december.orchestrationservice.entity.BookLoan;
import com.smoothstack.december.orchestrationservice.entity.LibraryBranch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("v1/lms/borrower")
public class BorrowerController {

    @Autowired
    RestTemplate restTemplate;

    private static final String baseUrl = "http://localhost:8085/lms/librarian";
    private static final String checkOutUrl = "/borrowers/{borrowerId}/branches/{branchId}/books/{bookId}:checkout";
    private static final String checkInUrl = "/borrowers/{borrowerId}/branches/{branchId}/books/{bookId}:checkin";
    private static final String libraryBranchesUrl = "/branches";
    private static final String availableBooksNotCheckedOutUrl = "/borrowers/{borrowerId}/branches/{branchId}/available-books/";
    private static final String bookLoansUrl = "/branches/{branchId}/borrowers/{borrowerId}";

    private static String fullUrl(String s) {
        return baseUrl + s;
    }

    @PostMapping(checkOutUrl)
    void checkOutBook(@PathVariable("bookId") long bookId, @PathVariable("branchId") long branchId,
            @PathVariable("borrowerId") long borrowerId) {
        BookLoan.BookLoanId id = new BookLoan.BookLoanId(bookId, borrowerId, branchId);
        restTemplate.postForObject(fullUrl(checkOutUrl), id, BookLoan.BookLoanId.class);
    }

    @PostMapping(checkInUrl)
    void checkInBook(@PathVariable("bookId") long bookId, @PathVariable("branchId") long branchId,
            @PathVariable("borrowerId") long borrowerId) {
        BookLoan.BookLoanId id = new BookLoan.BookLoanId(bookId, borrowerId, branchId);
        restTemplate.postForObject(fullUrl(checkInUrl), id, BookLoan.BookLoanId.class);
    }

    @GetMapping(libraryBranchesUrl)
    public LibraryBranch[] getLibraryBranches() {
        ResponseEntity<LibraryBranch[]> responseEntity = restTemplate.getForEntity(fullUrl(libraryBranchesUrl),
                LibraryBranch[].class);
        return responseEntity.getBody();
    }

    @GetMapping(availableBooksNotCheckedOutUrl)
    public Book[] getAvailableBooksNotCheckedOut(@PathVariable("branchId") long branchId,
            @PathVariable("borrowerId") long borrowerId) {
        ResponseEntity<Book[]> responseEntity = restTemplate.getForEntity(fullUrl(availableBooksNotCheckedOutUrl), Book[].class);
        return responseEntity.getBody();
    }

    @GetMapping(bookLoansUrl)
    public BookLoan[] getBookLoans(@PathVariable("branchId") long branchId,
            @PathVariable("borrowerId") long borrowerId) {
        ResponseEntity<BookLoan[]> responseEntity = restTemplate.getForEntity(fullUrl(bookLoansUrl),
                BookLoan[].class);
        return responseEntity.getBody();
    }
}
