/**
 * @author 56887
 * @version 1.0
 * @data 2025/4/15 19:05
 * <p>
 * 统计对称整数的数目
 * 给你两个正整数 low 和 high 。
 * <p>
 * 对于一个由 2 * n 位数字组成的整数 x ，如果其前 n 位数字之和与后 n 位数字之和相等，则认为这个数字是一个对称整数。
 * <p>
 * 返回在 [low, high] 范围内的 对称整数的数目 。
 * <p>
 * 示例 1：
 * 输入：low = 1, high = 100
 * 输出：9
 * 解释：在 1 到 100 范围内共有 9 个对称整数：11、22、33、44、55、66、77、88 和 99 。
 * <p>
 * 示例 2：
 * 输入：low = 1200, high = 1230
 * 输出：4
 * 解释：在 1200 到 1230 范围内共有 4 个对称整数：1203、1212、1221 和 1230 。
 */
public class countSymmetricIntegers {
    public static void main(String[] args) {
        System.out.println(symmetricIntegers(1, 100));
        System.out.println(symmetricIntegers(1200, 1230));

    }

    public static int symmetricIntegers(int low, int high) {
        int resultNum = 0;
        for (int num = low; num <= high; num++) {
            String numToStr = Integer.toString(num);
            int digitCount = numToStr.length();
            if (digitCount % 2 == 0) {
                int halfNum = digitCount / 2;
                String leftHalf = numToStr.substring(0, halfNum);
                String rightHalf = numToStr.substring(halfNum, digitCount);
                int leftHalfNum = Integer.parseInt(leftHalf);
                int rightHalfNum = Integer.parseInt(rightHalf);


                if (digitCount == 2) {
                    if (leftHalfNum == rightHalfNum) {
                        resultNum++;
                    }
                } else if (digitsSum(leftHalfNum) == digitsSum(rightHalfNum)) {
                    resultNum++;
                }
            }
        }
        return resultNum;
    }

    private static int digitsSum(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }


}
