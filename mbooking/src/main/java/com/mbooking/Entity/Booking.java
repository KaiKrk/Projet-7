package com.mbooking.Entity;

import org.apache.tomcat.jni.Local;
import org.springframework.boot.actuate.autoconfigure.endpoint.condition.ConditionalOnAvailableEndpoint;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "booking")
public class Booking {

    @Id
    @GeneratedValue
    @Column(name = "booking_id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "member_id", referencedColumnName = "member_id")
    private Member membre;

    @ManyToOne
    @JoinColumn(name = "book_id", referencedColumnName = "book_id")
    private Book book;

    @Column(name = "borrowing_date")
    private LocalDate borrowing_date;

    @Column(name = "return_date")
    private LocalDate return_date;

    @Column(name = "renewable")
    private Boolean renewable;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Member getMembre() {
        return membre;
    }

    public void setMembre(Member membre) {
        this.membre = membre;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LocalDate getBorrowing_date() {
        return borrowing_date;
    }

    public void setBorrowing_date(LocalDate borrowing_date) {
        this.borrowing_date = borrowing_date;
    }

    public LocalDate getReturn_date() {
        return return_date;
    }

    public void setReturn_date(LocalDate return_date) {
        this.return_date = return_date;
    }

    public Boolean getRenewable() {
        return renewable;
    }

    public void setRenewable(Boolean renewable) {
        this.renewable = renewable;
    }

    public Booking() {
    }

    public Booking(Member membre, Book book, LocalDate borrowing_date, LocalDate return_date, Boolean renewable) {
        this.membre = membre;
        this.book = book;
        this.borrowing_date = borrowing_date;
        this.return_date = return_date;
        this.renewable = renewable;
    }
}
