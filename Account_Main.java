package BankCount;
import java.util.Scanner;

public class Account_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account count = new Account();
		
		Scanner sr = new Scanner(System.in);
		//criação da conta do cliente
		System.out.print("Holder :");
		count.setName(sr.nextLine());
		
		System.out.print("Numer Account: ");
		count.setAccountNumber(sr.nextInt());
		
		
		//condicao se for fazer ou nao o primeiro saque
		if(count.depositFirst(sr)) {
			System.out.print("Value first Deposit: $");
			count.deposit(sr.nextDouble()); 
			System.out.println(count);
		}
		
		//Fazer um deposito
		System.out.print("\nValue Deposit: $");
		count.deposit(sr.nextDouble());
		System.out.print(count);
		
		//fazer saque
		System.out.print("\n\nValue WightDraw: $");
		count.withDraw(sr.nextDouble());
		//System.out.println("Withdrawal Fee: $5,00");
		System.out.println(count);
		System.out.println("Withdrawal Fee: $5,00");
		
		
		
		sr.close();
		
	}

}
