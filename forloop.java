import java.util.Scanner;
public class forloop{
    public static void main(String[] args)
    {
       int num,i;
       System.out.println("Enter any Number: ");
        Scanner s=new Scanner(System.in);
        num=s.nextInt();

        for(i=1;i<11;i++)
        {
            System.out.println(num*i);
        }
    }
}
        
     
