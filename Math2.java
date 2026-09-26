public class Math2 {
    public static void main(String[] args) {
        int n = 15687;
        int num = Math.abs(n), cnt = 0;
        for (int i = num; i > 0; i /= 10) {
            if (!((i % 10) % 2 == 0)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
