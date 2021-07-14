//*********************************************************************************************
// CLASS: Searcher (Searcher.java)
//
// CSE205 Object Oriented Programming and Data Structures, Fall B 2020
// Project Number: project 3
//
// AUTHOR: Dylan Carey, docarey, socarey@asu.edu
//*********************************************************************************************
package proj3;

import java.util.ArrayList;

public class Searcher {
	
	public static int search(ArrayList<Student> pList, String pKey) {
		int low = 0, high = (pList.size() - 1);
		
		while (low <= high) {
			int middle = (low + high)/2;
			
			if (pKey.equals(pList.get(middle).getLastName())) {
				return middle;
			}
			
			else if (pKey.compareToIgnoreCase(pList.get(middle).getLastName()) < 0) {
				high = middle - 1;
			}
			
			else {
				low = middle + 1;
			}
		}
		return -1; // Not found
	}
}
