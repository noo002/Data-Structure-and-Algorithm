package view;

import ADT.*;
import java.util.*;
import Model.*;
import java.io.*;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

public class Console {

    public static DeliverymanADT<DeliverymanInterface> dmList = new DeliverymanList<DeliverymanInterface>();
   
    static Scanner scanner = new Scanner(System.in);
    static char input;
    static String statusclockin = "clockIn";
    static String statusclockout = "clockOut";
    static String onbreak = "onBreak";
    static String delivering = "delivering";
    static String available = "available";

    public static void main(String[] args) {

        DeliverymanMenu();
    }

    public static void DeliverymanMenu() {

        System.out.println("\n================================");
        System.out.println("Deliveryman Info");
        System.out.println("================================\n");
        System.out.println("1. addDeliveryman");
        System.out.println("2. trackDeliveryman");
        System.out.println("3. Clockin");
        System.out.println("4. Clockout");
        System.out.println("5. ChangeStatus");
        System.out.println("6. AllocateTask");
        System.out.println("7. trackOrder");

        int choice = 0;

        System.out.print("Please enter your choice: ");
        choice = scanner.nextInt();

        do {
            if (choice == 1) {
                addDeliveryman();
            } else if (choice == 2) {
                displayDeliverymanStatus();
            } else if (choice == 3) {
                Clockin();
            } else if (choice == 4) {
                ClockOut();
            } else if (choice == 5) {
                changestatus();
            } else if (choice == 6) {
                allocatetask();
            } else if (choice == 7) {
                trackOrder();
            } else {
                System.out.print("\n Please enter other option");
            }
        } while (choice != 6);
    }

    public static void display() {
        try {
            Scanner f1 = new Scanner(Paths.get("Deliveryman.txt"));

            while (f1.hasNext() && f1.hasNextInt()) {
                String name = f1.next();
                String phNumber = f1.next();
                String Status = f1.next();
                String address = f1.next();
                String workStatus = f1.next();
                String custid = f1.next();

                dmList.addDeliveryman(new Deliveryman1(name, phNumber, Status, address, workStatus, custid));
            }

            f1.close();
        } catch (IOException ex) {
            System.out.println("File not found!");

        }   
    }

    public static void addDeliveryman() {

        do {
            System.out.println("\n================================");
            System.out.println("Register New Deliveryman");
            System.out.println("================================");
            System.out.print("\nName: ");
            String name = scanner.next();
            System.out.print("\nPhoneNumber: ");
            String phNumber = scanner.next();
            String Status = "clockout";
            System.out.print("\nAddress: ");
            String address = scanner.next();
            String workStatus = "available";
            String custid = "";

            dmList.addDeliveryman(new Deliveryman1(name, phNumber, Status, address, workStatus, custid));

            try {
                FileWriter fw = new FileWriter("Deliveryman.txt");
                PrintWriter pw = new PrintWriter(fw);

                for (int i = 1; i <= dmList.getLength(); i++) {
                    String newDeliveryman = dmList.getEntry(i).toString();
                    pw.println(newDeliveryman);
                }
                pw.close();
            } catch (IOException Ex) {
                System.out.println("File not found!");
            }

            System.out.print("\n Back to Deliveryman Menu(y) ");
            input = scanner.next().charAt(0);
        } while (input != 'y');

        DeliverymanMenu();
    }

    public static void displayDeliverymanStatus() {

        do {
            System.out.println("\nDeliveryman List");
            System.out.println("====================================================================================================");
            System.out.println("No\tName\t\tphNumber\tstatus\taddress\t\t\tworkStatus\tCustomerOrder");
            System.out.println("====================================================================================================");

            for (int i = 0; i < dmList.getLength(); i++) {
                System.out.println((i + 1) + "\t" + dmList.getEntry(i + 1));
            }

            System.out.println("====================================================================================================");

            System.out.print("\n Back Deliveryman Menu? (y): ");
            input = scanner.next().charAt(0);
        } while (input != 'y');

        DeliverymanMenu();
    }

