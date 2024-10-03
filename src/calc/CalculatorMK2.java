package calc;

import java.io.Console;

public class CalculatorMK2 {

//declare a constant at class level, naming convention all uppercase
//final makes something immutable, unable to update it
public static final int CMD_POS = 0;


    public static void main (String[] args){
        //declare accumulator
        float value = 0;
        float acc = 0;

        boolean stop = false;
        Console cons = System.console();

        while(!stop){
            //beware adding uppercase here, program specs may change in the future, e.g. logarithm
        String cmd = cons.readLine("CMD> ").trim().toUpperCase();
        String[] cmdSplit = cmd.split(" ");
        //System.out.println(cmdSplit[0]);

            switch (cmdSplit[CMD_POS]){
                // ADD 5 6 7 8
                case "ADD":
                for(int i = 1; i < cmdSplit.length; i++){
                    value = Float.parseFloat(cmdSplit[i]);
                    acc += value;
                }
                break;

                //SUB 5 6 7 8
                case "SUB":
                for(int i = 1; i < cmdSplit.length; i++){
                    value = Float.parseFloat(cmdSplit[i]);
                    acc -= value;
                }
                break;              
                
                //DIV 4
                case "DIV":
                for(int i = 1; i < cmdSplit.length; i++){
                    value = Float.parseFloat(cmdSplit[i]);
                    acc /= value;
                }
                break; 
                
                //MUL 5 6 7 8
                case "MUL":
                for(int i = 1; i < cmdSplit.length; i++){
                    value = Float.parseFloat(cmdSplit[i]);
                    acc *= value;
                }
                break; 

                case "INIT":
                acc = 0;
                break;

                case "BRK":
                stop = true;
                break;

                case "SHOW":
                System.out.printf("> %3f\n", acc);
                break;

                default:
        }    
    }


    }

}
