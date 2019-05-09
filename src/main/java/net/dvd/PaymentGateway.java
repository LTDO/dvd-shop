package net.dvd;

interface PaymentGateway {
    boolean pay(String customer, double amount);
}
