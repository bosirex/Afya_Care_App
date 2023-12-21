package com.mhutshow.AfyaCare.model;

import java.util.Date;

public class Appointment {
    private int noAppointment;
    private Date AppointmentDate;
    private Date dateAppointmentTaken;
    private String DoctorName;

    public Appointment(int noAppointment, Date AppointmentDate, Date dateAppointmentTaken, String DoctorName) {
        this.noAppointment = noAppointment;
        this.AppointmentDate = AppointmentDate;
        this.dateAppointmentTaken = dateAppointmentTaken;
        this.DoctorName = DoctorName;
    }

    public int getNoAppointment() {
        return noAppointment;
    }

    public void setNoAppointment(int noAppointment) {
        this.noAppointment = noAppointment;
    }

    public Date getAppointmentDate() {
        return AppointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.AppointmentDate = appointmentDate;
    }

    public Date getDateAppointmentTaken() {
        return dateAppointmentTaken;
    }

    public void setDateAppointmentTaken(Date dateAppointmentTaken) {
        this.dateAppointmentTaken = dateAppointmentTaken;
    }

    public String getDoctorName() {
        return DoctorName;
    }

    public void setDoctorName(String doctorName) {
        this.DoctorName = doctorName;
    }

    //View appointment status
    public void etatRDV(){
        System.out.println("The appointment "+ getNoAppointment()+" is in progress");
    }
}
