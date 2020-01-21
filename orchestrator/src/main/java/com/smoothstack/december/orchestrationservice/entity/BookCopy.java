package com.smoothstack.december.orchestrationservice.entity;

import java.util.Objects;

public class BookCopy {

    public static class BookCopyId {

        private Long bookId;
        private Long branchId;

        public BookCopyId() {
        }

        public BookCopyId(Long bookId, Long branchId) {
            this.bookId = bookId;
            this.branchId = branchId;
        }

        public Long getBookId() {
            return this.bookId;
        }

        public void setBookId(Long bookId) {
            this.bookId = bookId;
        }

        public Long getBranchId() {
            return this.branchId;
        }

        public void setBranchId(Long branchId) {
            this.branchId = branchId;
        }

        @Override
        public int hashCode() {
            return Objects.hash(this.bookId, this.branchId);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BookCopyId)) {
                return false;
            }
            BookCopyId other = (BookCopyId) obj;
            return Objects.equals(this.bookId, other.bookId) && Objects.equals(this.branchId, other.branchId);
        }

    }

    private BookCopyId id;
    private Long amount;

    public BookCopyId getId() {
        return this.id;
    }

    public void setId(BookCopyId id) {
        this.id = id;
    }

    public Long getAmount() {
        return this.amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

}
