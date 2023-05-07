public class Bank {
    float balance = 0;

    Bank(float money) {
        this.balance = money;

    }

    public void withdraw(float money) {
        this.balance = this.balance - money;
        System.out.println(this.balance);
    }

    public void deposit(float money) {
        this.balance = this.balance + money;
        System.out.println(this.balance);
    }

    public static void main(String[] args) {
        Bank bank = new Bank(2500);

        bank.deposit(200);
        bank.withdraw(54);
        bank.deposit(94);
        bank.withdraw(7);

    }
}