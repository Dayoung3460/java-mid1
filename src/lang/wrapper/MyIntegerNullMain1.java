package lang.wrapper;

public class MyIntegerNullMain1 {
    public static void main(String[] args) {
        MyInteger[] intArr = {new MyInteger(-1),new MyInteger(-0),new MyInteger(1)};
        System.out.println(findValue(intArr, -1));
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100));

    }

    //MyInteger가 객체라 null 반환가능
    private static MyInteger findValue(MyInteger[] inArr, int target) {
        for(MyInteger value : inArr) {
            if(value.getValue() == target) {
                return value;
            }
        }
        return null;
    }
}
