public class Pattern19 {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print("*");
            }
            for(int s=0;s<i*2;s++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int s=1;s<=(n-i)*2;s++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
