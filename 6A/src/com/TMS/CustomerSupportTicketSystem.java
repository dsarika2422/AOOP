package com.TMS;

import java.util.LinkedList;
import java.util.Queue;

public class CustomerSupportTicketSystem {
	private Queue<String> tickets;

    public CustomerSupportTicketSystem() {
        tickets = new LinkedList<>();
    }

    public void addTicket(String ticket) {
        tickets.add(ticket);
    }

    public void processTicket() {
        if (!tickets.isEmpty()) {
            String processedTicket = tickets.poll();
            System.out.println("Processed ticket: " + processedTicket);
        } else {
            System.out.println("No tickets to process.");
        }
    }

    public void displayPendingTickets() {
        System.out.println("Pending tickets:");
        for (String ticket : tickets) {
            System.out.println(ticket);
        }
    }

    public static void main(String[] args) {
        CustomerSupportTicketSystem csts = new CustomerSupportTicketSystem();
        csts.addTicket("Ticket 1: Issue with login");
        csts.addTicket("Ticket 2: Payment problem");
        csts.displayPendingTickets();
        csts.processTicket();
        csts.displayPendingTickets();
    }
}
