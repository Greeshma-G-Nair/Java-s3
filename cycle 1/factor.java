import java.util.*;
class factor
{
  public static void main(String args[])
   {
     System.out.println("Enter the value of n");
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     
     int i;
     
     System.out.println("Factors are: ");
     for(i=1;i<=n;i++)
       {
          if(n%i==0)
                 System.out.println(i);      
       } 
                 
   }
 }   
      
    
    
