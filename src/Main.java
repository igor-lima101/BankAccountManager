//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(10, "igor", 2000.00);
        BankAccount bankAccount1 = new BankAccount(20, "Marcos", 1000.00);
        bankAccount.withdraw(500.00);
        bankAccount1.deposit(230.00);

        System.out.println("\n--- final amounts ---");
        System.out.println(bankAccount.getName() + " | Account: " + bankAccount.getNumber() + " | Balance: " + String.format("%.2f R$", bankAccount.getAmount()));
        System.out.println(bankAccount1.getName() + " | Account: " + bankAccount1.getNumber() + " | Balance: " + String.format("%.2f R$", bankAccount1.getAmount()));
    }

}