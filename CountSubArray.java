// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// Count Subarrays of Length Three With a Condition sum of 1 and 3 is eqaul to the half of 2
class CountSubArray {
    public static void main(String[] args) {
       int arr[] ={1,2,1,4,1};
    //   int arr[] ={1,2,3,2,4,2,3,4,2,5};
       int count =0,  low=0 , high= 2;
       while(high <arr.length){
       int  mid= low+1;
             if(arr[low]+ arr[high]==arr[mid]/2){
                 count ++;
             }
             low++;
             high++;
       }
       System.out.println(count);
     
    }
}