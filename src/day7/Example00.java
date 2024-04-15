package day7;

public class Example00 {
    public static void main(String[] args) {
        int intNum = 0; // 4바이트 = 32비트 = 2^32개 (+-21억)
        double dNum = 0.12345678901234567890; // 8바이트 = 64비트 = 2^64개 (15자리)
        char character = 'a'; // 숫자를 넣으면 유니코드로 자동 할당
        boolean isTrue = false;
        String str = "";    // 재할당만 가능하고 특정 요소 수정 불가

        int[] a = new int[0];
        intNum = a.length;
        System.out.println(dNum);

        Integer integerNum;
        integerNum = intNum;
        System.out.println(integerNum instanceof Integer);
        intNum = integerNum;
        //System.out.println(intNum instanceof Integer);
    }
}
