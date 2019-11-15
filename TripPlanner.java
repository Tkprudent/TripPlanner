import java.util.Scanner;
public class TripPlanner {
    public static void main(String[] args) {
        intro();
        System.out.println("*****************");
        budget();
        System.out.println("*****************");
        time();
        System.out.println("*****************");
        distance();
        System.out.println("*****************");

    }

    private static void intro() {
        Scanner input = new Scanner(System.in);
        // takes in username and introduction
        System.out.println("Welcome to Vacation Planner");
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("Nice to meet you " + name + ", " + " where are your travelling to?  ");
        String destination = input.next();
        System.out.println("Great! " + destination + " " + "sounds like a great trip.");

    }

    private static void budget() {
        Scanner input = new Scanner(System.in);
        // takes in days planned on trip, allowance
        System.out.print("How many days are you going to spend travelling? ");
        int tripSpan = input.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip? ");
        Double tripBudget = input.nextDouble();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String destinationCurrencySymbol = input.next();
        System.out.print("How many " + destinationCurrencySymbol + " are there in 1 USD? ");
        Double exchangeRate = input.nextDouble();

        int tripSpanInHours = tripSpan * 24;
        int tripSpanInMinutes = tripSpanInHours * 60;
        int tripSpanInSeconds = tripSpanInMinutes * 60;
        System.out.println("If you are travelling for " + tripSpan + " days, that is the same as " + tripSpanInHours + " hours " + "or " + tripSpanInMinutes + " minutes " + "or " + tripSpanInSeconds + " seconds.");

        double budgetPerDay = tripBudget / tripSpan;
        budgetPerDay = budgetPerDay * 100;
        budgetPerDay = (int) budgetPerDay;
        budgetPerDay = budgetPerDay/100.0;
        System.out.println("If you are going to spend $" + tripBudget + " USD, that means per day you can spend up to " + budgetPerDay + " USD");

        double tripBudgetInForeignCurrency = tripBudget * exchangeRate;
        tripBudgetInForeignCurrency = tripBudgetInForeignCurrency * 100;
        tripBudgetInForeignCurrency = (int) tripBudgetInForeignCurrency;
        tripBudgetInForeignCurrency = tripBudgetInForeignCurrency /100.0;
        double dailyBudgetInForeignCurrency = tripBudgetInForeignCurrency / tripSpan;
        dailyBudgetInForeignCurrency = dailyBudgetInForeignCurrency *100;
        dailyBudgetInForeignCurrency = (int)dailyBudgetInForeignCurrency;
        dailyBudgetInForeignCurrency = dailyBudgetInForeignCurrency/100.0;
        System.out.println("Your total budget in " + destinationCurrencySymbol + " is " + tripBudgetInForeignCurrency + " " + destinationCurrencySymbol + " which per day is " + dailyBudgetInForeignCurrency + " " + destinationCurrencySymbol);

    }

    private static void time() {
        Scanner input = new Scanner(System.in);
        // takes the time difference between home and destination
        System.out.print("What is the time difference, in hours, between your home and trip destination? ");
        int timeDifference = input.nextInt();
        int timeDiffMidnight = (24 + timeDifference) % 24;
        int timeDiffNoon = (12 + timeDifference) % 24;
        System.out.println("That means that when it is midnight at home it will be " + timeDiffMidnight + " in your travel destination " + " and when it is noon at home it will be " + timeDiffNoon);
    }

    private static void distance(){
        Scanner input = new Scanner(System.in);
        System.out.print("What is the square area of your destination country in km^2? ");
        double kilometers = input.nextDouble();
        // takes the distance between home and destination in square kilometers and converts to square miles
        double miles = kilometers * 0.62137;
        miles = miles * 100;
        miles = (int) miles;
        miles = miles/100.0;
        System.out.println("In miles^2 that is " + miles);

    }

}
