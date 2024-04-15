package day7;

public class Assignment4_3 {
    //TODO:
    // 주어진 정수 배열에서 최댓값과 최솟값을 찾아 출력하는 프로그램을 작성하세요.
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int[] arr = new int[]{1,2,-3,0,5};
        if(arr.length == 0){
            System.out.println("빈 배열 입력됨");
        }else{
            System.out.println(String.format("최대값: %d, 최소값: %d", calculator.getMaxInt(arr), calculator.getMinInt(arr)));
        }
    }
}
