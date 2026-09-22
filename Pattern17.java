public class Pattern17 {
    public static void main(String[] args) {
        int n=4;
        char inc='A';
        for(int i=1;i<=4;i++)
        {
            for(int s=i;s<n;s++)
            {
                System.out.print(" ");
            }
            inc='A';
            for(int j=1;j<=i;j++)
            {
                System.out.print(inc);
                inc++;
            }
            inc--;
            for(int k=2;k<=i;k++)
            {
                inc--;
                System.out.print(inc);   
            }
            System.out.println();
        }
    }
}
