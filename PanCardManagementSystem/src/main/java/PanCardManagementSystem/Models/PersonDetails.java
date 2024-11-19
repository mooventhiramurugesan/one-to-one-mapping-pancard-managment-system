package PanCardManagementSystem.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "persondetails")
public class PersonDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private int id;
    
    private String fatherName;  
    private int panNumber;      
    private long phoneNumber;   

    public PersonDetails() {
    }

    public PersonDetails(String fatherName, int panNumber, long phoneNumber) {
        this.fatherName = fatherName;
        this.panNumber = panNumber;
        this.phoneNumber = phoneNumber;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public int getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(int panNumber) {
        this.panNumber = panNumber;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
