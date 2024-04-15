package day7;

public class Assignment3_3 {
    // TODO:
    //  사용자로부터 숫자 n을 입력받아, 1부터 n까지의 합을 계산하여 출력하는 프로그램을 작성하세요.
    public static void main(String[] args) {
        InputReciever inputReciever = new InputReciever();
        Calculator calculator = new Calculator();
        System.out.print("1부터 몇까지 더할지 입력하세요: ");
        int num = Integer.parseInt(inputReciever.getIntInput(false));
        System.out.print(String.format("1부터 %d까지의 정수의 합은 %d", num, calculator.sum1ToN(num)));
    }
}
