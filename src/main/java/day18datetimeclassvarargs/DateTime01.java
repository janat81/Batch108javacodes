package day18datetimeclassvarargs;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTime01 {

    public static void main(String[] args) {

        //How to get current date by typing Java code
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);//2022-09-27

        //How to get "current time" by typing Java code
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        //How to get "current date and time" by typing Java code
        LocalDateTime currentDayTime = LocalDateTime.now();
        System.out.println(currentDayTime);

        //How to get current date in another country by typing Java code
        LocalDate currentDateInJapan = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateInJapan);

        //How to get "current time" in Japan by typing Java code

        LocalTime currentTimeInJapan = LocalTime.now(ZoneId.of("Asia/Tokyo"));

        //How to get "current date and time" in Japan by typing Java code
        LocalDateTime currentDateTimeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeInJapan);

        //How to go future in date
        LocalDate cd1 = LocalDate.now();//2022-09-27
        LocalDate cd1Next = cd1.plusYears(2).plusMonths(5).plusDays(120);
        System.out.println(cd1Next);//2023-01-25

        //How to go past in date
        LocalDate cd1Past = cd1.minusYears(3).minusMonths(2).minusDays(5);
        System.out.println(cd1Past);

        //Homework : Type code to learn how to go future and past in time

        //How to get a specific part of the time
        LocalTime ct1 = LocalTime.now();
        int hour = ct1.getHour();
        System.out.println(hour);

        int minute = ct1.getMinute();
        System.out.println(minute);

        //How to change the format of the date
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String formattedCurrentDate = dtf.format(cd1);
        System.out.println(formattedCurrentDate);

        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MMM/yyyy");

        String formattedCurrentDate2 = dtf.format(cd1);
        System.out.println(formattedCurrentDate2);

        DateTimeFormatter d = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");

        String formattedCurrentDate3 = dtf.format(cd1);
        System.out.println(formattedCurrentDate3);

        //How to change the format of the time
        DateTimeFormatter mnr = DateTimeFormatter.ofPattern("hh:mm a");
        LocalTime lt = LocalTime.now();
        String formattedCurrentTime = mnr.format(lt);
        System.out.println(formattedCurrentTime);

        /*
            Enum is something like class normally in a class you have variables and methods. In Enum you may have variables and methods
            as well. But when we create Enum we use it to store constant variables. Unchangeable variables. Like months...
            Whenever you need unchangeable variables use Enum.
            For example, you are creating for Honda - Honda has some models like Civic HRV...
            their names will not be changed any time, Honda Civic exists for many years.
            If you are sure they will remain same for long time, you are creating application for Honda you will use Civic model many times in your app.
            You put them in Enum when you need models you go to Enum select it from there and use, you do not need to memorise model names.
            Go to Enum and get the one you need. When you create a value in Enum you can add values.
            For example, you are working with states in the USA, create an Enum and put states in it. Then you create method to put variables from that Enum.

         */

        //How to create specific dates
        LocalDate dob1 = LocalDate.of(2012,3,13);
        LocalDate dob2 = LocalDate.of(2013, Month.MAY,21);

        // How to compare two dates
        //In isBefore() method if the first date is before the second date you get true
        //Otherwise (equality and first is after) you will get false
        boolean isBefore = dob1.isBefore(dob2);
        System.out.println(isBefore);//true

        boolean is = dob2.isBefore(dob1);
        System.out.println(is);//false

        boolean isAfter = dob2.isAfter(dob1);
        System.out.println(isAfter);//true







    }


}
