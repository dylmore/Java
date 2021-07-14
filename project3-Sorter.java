//*********************************************************************************************
// CLASS: Sorter (Sorter.java)
//
// CSE205 Object Oriented Programming and Data Structures, Fall B 2020
// Project Number: project 3
//
// AUTHOR: Dylan Carey, docarey, socarey@asu.edu
//*********************************************************************************************
package proj3;

import java.util.ArrayList;

public class Sorter {
	
	private static int partition(ArrayList<Student> pList, int pFromIdx, int pToIdx) {
		// pivot point
		String pivot = pList.get((pFromIdx + pToIdx)/ 2).getLastName();

		int leftIndex = pFromIdx - 1, rightIndex = pToIdx + 1;
		
		while(leftIndex < rightIndex) {
			leftIndex++;
			
			//left while loop
			while(pList.get(leftIndex).getLastName().compareToIgnoreCase(pivot)
					> 0) {leftIndex++;}
			rightIndex--;
			
			//right while loop
			while (pList.get(rightIndex).getLastName().compareToIgnoreCase(pivot)
					< 0) {rightIndex--;}
			if(leftIndex < rightIndex) {
				swap(pList, leftIndex, rightIndex);
			}
		}// End while
		return rightIndex;
	}// End partition
	
	private static void quickSort(ArrayList<Student> pList, int pFromIdx, int pToIdx) {
		if(pFromIdx >= pToIdx) {return;}
		int partIdx = partition(pList, pFromIdx, pToIdx);
		quickSort(pList, pFromIdx, partIdx);
		quickSort(pList, partIdx + 1, pToIdx);
	}
	
	public static void sort(ArrayList<Student> pList) {
		quickSort(pList, 0, pList.size() - 1);
	}
	
	private static void swap(ArrayList<Student> pList, int pIdx1, int pIdx2) {
		// create copy of String at index 1
		Student temp = pList.get(pIdx1);
		// set reference at index 2 to reference at index 1
		pList.set(pIdx1, pList.get(pIdx2));
		// set copy of String 1 to String at index 2
		pList.set(pIdx2, temp);
	}
}
