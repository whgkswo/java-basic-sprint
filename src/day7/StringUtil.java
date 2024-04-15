package day7;

public class StringUtil {
    // TODO: - **`StringUtil`** 클래스를 생성하세요. 이 클래스는 문자열 처리와 관련된 다양한 기능을 제공하는 유틸리티 메서드를 포함할 것입니다.
    //  다음 기능을 수행하는 메서드를 **`StringUtil`** 클래스 내에 작성하세요:
    //    - **`reverse`**: 하나의 **`String`**을 매개변수로 받아 그 문자열을 뒤집은 결과를 반환합니다.
    //    - **`concat`**: 두 개의 **`String`**을 매개변수로 받아 이를 연결한 결과를 반환합니다.
    //    - **`contains`**: 하나의 **`String`**과 하나의 문자를 매개변수로 받아, 주어진 문자열이 해당 문자를 포함하는지 여부를 반환합니다.
    //  **메서드 오버로딩 실습**
    //    - **`concat`** 메서드를 오버로딩하여, 세 개의 **`String`**을 매개변수로 받아 이를 모두 연결한 결과를 반환하는 버전을 추가하세요.
    //    - **`contains`** 메서드를 오버로딩하여, 두 개의 **`String`**을 매개변수로 받아 첫 번째 문자열이 두 번째 문자열을 포함하는지 여부를 반환하는 버전을 추가하세요.

    static String reverse(String input){
        String result = "";
        for(int i = input.length()-1; i>= 0; i--){
            result += input.charAt(i);
        }
        return result;
    }
    // 문자열 붙이기
    static String concat(String strA, String strB){
        return strA + strB;
    }
    // 문자열 3개 붙이기
    static String concat(String strA, String strB, String strC){
        return strA + strB + strC;
    }
    // 문자열 문자 포함 여부
    static boolean contains(String str, char c){
        for(int i = 0; i< str.length(); i++){
            if(c == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
    // 문자열 문자열 포함 여부
    static boolean contains(String strA, String strB){
        int matchCount;
        // offset: B문자열이 A문자열의 몇 번 인덱스부터 대조를 시작할지 저장
        for (int offset = 0; offset<= strA.length() - strB.length(); offset++){
            matchCount = 0;     // 몇 개의 문자가 일치했는지 담을 변수
            // B문자열의 길이만큼 순회
            for(int j = 0; j< strB.length(); j++){
                if(strA.charAt(j + offset) == strB.charAt(j)){
                    matchCount ++;
                }
            }
            // 순회 종료 후 정해진 숫자(B문자열의 길이)만큼 일치했는지 (모두 일치했는지)
            if(matchCount == strB.length()){
                return true;
            }
        }
        return false;
    }
}
