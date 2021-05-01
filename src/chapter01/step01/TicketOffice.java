package chapter01.step01;

import java.util.List;

public class TicketOffice {
    private Long amount;
    private final List<Ticket> ticket;

    public TicketOffice(Long amount, List<Ticket> ticket) {
        this.amount = amount;
        this.ticket = ticket;
    }

    public Ticket getTicket() {
        return ticket.remove(0);
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
