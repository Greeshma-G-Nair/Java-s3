import java.util.*;
class sum
{
  public static void main(String args[])
   {
     System.out.println("Enter the value of n");
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     
     int sum=0,i;
     
     for(i=1;i<=n;i++)
       {
          sum=sum+i;
       }
     System.out.println("Sum of first "+n+" natural numbers = "+sum);
   }
 }   
      
    
    
