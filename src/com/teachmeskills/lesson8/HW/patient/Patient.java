package com.teachmeskills.lesson8.HW.patient;

import com.teachmeskills.lesson8.HW.doctor.Doctor;

public class Patient {

     private int healthPlan;
     private Doctor doctor;



     public int getHealthPlan() {

          return healthPlan;
     }

     public void setHealthPlan(int healthPlan) {

          this.healthPlan = healthPlan;
     }

     public Doctor getDoctor() {

          return doctor;
     }

     public void setDoctor(Doctor doctor) {

          this.doctor = doctor;
     }
}
