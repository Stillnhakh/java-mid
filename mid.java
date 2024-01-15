import java.util.Scanner;

public class ShortDateToFullDateConverter {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

   
        System.out.print("Enter a short date (YYYY-MM-DD): ");
        String shortDate = scanner.nextLine();

       
        int year = Integer.parseInt(shortDate.substring(0, 4));
        int month = Integer.parseInt(shortDate.substring(5, 7));
        int day = Integer.parseInt(shortDate.substring(8, 10));

       
        String monthName = getMonthName(month);

        
        System.out.println("Full Date: " + monthName + " " + day + ", " + year);

        
        scanner.close();
    }

    private static String getMonthName(int month) {
        String[] monthNames = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        if (month >= 1 && month <= 12) {
            return monthNames[month];
        } else {
            return "Invalid Month";
        }
    }
}