/**
 * @author qiqi
 * @version 1.0
 * @data 2025/4/14 20:49
 * <p>
 * <p>
 * 统计好三元组
 * 给你一个整数数组 arr ，以及 a、b 、c 三个整数。请你统计其中好三元组的数量。
 * <p>
 * 如果三元组 (arr[i], arr[j], arr[k]) 满足下列全部条件，则认为它是一个 好三元组 。
 * <p>
 * 0 <= i < j < k < arr.length
 * |arr[i] - arr[j]| <= a
 * |arr[j] - arr[k]| <= b
 * |arr[i] - arr[k]| <= c
 * 其中 |x| 表示 x 的绝对值。
 * <p>
 * 返回 好三元组的数量 。
 */

public class countGoodTriplets {

    public static void main(String[] args) {
        int[] arr = {3, 0, 1, 1, 9, 7};
        int a = 7;
        int b = 2;
        int c = 3;
        System.out.println(goodTriplets(arr, a, b, c));
    }

    //arr = [3,0,1,1,9,7], a = 7, b = 2, c = 3
    public static int goodTriplets(int[] arr, int a, int b, int c) {
        int arrLength = arr.length;
        int tripletsNums = 0;
        for (int i = 0; i < arrLength - 2; i++) {
            for (int j = i + 1; j < arrLength - 1; j++) {
                for (int k = j + 1; k < arrLength; k++) {
                    Boolean condition1 = (Math.abs(arr[i] - arr[j]) <= a);
                    Boolean condition2 = (Math.abs(arr[j] - arr[k]) <= b);
                    Boolean condition3 = (Math.abs(arr[i] - arr[k]) <= c);
                    if (condition1 && condition2 && condition3) {
                        tripletsNums++;
                        System.out.println(arr[i] + "---" + arr[j] + "---" + arr[k]);
                    }
                }

            }
        }

        return tripletsNums;
    }

}
