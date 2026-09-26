public class Math5 {
    public static void main(String[] args) {
        int n=370;
        int cnt=0,tempN=n;
        while(tempN!=0)
        {
            cnt++;
            tempN/=10;
        }
        tempN=n;
        int sum=0;
        while(tempN!=0)
        {
            sum+=Math.pow(tempN%10,cnt);
            tempN/=10;
        }
        System.out.println(sum==n);
    }
}
