package com.java8.Java8DateTimeApi;

import java.time.LocalTime;
import java.time.ZoneId;

public class LocalTimeExample {

    public static void main(String[] args) {
        
        //Current Time
        LocalTime time = LocalTime.now();
        System.out.println("Current Time="+time);
        
        //Creating LocalTime by providing input arguments
        LocalTime specificTime = LocalTime.of(12,20,25,40);
        System.out.println("Specific Time of Day="+specificTime);
        
        //LocalTime invalidTime = LocalTime.of(25,20);
        
        //Current date in "Asia/Kolkata", you can get it from ZoneId javadoc
        LocalTime timeKolkata = LocalTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current Time in IST="+timeKolkata);

        //LocalTime todayIST = LocalTime.now(ZoneId.of("IST"));
        
        //Getting date from the base date i.e 01/01/1970
        LocalTime specificSecondTime = LocalTime.ofSecondOfDay(10000);
        System.out.println("10000th second time= "+specificSecondTime);

    }

}