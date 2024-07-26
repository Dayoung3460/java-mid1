package lang.string.builder;

public class StringBuilderMain1_2 {
    public static void main(String[] args) {
        // String은 불변객체라 값이 변경될 때마다 새로운 객체를 반환한다.
        // 메모리를 많이 잡아먹고 처리 시간을 더 많이 소모하는 등 단점이 있어서 이러한 문제를 해결하기 위해
        // 가변객체인 StringBuilder를 사용할 수 있음
        // 값을 변경할 수 있기 때문에 따로 새로운 객체를 반환하지 않음
        StringBuilder sb = new StringBuilder();
        String string = sb.append("A").append("B").append("C").append("D")
                .insert(1, "Java")
                .delete(4, 8)
                .reverse()
                .toString();
        System.out.println(string);

        // 자바가 최적화를 해주기 때문에 간단한 연산은 String써도 괜찮음
    }
}
