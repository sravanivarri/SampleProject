/**
 * 
 */
package com.sellabs.sample;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vijay
 *
 */
public class ListData_mypurpose {
	static char[] arr = new char[30]; // create an array for storing alphabets
	static String[] arr1 = new String[30];
	int k = 0;

	public void data() {
		int j = 0;
		for (char i = 'a'; i <= 'z'; i++) { // create loop for alphabets
			arr[j] = i; // alphabets are stored in an array
			arr1[j] = Character.toString(arr[j]);// datatype change of alphabets from character to string
			j = j + 1; // and store in string array and increment j for next pointer

		}
	}

	public void list() {
		List<String> mainlist = new ArrayList<>();// list to store values
		for (int i = 0; i < 26; i += 3) {
			List<String> list = new ArrayList<String>();
			list.add(arr1[i]);// add to list
			list.add(arr1[i + 1]);
			list.add(arr1[i + 2]);
			String element0 = (String) list.get(0);
			String element1 = (String) list.get(1);
			String element3 = (String) list.get(2);
			String element4 = element0 + element1 + element3;// to append the alphabets

			mainlist.add(k++, element4);// here the place of element4 should be string,so take variables for every
										// element and then appended as element4

		}

		for (String data : mainlist) { // printing a list by creating data as variable
			System.out.println(data);

		}
	}

	public static void main(String[] args) {
		ListData_mypurpose ld = new ListData_mypurpose();
		ld.data();
		ld.list();

	}
}
