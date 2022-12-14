package zsm.console.PICinemas;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class TheatreTicketProcess {

    private static final DecimalFormat df = new DecimalFormat("0.00");
    static int screen1show1Available = 100;
    static int screen1show2Available = 100;
    static int screen1show3Available = 100;
    static int screen1show4Available = 100;
    static int screen2show1Available = 100;
    static int screen2show2Available = 100;
    static int screen2show3Available = 100;
    static int screen2show4Available = 100;
    ArrayList<TicketInfo> screen1show1 = new ArrayList<>(100);
    ArrayList<TicketInfo> screen1show2 = new ArrayList<>(100);
    ArrayList<TicketInfo> screen1show3 = new ArrayList<>(100);
    ArrayList<TicketInfo> screen1show4 = new ArrayList<>(100);

    ArrayList<TicketInfo> screen2show1 = new ArrayList<>(100);
    ArrayList<TicketInfo> screen2show2 = new ArrayList<>(100);
    ArrayList<TicketInfo> screen2show3 = new ArrayList<>(100);
    ArrayList<TicketInfo> screen2show4 = new ArrayList<>(100);

    ArrayList<CustomerInfo> customers = new ArrayList<>();

    public void checkAvailability(int screenNo, int show) {
        int outerIndex = 0, innerIndex = 0;
        if (screenNo == 1) {
            if (show == 1) {
                for (outerIndex = 1; outerIndex <= 10; outerIndex++) {
                    for (innerIndex = 1; innerIndex <= 10; innerIndex++)
                        screen1show1.add(new TicketInfo(1, 1, (char) (64 + outerIndex) + "" + innerIndex, true));
                }
                System.out.println("-------------------------------SCREEN HERE---------------------------------------------");
                System.out.print(screen1show1Available + " seats available in screen 1 show 1");
                for (outerIndex = 0; outerIndex < 100; outerIndex++) {
                    if (outerIndex % 10 == 0)
                        System.out.println();
                    if (screen1show1.get(outerIndex).isAvailable())
                        System.out.print(screen1show1.get(outerIndex).getSeatNumber() + "  ");
                    else
                        System.out.print("-??- ");
                }
            }
            if (show == 2) {
                for (outerIndex = 1; outerIndex <= 10; outerIndex++) {
                    for (innerIndex = 1; innerIndex <= 10; innerIndex++)
                        screen1show2.add(new TicketInfo(1, 2, (char) (64 + outerIndex) + "" + innerIndex, true));
                }
                System.out.println("-------------------------------SCREEN HERE---------------------------------------------");
                System.out.print(screen1show2Available + " seats available in screen 1 show 2");
                for (outerIndex = 0; outerIndex < 100; outerIndex++) {
                    if (outerIndex % 10 == 0)
                        System.out.println();
                    if (screen1show2.get(outerIndex).isAvailable())
                        System.out.print(screen1show2.get(outerIndex).getSeatNumber() + "  ");
                    else
                        System.out.print("-??- ");
                }
            }
            if (show == 3) {
                for (outerIndex = 1; outerIndex <= 10; outerIndex++) {
                    for (innerIndex = 1; innerIndex <= 10; innerIndex++)
                        screen1show3.add(new TicketInfo(1, 3, (char) (64 + outerIndex) + "" + innerIndex, true));
                }
                System.out.println("-------------------------------SCREEN HERE---------------------------------------------");
                System.out.print(screen1show3Available + " seats available in screen 1 show 3");
                for (outerIndex = 0; outerIndex < 100; outerIndex++) {
                    if (outerIndex % 10 == 0)
                        System.out.println();
                    if (screen1show3.get(outerIndex).isAvailable())
                        System.out.print(screen1show3.get(outerIndex).getSeatNumber() + "  ");
                    else
                        System.out.print("-??- ");
                }
            }
            if (show == 4) {
                for (outerIndex = 1; outerIndex <= 10; outerIndex++) {
                    for (innerIndex = 1; innerIndex <= 10; innerIndex++)
                        screen1show4.add(new TicketInfo(1, 4, (char) (64 + outerIndex) + "" + innerIndex, true));
                }
                System.out.println("-------------------------------SCREEN HERE---------------------------------------------");
                System.out.print(screen2show4Available + " seats available in screen 1 show 4");
                for (outerIndex = 0; outerIndex < 100; outerIndex++) {
                    if (outerIndex % 10 == 0)
                        System.out.println();
                    if (screen1show4.get(outerIndex).isAvailable())
                        System.out.print(screen1show4.get(outerIndex).getSeatNumber() + "  ");
                    else
                        System.out.print("-??- ");
                }
            }
            System.out.println("\n");
        }
        if (screenNo == 2) {
            if (show == 1) {
                for (outerIndex = 1; outerIndex <= 10; outerIndex++) {
                    for (innerIndex = 1; innerIndex <= 10; innerIndex++)
                        screen2show1.add(new TicketInfo(2, 1, (char) (64 + outerIndex) + "" + innerIndex, true));
                }
                System.out.println("-------------------------------SCREEN HERE---------------------------------------------");
                System.out.print(screen2show1Available + " seats available in screen 2 show 1");
                for (outerIndex = 0; outerIndex < 100; outerIndex++) {
                    if (outerIndex % 10 == 0)
                        System.out.println();
                    if (screen2show1.get(outerIndex).isAvailable())
                        System.out.print(screen2show1.get(outerIndex).getSeatNumber() + "  ");
                    else
                        System.out.print("-??- ");
                }
            }
            if (show == 2) {
                for (outerIndex = 1; outerIndex <= 10; outerIndex++) {
                    for (innerIndex = 1; innerIndex <= 10; innerIndex++)
                        screen2show2.add(new TicketInfo(2, 2, (char) (64 + outerIndex) + "" + innerIndex, true));
                }
                System.out.println("-------------------------------SCREEN HERE---------------------------------------------");
                System.out.print(screen2show2Available + " seats available in screen 2 show 2");
                for (outerIndex = 0; outerIndex < 100; outerIndex++) {
                    if (outerIndex % 10 == 0)
                        System.out.println();
                    if (screen2show2.get(outerIndex).isAvailable())
                        System.out.print(screen2show2.get(outerIndex).getSeatNumber() + "  ");
                    else
                        System.out.print("-??- ");
                }
            }
            if (show == 3) {
                for (outerIndex = 1; outerIndex <= 10; outerIndex++) {
                    for (innerIndex = 1; innerIndex <= 10; innerIndex++)
                        screen2show3.add(new TicketInfo(2, 3, (char) (64 + outerIndex) + "" + innerIndex, true));
                }
                System.out.println("-------------------------------SCREEN HERE---------------------------------------------");
                System.out.print(screen2show3Available + " seats available in screen 2 show 3");
                for (outerIndex = 0; outerIndex < 100; outerIndex++) {
                    if (outerIndex % 10 == 0)
                        System.out.println();
                    if (screen2show3.get(outerIndex).isAvailable())
                        System.out.print(screen2show3.get(outerIndex).getSeatNumber() + "  ");
                    else
                        System.out.print("-??- ");
                }
            }
            if (show == 4) {
                for (outerIndex = 1; outerIndex <= 10; outerIndex++) {
                    for (innerIndex = 1; innerIndex <= 10; innerIndex++)
                        screen2show4.add(new TicketInfo(2, 4, (char) (64 + outerIndex) + "" + innerIndex, true));
                }
                System.out.println("-------------------------------SCREEN HERE---------------------------------------------");
                System.out.print(screen2show4Available + " seats available in screen 2 show 4");
                for (outerIndex = 0; outerIndex < 100; outerIndex++) {
                    if (outerIndex % 10 == 0)
                        System.out.println();
                    if (screen2show4.get(outerIndex).isAvailable())
                        System.out.print(screen2show4.get(outerIndex).getSeatNumber() + "  ");
                    else
                        System.out.print("-??- ");
                }
            }
        }
        System.out.println("\n");
    }

    public void cancel(int screenNo, int show, String mobile) {
        cancelTicket(customers, screenNo, show, mobile);
    }

    private void cancelTicket(ArrayList<CustomerInfo> customers, int screen, int show, String mobile) {
        String seatToCancel = "";
        for (int l = 0; l < customers.size(); l++) {
            if (customers.get(l).getMobileNumber().equals(mobile)) {
                for (int i = 0; i < customers.get(l).getTotalNoOfTickets(); i++) {
                    Scanner input = new Scanner(System.in);
                    System.out.println("Enter seat number to cancel:");
                    seatToCancel = input.next();
//                            if (customers.get(l).getTotalSeatNumber().substring(0, 1).equals(seatToCancel) || customers.get(l).getTotalSeatNumber().substring(3, 4).equals(seatToCancel) || customers.get(l).getTotalSeatNumber().substring(6, 7).equals(seatToCancel) || customers.get(l).getTotalSeatNumber().substring(9, 10).equals(seatToCancel) || customers.get(l).getTotalSeatNumber().substring(12, 13).equals(seatToCancel)) {

                    if (screen == 1) {
                        if (show == 1) {
                            for (TicketInfo ticketInfo : screen1show1) {
                                if (ticketInfo.getSeatNumber().compareTo(seatToCancel) == 0 && !ticketInfo.isAvailable()) {
                                    ticketInfo.setAvailable(true);
                                    System.out.println(seatToCancel + " Cancelled!");
                                    screen1show1Available++;
                                }
                            }
                        }
                        if (show == 2) {
                            for (TicketInfo ticketInfo : screen1show2) {
                                if (ticketInfo.getSeatNumber().compareTo(seatToCancel) == 0 && !ticketInfo.isAvailable()) {
                                    ticketInfo.setAvailable(true);
                                    System.out.println(seatToCancel + " Cancelled!");
                                    screen1show2Available++;
                                }
                            }
                        }
                        if (show == 3) {
                            for (TicketInfo ticketInfo : screen1show3) {
                                if (ticketInfo.getSeatNumber().compareTo(seatToCancel) == 0 && !ticketInfo.isAvailable()) {
                                    ticketInfo.setAvailable(true);
                                    System.out.println(seatToCancel + " Cancelled!");
                                    screen1show3Available++;
                                }
                            }
                        }
                        if (show == 4) {
                            for (TicketInfo ticketInfo : screen1show4) {
                                if (ticketInfo.getSeatNumber().compareTo(seatToCancel) == 0 && !ticketInfo.isAvailable()) {
                                    ticketInfo.setAvailable(true);
                                    System.out.println(seatToCancel + " Cancelled!");
                                    screen1show4Available++;
                                }
                            }
                        }
                    }
                    if (screen == 2) {
                        if (show == 1) {
                            for (TicketInfo ticketInfo : screen2show1) {
                                if (ticketInfo.getSeatNumber().compareTo(seatToCancel) == 0 && !ticketInfo.isAvailable()) {
                                    ticketInfo.setAvailable(true);
                                    System.out.println(seatToCancel + " Cancelled!");
                                    screen2show1Available++;
                                }
                            }
                        }
                        if (show == 2) {
                            for (TicketInfo ticketInfo : screen2show2) {
                                if (ticketInfo.getSeatNumber().compareTo(seatToCancel) == 0 && !ticketInfo.isAvailable()) {
                                    ticketInfo.setAvailable(true);
                                    System.out.println(seatToCancel + " Cancelled!");
                                    screen2show2Available++;
                                }
                            }
                        }
                        if (show == 3) {
                            for (TicketInfo ticketInfo : screen2show3) {
                                if (ticketInfo.getSeatNumber().compareTo(seatToCancel) == 0 && !ticketInfo.isAvailable()) {
                                    ticketInfo.setAvailable(true);
                                    System.out.println(seatToCancel + " Cancelled!");
                                    screen2show3Available++;
                                }
                            }
                        }
                        if (show == 4) {
                            for (TicketInfo ticketInfo : screen2show4) {
                                if (ticketInfo.getSeatNumber().compareTo(seatToCancel) == 0 && !ticketInfo.isAvailable()) {
                                    ticketInfo.setAvailable(true);
                                    System.out.println(seatToCancel + " Cancelled!");
                                    screen2show4Available++;
                                }
                            }
                        }
                    }
//                            }
//                            else {
//                                System.out.println("Invalid Seat Number,Enter correct seat number");
//                                seatToCancel = input.next();
//                            }

                }

            } else
                System.out.println("Enter valid Mobile Number");
            System.out.printf("%-20s%-20s\n", "Refund Amount", customers.get(l).getTotalAmount());
            customers.remove(l);
        }

    }

    public void bookTicket(int screenNo, int show) {

        String totalSeatNo = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name");
        String name = input.next();
        System.out.println("Enter Mobile Number");
        String mobileNo = input.next();
        System.out.println("NO of Tickets");
        int totalNoOfTickets = input.nextInt();
        int amount = totalNoOfTickets * 120;
        double totalAmount = amount + (amount * 0.28);
        if (screenNo == 1) {
            if (show == 1) {
                for (int ticketIterator = 1; ticketIterator <= totalNoOfTickets; ticketIterator++) {
                    System.out.println("Select " + ticketIterator + "st" + " seat number");
                    String seatNo = input.next();
                    while (seatAvailabilityCheck(1, 1, seatNo)) {
                        System.out.println("Ooch!Ticket already booked!Select any other seat number");
                        seatNo = input.next();
                    }
                    totalSeatNo = totalSeatNo.equals("") ? seatNo : totalSeatNo + "," + seatNo;
                    for (int index = 0; index < 100; index++) {
                        if (screen1show1.get(index).getSeatNumber().equals(seatNo))
                            screen1show1.get(index).setAvailable(false);
                    }
                    
                }
                screen1show1Available = screen1show1Available - totalNoOfTickets;
            }
            if (show == 2) {
                for (int ticketIterator = 1; ticketIterator <= totalNoOfTickets; ticketIterator++) {
                    System.out.println("Select " + ticketIterator + "st" + " seat number");
                    String seatNo = input.next();
                    while (seatAvailabilityCheck(1, 2, seatNo)) {
                        System.out.println("Ooch!Ticket already booked!Select any other seat number");
                        seatNo = input.next();
                    }
                    totalSeatNo = totalSeatNo.equals("") ? seatNo : totalSeatNo + "," + seatNo;
                    for (int index = 0; index < 100; index++) {
                        if (screen1show2.get(index).getSeatNumber().equals(seatNo))
                            screen1show2.get(index).setAvailable(false);
                    }
                }
                screen1show2Available = screen1show2Available - totalNoOfTickets;
            }
            if (show == 3) {
                for (int ticketIterator = 1; ticketIterator <= totalNoOfTickets; ticketIterator++) {
                    System.out.println("Select " + ticketIterator + "st" + " seat number");
                    String seatNo = input.next();
                    while (seatAvailabilityCheck(1, 3, seatNo)) {
                        System.out.println("Ooch!Ticket already booked!Select any other seat number");
                        seatNo = input.next();
                    }
                    totalSeatNo = totalSeatNo.equals("") ? seatNo : totalSeatNo + "," + seatNo;
                    for (int index = 0; index < 100; index++) {
                        if (screen1show3.get(index).getSeatNumber().equals(seatNo))
                            screen1show3.get(index).setAvailable(false);
                    }
                }
                screen1show3Available = screen1show3Available - totalNoOfTickets;
            }
            if (show == 4) {

                for (int ticketIterator = 1; ticketIterator <= totalNoOfTickets; ticketIterator++) {
                    System.out.println("Select " + ticketIterator + "st" + " seat number");
                    String seatNo = input.next();
                    while (seatAvailabilityCheck(1, 4, seatNo)) {
                        System.out.println("Ooch!Ticket already booked!Select any other seat number");
                        seatNo = input.next();
                    }
                    totalSeatNo = totalSeatNo.equals("") ? seatNo : totalSeatNo + "," + seatNo;
                    for (int index = 0; index < 100; index++) {
                        if (screen1show4.get(index).getSeatNumber().equals(seatNo))
                            screen1show4.get(index).setAvailable(false);
                    }
                }
                screen1show4Available = screen1show4Available - totalNoOfTickets;
            }
        }
        if (screenNo == 2) {
            if (show == 1) {
                for (int ticketIterator = 1; ticketIterator <= totalNoOfTickets; ticketIterator++) {
                    System.out.println("Select " + ticketIterator + "st" + " seat number");
                    String seatNo = input.next();
                    while (seatAvailabilityCheck(2, 1, seatNo)) {
                        System.out.println("Ooch!Ticket already booked!Select any other seat number");
                        seatNo = input.next();
                    }
                    totalSeatNo = totalSeatNo.equals("") ? seatNo : totalSeatNo + "," + seatNo;
                    for (int index = 0; index < 100; index++) {
                        if (screen2show1.get(index).getSeatNumber().equals(seatNo))
                            screen2show1.get(index).setAvailable(false);
                    }
                }
                screen2show1Available = screen2show1Available - totalNoOfTickets;
            }
            if (show == 2) {
                for (int ticketIterator = 1; ticketIterator <= totalNoOfTickets; ticketIterator++) {
                    System.out.println("Select " + ticketIterator + "st" + " seat number");
                    String seatNo = input.next();
                    while (seatAvailabilityCheck(2, 2, seatNo)) {
                        System.out.println("Ooch!Ticket already booked!Select any other seat number");
                        seatNo = input.nextLine();
                    }
                    totalSeatNo = totalSeatNo.equals("") ? seatNo : totalSeatNo + "," + seatNo;
                    for (int index = 0; index < 100; index++) {
                        if (screen2show2.get(index).getSeatNumber().equals(seatNo))
                            screen2show2.get(index).setAvailable(false);
                    }
                }
                screen2show2Available = screen2show2Available - totalNoOfTickets;
            }
            if (show == 3) {
                for (int ticketIterator = 1; ticketIterator <= totalNoOfTickets; ticketIterator++) {
                    System.out.println("Select " + ticketIterator + "st" + " seat number");
                    String seatNo = input.next();
                    while (seatAvailabilityCheck(2, 3, seatNo)) {
                        System.out.println("Ooch!Ticket already booked!Select any other seat number");
                        seatNo = input.next();
                    }
                    totalSeatNo = totalSeatNo.equals("") ? seatNo : totalSeatNo + "," + seatNo;
                    for (int index = 0; index < 100; index++) {
                        if (screen2show3.get(index).getSeatNumber().equals(seatNo))
                            screen2show3.get(index).setAvailable(false);
                    }
                }
                screen2show3Available = screen2show3Available - totalNoOfTickets;
            }
            if (show == 4) {
                for (int ticketIterator = 1; ticketIterator <= totalNoOfTickets; ticketIterator++) {
                    System.out.println("Select " + ticketIterator + "st" + " seat number");
                    String seatNo = input.next();
                    while (!seatAvailabilityCheck(2, 4, seatNo)) {
                        System.out.println("Ooch!Ticket already booked!Select any other seat number");
                        seatNo = input.next();
                    }
                    totalSeatNo = totalSeatNo.equals("") ? seatNo : totalSeatNo + "," + seatNo;
                    for (int index = 0; index < 100; index++) {
                        if (screen2show4.get(index).getSeatNumber().equals(seatNo))
                            screen2show4.get(index).setAvailable(false);
                    }
                }
                screen2show4Available = screen2show4Available - totalNoOfTickets;
            }
        }
        CustomerInfo customerInfo = new CustomerInfo(name, mobileNo, totalNoOfTickets, totalSeatNo, screenNo, show, amount, totalAmount);
        customers.add(customerInfo);
        printTicket(name, mobileNo, totalNoOfTickets, totalSeatNo, screenNo, show, amount, totalAmount);
    }

    private void printTicket(String name, String mobileNo, int totalNoOfTickets, String totalSeatNo, int screenNo, int show, int amount, double totalAmount) {
        if (screenNo == 1) {
            System.out.println("--------------------------------------SCREEN 1-------------------------------------------------------");
            System.out.println("PONNIYIN SELVAN PART I");
            System.out.println("(U/A) TAMIL 2h 27m 2D");
            if (show == 1)
                System.out.printf("%-20s%-20s\n", "SHOW", "show 1 - 10 AM");
            if (show == 2)
                System.out.printf("%-20s%-20s\n", "SHOW", "show 2 - 2 PM");
            if (show == 3)
                System.out.printf("%-20s%-20s\n", "SHOW", "show 3 - 6 PM");
            if (show == 4)
                System.out.printf("%-20s%-20s\n", "SHOW", "show 4 - 10 PM");
        }
        if (screenNo == 2) {
            System.out.println("--------------------------------------SCREEN 2-------------------------------------------------------");
            System.out.println("NAANE VARUVEAN");
            System.out.println("(U/A) TAMIL 2h 15m 2D");
            if (show == 1)
                System.out.printf("%-20s%-20s\n", "SHOW", "show 1 - 9 AM");
            if (show == 2)
                System.out.printf("%-20s%-20s\n", "SHOW", "show 2 - 1 PM");
            if (show == 3)
                System.out.printf("%-20s%-20s\n", "SHOW", "show 3 - 5 PM");
            if (show == 4)
                System.out.printf("%-20s%-20s\n", "SHOW", "show 4 - 9 PM");
        }
        System.out.printf("%-20s%-20s\n", "NAME", name);
        System.out.printf("%-20s%-20s\n", "Mobile Number", mobileNo);
        System.out.printf("%-20s%-20s\n", "NO OF SEATS", totalNoOfTickets);
        System.out.printf("%-20s%-20s\n", "SEAT NAMES", totalSeatNo);
        System.out.printf("%-20s%-20s\n", "Ticket Rate", "Rs.120");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.printf("%-20s%-20s\n", "Amount", "Rs." + amount);
        System.out.printf("%-20s%-20s\n", "CGST", "Rs." + amount * 0.14);
        System.out.printf("%-20s%-20s\n", "SGST", "Rs." + amount * 0.14);
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.printf("%-40s\n", "Total Amount to Pay Rs." + df.format(totalAmount));
        System.out.println("---------------------------------THANK YOU! VISIT AGAIN!---------------------------------------------");
    }

    public void print() {
        printTicketHistory(customers);
    }

    public void printTicketHistory(ArrayList<CustomerInfo> customerInfo) {
        for (CustomerInfo info : customerInfo) {
            if (info.getScreenNumber() == 1) {
                System.out.println("--------------------------------------SCREEN 1-------------------------------------------------------");
                System.out.println("PONNIYIN SELVAN PART I");
                System.out.println("(U/A) TAMIL 2h 27m 2D");
                if (info.getShowNumber() == 1)
                    System.out.printf("%-20s%-20s\n", "SHOW", "show 1 - 10 AM");
                if (info.getShowNumber() == 2)
                    System.out.printf("%-20s%-20s\n", "SHOW", "show 2 - 2 PM");
                if (info.getShowNumber() == 3)
                    System.out.printf("%-20s%-20s\n", "SHOW", "show 3 - 6 PM");
                if (info.getShowNumber() == 4)
                    System.out.printf("%-20s%-20s\n", "SHOW", "show 4 - 10 PM");
            }
            if (info.getScreenNumber() == 2) {
                System.out.println("--------------------------------------SCREEN 2-------------------------------------------------------");
                System.out.println("NAANE VARUVEAN");
                System.out.println("(U/A) TAMIL 2h 15m 2D");
                if (info.getShowNumber() == 1)
                    System.out.printf("%-20s%-20s\n", "SHOW", "show 1 - 9 AM");
                if (info.getShowNumber() == 2)
                    System.out.printf("%-20s%-20s\n", "SHOW", "show 2 - 1 PM");
                if (info.getShowNumber() == 3)
                    System.out.printf("%-20s%-20s\n", "SHOW", "show 3 - 5 PM");
                if (info.getShowNumber() == 4)
                    System.out.printf("%-20s%-20s\n", "SHOW", "show 4 - 9 PM");
            }
            System.out.printf("%-20s%-20s\n", "NAME:", info.getName());
            System.out.printf("%-20s%-20s\n", "Mobile Number", info.getMobileNumber());
            System.out.printf("%-20s%-20s\n", "NO OF SEATS", info.getTotalNoOfTickets());
            System.out.printf("%-20s%-20s\n", "SEAT NAMES", info.getTotalSeatNumber());
            System.out.printf("%-20s%-20s\n", "Ticket Rate", "Rs.120");
            System.out.println("----------------------------------------------------------------------------------------------------");
            System.out.printf("%-20s%-20s\n", "Amount", "Rs." + info.getAmount());
            System.out.printf("%-20s%-20s\n", "CGST", "Rs." + info.getAmount() * 0.14);
            System.out.printf("%-20s%-20s\n", "SGST", "Rs." + info.getAmount() * 0.14);
            System.out.println("-----------------------------------------------------------------------------------------------------");
            System.out.printf("%-40s\n", "Total Amount to Pay Rs." + df.format(info.getTotalAmount()));
            System.out.println("-----------------------------------------------------------------------------------------------------");
        }
    }

    private boolean seatAvailabilityCheck(int screenNo, int show, String seatNo) {
        boolean seatAlreadyBooked = false;
        if (screenNo == 1) {
            if (show == 1) {
                for (int index = 0; index < 100; index++) {
                    if (screen1show1.get(index).getSeatNumber().equals(seatNo) && screen1show1.get(index).isAvailable()) {
                        seatAlreadyBooked = true;
                    }
                }
            }
            if (show == 2) {
                for (int index = 0; index < 100; index++) {
                    if (screen1show2.get(index).getSeatNumber().equals(seatNo) && screen1show2.get(index).isAvailable()) {
                        seatAlreadyBooked = true;
                    }
                }
            }
            if (show == 3) {
                for (int index = 0; index < 100; index++) {
                    if (screen1show3.get(index).getSeatNumber().equals(seatNo) && screen1show3.get(index).isAvailable()) {
                        seatAlreadyBooked = true;
                    }
                }
            }
            if (show == 4) {
                for (int index = 0; index < 100; index++) {
                    if (screen1show4.get(index).getSeatNumber().equals(seatNo) && screen1show4.get(index).isAvailable()) {
                        seatAlreadyBooked = true;
                    }
                }
            }
        }
        if (screenNo == 2) {
            if (show == 1) {
                for (int index = 0; index < 100; index++) {
                    if (screen2show1.get(index).getSeatNumber().equals(seatNo) && screen2show1.get(index).isAvailable()) {
                        seatAlreadyBooked = true;
                    }
                }
            }
            if (show == 2) {
                for (int index = 0; index < 100; index++) {
                    if (screen2show2.get(index).getSeatNumber().equals(seatNo) && screen2show2.get(index).isAvailable()) {
                        seatAlreadyBooked = true;
                    }
                }
            }
            if (show == 3) {
                for (int index = 0; index < 100; index++) {
                    if (screen2show3.get(index).getSeatNumber().equals(seatNo) && screen2show3.get(index).isAvailable()) {
                        seatAlreadyBooked = true;
                    }
                }
            }
            if (show == 4) {
                for (int index = 0; index < 100; index++) {
                    if (screen2show4.get(index).getSeatNumber().equals(seatNo) && screen2show4.get(index).isAvailable()) {
                        seatAlreadyBooked = true;
                    }
                }
            }
        }
        return !seatAlreadyBooked;
    }


    public void collectionDetails() {
        totalCollectionDetails(customers);
    }

    private void totalCollectionDetails(ArrayList<CustomerInfo> customers) {
        int sumOfAmount = 0;
        double sumOfTotalAmount = 0.0;
        for (CustomerInfo customer : customers) {
            sumOfAmount += customer.getAmount();
            sumOfTotalAmount += customer.getTotalAmount();
        }
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-50s%-20s\n", "Total Collection Amount:", sumOfAmount);
        System.out.printf("%-50s%-20s\n", "Total CGST:", sumOfAmount * 0.14);
        System.out.printf("%-50s%-20s\n", "Total SGST:", sumOfAmount * 0.14);
        System.out.printf("%-50s%-20s\n", "Total GST:", sumOfAmount * 0.28);
        System.out.printf("%-50s%-20s\n", "Total Collection Amount with GST:", sumOfTotalAmount);
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
    }
}


