package easy;

/**
 * 给定一个 32 位有符号整数，将整数中的数字进行反转。
 * 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−231,  231 − 1]。
 * 根据这个假设，如果反转后的整数溢出，则返回 0
 */
public class E_007_Reverse {

    /**
     * 关键点：怎么判断溢出
     */
    public int reverse(int n) {
        int result = 0;
        while (n != 0) {
            int temp = result * 10 + n % 10;
            n = n / 10;
            if (temp / 10 != result) {
                result = 0;
                break;
            }
            result = temp;
        }
        return result;
    }
}
