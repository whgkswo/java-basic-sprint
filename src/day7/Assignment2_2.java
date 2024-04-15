package day7;

public class Assignment2_2 {
    public static void main(String[] args) {
        InputReciever inputReciever = new InputReciever();
        System.out.print("첫 번째 수를 입력하세요: ");
        int num1 = Integer.parseInt(inputReciever.getIntInput(true));
        System.out.print("두 번째 수를 입력하세요: ");
        int num2 = Integer.parseInt(inputReciever.getIntInput(true));
        System.out.print("세 번째 수를 입력하세요: ");
        int num3 = Integer.parseInt(inputReciever.getIntInput(true));

        Calculator calc = new Calculator();
        int maxNumber = calc.getMaxInt(new int[]{num1, num2, num3});   int minNumber = calc.getMinInt(new int[]{num1, num2, num3});
        System.out.println(String.format("%d, %d, %d 중 최대값: %d, 최소값: %d", num1, num2, num3, maxNumber, minNumber));
    }
}
