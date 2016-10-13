
package numberformatapp;

import java.text.NumberFormat;
import java.util.Random;

/**
 *
 * @author simeonkakpovi
 */
public class NumberFormatApp {


    public static void main(String[] args) {
        //System.out.println(formatPercent(.555));
        //System.out.println(getMin(90, 4));
    }
    
    //return a number formatted as a percentage
    public static String formatPercent(double num){
        NumberFormat percent = NumberFormat.getPercentInstance();
        String fnum = percent.format(num);
        return fnum;
    }
    
    //return a number formatted as currency
    public static String formatCurrency(int num){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String fnum = currency.format(num); 
        return fnum;
    }
    
    //return a number formatted to a specific number of decimal places
    public static String formatDecimal(int num, int places){
        NumberFormat number = NumberFormat.getNumberInstance();
        number.setMaximumFractionDigits(places);
        String fnum = number.format(num);
        return fnum;
    }
    
    //return a random number between two values, A and B (inclusive) 
    public static int getRandom(int min, int max){
        Random rnd = new Random();
        int range = max - min + 1;
        int fnum =  min + rnd.nextInt(range);
        return fnum;
    }
    
    //Return the Maximum value of two numbers (see the Math class)
    public static int getMax(int num1, int num2){
        if (num1 > num2){
            return num1;
        } else {
            return num2;
        }
    }
    
    //Return the Minimum value of two numbers (see the Math class)
    public static int getMin(int num1, int num2){
        if (num1 < num2){
            return num1;
        } else {
            return num2;
        }
    }
    
    
    
    
}
