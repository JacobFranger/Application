package com.plurasight;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Date: "+ LocalDate.now());
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyyMMddHHmm");
        System.out.println("Time: "+ LocalTime.now());


    }
}
