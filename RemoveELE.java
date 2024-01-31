public class RemoveELE{
        public static void main(String[] args) {
            int [] nums={3,2,2,3};
            int val=3;
            // Solution
            int index = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val) {
                    nums[index] = nums[i];
                    index++;
                 }
            }
            System.out.println(index);
        }
}