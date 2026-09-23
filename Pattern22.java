public class Pattern22 {

    /*
    
    */
    public static void main(String[] args) {
        int n = 4;
        int size = (n * 2) - 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int top = i;
                int bottom = size - i - 1;
                int left = j;
                int right = size - j - 1;

                int minD = Math.min(Math.min(top, bottom), Math.min(left, right));
                //System.out.print(minD + " ");
                System.out.print(n-minD + " ");
            }
            System.out.println();
        }
    }
}
