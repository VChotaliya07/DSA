class Math1 {
    public static void main(String[] args) {
        int n = 0;
        if (n == 0) {
            System.out.println("1");
            return;
        }
        int num = Math.abs(n), cnt = 0;
        for (int i = num; i >= 0; i /= 10) {
            cnt++;
        }
        System.out.println(cnt);
    }
}