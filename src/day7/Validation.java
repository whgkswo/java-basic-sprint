package day7;

public class Validation {
    boolean isStringValid(String input){
        String refStr = "0123456789";
        for(int i = 0; i< refStr.length(); i++){
            if(input.contains(""+refStr.charAt(i))){
                return false;
            }
        }
        return true;
    }
    boolean isIntValid(String input, boolean negativeValueAllowed){
        String refStr = "0123456789";
        int iOffset = 0;

        // 음수가 허용된다면, 첫 자리가 -부호일 때 첫 자리를 검사 대상에서 제외
        if(negativeValueAllowed && input.charAt(0) == '-'){
            iOffset = 1;
        }
        // 0 또는 1부터 끝까지 순회
        for(int i = iOffset; i< input.length(); i++){
            // refStr에 포함된 문자(숫자)가 아닌 다른 게 들어오면 안 됨
            if(!refStr.contains(""+input.charAt(i))){
                return false;
            }
        }
        return true;
    }
    boolean isDoubleValid(String input, boolean zeroAllowed, boolean negetiveValueAllowed){
        int dotCount = 0;   int iOffset = 0;
        // 첫글자가 -기호면 음수라는 뜻
        if(input.charAt(0) == '-'){
            iOffset = 1; // 첫 자리는 검사 대상에서 제외하겠다는 뜻
        }
        // 양수면 0부터 순회, 음수면 첫 자리 제외 1부터 순회
        for(int i = iOffset; i< input.length(); i++){
            // 숫자가 아닌 무언가라면
            if(!Character.isDigit(input.charAt(i))){
                // 소수점 한 번까지는 ok
                if(input.charAt(i) == '.' && dotCount == 0){
                    dotCount ++;
                }else{ // 소수점이 아니거나, 두 번 이상 나왔다면 유효하지 않음
                    return false;
                }
            }
        }
        // 여기까지 오면 위에서 숫자가 아닌 것들이 걸러지고 유효한 실수만 남음. 그 중에서
        if(zeroAllowed){  // 0이 허용된다면
            if(negetiveValueAllowed){ // 음수 허용되는지 보고
                return true;
            }else{
                return iOffset == 0; // 허용 안 되면 양수만 통과 (위에서 음수면 iOffset = 1 했음)
            }
        }else{
            // 0이 금지된다면 0만 빼고
            if(Double.parseDouble(input) == 0.0){
                return false;
            }else{
                if(negetiveValueAllowed){ // 음수 허용되는지 보고
                    return true;
                }else{
                    return iOffset == 0; // 허용 안 되면 양수만 통과 (위에서 음수면 iOffset = 1 했음)
                }
            }
        }
    }
}
