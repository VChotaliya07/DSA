public class Math8 {
    public static void main(String[] args) {
        int n1=6,n2=8;
        if(n1==n2)
            System.out.println(n1);
        int minN=Math.min(n1,n2),maxN=Math.max(n1,n2);
        if(maxN%minN==0)
        {
            System.out.println(minN);
            return ;
        }
        for(int i=minN;i>0;i--)
        {
            if(minN%i==0 && maxN%i==0)
            {
                System.out.println(i);
                return ;
            }
        }
    }
}
