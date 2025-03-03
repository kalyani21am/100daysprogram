package doc;

public class Bank {
    int AccBalance = 1000;

    
    public void Deposit(int amount) {
    	System.out.println("enter amount"+amount);
        if (amount > 0) {
        	
            AccBalance += amount; 
            
        } else {
            System.err.println("Invalid amount. Please enter a positive value.");
        }
        
    }



    public void Withdraw(int amount1) {
        if (amount1 > AccBalance) {
            System.err.println("Insufficient balance. Available Balance: " + AccBalance);
        } else {
            AccBalance -= amount1;
            
        }
        
    }
    public int ShowBalance()
    {
    	System.out.println("Current account balance:"+AccBalance);
    	return AccBalance;
    }
    

    
}