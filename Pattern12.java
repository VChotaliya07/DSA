public class Pattern12 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int k = (i * 2) ; k < n * 2; k++) {
                System.out.print(" ");
            }
            for(int l=i;l>=1;l--)
            {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
