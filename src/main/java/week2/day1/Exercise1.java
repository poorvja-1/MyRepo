package week2.day1;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s = "Aspire (10397)";
      // System.out.println(s.substring(8, 13));
     String s1 = "hi how are you";
     
        String[] split = s.split(" ");
       for(int i = 0; i<split.length; i++){
   	 String  a = split[i];
   	 char[] cArray = a.toCharArray();
   	 for(int j = 0; j<cArray.length; j++)
   	 {
    	if ((int) cArray[j] < 10)
       System.out.println(cArray[j]);
       
       }
       }
	
	}
}
