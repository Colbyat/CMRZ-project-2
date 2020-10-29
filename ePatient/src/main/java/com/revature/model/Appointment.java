package com.revature.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity

@Table(name = "appointment")
public class Appointment {

    @Id
    @Column(name = "appointmentid")
    private int id;

    @ManyToOne
    @JoinColumn(name = "patientid")
    private Person patient;

    @ManyToOne
    @JoinColumn(name = "doctorid")
    private Person doctor;

    @Column(name = "date")
    private Date date;

    @Column(name = "status")
    private String status;

    @Column(name = "comment")
    private String comment;

    public Appointment(int id, Person patient, Person doctor, Date date, String comment, String status) {
        this.id = id;
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
        this.comment = comment;
        this.status = status;
    }

    public Appointment(Person patient, Person doctor, Date date, String comment){
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
        this.comment = comment;
        this.status = "pending";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person getPatient() {
        return patient;
    }

    public void setPatient(Person patient) {
        this.patient = patient;
    }

    public Person getDoctor() {
        return doctor;
    }

    public void setDoctor(Person doctor) {
        this.doctor = doctor;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Appointment [comment=" + comment + ", date=" + date + ", doctor=" + doctor + ", id=" + id + ", patient="
                + patient + ", status=" + status + "]";
    }

}
