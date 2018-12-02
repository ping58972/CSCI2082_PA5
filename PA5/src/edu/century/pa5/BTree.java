package edu.century.pa5;

public class BTree {
/*	public static void main(String[] args) {
		int[] data = { 2,4,10,14,15,23,30,33,35,37,40,45,50};
		int[] data2 = { 2,4,14,15,23,30,35,37,40,45,50};
		System.out.println(has33(data, 0, data.length-6));
		System.out.println(has33(data2, 0, data2.length));
	}*/
	
	public static boolean has33(int[] data, int start, int end) {
		int middle;
		if(end <= 0) 
			return false;
		else {
			middle = start + end/2;
			if(data[middle] == 33)
				return true;
			else if (data[middle]>33)
				return has33(data, start, end/2);
			else
				return has33(data, middle+1, (end-1)/2);
		}
	}
}
