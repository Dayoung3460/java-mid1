package lang.string.chaining;

public class MethodChainingMain3 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        // 반환된 참조값을 활용하여 메서드 체이닝
        int result = adder.add(1).add(2).add(3).getValue();
        System.out.println(result);
    }
}
