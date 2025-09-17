package Homework2;
// Transaction.java
class Transaction {
    
    // Method 1: Google Pay Transaction
    public void transaction(String sender, String receiver, double amount, String upiId, String transactionId) {
        System.out.println("Google Pay Transaction:");
        System.out.println("Sender: " + sender);
        System.out.println("Receiver: " + receiver);
        System.out.println("Amount: ₹" + amount);
        System.out.println("UPI ID: " + upiId);
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("-----------------------------");
    }

    // Method 2: Demand Draft (DD) Transaction
    public void transaction(String sender, String receiver, double amount, int ddNumber, String bankName) {
        System.out.println("Demand Draft Transaction:");
        System.out.println("Sender: " + sender);
        System.out.println("Receiver: " + receiver);
        System.out.println("Amount: ₹" + amount);
        System.out.println("DD Number: " + ddNumber);
        System.out.println("Bank: " + bankName);
        System.out.println("-----------------------------");
    }
 // Method 3: Cheque Transaction
    public void transaction(String sender, String receiver, double amount, int chequeNumber, String issueDate) {
        System.out.println("Cheque Transaction:");
        System.out.println("Sender: " + sender);
        System.out.println("Receiver: " + receiver);
        System.out.println("Amount: ₹" + amount);
        System.out.println("Cheque No: " + chequeNumber);
        System.out.println("Issue Date: " + issueDate);
        System.out.println("-----------------------------");
    }

    // Method 4: Credit Card Transaction
    public void transaction(String sender, String receiver, double amount, String cardNumber, String expiryDate) {
        System.out.println("Credit Card Transaction:");
        System.out.println("Sender: " + sender);
        System.out.println("Receiver: " + receiver);
        System.out.println("Amount: ₹" + amount);
        System.out.println("Card No: " + cardNumber);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("-----------------------------");
    }

    // Method 5: Net Banking Transaction
    public void transaction(String sender, String receiver, double amount, String accountNumber, String ifscCode) {
        System.out.println("Net Banking Transaction:");
        System.out.println("Sender: " + sender);
        System.out.println("Receiver: " + receiver);
        System.out.println("Amount: ₹" + amount);
        System.out.println("Account No: " + accountNumber);
        System.out.println("IFSC Code: " + ifscCode);
        System.out.println("-----------------------------");
    }
}
//Main class
public class Main {
 public static void main(String[] args) {
     Transaction t = new Transaction();

     // Google Pay
     t.transaction("Alice", "Bob", 2500.50, "alice@upi", "TXN12345");

     // DD
     t.transaction("John", "University", 15000, 987654, "SBI");

     // Cheque
     t.transaction("David", "Mike", 5000, 112233, "12-09-2025");

     // Credit Card
     t.transaction("Emma", "ShopMart", 3200, "4111-2222-3333-4444", "08/28");

     // Net Banking
     t.transaction("Sophia", "Electricity Board", 4500, "1234567890", "HDFC0001234");
    }
}