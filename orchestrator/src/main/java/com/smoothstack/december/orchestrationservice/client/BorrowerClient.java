package com.smoothstack.december.orchestrationservice.client;

import java.util.List;

import com.smoothstack.december.orchestrationservice.entity.Book;
import com.smoothstack.december.orchestrationservice.entity.BookLoan;
import com.smoothstack.december.orchestrationservice.entity.LibraryBranch;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "borrower", url = "http://localhost:8085")
public interface BorrowerClient {

        @PostMapping("/checkout")
        void checkOutBook(@RequestParam("bookId") long bookId, @RequestParam("branchId") long branchId,
                        @RequestParam("borrowerId") long borrowerId);

        @PostMapping("/checkin")
        void checkInBook(@RequestParam("bookId") long bookId, @RequestParam("branchId") long branchId,
                        @RequestParam("borrowerId") long borrowerId);

        @GetMapping("/library-branches")
        public List<LibraryBranch> getLibraryBranches();

        @GetMapping("/branch-{:branchId}")
        public List<Book> getAvailableBooksNotCheckedOut(@PathVariable("branchId") long branchId,
                        @RequestParam("borrowerId") long borrowerId);

        @GetMapping("/branch-{:branchId}/borrower-{:borrowerId}")
        public List<BookLoan> getBookLoans(@PathVariable("branchId") long branchId,
                        @PathVariable("borrowerId") long borrowerId);
}
