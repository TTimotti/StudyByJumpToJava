package jump.to.java.chap5;

/**
 * 문제 2번
 * 객체변수 value가 100 보다 큰 값은 가질 수 없도록 제한하는 
 * MaxLimitCalculator 클래스를 만들어 보자. 
 * 
 * 단 MaxLimitCalculator 클래스는 반드시 Quest1의 Calculator 클래스를 상속해서 만들어야 한다.
 */
public class Quest2 {
    
    public static void main(String[] args) {
        MaxLimitCalculator cal = new MaxLimitCalculator();
        cal.add(50);  // 50 더하기
        cal.add(60);  // 60 더하기
        System.out.println(cal.getValue()); // 100 출력
    }
}

class MaxLimitCalculator extends Calculator {
    @Override
    int getValue() {
        if (value > 100) {
            value = 100;
        }
        return value;
    }
}

