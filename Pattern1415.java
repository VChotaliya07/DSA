public class Pattern1415 {
    public static void main(String[] args) {
        int n=4;
        char inc='A';
       /*  for(int i=1;i<=n;i++)
        {
            inc='A';
            for(int j=1;j<=i;j++)
            {
                System.out.print(inc);
                inc++;
            }
            System.out.println();
        }*/
       for(int i=1;i<=n;i++)
       {
            inc='A';
            for(int j=i;j<=n;j++)
            {
                System.out.print(inc);
                inc++;
            }
            System.out.println();
       }
    }
}
