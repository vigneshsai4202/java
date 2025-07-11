package basic.Easy_Medium_Problems_Math_Patterns;
import java.util.Scanner;

public class weekdays  {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the day:");
        String day= scanner.next();
        if(day.equals("MONDAY") ||(day.equals("TUESDAY") ||day.equals( "WEDNESDAY" )||day.equals ("THURSDAY") || day.equals("FRIDAY"))){
            System.out.println("Uff,its a weekday");

        }else if (day.equals("SATURDAY")|| day.equals("SUNDAY")){
            System.out.println("Yay its weekend");
        }else{
            System.out.println("Incoorect input");
        }
    }

}
