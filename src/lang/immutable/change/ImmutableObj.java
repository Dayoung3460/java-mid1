package lang.immutable.change;

public class ImmutableObj {
    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    // 불변 객체지만 멤버변수 값을 변경하고 싶을 때
    public ImmutableObj add(int addValue) {
        // value를 바로 변경할 수 없음
        // value = value + addValue 이렇게 할 수 없음
        int result = value + addValue;
        // 변경하고 싶은 값(result)을 가지고 본인을 새로 생성해서 반환
        return new ImmutableObj(result);
    }
}
