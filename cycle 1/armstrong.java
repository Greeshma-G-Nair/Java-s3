import java.util.*;
class armstrong
{
  public static void main(String args[])
   {
     System.out.println("Enter the value of n");
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     
     int sum=0,org_num,num,rem;
     
     org_num=n;
   
     while(n>0)
          {
              rem=n%10;
              num=rem*rem*rem;
              sum=sum+num;
              n=n/10;    
          }
          
     if(sum==org_num)
            System.out.println("Given number is Armstrong");
            
     else 
            System.out.println("Given number is not Armstrong");
   
   }
 }
    
