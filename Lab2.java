
// Lab D2 ques_no. 1

/* 
1. Create a Bank class and declare an instance variable named amount of type double.Create parameterized constructor to initialize variable "amount" 
with value 10000.Create two methods withdraw(double withdrawalAmount) and deposit(double depositAmount).Calculate withdrawal based on some condition 
(using ternary operator) like If amount is sufficient then "withdraw successful" message will be printed on the console and amount should be updated 
after withdraw. Later on, deposit 5000 in the account balance.At the end display total balance on the console. String message = (withdrawal Amount <= amount) ? 
"Withdrawal successful" : "Insufficient balance"; 
*/

public class Lab2 {
    private double amount;

    // Parameterized constructor to initialize the amount
    public Bank(double initialAmount) {
        this.amount = initialAmount;
    }


    // Method to withdraw money
    public String withdraw(double withdrawalAmount) {
        
        String message = (withdrawalAmount <= amount) ? "Withdrawal successful" : "Insufficient balance"; // checking if withdraw possible

         
        if (withdrawalAmount <= amount) {   // for updating amount after , withdrawal
            amount -= withdrawalAmount;
        }

        return message;
    }


    // Method to deposit money
    public void deposit(double depositAmount) {
        
        amount += depositAmount;
    }


    // Method to get the total balance
    public double getBalance() {
        return amount;
    }


    public static void main(String[] args) {
       
        Bank bank = new Bank(10000);  // making inital amount 10,000

		String withdrawMessage = bank.withdraw(6000); // withdraw 6,000
        System.out.println(withdrawMessage);

        bank.deposit(5000); // depositing 5,000

        
        System.out.println("Final balance: Rs. " + bank.getBalance()); 
    }
}


