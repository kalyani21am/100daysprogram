package doc;

public class Ticket {
          int Available =100;
         
          public void Book(int ticket) {
          	System.out.println("enter Ticket"+ticket);
              if (ticket > 0) {
              	
                  Available += ticket;
          
                  
              } else {
                  System.err.println("Invalid amount. Please enter a positive value.");
              }
              
          }
          public void Cancel(int amount1) {
              if (amount1 > Available) {
                  System.err.println("Insufficient balance. Available Balance: " + Available);
              } else {
                  Available -= amount1;
                  
              }
          }
}
