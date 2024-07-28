package enumeration.ex1;

public class StringGradeEx1_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        // 존재하지 않는 등급
        int vip = discountService.discount("VIP", price);
        System.out.println(vip);

        // 오타
        int diamondd = discountService.discount("DIAMONDD", price);
        System.out.println(diamondd);

        // 소문자 입력
        int gold = discountService.discount("gold", price);
        System.out.println(gold);

        // discount 함수의 첫번째 매개변수 타입이 여전히 String 타입이라 아무 스트링값을 넣을 수 있음
    }
}
