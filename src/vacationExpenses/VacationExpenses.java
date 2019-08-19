package vacationExpenses;

import java.util.Scanner;

public class VacationExpenses {
    private static Scanner scanner;

//Write a program, which calculates vacation expenses:
//Read season, accommodation type and count of the days
//Print the total expenses, based on the price table bellow,formatted to the 2nd * digit after the decimal point
//Season Hotel  Camping Discount
//Spring  30       10      20%
//Summer  50       30      0%
//Autumn  20       15      30%
//Winter  40       10      10%

	public static void main(String[] args) {
        scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        String accommodation = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        double total = 0.00;
        switch(season){
            case "Spring":
                if(accommodation.equals("Hotel")){
                    double price = 30 * days;
                    total = price - price* 0.2;
                }else if(accommodation.equals("Camping")){
                    double price = 10 * days;
                    total = price - price* 0.2;
                }
                break;
            case "Summer":
                 if(accommodation.equals("Hotel")){
                    total = 50 * days;
                }else if(accommodation.equals("Camping")){
                    total = 30 * days;
                }
                break;
            case "Autumn":
                 if(accommodation.equals("Hotel")){
                    double price = 20 * days;
                    total = price - price* 0.3;
                }else if(accommodation.equals("Camping")){
                    double price = 15 * days;
                    total = price - price* 0.3;
                }
                break;
            case "Winter":
                 if(accommodation.equals("Hotel")){
                    double price = 40 * days;
                    total = price - price* 0.1;
                }else if(accommodation.equals("Camping")){
                    double price = 10 * days;
                    total = price - price* 0.1;
                }
                break;
                default :
                    total = 0;
        }
        System.out.printf("%.2f", total);
        }
}