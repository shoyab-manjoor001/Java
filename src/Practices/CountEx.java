import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

public class CountEx
{
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		for(int i=10;i>=1;i--)
		{
		    numbers.add(i);
		}
	    System.out.println(numbers);
	    
	    Long count = numbers.stream().count();
	    
	    if(count!=null)
	    {
	        System.out.println(count);
	    }
	    else
	    {
	        System.out.println("List is Empty");
	    }
	}
}