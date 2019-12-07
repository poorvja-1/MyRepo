package week3.day1;

public class SBI implements RBI, Cibil{

	public void getCreditScore() {
		System.out.println("CreditScore");
		
	}

	public void maxTransLimit() {
		System.out.println("MaxTransLimit");
		
	}

	public void verifyAadhar() {
		System.out.println("VerifyAadhaar");
		
	}

	public void minimumBalance() {
		System.out.println("MinimumBalance");
		
	}
	public static void main(String[] args) {
		
SBI sbi = new SBI();
sbi.getCreditScore();
sbi.maxTransLimit();
sbi.verifyAadhar();
sbi.minimumBalance();
	}

}
