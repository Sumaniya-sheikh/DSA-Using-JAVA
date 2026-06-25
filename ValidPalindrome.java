public class Main{
public static void main(String[] args){

String str = "A man, a plan, a canal: Panama";
int left =0, right = str.length()-1;

while(left<right){
  if (!Character.isLetterOrDigit(str.charAt(left))) {

// if(!(str.charAt(left) >= '0' && str.charAt(left)<='9' ||str.charAt(left)>= 'A' && str.charAt(left) <= 'Z' || str.charAt(left)>='a' && str.charAt(left)<='z') ){
 left ++; 
continue;

}
// else if(!(str.charAt(right) >= '0' && str.charAt(right)<='9' ||str.charAt(right)>= 'A' && str.charAt(right) <= 'Z' || str.charAt(right)>='a' && str.charAt(right)<='z' )){
  if (!Character.isLetterOrDigit(str.charAt(right))) {
right--;
continue;

}

// if(str.tolowerCase(str.charAt(left))!=(str.tolowerCase(str.charAt(right)){

if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
 System.out.println("Not Palindrome");
                return;
            }

            left++;
            right--;
        }

        System.out.println("Palindrome");
    }
}