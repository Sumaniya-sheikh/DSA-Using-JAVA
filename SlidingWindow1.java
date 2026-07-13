// Find the length of the longest subarray whose sum is ≤ target, assuming all array elements are positive
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class SlidingWindow1 {
    public static void main(String[] args) {
        int arr[]={2,3,4 ,5,3, 5,6,7,8};
        
        int low=0 , maxLen=0 , sum=0 , target =16 , high =0 ;
        for(;high < arr.length; ){
            sum = sum + arr[high];
          
            while(sum>target){
                sum -=arr[low];
                low++;
            }
              int curLen = high - low + 1;
            maxLen = Math.max(maxLen, curLen);
            high++;
        }
        System.out.println(maxLen);
    }
}