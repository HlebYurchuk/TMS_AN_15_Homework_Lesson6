package com.teachmeskills.lesson6.part_1.store_service.model.container;

import java.util.Objects;

public class Homework6_2 {
            String name;
            String surname;
            int NoPassport;
            String NoGroup;
            String country;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Homework6_2 that = (Homework6_2) o;
        return NoPassport == that.NoPassport && Objects.equals(name, that.name) && Objects.equals(surname, that.surname) && Objects.equals(NoGroup, that.NoGroup) && Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, NoPassport, NoGroup, country);
    }

        public static void main(String[] args) {

            Homework6_2 Bob = new Homework6_2();
            Bob.name="Bob";
            Bob.surname="Kupa";
            Bob.NoPassport=1234;
            Bob.NoGroup="TMS_An15";
            Bob.country="Зимбабве";


            Homework6_2 John = new Homework6_2();
            John.name="Bob";
            John.surname="Kupa";
            John.NoPassport=1234;
            John.NoGroup="TMS_An15";
            John.country="Зимбабве";

            if(Bob.equals(John)){
                System.out.println("Yes");

        } else {
                System.out.println("No");
            }



    }
}
