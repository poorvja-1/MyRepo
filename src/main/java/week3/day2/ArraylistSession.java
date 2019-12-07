package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class ArraylistSession {

	public static void main(String[] args) {
		List<String> lis = new ArrayList();
		lis.add("Anand");
		lis.add("Bala");
		lis.add("Chandran");
		lis.add("Poorvja");
		lis.add("Raj");
		lis.add("Kumar");
		lis.add("Ajith");
		lis.add("Raj");
		lis.add("Manoj");
		
		for(int i=0; i<lis.size(); i++){
		
			for(int j=i+1; j<lis.size();j++) {
				
				if (lis.get(i).equals(lis.get(j))) {
					System.out.println("duplicate:" +lis.get(i));
					lis.remove(i);
					lis.remove(j-1);
				}
				}
			}
		
		for(int k=0; k<lis.size(); k++) {
			System.out.println("unique:" +lis.get(k));
		}
		
		
		}
		
		
	}


