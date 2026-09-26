public class Math4 {
    public static void main(String[] args) {
        int n=167;
        int max=0;
        while(n!=0)
        {
            if(max<n%10)
                max=n%10;
            n/=10;
        }
        System.out.println(max);
    }
}
