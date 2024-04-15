package day7;

public class Assignment3_1 {
    // TODO:
    //  사용자로부터 숫자를 하나 입력받아, 이 숫자가 양수인지, 음수인지, 아니면 0인지를 판단하여 출력하는 프로그램을 작성하세요.
    public static void main(String[] args) {
        // 필요한 인스턴스 생성
        InputReciever inputReciever = new InputReciever();
        Calculator calculator = new Calculator();
        System.out.print("숫자를 입력하세요: ");
        // 숫자 입력받기
        double input = Double.parseDouble(inputReciever.getDoubleInput(true, true));
        // 입력받은 숫자에 따라 실행
        switch (calculator.getPlusOrMinus(input)){
            case 1:
                System.out.println(String.format("%f는 양수", input));
                break;
            case 0:
                System.out.println(String.format("%f는 0", input));
                break;
            case -1:
                System.out.println(String.format("%f는 음수", input));
                break;
        }
    }
}
