@FunctionalInterface
interface PaymentProcessor {
    boolean PaymentAmount(double amount);

    default void TransactionLogger()
    {
        System.out.println("The transaction is logged");
    }
}
