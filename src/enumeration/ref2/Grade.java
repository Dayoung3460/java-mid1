package enumeration.ref2;

public enum Grade {
    // 상수에 생성자에 맞는 인수 바로 전달하면 됨.
    BASIC(10), GOLD(20), DIAMOND(30);

    private final int discountPercent;

    // private 생략
    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}
