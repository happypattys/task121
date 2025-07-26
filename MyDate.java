package Task121;

import Task.DateTask;

public class MyDate {
    public static void main(String[] args) {
       
        DateTask date1 = new DateTask(); 
        DateTask date2 = new DateTask();

        
        date1.setDate(1, 1, 1978);

       
        date2.setDate(9, 21, 1984);

        
        System.out.println("Date1: " + date1.toString());
        System.out.println("Date2: " + date2.toString());

       
        System.out.println("\nLeap Years from 1980 to 2023:");
        DateTask.leapYears();
    }
}
