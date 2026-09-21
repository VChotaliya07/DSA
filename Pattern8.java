class Pattern8 {
    public static void main(String[] args) {
        int n = 4;
        Solution s1 = new Solution();
        s1.pattern1(n);
    }
}

class Solution {
    public void pattern1(int n) {
        // for (int i = (n * 2) - 1; i >= 1; i -= 2) {
        //     for (int k = i; k <= (n * 2) - 2; k += 2)
        //         System.out.print(" ");
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        for(int i=0;i<n;i++)
        {
            for(int k=0;k<i;k++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<2*(n-i)-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}