import java.util.Scanner;

public class Coffeeshop {
    public static void main(String[] args){
        while(true){
        Scanner sc = new Scanner(System.in);
        // ask the user for their balance
        // ask the user if they want esspresso or americano
        // ask the user how many they want
        // if the user inputs 0 or a negative number, produce no output
        // if the user can not afford the number of coffees requested, produce no output
        // the user should get a different message depending on the type of coffee they purchased
        System.out.println("whats your balance?");
        String balanceInput = sc.nextLine();
        double balance = Double.parseDouble(balanceInput);
        System.out.println("what type of coffee do you want? Enter espresso or latte.");
        String coffeeInput = sc.nextLine();
        System.out.println("how many do you want?");
        int amountInput = Integer.parseInt(sc.nextLine());
        double espressoPrice = 3.99;
        double lattePrice = 2.99;

        if(amountInput > 0 ){
            // proceed with coffee purchase attempt
            boolean isEspresso = coffeeInput.equalsIgnoreCase("espresso");
            boolean isAmericano = coffeeInput.equalsIgnoreCase("latte");
            if(isEspresso && (balance >= (espressoPrice * amountInput))){
                // print out a successful espresso purchase message
                System.out.println("enjoy your espresso");
                
            }
            if(isAmericano && (balance >= (americanoPrice * amountInput))){
                System.out.println("enjoy your americano");
            }
            
        }else{
            System.out.println("no coffee - amount requested is 0 or less");
        }
        // no coffee
    }
}
}
