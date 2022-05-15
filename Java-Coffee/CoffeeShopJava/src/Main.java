import javax.swing.*;
import java.math.*;
import java.lang.*;
import java.text.*;
import static java.lang.Integer.parseInt;

//To solve the problem I am planning on creating variables storing the amount of each coffee drink
//gathering information from the user on how many of each type they purchased
//adding up the amount and giving them a percentage discount based on their total amount
//if the purchase over a specific amount of drinks they also get a dollar off discount
//lastly, if they are a student they pay tax, if they are faculty they do not pay tax



public class Main {

    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {



        double coffee = 1.35;
        double latte  = 3.15;
        double mocha  = 3.45;
        double discountTotal;
        double pdDiscount;
        double testing;
        double taxTotal;

        //Gathering User Information
        String coffeeNumber = JOptionPane.showInputDialog("How many coffees did you buy?");
        int coffeesPurchased = parseInt(coffeeNumber);

        String latteNumber =   JOptionPane.showInputDialog("How many lattes did you buy?");
        int lattesPurchased  = parseInt(latteNumber);

        String mochaNumber =   JOptionPane.showInputDialog("How many mochas did you buy?");
        int mochasPurchased  = parseInt(mochaNumber);

        String customerCode = JOptionPane.showInputDialog("Please give your customer code." + "\n" + " If you're a student enter: S" + "\n" + "If you are faculty enter: F" );



        //Creating the Coffee Information
        double coffeeTotal = coffee * coffeesPurchased;

        double latteTotal  = latte  * lattesPurchased;

        double mochaTotal  = mocha  * mochasPurchased;

        double drinkTotal  = coffeeTotal + latteTotal + mochaTotal;

        //Working through Customer Codes
        if (customerCode.equals('S')){
            taxTotal = drinkTotal;
        } if (customerCode.equals('F')){
            taxTotal = drinkTotal * 0.06;
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect Customer Code, please enter S for student or F for faculty.");
        }

         if (drinkTotal <= 20.00)
            discountTotal = drinkTotal * 0.97;
         else if (drinkTotal >= 20.00 && drinkTotal < 40.00)
            discountTotal = drinkTotal * 0.95;
         else if (drinkTotal >= 40.00 && drinkTotal <= 60.00)
            discountTotal = drinkTotal * 0.90;
         else if (drinkTotal >= 60.00 && drinkTotal <= 75.00)
             discountTotal = drinkTotal - ( drinkTotal * 0.15);
         else if (drinkTotal >= 75.00)
             discountTotal = drinkTotal * 0.80;
         else discountTotal = drinkTotal;



        if (coffeesPurchased >= 60){
            pdDiscount = discountTotal - 5;
         } else if (lattesPurchased >= 40){
            pdDiscount = discountTotal - 10;
         } else if (mochasPurchased >= 50){
             pdDiscount = discountTotal - 15;
         } else pdDiscount = discountTotal;

        double finalTotal = pdDiscount;




        System.out.println(df.format(finalTotal));
    }
}