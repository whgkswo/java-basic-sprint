package day7;

public class Assignment2_3 {
    public static void main(String[] args) {
        int[] numbers = {1,2,7,6,31,-5,57,42,8,13};
        Calculator calculator = new Calculator();

        for(int i : numbers){
            // 짝수이자 양수이면
            if(calculator.isEven(i) && i > 0){
                System.out.println(String.format("%d는 짝수이자 양수", i));
            }
            if(calculator.isEven(i) || i > 0){
                System.out.println(String.format("%d는 짝수이거나 양수", i));
            }
            if(!calculator.isEven(i)){
                System.out.println(String.format("%d는 짝수가 아님", i));
            }
        }
    }
}
