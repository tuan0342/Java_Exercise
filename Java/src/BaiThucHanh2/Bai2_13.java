package BaiThucHanh2;

public class Bai2_13 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100000000; i <= 999999999; i++) {
            if(thuanNghich(i + "")) {
                System.out.printf("%12d", i);
                count++;
                if(count % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }

    private static boolean thuanNghich(String s) {
        String other;
        StringBuilder stringBuilder = new StringBuilder(s);
        other = stringBuilder.reverse().toString();

        return (s.compareTo(other) == 0);
    }
}
