package lang.print.gaps.finalModuleTask;

public class NumberReverter {
        public void revert(int number) {
           int num = 0;
            for (int i = 0; i < 3; i++){
                num += (number % 10);
                number/=10;
                num *= 10;
        }
            System.out.println(num/10);
    }
}
