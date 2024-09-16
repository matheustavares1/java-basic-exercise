package BankCount;
import java.util.Scanner;
public class Account {

	
	private String name;
	private double valueAccount;
	private  int accountNumber;
	
	
	
	
	//Metodos GETTERS e SETTERS
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getValue() {
		return valueAccount;
	}
	public void setValue(double value) {
		this.valueAccount = value;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	
	
	
	//Metodos
	public boolean depositFirst(Scanner sr) {
		System.out.print("Make deposit? (Y/N)");
		char depo = sr.next().toUpperCase().charAt(0);
		return depo == 'Y';
	}
	public void deposit(double deposit) {
		valueAccount += deposit;
		}
	
	public void withDraw(double draw) {
	 valueAccount = valueAccount - draw - 5.00;
		
	}
	@Override
	public String toString() {
		String infomations = String.format("Account data:\nHolder: %s, Account Number: %d, Account Value: $ %.2f ", this.name, this.accountNumber, valueAccount);
		return infomations;
	}
			
				
				
				
				
	
	
	
	
	
}
