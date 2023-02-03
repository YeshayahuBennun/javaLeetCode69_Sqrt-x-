public class Solution {
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }

    public static int mySqrt(int x) {
        int num = x;
        int index = 1;
        int count = 0;

        while (num != 0) {

            if (index % 2 != 0) {
                num = num - index;
                count++;
                if (num < 0) {
                    count--;
                    break;
                }
            }
            index++;
        }
        return count;
    }
}
