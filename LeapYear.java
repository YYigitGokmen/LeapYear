
import java.util.Scanner;






public class LeapYear {

public static void main(String[] args) {

     Scanner scan = new Scanner(System.in);
        int year;
        System.out.print("Yılı  Giriniz : ");
        year = scan.nextInt();


        if (year%4==0 && year%100!=0 || year%400==0){
            System.out.print(year + " bir artık yıldır !");
        }else {
            System.out.println(year + " bir artık yıl değildir !");




            }
        }
}
