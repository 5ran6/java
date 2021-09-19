package hackerrank.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * brunolima on Sep 12, 2021
 * 
 */

public class PhotoAlbum {
	
	public static void main(String[] args) {
//		List<Integer> lsIndex = Arrays.asList(0, 1, 2, 1, 2);
//		List<Integer> lsIdentity = Arrays.asList(0, 1, 2 ,3 ,4);
		
		List<Integer> lsIndex = Arrays.asList(0, 1, 1);
		List<Integer> lsIdentity = Arrays.asList(0, 1, 2);
		
		
		System.out.println(photoAlbum(lsIndex, lsIdentity));
	}

	public static List<Integer> photoAlbum(List<Integer> index, List<Integer> identity) {
		// Write your code here
		List<Integer> result = new ArrayList<Integer>();
		
		for (int i = 0; i < index.size(); i++) {
			System.out.println(index.get(i));
			
			if (index.get(i).equals(identity.get(i))) {
				result.add(index.get(i));
			} else if (!index.get(i).equals(identity.get(i))) {
				Integer indexToChange = index.get(i);
				Integer valueToChange = result.get(indexToChange);
				
				result.add(indexToChange, identity.get(i));
				result.add(identity.get(i), valueToChange);
			}
		}
		
		
		return result.subList(0, result.size() - 1);
	}

}
