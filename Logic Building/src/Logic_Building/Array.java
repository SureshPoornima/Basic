package Logic_Building;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class Array {

	public static void main(String[] args) {
	  ArrayList <Integer> array = new ArrayList <Integer>();
	  array.add(12);
	  array.add(13);
	  array.add(14);
	  array.add(15);
	  array.add(16);
	  array.add(17);
	  array.add(1,18);
	  System.out.println(array);
	  
	  LinkedList <Integer>  link = new LinkedList<Integer>();
	  link.add(23);
	  link.add(24);
	  link.add(25);
	  link.add(26);
	  link.add(27);
	  link.add(28);
	  System.out.println(link);
	  ArrayList<String> arraystring = new ArrayList<String>();
	  arraystring.add("poornima");
	  arraystring.add("suresh");
	  arraystring.add("priya");
	  arraystring.add("yadhu");
	  arraystring.add("krishna");
	  arraystring.add("cs");
	  arraystring.add(1,"karthik");
	  System.out.println(arraystring);
	  Vector<Integer> vector = new Vector<Integer>();
	  vector.add(12);
	  vector.add(13);
	  vector.add(14);
	  vector.add(15);
	  vector.add(16);
	  vector.add(17);
	  System.out.println(vector); 
	}

}
