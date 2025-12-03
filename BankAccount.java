//  1. create a  java code  for a bankaccount  where account number and balance are class  ensure balance cannot be direclty midfiy allow only deposit  and withdraw method 
// 2. create a class name emloyee with the feild name  and salary and method to display the details of employee and slary should now be set directly and create a method to increasesalary or double  percent  

class Bank_Acc{
    private String account;
    private double balance;
    public Bank_Acc(String account , double initialBalance){
      this.account = account;
        if(initialBalance >= 0){
            balance = initialBalance;
        }
        else{
            this.balance =0;
            System.out.println("Initial balance connot be negative. Set to 0");
        }
    }
    public String getAccount(){
        return account;
    }
    public double getBalance(){
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0){
            balance += amount;
            System.out.println("Deposit: " + amount);
        }
        else{
            System.out.println("Deposit amount must be positive");
        }
    
    } 
    public void withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdraw: " + amount);
        }
        else{
            System.out.println("Invalid withdraw amount!");
        }
    }
    
}