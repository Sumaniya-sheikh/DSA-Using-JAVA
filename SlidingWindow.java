// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// finding the maximum sum of subarray of size 2
class SlidingWindow {
    //  fixed size
    public static void main(String[] args) {
     int arr[]={2,3,4,5,3,5,6,7,8};
      int sum, maxSum;
      int low =0 , high=1;
      
      sum = arr[low]+arr[high];
        maxSum= sum;
     
     while(high<arr.length-1){
         sum-=arr[low];
         low++;
         high++;
         
         sum+= arr[high];
         maxSum= Math.max(maxSum, sum);
     }
     System.out.println(maxSum);
    }
}
   