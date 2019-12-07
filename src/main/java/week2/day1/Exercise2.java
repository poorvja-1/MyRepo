package week2.day1;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = {"pooja", "ajith", "dinesh", "raj","kumar", "prem"};
		for(String str : name) {
			System.out.println(str);
		}
		for(String str1 : name) {
			if(str1.startsWith("p")||str1.endsWith("h"))
			System.out.print(str1+" ");
		}
	}

}
