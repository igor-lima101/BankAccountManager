public class BankAccount {

    private int number;
    private String name;
    private double amount;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public BankAccount(int number, String name, double amount){
        this.number = number;
        this.name = name;
        this.amount = amount;
    }

    public void withdraw(double value){
        if(getAmount() < 0 || getAmount() < value){
            System.out.println("Error, insufficient founds");
            return;
        }
        setAmount(getAmount() - value);
        System.out.println("Transaction completed: withdraw -- [" + value + " R$]\n" + "Amount: [" + getAmount() + " R$]");
    }

    public void deposit(double value){
        if(value <= 0){
            System.out.println("Error, insufficient value");
            return;
        }

        setAmount(getAmount() + value);
        System.out.println("Transaction completed: deposit -- [" + value + " R$]\n" + "Amount: [" + getAmount() + " R$]");
    }
}
