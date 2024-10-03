package array;

public class MainArrays {
    public static void main (String[] args){
        String[] myList = new String[5];
            myList[0] = "hello";
            myList[1] = "world";
            myList[2] = "abc123";
            System.out.printf(">> %s\n", myList[2]);
            System.out.println(myList.length);

            int counter = 0;
        while(counter < myList.length){
            System.out.println(myList[counter]);
            counter++;
        }

    }
}
