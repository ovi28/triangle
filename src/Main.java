import java.util.Scanner;

/**
 * Created by Ovi28 on 8/2/2017.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("First number:");
        String input1 = scanner.next();
        System.out.println("Second number:");
        String input2 = scanner.next();
        System.out.println("Third number:");
        String input3 = scanner.next();

        float firstSide = 0, secondSide = 0, thirdSide = 0;
        try {
            firstSide = Integer.parseInt(input1);
            secondSide = Integer.parseInt(input2);
            thirdSide = Integer.parseInt(input3);
        } catch (NumberFormatException ignored) {

        }

        if (firstSide <= 0 || secondSide <= 0 || thirdSide <= 0) {
            System.out.println("The numbers are not valid");
        } else if (firstSide + secondSide < thirdSide || firstSide + thirdSide < secondSide || secondSide + thirdSide < firstSide) {
            System.out.println("The numbers are not valid");
        } else if(firstSide==secondSide && firstSide == thirdSide){
            System.out.println("Equilateral triangle");
        } else if((firstSide==secondSide && firstSide!=thirdSide )||(secondSide== thirdSide&& secondSide!=firstSide)||(firstSide==thirdSide && firstSide!=secondSide) ){
            System.out.println("Isosceles triangle");
        }else{
            System.out.println("It's scalene");
        }

    }
}
