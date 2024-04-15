package day7;

public class Assignment4_2 {
    //TODO:
    // 사용자로부터 5명의 학생의 점수를 입력받아 배열에 저장한 다음, 평균 점수를 계산하여 출력하세요.
    public static void main(String[] args) {
        InputReciever inputReciever = new InputReciever();
        Calculator calculator = new Calculator();
        System.out.print("첫 번째 점수를 입력하세요: ");
        double scoreA = Double.parseDouble(inputReciever.getDoubleInput(true, false));
        System.out.print("두 번째 점수를 입력하세요: ");
        double scoreB = Double.parseDouble(inputReciever.getDoubleInput(true, false));
        System.out.print("세 번째 점수를 입력하세요: ");
        double scoreC = Double.parseDouble(inputReciever.getDoubleInput(true, false));
        System.out.print("네 번째 점수를 입력하세요: ");
        double scoreD = Double.parseDouble(inputReciever.getDoubleInput(true, false));
        System.out.print("다섯 번째 점수를 입력하세요: ");
        double scoreE = Double.parseDouble(inputReciever.getDoubleInput(true, false));

        System.out.print(String.format("평균은 %f", calculator.getAverage(new double[]{scoreA, scoreB, scoreC, scoreD, scoreE})));
    }
}
