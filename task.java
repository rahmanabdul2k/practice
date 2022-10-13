import java.util.Scanner;
class Task
{
    public void Customers ()
    {
        Scanner s =new Scanner(System.in);
                int i;
        for ( i=0;i<100;i++)
              {
                  System.out.println("Enter the Tshirt color");
                  String color=s.nextLine();
                  System.out.println("Enter the tshirt count");
                  int Count=s.nextInt();
                  int j=i+Count;
                  i=j;

                  if (i>=100)
                  {
                      System.out.println("you reach the more than 100");
                  }
                  System.out.println("Enter the Tshirt size");
                  char size = s.next().charAt(0);
                  System.out.println("T-SHIRT count "+Count+" with "+color+"color"+" and "+size+" size");


              }
    }

}

     class Purchase extends Task
     {
         int Count;
         String color;
         char size;

         static
         {
             System.out.println("Welcome");
         }
         Purchase(int i, String j, char k)
         {
             this.Count=i;
             this.color=j;
             this.size=k;
         }
         public void display()
         {
             System.out.println("Total t-shirt count is "+Count);
             System.out.println("Total t-shirt colour is "+color);
             System.out.println("Total t-shirt colour is "+size);
         }
         public static void main(String[]args)
         {
             Purchase p= new Purchase(100,"Black", 'M');
             p.display();;
             p.Customers();
         }


     }