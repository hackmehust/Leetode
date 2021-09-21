package Learn;

public class Sample {
    
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int numberOfDigit = (int) Math.log10(nums[i]) + 1;
            if (numberOfDigit % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int nums1[] = {12, 345, 2, 6, 7896};
        int nums2[] = {555,901,482,1771};
        System.out.println(findNumbers(nums1));
        System.out.println(findNumbers(nums2));
    }
    
}