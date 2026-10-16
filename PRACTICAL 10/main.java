
class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    BankAccount(String holder, String number, double balance) {
        this.accountHolder = holder;
        this.accountNumber = number;

        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
        } else {
            balance += amount;
            System.out.println("Deposit successful.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        }
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount(
            "Rahul", "12345", 5000
        );

        System.out.println("Account Holder: " + b.getAccountHolder());
        System.out.println("Account Number: " + b.getAccountNumber());
        System.out.println("Initial Balance: Rs." + b.getBalance());

        b.deposit(1000);
        b.deposit(-500);

        b.withdraw(2000);
        b.withdraw(10000);
        b.withdraw(0);

        System.out.println("Final Balance: Rs." + b.getBalance());
    }
}
