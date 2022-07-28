package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
      int revert= 0;
        while(number > 0){
            revert = (revert*10)+ number % 10;
            number = number / 10;
        }
        System.out.println(revert);
    }
}
