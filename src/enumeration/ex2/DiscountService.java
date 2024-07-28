package enumeration.ex2;

public class DiscountService {
    public int discount(ClassGrade classGrade, int price) {
        int discountPercent = 0;

        if(classGrade.equals(ClassGrade.BASIC)) {
            discountPercent = 10;
        } else if(classGrade.equals(ClassGrade.GOLD)) {
            discountPercent = 20;
        } else if(classGrade.equals(ClassGrade.DIAMOND)) {
            discountPercent = 30;
        } else {
            System.out.println("no discount");
        }
        return price * discountPercent / 100;
    }
}
