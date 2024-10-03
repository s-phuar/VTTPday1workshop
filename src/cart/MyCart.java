package cart;

import java.io.Console;

public class MyCart {


    public static void main(String[] args){
        Console cons = System.console();
        String input = cons.readLine("Number of items in your cart? ");
        int itemCount = Integer.parseInt(input);
        
        //create the cart array
        String[] cart = new String[itemCount];
        
        for(int i = 0; i < cart.length; i++){
            cart[i] = cons.readLine("Add item %d: ", i + 1);
        }

        for(int i = 0; i < cart.length; i++){
            System.out.printf("%d. %s\n", i + 1, cart [i]);
        }

}   
    
}
