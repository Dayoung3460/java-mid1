package lang.string.chaining;

public class ValueAdder {
    private int value;

    public ValueAdder add(int addValue) {
        value += addValue;
        // 본인(본인의 참조값)을 반환
        return this;
    }

    public int getValue() {
        return value;
    }
}

