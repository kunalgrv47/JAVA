package linkedList;

import java.util.Comparator;
import java.util.LinkedList;

public class LinkedListPractice {

	public static void main(String[] args) {

		//CREATE LinkedList list1 and add data 10,20,40,80,60
		LinkedList<Integer> list1 = new LinkedList<>();
		list1.add(10);
		list1.add(20);
		list1.add(40);
		list1.add(80);
		list1.add(60);


		//CREATE LinkedList list2 and ADD THE SAME ELEMENT AS OF list1
		LinkedList<Integer> list2 = new LinkedList<>();
		list2.add(10);
		list2.add(20);
		list2.add(40);
		list2.add(80);
		list2.add(60);

		//PRINT LIST 1 and LIST 2 DATA
		System.out.println("LIST 1 DATA : "+ list1);
		System.out.println("LIST 2 DATA : "+ list2);


		//CHECK IF THE CONTENTS OF LIST1 and LIST2 ARE SAME 
		System.out.print("\nBOTH LIST ARE EQUAL: ");  // \n is for printing from next line oe we can say it as Enter button
		System.out.println(list1.equals(list2));

		//SORT LIST 1 IN ASCENDING ORDER and LIST 2 IN DESCENDING ORDER
		//to use comparator we need to import comparator
		list2.sort(Comparator.naturalOrder());  //we can write like this also : list1.sort(null);
		list2.sort(Comparator.reverseOrder());

		//PRINT LIST 1 and LIST 2 AFTER SORTING
		System.out.println("\nLIST 1 DATA AFTER SORTING IN ASCENDING ORDER :  "+ list1);
		System.out.println("LIST 2 DATA AFTER SORTING IN DESCENDING ORDER: "+list2);


		//ADD 100 AT THE START OF LIST 1 and 100 AT THE 1st INDEX OF LIST 2
		list1.addFirst(100);
		list2.add(1, 100);

		//REMOVE THE 2nd LAST INDEX ELEMENT OF BOTH LIST
		list1.remove(list1.size()-2);
		list2.remove(list2.size()-2);

		//PRINT LIST 1 AND LIST 2 AFTER MODIFYING DATA
		System.out.println("\nAdded 100 at the start of list 1 and 100 at the 1st index of list 2. Then removed 2nd last element of both list");
		System.out.println("LIST 1 DATA AFTER MODIFYING DATA: "+ list1);
		System.out.println("LIST 2 DATA AFTER MODIFYING DATA: "+list2);

		//INSERT 200 AT 3rd INDEX OF LIST 1 and REPLACE 3rd INDEX VALUE OF LIST 2 with 700
		list1.add(2, 200);
		list2.set(2, 700);

		//PRINT LIST 1 AND LIST 2 AFTER MODIFYING DATA
		System.out.println("\nAdded 200 at the 3rd index of list 1 and replaces 3rd index value of list 2 with 700");
		System.out.println("LIST 1 DATA AFTER MODIFYING DATA: "+ list1);
		System.out.println("LIST 2 DATA AFTER MODIFYING DATA: "+list2);


		//CHECK AGAIN IF THE CONTENET OF LIST 1 and LIST 2 ARE EQUAL
		System.out.print("\nBOTH LIST ARE EQUAL: ");
		System.out.println(list1.equals(list2));
		
	}

}
