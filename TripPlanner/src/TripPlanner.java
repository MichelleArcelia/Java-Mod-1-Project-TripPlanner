/* MODULE ONE Project - Trip Planner - Pre-Merit America AP Certification Class Assignment Final*/

import java.util.Scanner;

public class TripPlanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Greeting();
        TravelTimeBudget();
        TimeDifference();
        CountryArea();
    }

    /* PART ONE - GREETING */
    public static void Greeting() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("Nice to meet you " + name + ", where are you travelling to?");
        String location = input.nextLine();
        System.out.println("Great! " + location + " sounds like a great trip");
        System.out.println();
        System.out.print("***********");
        System.out.println();
    }

    /* PART TWO - TRAVEL TIME & BUDGET*/
    public static void TravelTimeBudget() {
        Scanner input = new Scanner(System.in);
        System.out.println();

        System.out.print("How many days are you going to spend travelling?");
        double days = input.nextDouble();

        System.out.print("How much money, in USD, are you planning to spend on your trip?");
        double money = input.nextDouble();

        System.out.print("What is the three letter currency symbol for your travel destination?");
        String symbol = input.next();

        System.out.print("How many " + symbol + " are there in 1 USD?");
        double symboltodolla = input.nextDouble();

        System.out.println();
        System.out.println("If you are travelling for " + (int) days + " days that is the same as " + ((int) days * 24) + " hours or " + ((int) days * 1440) + " minutes");

        System.out.println("If you are going to spend $" + money + " USD that means per day you can spend up to $" + money / days + " USD");

        System.out.println("Your total budget in " + symbol + " is " + (money * symboltodolla) + " " + symbol + ", which per day is " + (money * symboltodolla) / days + " " + symbol);
        System.out.println();

        System.out.print("***********");
        System.out.println();
    }

    /* PART THREE - TIME DIFFERENCE */
    public static void TimeDifference() {
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.print("What is the time difference, in hours, between your home and your destination?");

        Integer difference = input.nextInt();

        System.out.println("That means that when it is midnight at home it will be " + ((difference % 24 + 24) % 24 + ":00") + " in your travel destination and when it is noon at home it will be " + (12 + difference % 24 + ":00"));

        System.out.println();
        System.out.print("***********");
        System.out.println();
    }

    /* PART FOUR - Country Area
     * Kilometre number - 144 - halve it = 72
     * Quarter of your half = 18
     * Add the two together. 72 + 18 = 90
     * 90 miles. */

    public static void CountryArea() {
        Scanner input = new Scanner(System.in);
        System.out.println();

        System.out.print("What is the square area of your destination country in km2?");

        double kilo = input.nextDouble();
        System.out.println();

        double a = kilo / 2;
        double b = a * 0.25;
        double c = (a + b);
        double d = c * 100;
        double e = (int) d / 100;

        System.out.println("In miles2 that is " + e);

        System.out.println();
        System.out.print("***********");
        System.out.println();
    }
}


    /*FUTURE PART 6 – Hacker Problem - How Far?

For extra fun, calculate the distance between the user’s home and their travel destination using the Haversine formula. https://en.wikipedia.org/wiki/Haversine_formula To do this you’ll need to ask the user to enter the longitude and latitude for their home and their travel destination. You’ll also need to do some pretty fancy math.

To do fancy math in Java (cos, sin, squared etc…) you can use the Math Class. Here is the documentation for that: https://docs.oracle.com/javase/7/docs/api/java/lang/Math.html All the code to accomplish the hacker problem should be in its own method. */



