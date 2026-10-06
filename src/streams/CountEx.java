package src.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CountEx {

   static ArrayList<Integer> alist = new ArrayList<Integer>();

    public static void main(String[] args) {
        alist.add(45);
        alist.add(56);
        alist.add(35);
        alist.add(20);
        alist.add(10);
        alist.add(32);
        alist.add(68);
        alist.add(33);

      List<Integer> list = alist.stream().filter(i -> i<35).collect(Collectors.toList());
      System.out.println("Failed Students: "+list);
      System.out.println("No. of Failed Students: "+ list.stream().count());
      
       List<Integer> number = new ArrayList<Integer>();
	    
	    for(int i=0;i<=10;i++)
	    {
	        number.add((int) (Math.random() * 100));
	    }
	    
	    System.out.println(number);
	    
	    List<Integer> even = number.stream().filter(n->n%2==0).collect(Collectors.toList());
	    System.out.println("Even Number : "+even);
	    System.out.println("Number of even : "+ even.stream().count());
    }
}
