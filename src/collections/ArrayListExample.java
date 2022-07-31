package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> List1 = new ArrayList<String>();
		
		List1.add("Harsh"); //to add data in arraylist
		List1.add("John");	
		List1.add("Leana");
		List1.add("Jane");	
		List1.add("Gopala");
		
		System.out.println("The List is " + List1);
		System.out.println("The size of list is " + List1.size());
		
		List1.remove(1);  //to remove data in arraylist
		
		System.out.println("The List after removing John is " + List1);
		System.out.println("The new size of list is " + List1.size());
		
		System.out.println("The data in list at 4th position is " + List1.get(3)); // to check data in any postion
		
		List1.set(2, "James"); // to change any date in arraylist
		
		System.out.println("The New List is " + List1);
		
		List1.add(2, "Jane"); // to add data in certain position in arraylist
		
		System.out.println("The Updated List is " + List1);
		
		Collections.sort(List1); // to sort in ascending any arraylist
		
		System.out.println("The List is after soriting is " + List1);
		
		for(int index=0;index<List1.size();index++)	{
			System.out.println(List1.get(index)); 
		} //for loop traversal string method
		
	for(String name : List1) {
		System.out.println(name);
	} //for each traversal sting method
	
	Collections.reverse(List1); // to sort in descending any arraylist
	
	System.out.println("The List is after reverse soriting is " + List1);
	

	for(int index1=0;index1<List1.size();index1++)	{
		if(List1.get(index1)=="Jane") {System.out.println("Position of Jane is " + index1++);
		break;
		} //position of certain data in arraylist
		
	}
}
}
