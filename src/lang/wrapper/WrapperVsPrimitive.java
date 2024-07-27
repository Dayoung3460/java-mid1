package lang.wrapper;

public class WrapperVsPrimitive {
    public static void main(String[] args) {
        int iteration = 1_000_000_000;
        long startTime, endTime;

        // primitive
        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();
        for(int i = 0; i < iteration; i++) {
            sumPrimitive += 1;
        }

        endTime = System.currentTimeMillis();
        System.out.println(sumPrimitive);
        System.out.println((endTime - startTime) + "ms");

        // wrapper
        Long sumWrapper = 0L;
        startTime = System.currentTimeMillis();
        for(int i = 0; i < iteration; i++) {
            // auto boxing
            sumWrapper += 1;
        }

        endTime = System.currentTimeMillis();
        System.out.println(sumWrapper);
        System.out.println((endTime - startTime) + "ms");

        // 기본형이 더 빠름
        // 기본형은 메모리에서 단순히 그 크기만큼 공간 차지(int는 보통 4바이트)
        // 래퍼 클래스는 객체 메타데이터 등 더 많은 메모리 사용
        // 하지만 위의 예시는 1_000_000_000번 루프 돌렸을 때임. 이마이 루프 돌리는거 아닌 이상 별 차이 없음
        // 레퍼 클래스가 유지보수 하기 더 나으면 래퍼 클래스 쓰면 됨.

        // 유지보수 vs 최적화 -> 유지보수가 우선.
        // 최적화 한다고 코드 복잡해지는 것보다 유지보수에 신경쓰는게 나음. 요새 컴터가 얼마나 좋은데

    }
}
