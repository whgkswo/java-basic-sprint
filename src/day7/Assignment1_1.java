package day7;

public class Assignment1_1 {
    public static void main(String[] args) {
        InputReciever inputReciever = new InputReciever();

        System.out.print("이름을 입력하세요: ");
        String name = inputReciever.getStringInputWithoutNumber();
        System.out.print("나이를 입력하세요: ");
        int age = Integer.parseInt(inputReciever.getIntInput(false));

        System.out.println(String.format("%s(%d세)", name,age));
    }
}
