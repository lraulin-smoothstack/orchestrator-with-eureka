package com.smoothstack.december.orchestrationservice.entity;

import java.time.LocalDate;
import java.util.Objects;;

public class BookLoan {

    public static class BookLoanId {

        private Long bookId;
        private Long borrowerId;
        private Long branchId;

        public BookLoanId() {
        }

        public BookLoanId(long bookId, long borrowerId, long branchId) {
            this.bookId = bookId;
            this.borrowerId = borrowerId;
            this.branchId = branchId;
        }

        public Long getBookId() {
            return this.bookId;
        }

        public void setBookId(Long bookId) {
            this.bookId = bookId;
        }

        public Long getBorrowerId() {
            return this.borrowerId;
        }

        public void setBorrowerId(Long borrowerId) {
            this.borrowerId = borrowerId;
        }

        public Long getBranchId() {
            return this.branchId;
        }

        public void setBranchId(Long branchId) {
            this.branchId = branchId;
        }

        @Override
        public int hashCode() {
            return Objects.hash(this.bookId, this.borrowerId, this.branchId);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BookLoanId)) {
                return false;
            }
            BookLoanId other = (BookLoanId) obj;
            return Objects.equals(this.bookId, other.bookId) && Objects.equals(this.borrowerId, other.borrowerId)
                    && Objects.equals(this.branchId, other.branchId);
        }

    }

    private BookLoanId id;;
    private LocalDate dateOut;
    private LocalDate dueDate;
    private LocalDate dateIn;

    public BookLoanId getId() {
        return this.id;
    }

    public void setId(BookLoanId id) {
        this.id = id;
    }

    public LocalDate getDateOut() {
        return this.dateOut;
    }

    public void setDateOut(LocalDate dateOut) {
        this.dateOut = dateOut;
    }

    public LocalDate getDueDate() {
        return this.dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDate getDateIn() {
        return this.dateIn;
    }

    public void setDateIn(LocalDate dateIn) {
        this.dateIn = dateIn;
    }

}