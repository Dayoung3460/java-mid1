package lang.string.builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        // String은 불변객체라 값이 변경될 때마다 새로운 객체를 반환한다.
        // 메모리를 많이 잡아먹고 처리 시간을 더 많이 소모하는 등 단점이 있어서 이러한 문제를 해결하기 위해
        // 가변객체인 StringBuilder를 사용할 수 있음
        // 값을 변경할 수 있기 때문에 따로 새로운 객체를 반환하지 않음
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println(sb);

        sb.insert(1, "Java");
        System.out.println(sb);

        sb.delete(4, 8);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        // 작업 다 끝나면 불변인 String으로 바꿔주면 됨
        String string = sb.toString();
        System.out.println(string);
    }
}
