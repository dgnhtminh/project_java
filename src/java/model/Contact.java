/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author pc
 */
public class Contact {
    private int id, status;
    private String username, email, subject, message, time_sent;

    public Contact() {
    }
    
    public Contact(int id, String username, String email, String subject, String message, int status, String time_sent) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.subject = subject;
        this.message = message;
        this.status = status;
        this.time_sent = time_sent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTime_sent() {
        return time_sent;
    }

    public void setTime_sent(String time_sent) {
        this.time_sent = time_sent;
    }

    @Override
    public String toString() {
        return id + " " + status + " " + username + " " + email + " " + subject + " " + message + " " + time_sent;
    }

    
    
}
