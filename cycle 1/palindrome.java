import java.util.*;
class palindrome
{
  public static void main(String args[])
   {
     System.out.println("Enter the value of n");
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     
     int rev=0,org_num,rem;
     
     org_num=n;
   
     while(n>0)
          {
              rem=n%10;
              rev=rev*10+rem;
              n=n/10;    
          }
          
     if(rev==org_num)
            System.out.println("Given number is palindrome");
            
     else 
            System.out.println("Given number is not palindrome");
   
   }
 }
    
