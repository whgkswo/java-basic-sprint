package day7;

public class Assignment2_1 {
    public static void main(String[] args) {

        InputReciever inputReciever = new InputReciever();
        System.out.print("첫 번째 수를 입력하세요: ");
        double num1 = Double.parseDouble(inputReciever.getDoubleInput(true, true));
        System.out.print("두 번째 수를 입력하세요 (0 금지): ");
        double num2 = Double.parseDouble(inputReciever.getDoubleInput(false, true));

        Calculator calculator = new Calculator();
        String operators = "+-*/";
        for(int i = 0; i< operators.length(); i++){
            System.out.println(String.format("%f %s %f = %f", num1, operators.charAt(i), num2,
                    calculator.basicCalculate(num1,num2,operators.charAt(i))));
        }
    }
}
