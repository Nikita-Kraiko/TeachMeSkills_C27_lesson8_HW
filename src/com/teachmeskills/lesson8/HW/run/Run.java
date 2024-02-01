package com.teachmeskills.lesson8.HW.run;

import com.teachmeskills.lesson8.HW.doctor.IHealth;
import com.teachmeskills.lesson8.HW.doctor.Therapist;
import com.teachmeskills.lesson8.HW.patient.Patient;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        Patient patient = new Patient();
        patient.setHealthPlan(a);
        
        IHealth iHealth = Therapist.choseDoctor(patient.getHealthPlan());
        iHealth.doHealth(patient.getHealthPlan());




    }





}
