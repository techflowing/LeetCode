package easy;

/**
 * 判断一个整数是否是回文数。
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 */
public class E_009_IsPalindrome {

    public static void main(String[] args) {
        new E_009_IsPalindrome().isPalindrome(123);
    }

    /**
     * 数的两头的数字判断
     */
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        // 计算x为几位数
        int bit = 1;
        int temp = x;
        while ((temp = temp / 10) != 0) {
            bit++;
        }
        while (bit > 1) {
            // 判断第一位数与最后一位数是否相等
            if ((x % 10) != (x / (int) Math.pow(10, bit - 1))) {
                return false;
            }
            //移除第一位数和最后一位数
            x = x % (int) Math.pow(10, bit - 1) / 10;
            bit -= 2;
        }
        return true;
    }
}
