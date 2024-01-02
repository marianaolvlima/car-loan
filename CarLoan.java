public class CarLoan {

  int carLoan = 10000;
  int loanLength = 3;
  int interestRate = 5; 
  int downPayment = 2000; 

  public CarLoan() {
    if (loanLength <= 0 || interestRate <= 0) {
      System.out.println("Error! You must take out a valid car loan.");
    } else if (downPayment >= carLoan) {
      System.out.println("The car can be paid in full!");
    } else {
      int remainingBalance = carLoan - downPayment;
      int months = loanLength * 12;
      int monthlyBalance = remainingBalance / months;
      int interest = (remainingBalance * interestRate) / 100;
      int monthlyPayment = (remainingBalance + interest) / months; 
      System.out.println(monthlyPayment);
    }
  }

	public static void main(String[] args) {
    CarLoan myCarLoan = new CarLoan();
	}
}