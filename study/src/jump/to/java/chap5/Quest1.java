package jump.to.java.chap5;

/**
 * 문제 1번
 * 객체변수 value가 100 보다 큰 값은 가질 수 없도록 제한하는 
 * MaxLimitCalculator 클래스를 만들어 보자. 
 * 
 * 즉 다음과 같이 동작해야 한다.
 */
class Calculator {
    int value;

    Calculator() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }
}

public class Quest1 {
    public static void main(String[] args) {
        UpgradeCalculator cal = new UpgradeCalculator();
        cal.add(10);
        cal.minus(3);
        System.out.println(cal.getValue()); // 10에서 7을 뺀 3을 출력
    }
}
/**
 * Calculator 클래스를 상속하는 UpgradeCalculator를 만들고 값을 뺄 수 있는 minus 메서드를 추가해 보자. 
 * 즉 다음과 같이 동작하는 클래스를 만들어야 한다.
 * UpgradeCalculator cal = new UpgradeCalculator();
 * cal.add(10);
 * cal.minus(3);
 * System.out.println(cal.getValue());  // 10에서 7을 뺀 3을 출력
 */

class UpgradeCalculator extends Calculator {
    void minus(int val) {
        super.value -= val;        
    }
}
