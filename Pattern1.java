class Pattern1
{
    public static void main(String[] args)
    {
        int n=4;
        Solution s1=new Solution();
        s1.pattern1(n);
    }
}

class Solution {
    public void pattern1(int n) {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// class Pattern1
// {
//     public static void main(String[] args)
//     {
//         int n=4;
//         Solution s1=new Solution();
//         s1.pattern1();
//     }
// }

// class Solution {
//     public void pattern1(int n) {

//     }
// }