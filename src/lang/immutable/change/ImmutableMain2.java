package lang.immutable.change;

public class ImmutableMain2 {
    public static void main(String[] args) {
        ImmutableObj immutableObj = new ImmutableObj(10);
        immutableObj.add(20);

        // 10이 출력됨. 30 아님. 윗줄에서 return값(30을 들고 있는 새로운 객체) 안 받았잖니
        System.out.println(immutableObj.getValue());
    }
}