    public static void Clockin() {
        do {
            System.out.println("\n================================");
            System.out.println("Clock in to work");
            System.out.println("================================\n");
            System.out.print("Deliveryman Name: ");
            String name = scanner.next();

            for (int i = 0; i < dmList.getLength(); i++) {
                if (dmList.getEntry(i + 1).getName().equalsIgnoreCase(name)) {
                    dmList.getEntry(i + 1).setStatus(statusclockin);
                    dmList.replaceDeliveryman(i + 1, dmList.getEntry(i + 1));

                    System.out.println("\n Clocked in");
                }

                try {
                    FileWriter fw = new FileWriter("Deliveryman.txt");
                    PrintWriter pw = new PrintWriter(fw);

                    for (int j = 1; j <= dmList.getLength(); j++) {
                        String newDeliveryman = dmList.getEntry(j).toString();
                        pw.println(newDeliveryman);
                    }
                    pw.close();
                } catch (IOException Ex) {
                    System.out.println("File not found!");
                }

            }

            System.out.print("\nBack Deliveryman Main Menu? (y): ");
            input = scanner.next().charAt(0);
        } while (input != 'y');

        DeliverymanMenu();

    }

    public static void ClockOut() {
        do {
            System.out.println("\n================================");
            System.out.println("Clock Out from Work");
            System.out.println("================================\n");
            System.out.print("Deliveryman Name: ");
            String name = scanner.next();

            for (int i = 0; i < dmList.getLength(); i++) {
                if (dmList.getEntry(i + 1).getName().equalsIgnoreCase(name)) {
                    dmList.getEntry(i + 1).setStatus(statusclockout);
                    dmList.replaceDeliveryman(1, dmList.getEntry(i + 1));

                    System.out.println("\n Clock out");
                }

                try {
                    FileWriter fw = new FileWriter("Deliveryman.txt");
                    PrintWriter pw = new PrintWriter(fw);

                    for (int a = 1; a <= dmList.getLength(); a++) {
                        String newDeliveryman = dmList.getEntry(a).toString();
                        pw.println(newDeliveryman);
                    }
                    pw.close();
                } catch (IOException Ex) {
                    System.out.println("File not found!");
                }

            }

            System.out.print("\nBack Deliveryman Main Menu? (y): ");
            input = scanner.next().charAt(0);
        } while (input != 'y');

        DeliverymanMenu();

    }

    public static void changestatus() {
        do {

            System.out.println("===============================================================================");
            System.out.println("Deliveryman Change Status");
            System.out.println("\nDeliveryman Name:");
            String name = scanner.next();
            System.out.println("\nDeliveryman Status");
            String status = scanner.next();
            for (int i = 0; i < dmList.getLength(); i++) {

                if (dmList.getEntry(i + 1).getName().equalsIgnoreCase(name) && dmList.getEntry(i + 1).getStatus().equalsIgnoreCase(statusclockin)) {

                    dmList.getEntry(i + 1).setWorkStatus(status);
                    dmList.replaceDeliveryman(+1, dmList.getEntry(i + 1));

                } else if (dmList.getEntry(i + 1).getStatus().equalsIgnoreCase(name) && dmList.getEntry(i + 1).getStatus().equalsIgnoreCase(statusclockin)) {
                    dmList.getEntry(i + 1).setWorkStatus(status);
                    dmList.replaceDeliveryman(+1, dmList.getEntry(i + 1));
                } else {
                    System.out.println("The Deliveryman must clock in first");
                }
                try {
                    FileWriter fw = new FileWriter("Deliveryman.txt");
                    PrintWriter pw = new PrintWriter(fw);

                    for (int j = 1; j <= dmList.getLength(); j++) {
                        String newDeliveryman = dmList.getEntry(j).toString();
                        pw.println(newDeliveryman);
                    }
                    pw.close();
                } catch (IOException Ex) {
                    System.out.println("File not found!");
                }
            }

            System.out.print("\n Back Deliveryman Menu? (y): ");
            input = scanner.next().charAt(0);

        } while (input != 'y');
        DeliverymanMenu();
    }

