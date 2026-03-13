public class Duplicat {
  public static void main(String[] args) {
    //Solution sol = new Solution();
    int nums[]={0, 0, 3, 3, 5,8,8,9,10};
    // sol.removeDuplicates(arr[]);
      int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                nums[i+1]=nums[j];
                i++;
            }
        }
        System.out.println(i+1);
        for(int j=0;j<6;j++){
          System.out.print(nums[j]+" ");
        }
  }
    
}