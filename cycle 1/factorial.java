import java.util.*;
class factorial
{
  public static void main(String args[])
   {
     System.out.println("Enter the value of n");
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     
     int i,fact=1;
   
     for(i=1;i<=n;i++)
                 fact=fact*i;
                 System.out.println("Factorial is "+fact);      
                       
   }
 }   
      
    
    