    public static void allocatetask() {
        do {
            System.out.println("\n================================");
            System.out.println("allocate Task to Deliveryman");
            System.out.println("================================\n");
            System.out.print("Please Key in the Deliveryman Name: ");
            String name = scanner.next();
            System.out.println("\nPlease Key in the Customer order");

            for (int i = 0; i < dmList.getLength(); i++) {

                if (dmList.getEntry(i + 1).getName().equalsIgnoreCase(name) && dmList.getEntry(i + 1).getWorkStatus().equalsIgnoreCase(available)) {

                    dmList.getEntry(i + 1).setWorkStatus(delivering);
                    dmList.replaceDeliveryman(i + 1, dmList.getEntry(i + 1));

                    String custid = scanner.next();
                    dmList.getEntry(i + 1).setCustOrder(custid);
                    dmList.replaceDeliveryman(i + 1, dmList.getEntry(i + 1));

                    System.out.println("The Task have been allocated " + name);

                } else if (dmList.getEntry(+1).getName().equalsIgnoreCase(name) && dmList.getEntry(i + 1).getWorkStatus().equalsIgnoreCase(delivering)) {
                    System.out.println("The Deliveryman" + name + " ON busy");

                } else if (dmList.getEntry(i + 1).getName().equalsIgnoreCase(name) && dmList.getEntry(i + 1).getWorkStatus().equalsIgnoreCase(onbreak)) {
                    System.out.println("The Deliveryman" + name + "On break");

                }
                //else {
                // System.out.println("Invalid Deliveryman");
                //  }

                try {
                    FileWriter fw = new FileWriter("Deliveryman.txt");
                    PrintWriter pw = new PrintWriter(fw);

                    for (int j = 1; j <= dmList.getLength(); j++) {
                        String newDeliveryman = dmList.getEntry(j).toString();
                        pw.println(newDeliveryman);
                    }
                    pw.close();
                } catch (IOException Ex) {
                    System.out.println("File not found!");
                }

            }

            System.out.print("\nBack to Deliveryman Main Menu? (y): ");
            input = scanner.next().charAt(0);
        } while (input != 'y');

        DeliverymanMenu();

    }

    public static void trackOrder() {
        do {
            System.out.println("\n================================");
            System.out.println("Customer Track Order");
            System.out.println("================================\n");
            System.out.print("Please Key in the OrderNumber ");
            String OrderNumber = scanner.next();

            for (int i = 0; i < dmList.getLength(); i++) {

                if (dmList.getEntry(i + 1).getCustOrder().equalsIgnoreCase(OrderNumber)) {
                    Calendar cal1 = Calendar.getInstance();
                    cal1.setTime(new Date());

                    System.out.println("The Order Recevive time in " + cal1.getTime());
                    Calendar cal = Calendar.getInstance();
                    cal.setTime(new Date());
                    cal.add(Calendar.HOUR_OF_DAY, 1);

                    System.out.println("The Estimate Order arrived in" + cal.getTime());
                    
                }

                try {
                    FileWriter fw = new FileWriter("Deliveryman.txt");
                    PrintWriter pw = new PrintWriter(fw);

                    for (int j = 1; j <= dmList.getLength(); j++) {
                        String newDeliveryman = dmList.getEntry(j).toString();
                        pw.println(newDeliveryman);
                    }
                    pw.close();
                } catch (IOException Ex) {
                    System.out.println("File not found!");
                }

            }

            System.out.print("\nBack to Deliveryman Main Menu? (y): ");
            input = scanner.next().charAt(0);
        } while (input != 'y');

        DeliverymanMenu();

    }

}
