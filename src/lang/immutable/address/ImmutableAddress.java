package lang.immutable.address;

// 불변객체: 객체의 상태(객체 내부의 값, 필드, 맴버 변수)가 변하지 않는 객체 -> 참조값이 공유되는 사이드이펙트를 막기 위해
// 생성자 통해서만 값(멤버 변수)을 설정할 수 있고, 이후에는 값을 변경할 수 없음
public class ImmutableAddress {
    // 멤버 변수값 못 바꾸도록 final
    // final 없어도 value 값을 변경할 수 있는 방법은 없음. 그래도 final 넣어두면 의도를 명확히 할 수 있음
    private final String value;

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    // 불변객체에서는 setter 필요없음

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
