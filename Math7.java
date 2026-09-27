public class Math7 {
   public static void main(String[] args) {
    int n=6;
        int cnt=0;
        for(int i=2;i<=n;i++)
        {
            if(isPrime(i))
            {
                cnt++;
            }
        }
        System.out.println(cnt);
   } 
   public static boolean isPrime(int n) {
        if(n==2)
            return true;
        if(n%2==0 || n==1)
        {
            return false;
        }
        for(int i=3;i<=Math.sqrt(n);i+=2)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
