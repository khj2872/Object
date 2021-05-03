package chapter02;

public class Reservation {
    private final Customer customer;
    private final Screening screening;
    private final Money calculateFee;
    private final int audienceCount;

    public Reservation(Customer customer, Screening screening, Money calculateFee, int audienceCount) {
        this.customer = customer;
        this.screening = screening;
        this.calculateFee = calculateFee;
        this.audienceCount = audienceCount;
    }
}
