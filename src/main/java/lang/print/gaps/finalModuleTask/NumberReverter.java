package lang.print.gaps.finalModuleTask;

import java.util.Scanner;

public class NumberReverter {
    public void revert(int number) {
       if (number>100){
        int first = number/100;
        int third = number%10;
        int second = (number/10)%10;
           System.out.println(""+third+second+first);
       }
       else System.out.println(number);
    }
}
