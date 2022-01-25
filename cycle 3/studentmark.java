import java.util.*;
class studentmark
{
    public static void main (String[] args)
    {
        Student obj=new Student();
        obj.Read();
        obj.Display();
    }
}
class Student
{
    String name;
    int rollno,i;
    int mark[]=new int[5];
    
    void Read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        name=sc.nextLine();
        System.out.println("Enter your roll number:");
        rollno=sc.nextInt();
        System.out.println("Enter the marks of 5 subjects:");
        for(i=0;i<5;i++)
        {
            System.out.println("Enter mark of subject"+(i+1));
            mark[i]=sc.nextInt();
        }
    }
    void Display()
    {
        System.out.println("The Given list is:");
        System.out.println("Name:"+name);
        System.out.println("Roll number:"+rollno);
        for(i=0;i<5;i++)
        {
            System.out.println("Mark of subject "+(i+1)+" is "+mark[i]); 
        }
    }
}
