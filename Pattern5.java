class Pattern5 {
    public static void main(String[] args) {
        int n = 4;
        Solution s1 = new Solution();
        s1.pattern1(n);
    }
}

class Solution {
    public void pattern1(int n) {
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}