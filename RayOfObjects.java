import java.util.Arrays;
import static java.lang.System.*;


public class RayOfObjects
{
    private String[] array;

    public RayOfObjects(String input)
    {
        setArray(input);
    }
    
    public void setArray(String input){
        array = input.split(" ");
        out.println(Arrays.toString(array));
    }

    //Count how many occurences of a given target string are 
    //in the array of strings, use string.eqauls(anotherString)
    public int count(String target)
    {
        return 0;
    }
    
    
    //check that every s1 has a unique s2 after it in the array
    public boolean matches(String s1, String s2){
        return true;
    }
}
