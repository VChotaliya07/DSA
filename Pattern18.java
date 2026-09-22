public class Pattern18 {
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>=1;i--)
        {
            char inc='A';
            inc+=i-1;
            for(int j=i;j<=n;j++)
            {
                System.out.print(inc);
                inc++;
            }
            System.out.println();
        }
    }
}
