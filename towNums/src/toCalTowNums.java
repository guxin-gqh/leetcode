public class toCalTowNums {
    public static void main(String[] args) {
        int[] can={1,28,3,54,5,6};
        int[] ints = twoSum(can, 7);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
    public static int[] twoSum(int[] nums,int target){
        int[] result=new int[2];
        for (int i = 0; i <nums.length ; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if (nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                    break;
                }
            }
        }
        return result;
    }
}
