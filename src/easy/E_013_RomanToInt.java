package easy;

/**
 * 罗马数字转整数
 */
public class E_013_RomanToInt {

    public int romanToInt(String s) {
        int result;
        char[] sc = s.toCharArray();
        result = toInt(sc[0]);
        for (int i = 1; i < s.length(); i++) {
            result += toInt(sc[i]);
            if (toInt(sc[i - 1]) < toInt(sc[i])) {
                result -= toInt(sc[i - 1]) * 2;
            }
        }
        return result;
    }

    private int toInt(char s) {
        switch (s) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }
}
