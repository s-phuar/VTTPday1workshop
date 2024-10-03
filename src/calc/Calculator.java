package calc;

import java.io.Console;

public class Calculator {

    Console cons = System.console();

    public static void main (String[] args){
        //declare accumulator
        float value = 0;
        float acc = 0;

        boolean stop = false;
        Console cons = System.console();

        while(!stop){
        String cmd = cons.readLine("CMD> ").trim().toUpperCase();

            switch (cmd){
                // ADD 5 6 7 8
                case "ADD":
                cmd = cons.readLine("VAL> ") .trim();
                value = Float.parseFloat(cmd);
                acc+= value;
                break;

                //SUB 5 6 7 8
                case "SUB":
                cmd = cons.readLine("VAL> ").trim();
                value = Float.parseFloat(cmd);
                acc-= value;
                break;                
                
                //DIV 4
                case "DIV":
                cmd = cons.readLine("VAL> ").trim();
                value = Float.parseFloat(cmd);
                acc/= value;
                break;
                
                //MUL 5 6 7 8
                case "MUL":
                cmd = cons.readLine("VAL> ").trim();
                value = Float.parseFloat(cmd);
                acc*= value;
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
