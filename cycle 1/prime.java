import java.util.*;
class prime
{
 public static void main(String args[])
 {
  System.out.println("Enter a number:");
  Scanner sc = new Scanner(System.in);
  int n=sc.nextInt();
  
  int flag=0;
 
  for(int i=2;i<n/2;i++)
             {
                if(n%i==0)
                  {
                     flag=1;
                     break;
                  }
             }
             
   if (flag==1) 
       
          System.out.println("Given number is not prime");
   else
      
          System.out.println("Given number is prime");
  }
}        
      
  
