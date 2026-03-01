class Solution {
    public void secondLargestElement(int[] nums) {
      int larg=nums[0];
      for(int i=0;i<nums.length;i++){
        if(nums[i]>larg){
            larg=nums[i];
        }
      }
      int seclarg=-1;
     for(int i=0;i<nums.length;i++){
        if(nums[i]>seclarg && nums[i]!=larg){
            seclarg=nums[i];
        }
      }
      System.out.println(seclarg);
    }
}
public class seclargnum {
   public static void main(String[] args) {
    Solution sol = new Solution();
    int arr[]={56,23,5,69,20,54,25};
    sol.secondLargestElement(arr);
   } 
}
