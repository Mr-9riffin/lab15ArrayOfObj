
/**
 * Write a description of class Example here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Arrays;

public class Example
{
    public static void main(String[] args) {

        String myString = "andy amy bob charlee cate";

        System.out.println(myString.length());

        String[] stringArray = myString.split(" ");
        System.out.println(Arrays.toString(stringArray));

        for(int i = 0; i < stringArray.length; i++){
            if(stringArray[i].startsWith("a")){
                System.out.println(stringArray[i]);
                System.out.println(stringArray[i].length());
            }
        }

    }
}
