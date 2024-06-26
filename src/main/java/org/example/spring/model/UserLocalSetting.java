package org.example.spring.model;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.*;


@Entity
public class UserLocalSetting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Assuming you want an autogenerated ID for the entity

    private String employeeId;
    private String name;
    private String currentTimee;
    private String formattedBirthDate;
    private String formattedDeathDate;
    private String startHours;
    private String startMinute;
    private String endHours;
    private String endMinute;
    private String totalHours;
    private String designation;

    // New column
    private String status;// New column


    // Default constructor
    public UserLocalSetting() {
    }

    // Parameterized constructor
    public UserLocalSetting(String employeeId, String name, String currentTime,
                            String formattedBirthDate, String formattedDeathDate,
                            String startHours, String startMinute, String endHours,
                            String endMinute, String totalHours, String designation, String status) {
        this.employeeId = employeeId;
        this.name = name;
        this.currentTimee = currentTime;
        this.formattedBirthDate = formattedBirthDate;
        this.formattedDeathDate = formattedDeathDate;
        this.startHours = startHours;
        this.startMinute = startMinute;
        this.endHours = endHours;
        this.endMinute = endMinute;
        this.totalHours = totalHours;
        this.designation = designation;
        this.status = status;

    }

    // Getter and setter methods for each field
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrentTime() {
        return currentTimee;
    }

    public void setCurrentTime(String currentTime) {
        this.currentTimee = currentTime;
    }

    public String getFormattedBirthDate() {
        return formattedBirthDate;
    }

    public void setFormattedBirthDate(String formattedBirthDate) {
        this.formattedBirthDate = formattedBirthDate;
    }

    public String getFormattedDeathDate() {
        return formattedDeathDate;
    }

    public void setFormattedDeathDate(String formattedDeathDate) {
        this.formattedDeathDate = formattedDeathDate;
    }

    public String getStartHours() {
        return startHours;
    }

    public void setStartHours(String startHours) {
        this.startHours = startHours;
    }

    public String getStartMinute() {
        return startMinute;
    }

    public void setStartMinute(String startMinute) {
        this.startMinute = startMinute;
    }

    public String getEndHours() {
        return endHours;
    }

    public void setEndHours(String endHours) {
        this.endHours = endHours;
    }

    public String getEndMinute() {
        return endMinute;
    }

    public void setEndMinute(String endMinute) {
        this.endMinute = endMinute;
    }

    public String getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(String totalHours) {
        this.totalHours = totalHours;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    // Override equals and hashCode methods if needed
    // ...

    // Override toString method for better string representation
    @Override
    public String toString() {
        return "UserLocalSetting{" +
                "employeeId='" + employeeId + '\'' +
                ", name='" + name + '\'' +
                ", currentTime='" + currentTimee + '\'' +
                ", formattedBirthDate='" + formattedBirthDate + '\'' +
                ", formattedDeathDate='" + formattedDeathDate + '\'' +
                ", startHours='" + startHours + '\'' +
                ", startMinute='" + startMinute + '\'' +
                ", endHours='" + endHours + '\'' +
                ", endMinute='" + endMinute + '\'' +
                ", totalHours='" + totalHours + '\'' +
                ", designation='" + designation + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
