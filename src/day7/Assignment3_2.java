package day7;

import java.util.Arrays;

public class Assignment3_2 {
    // TODO:
    //  1부터 100까지의 정수 중에서 짝수만 출력하는 프로그램을 작성하세요.
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("1부터 100 중 짝수는");
        System.out.println(Arrays.toString(calculator.getEvenNumbers(1, 100)));
    }
}
