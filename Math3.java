public class Math3 {
    public static void main(String[] args) {
        int x = 1021;
        if (x < 0) {
            System.out.println("false");
            return;
        }
        int rev = 0, tempX = x;
        while (tempX != 0) {
            if ((rev > 0 && rev > Integer.MAX_VALUE / 10) || (rev < 0 && rev < Integer.MIN_VALUE / 10)) {
                System.out.println("0");
                return;
            }
            rev = (rev * 10) + (tempX % 10);
            tempX /= 10;
        }
        System.out.println(rev == x);
    }
}
