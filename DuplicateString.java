import java.util.ArrayList;//unused--auto imported in other attempts
import java.util.Arrays;//unused--auto imported in other attemps
import java.util.HashSet;
import java.util.Set;

public class DuplicateString {
    public static void main(String[] args) {
        String firstString = "Abcd";//check string with just letters and no spaces with no duplicates
        String secondString = "ABCda";//check string with upper/lower duplicate situation
        String thirdString = "acd$%5";//check string with characters other than letters
        String fourthString = "The Big";//check string with no duplicate letters but a space
        String fifthString = "Do it be?";//check with not duplicate letters but two spaces
        String sixthString = "There are duplicates here";

        System.out.println(firstString + ": " + hasDuplicateAny(fifthString));//false in any method
        System.out.println(secondString + ": " + hasDuplicateAny(secondString));//true
        System.out.println(secondString + ": " + hasDuplicateNoCase(secondString));//false
        //third and fourth strings come up false in either case
        //this will be true in either method below--never came up with a way to ignore spaces.
        System.out.println(fifthString + ": " + hasDuplicateAny(fifthString));

        System.out.println(hasDuplicateNotSpaces(fifthString));
        System.out.println(hasDuplicateNotSpaces(sixthString));
    }

    /**
     * This method takes in a string and checks to see if there are any duplicates including
     * spaces or letters that are lower/upper case (i.e. A & a = duplicate)
     * @param stringToCheck
     * @return true if there is any duplicate, false if there is not
     */
    public static boolean hasDuplicateAny(String stringToCheck) {
        Set<Character> set = new HashSet<>();
        String string = stringToCheck.toLowerCase();

        for (int i = 0; i < string.length(); i++) {
            set.add(string.charAt(i));
        }
        if(string.length() != set.size()){
            return true;
        }
        return false;
    }

    /**
     * This method takes in a string and checks for duplicates (including spaces) but
     * is case sensitive (A & a = false)
     * @param stringToCheck
     * @return
     */
    public static boolean hasDuplicateNoCase(String stringToCheck) {
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < stringToCheck.length(); i++) {
            set.add(stringToCheck.charAt(i));
        }

        if(stringToCheck.length() != set.size()){
            return true;
        }
        return false;
    }

    //use regex with replaceAll method

    /**
     *
     * @param stringToCheck
     * @return true if no characters are duplicate even if there are spaces (case-sensitive)
     */
    public static boolean hasDuplicateNotSpaces(String stringToCheck){
        String noSpaces = stringToCheck.replaceAll("\\s", "");
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < noSpaces.length(); i++) {
            set.add(noSpaces.charAt(i));
        }
        if(noSpaces.length() != set.size()){
            return true;
        }
        return false;
    }


 }//end of class
