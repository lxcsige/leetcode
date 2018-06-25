import java.util.HashMap;
import java.util.Map;

/**
 * User: lxcfour
 * Date: 2018/6/25
 * Time: 下午9:12
 */
public class TwoSums {

    public static void main(String[] args) {
        TwoSums test = new TwoSums();
        int[] arr = {5, 4, 2, 3, 1};
        int[] res = test.twoSums(arr, 6);
    }

    /**
     * 无序数组，若存在两数之和等于target则返回
     * 空间换时间，时间复杂度O(n)，空间复杂度O(n)
     * @param arr
     * @param target
     * @return
     */
    private int[] twoSums(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        int[] res = new int[2];
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target - arr[i])) {
                res[0] = map.get(target -  arr[i]);
                res[1] = i;
                break;
            } else {
                map.put(arr[i], i);
            }
        }

        return res;
    }
}
