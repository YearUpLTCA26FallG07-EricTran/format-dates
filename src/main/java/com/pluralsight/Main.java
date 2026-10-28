package com.pluralsight;

import java.io.Console;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {


        LocalDate today = LocalDate.now();
        LocalDateTime todayTimer = LocalDateTime.now();


        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate = today.format(fmt);

        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("E, MMM dd, yyyy");
        String secondFormattedDate = today.format(fmt2);


        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("E, MMM dd, yyyy HH:mm");
        String thirdFormattedDate = todayTimer.format(fmt3);

        System.out.println(formattedDate);
        System.out.println(today);
        System.out.println(secondFormattedDate);
        System.out.println(thirdFormattedDate);



    }
}
