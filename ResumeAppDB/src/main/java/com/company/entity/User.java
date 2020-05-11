package com.company.entity;

import java.sql.Date;
import java.util.List;

public class User {
    private int id;
    private String name;
    private String surname;
    private String phone;
    private String email;
    private String profileDescription;
    private String password;
    private String address;
    private Date birthDate;
    private Country nationality;
    private Country birthPlace;
    private List<UserSkill> skills;
    
    public User(int id) {
        this.id = id;
    }
    
    public User(int id, String name, String surname, String phone, String email, String profileDescription, String address, Date birthDate, Country nationality, Country birthPlace) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
        this.profileDescription = profileDescription;
        this.address = address;
        this.birthDate = birthDate;
        this.nationality = nationality;
        this.birthPlace = birthPlace;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getSurname() {
        return surname;
    }
    
    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public Date getBirthDate() {
        return birthDate;
    }
    
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    
    public Country getNationality() {
        return nationality;
    }
    
    public void setNationality(Country nationality) {
        this.nationality = nationality;
    }
    
    public Country getBirthPlace() {
        return birthPlace;
    }
    
    public void setBirthPlace(Country birthPlace) {
        this.birthPlace = birthPlace;
    }
    
    public List<UserSkill> getSkills() {
        return skills;
    }
    
    public void setSkills(List<UserSkill> skills) {
        this.skills = skills;
    }
    
    public String getProfileDescription() {
        return profileDescription;
    }
    
    public void setProfileDescription(String profileDescription) {
        this.profileDescription = profileDescription;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", birthDate=" + birthDate +
                ", nationality=" + nationality +
                ", birthPlace=" + birthPlace +
                '}';
    }
}
