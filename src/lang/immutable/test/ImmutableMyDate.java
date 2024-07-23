package lang.immutable.test;

public class ImmutableMyDate {
    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    // 불변 객체에서 값을 변경하고 본인을 반환하는 이런 메서드는
    // 메서드명을 'with + {변경하려는 멤버변수명}' 이렇게 짓는것이 관례
    public ImmutableMyDate withYear(int newYear) {
        return new ImmutableMyDate(newYear, this.month, this.day);
    }

    public ImmutableMyDate withMonth(int newMonth) {
        return new ImmutableMyDate(this.year, newMonth, this.day);
    }

    public ImmutableMyDate withDay(int newDay) {
        return new ImmutableMyDate(this.year, this.month, newDay);
    }

    @Override
    public String toString() {
        return "ImmutableMyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
