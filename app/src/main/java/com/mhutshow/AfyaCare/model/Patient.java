package com.mhutshow.AfyaCare.model;

public class Patient {
    private String name;
    private String address;
    private String tel;
    private String email;
    private String date_of_birth;
    private String familySituation;


    public Patient(){
        //needed for firebase
    }

    public Patient(String name, String address, String tel, String email, String date_of_birth, String familySituation) {
        this.name = name;
        this.address = address;
        this.tel = tel;
        this.email = email;
        this.date_of_birth = date_of_birth;
        this.familySituation = familySituation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getFamilySituation() {
        return familySituation;
    }

    public void setFamilySituation(String familySituation) {
        this.familySituation = familySituation;
    }
}
