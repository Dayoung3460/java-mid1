package lang.wrapper;

public class MyIntegerNullMain0 {
    public static void main(String[] args) {
        int[] intArr = {-1, 0, 1, 2, 3};
        System.out.println(findValue(intArr, -1));
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100));

    }

    // 값을 찾는 함수.
    // 반환 타입은 int여서 값을 못찾더라도 int 값을 반환해야함. 반환값을 null로 할 수 없음
    // 여기선 못찾으면 -1을 반환하는데 배열에 -1이 있어서 값을 찾았을 때도 -1을 반환함.
    // 반환값이 -1일 때 값을 찾았는지 못 찾았는지 알 수 있는 방법이 없음.
    private static int findValue(int[] inArr, int target) {
        for(int value : inArr) {
            if(value == target) {
                return value;
            }
        }
        return -1;
    }
}
