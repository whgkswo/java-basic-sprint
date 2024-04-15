package day7;

import java.util.ArrayList;

public class Calculator {
    // 기본적인 사칙연산을 수행하는 메서드
    double basicCalculate(double num1, double num2, char operator){
        switch(operator){
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
        }
        return Integer.MIN_VALUE; // 연산자가 올바르지 않을 때
    }
    // 파라미터 중 가장 작은 값을 반환하는 메서드
    int getMinInt(int [] input){
        int minValue = Integer.MAX_VALUE;
        for(int i: input){
            minValue = Math.min(i, minValue);
        }
        return minValue;
    }
    // 파라미터 중 가장 큰 값을 반환하는 메서드
    int getMaxInt(int[] input){
        int maxValue = Integer.MIN_VALUE;
        for(int i: input){
            maxValue = Math.max(i, maxValue);
        }
        return maxValue;
    }
    // 주어진 숫자가 짝수인지 반환하는 메서드
    boolean isEven(int input){
        return input % 2 == 0;

    }
    // from ~ to 사이 짝수를 배열로 반환하는 메서드
    int[] getEvenNumbers(int from, int to){
        ArrayList<Integer> evenAL = new ArrayList<>();
        // from부터 to까지 순회
        for(int i = from; i<= to; i++){
            if(i % 2 == 0){ // 짝수면
                evenAL.add(i);  // evenAL에 추가
            }
        }
        // 리턴값에 담을 배열 생성
        int[] evenNumbers = new int[evenAL.size()];
        // evenAL을 배열에 담기
        for(int i = 0; i< evenAL.size(); i++){
            evenNumbers[i] = evenAL.get(i);
        }
        return evenNumbers;
    }
    // 입력받은 수의 부호를 반환하는 메서드
    int getPlusOrMinus(double input){
        if(input > 0){
            return 1;
        } else if(input == 0){
            return 0;
        }else{
            return -1;
        }
    }
    // 1부터 입력받은 수까지 합을 반환하는 메서드
    int sum1ToN(int input){
        int sum = 0;
        for(int i = 1; i<= input; i++){
            sum += i;
        }
        return sum;
    }
    // 파라미터 요소의 평균값을 반환하는 메서드
    double getAverage(double[] input){
        double sum = 0;
        for(double i: input){
            sum += i;
        }
        return sum / input.length;
    }
}
