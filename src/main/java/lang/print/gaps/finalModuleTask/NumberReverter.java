package lang.print.gaps.finalModuleTask;

import java.util.Scanner;

public class NumberReverter {
    public void revert(int number) {
//       if (number>100){
//        int first = number/100;
//        int third = number%10;
//        int second = (number/10)%10;
//           System.out.println(""+third+second+first);
//       }
//       else System.out.println(number);
        int revert= 0;
        while(number > 0){
            revert = (revert*10)+ number % 10;
            number = number / 10;
        }
        System.out.println(revert);
    }
}
