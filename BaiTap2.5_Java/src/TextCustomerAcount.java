public class TextCustomerAcount {
    public static void main(String[] args) {
          Customer customer1 = new Customer(88, "Tan Ah Teck", 'm');
          System.out.println(customer1);

          Account account1 = new Account(101, customer1, 999.9);
          System.out.println(account1);

          account1.withdraw(200);
          System.out.println(account1);

          account1.withdraw(1000);
    }
}
