// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class ContainerWithMostWater {
    public static void main(String[] args) {
       int[] arr = {1,3,8,4,5,6,3,4,8,10,2};
        int left =0, right= arr.length-1; 
       int maxArea= 0;
        
        while(left<right){
            int currArea =  Math.min(arr[left], arr[right])*(right-left);
            
            maxArea = Math.max(maxArea, currArea);
           if(arr[left]<arr[right])
          {
                left++;
          }
            else
            {
                right--;
            }
        }
     System.out.println(maxArea);
    }
}