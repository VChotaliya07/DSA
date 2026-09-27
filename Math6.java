class Math6 {
    public static void main(String[] args) {
        int n = 6;
         if(n%10!=8 && n%10!=6)
         {
            System.out.println("false");
            return ;
        }
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;
                sum += n / i;
            }
        }
        System.out.println(n == sum);
    }
}