import java.util.*;
class Multiple
{
    public static void main(String arr[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println(“Enter an integer:”);
        n=sc.nextInt();
        if(n%5==0) 
            System.out.println("Multiple of 5");
        else
            System.out.println("Not a multiple of 5");
    }
}