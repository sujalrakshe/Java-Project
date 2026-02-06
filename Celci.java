import java.util.Scanner;
public class Celci
{
   public static void main(String args[])
   {
      float n1;
      float n2;
      float cal;
      float n3;

      System.out.println("Select Operation For Conversion");
      System.out.println("1-Celsius");
      System.out.println("2-Fahrenheit");
      System.out.println("Select Operation Number:-");
      Scanner s = new Scanner(System.in);
       n1=s.nextFloat();

      if(n1==1)
      {
        System.out.println("Enter Celsius:-");
        Scanner r = new Scanner(System.in);
        n2 = r.nextFloat();
        cal = (n2*9/5)+32;
        System.out.println("Fahrenheit value is:-"+cal);
        }
        else if(n1==2){
        System.out.println("Enter Fahrenheit value:-");
        Scanner a = new Scanner(System.in);
        n3 = a.nextFloat();
        cal=(n3-32)*5/9;
        System.out.println("Celsius value is:-"+cal);


        }
        System.out.println("Conversion Completed");
       }

      }

