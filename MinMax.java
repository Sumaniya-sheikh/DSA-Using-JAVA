class MinMax{
    public static void main(String[] args) {
        int arr[]={-3,0,1,2,3,4,-2,5,6,7,8,-1};
        int min=arr[0];
        int max=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Minimum value is: "+min);
        System.out.println("Maximum value is: "+max);
    }
}