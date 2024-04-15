package day7;

import java.util.Scanner;

public class InputReciever {
    String getStringInputWithoutNumber(){
        while(true){
            Scanner sc = new Scanner(System.in);
            String nameInput = sc.next();
            Validation nameValidation = new Validation();
            if(nameValidation.isStringValid(nameInput)){
                //sc.close(); // <- 에러
                return nameInput;
            }else{
                System.out.print("숫자가 포함되면 안 됩니다. (다시 입력하세요): ");
            }
        }
    }
    String getIntInput(boolean negativeValueAllowed){
        // 유효한 수가 들어올 때까지 반복
        while(true){
            Scanner sc = new Scanner(System.in);
            String ageInput = sc.next();
            Validation ageValidation = new Validation();
            // 입력받은 수가 유효한지 검사
            if(ageValidation.isIntValid(ageInput, negativeValueAllowed)){
                //sc.close(); // <- 에러
                return ageInput;
            }else{
                System.out.print("유효한 정수를 입력해야 합니다. (다시 입력하세요): ");
            }
        }
    }
    String getDoubleInput(boolean zeroAllowed, boolean negetiveValueAllowed){
        // 유효한 수가 들어올 때까지 반복
        while(true){
            Scanner sc = new Scanner(System.in);
            String doubleInput = sc.next();
            Validation doubleValidation = new Validation();
            // 입력한 숫자가 유효한지 검사
            if (doubleValidation.isDoubleValid(doubleInput,zeroAllowed, negetiveValueAllowed)) {
                //sc.close(); // <- 에러
                return doubleInput;
            }else {
                System.out.print("유효한 수를 입력해야 합니다. (다시 입력하세요): ");
            }
        }
    }
}
