package com.teachmeskills.lesson8.HW.doctor;

public class Therapist extends Doctor implements IHealth{

    public void doHealth(int healthPlan) {
        System.out.println("Я Терапевт, с вас 5 тыщ");

    }
    public static IHealth choseDoctor(int healthPlan){

        switch (healthPlan) {
            case 1:
                return new Surgeon();
            case 2:
                return new Dentist();
            default:
                return new Therapist();
        }
    }

}
