package app;

import java.util.*;

public class ConcertTickets {
    public static void main(String[] args) throws Exception {
        Map<String, String> show1 = new HashMap<String, String>();
        show1.put("Artist: ", "Phoebe Bridgers");
        show1.put("Price: ", "15");
        show1.put("Date: ", "1/18/20");
        show1.put("Time: ", "5:00PM");
        show1.put("Tickets: ", "45");

        Map<String, String> show2 = new HashMap<String, String>();
        show2.put("Artist: ", "Big Thief");
        show2.put("Price: ", "20");
        show2.put("Date: ", "1/18/20");
        show2.put("Time: ", "5:45PM");
        show2.put("Tickets: ", "23");

        Map<String, String> show3 = new HashMap<String, String>();
        show3.put("Artist: ", "Coulter Wall");
        show3.put("Price: ", "25");
        show3.put("Date: ", "1/18/20");
        show3.put("Time: ", "6:30PM");
        show3.put("Tickets: ", "36");

        System.out.println("\nTonight's shows:\n");
        System.out.println(show1.get("Artist") + "\n");
        System.out.println(show2.get("Artist") + "\n");
        System.out.println(show3.get("Artist") + "\n");

        Scanner whatShow = new Scanner(System.in);
        System.out.println("What show will you be seeing? ");
        String show = whatShow.nextLine();

        Scanner numberOfTickets = new Scanner(System.in);
        System.out.println("How many tickets would you like: ");
        int totalTickets = numberOfTickets.nextInt();

        Scanner customerName = new Scanner(System.in);
        System.out.println("\nWhat might your name be? ");
        String name = customerName.nextLine();

        if (show.equals("Phoebe Bridgers")) {
            String cost = show1.get("Price");
            int price = Integer.parseInt(cost);
            String time = show1.get("Time");
            String tickets = show1.get("Tickets");
            int ticketsRemaining = Integer.parseInt(tickets);
            ticketsRemaining = ticketsRemaining--;
            System.out.println("Alright " + name + ", that will be: $" + price + " for " + totalTickets + " tickets to "
                    + show + " at " + time + ". Enjoy!");
            System.out.println("There are " + ticketsRemaining + " tickets remaining.");
        }
        if (show.equals("Big Thief")) {
            String cost = show2.get("Price");
            int price = Integer.parseInt(cost);
            String time = show2.get("Time");
            String tickets = show1.get("Tickets");
            int ticketsRemaining = Integer.parseInt(tickets);
            ticketsRemaining = ticketsRemaining--;
            System.out.println("Alright " + name + ", that will be: $" + price + " for " + totalTickets + " tickets to "
                    + show + " at " + time + ". Enjoy!");
            System.out.println("There are " + ticketsRemaining + " tickets remaining.");
        }
        if (show.equals("Coulter Wall")) {
            String cost = show3.get("Price");
            int price = Integer.parseInt(cost);
            String time = show3.get("Time");
            String tickets = show1.get("Tickets");
            int ticketsRemaining = Integer.parseInt(tickets);
            ticketsRemaining = ticketsRemaining--;
            System.out.println("Alright " + name + ", that will be: $" + price + " for " + totalTickets + " tickets to "
                    + show + " at " + time + ". Enjoy!");
            System.out.println("There are " + ticketsRemaining + " tickets remaining.");
        } else {
            System.out.println("We are not showing them.");
        }
    }
}