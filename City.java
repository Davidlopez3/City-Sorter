
import java.util.Scanner;
public class City {

    public static void main (String [] args ) {

        //  Scanner
        Scanner input = new Scanner(System.in);

        // Variable string
        String firstCity;
        String secondCity;
        String thirdCity;

        // Request first city
        System.out.print("Please enter the first city: ");
        firstCity = input.nextLine();

        //Request second city
        System.out.println("Please enter the second city: ");
        secondCity = input.nextLine();

        // Request third city
        System.out.println("Please enter the third city: ");
        thirdCity = input.nextLine();

        /// 123
        if ((firstCity.compareTo(secondCity) < 0) && (secondCity.compareTo(thirdCity) < 0) && (firstCity.compareTo(thirdCity) < 0)) {
            System.out.println(firstCity);
            System.out.println(secondCity);
            System.out.println(thirdCity);
        }

        //132
        if ((firstCity.compareTo(secondCity) < 0) && (secondCity.compareTo(thirdCity) > 0) && (firstCity.compareTo(thirdCity) < 0)) {
            System.out.println(firstCity);
            System.out.println(thirdCity);
            System.out.println(secondCity);
        }

        // 213
        if ((firstCity.compareTo(secondCity) > 0) && (secondCity.compareTo(thirdCity) < 0) && (firstCity.compareTo(thirdCity) < 0)) {
            System.out.println(secondCity);
            System.out.println(firstCity);
            System.out.println(thirdCity);
        }
        /// 231
        if ((firstCity.compareTo(secondCity) > 0) && (firstCity.compareTo(thirdCity) > 0) && (secondCity.compareTo(thirdCity) < 0)) {
            System.out.println(secondCity);
            System.out.println(thirdCity);
            System.out.println(firstCity);
        }
        // 321
        if ((firstCity.compareTo(secondCity) > 0) && (secondCity.compareTo(thirdCity) > 0) && (firstCity.compareTo(thirdCity) > 0)){
        System.out.println(thirdCity);
        System.out.println(secondCity);
        System.out.println(firstCity);
    }
        /// 312

       if ((firstCity.compareTo(secondCity) < 0) && (secondCity.compareTo(thirdCity) > 0) && (firstCity.compareTo(secondCity) > 0)){
        System.out.println(thirdCity);
        System.out.println(firstCity);
        System.out.println(secondCity);
      }


                }

    }

