import java.util.Arrays;

public class TwoSum  {
    public static void main(String[] args) {
        int nums[]  = {-4,-1,-2,0,2,3,1,4,5,5};
        int target = 9;
         Arrays.sort(nums);
        int n= nums.length;
        int left= 0 , right = n-1;
        while(left<right){
            int sum= nums[left]+nums[right];
            if(sum==target){
                System.out.println(left+" "+right);
                left++;
                right--;
          while(left>0 && left<right && nums[left]==nums[left-1]){
                left++;
            }
            while(right<n-1 && left<right && nums[right]==nums[right+1]){
                right--;
            }
            }
            
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
           
        }
    }}