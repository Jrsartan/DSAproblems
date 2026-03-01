import java.util.*;
public class dateOfBirth {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a date of birth!");
        String dob=sc.nextLine();

        String day=dob.substring(0, 2);
        String month=dob.substring(2, 4);
        String year=dob.substring(4, 8);

       String  monthname="";
       switch(month){
        case "01":
                monthname="january";
                break;
        case "02":
                monthname="February";
                break;
        case "03":
                monthname="March";
                break;
        case "04":
                monthname="january";
                break;
        case "05":
                monthname="February";
                break;
        case "06":
                monthname="March";
                break;
        case "07":
                monthname="january";
                break;
        case "08":
                monthname="February";
                break;
        case "09":
                monthname="March";
                break;
        case "10":
                monthname="january";
                break;
        case "11":
                monthname="February";
                break;
        case "12":
                monthname="March";
                break;
        default:
               monthname="Invalid month!";
       }
       System.out.println(day+" "+monthname+" "+year);
       sc.close();
    }
}
