import java.util.Scanner;
public class AccountInstance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);

SavingAccount account1=new SavingAccount("Jay", 100134, 100);
SavingAccount account2=new SavingAccount("Aileen", 100190, 1000);
SavingAccount account3=new SavingAccount("John", 100153, 3213);

System.out.println("What is the username for current account? ");
String username=scan.nextLine();
System.out.println("What is the pin? ");
int pin=scan.nextInt();
System.out.println("What is the account balance? ");
double balance=scan.nextInt();
SavingAccount currentAccount1=new SavingAccount(username,pin,balance);

System.out.println("Key in 1 for withdraw, and 2 for deposit, are you withdrawing or depositing?");
int answer=scan.nextInt();
if(answer==1)
{
	System.out.println("How much are you withdrawing? ");
	double withdaw1=scan.nextDouble();
	System.out.println(currentAccount1.withdraw(withdaw1));
}
else if(answer==2)
{
	System.out.println("How much are you depositing? ");
	double deposit1=scan.nextDouble();
	System.out.println(currentAccount1.deposit(deposit1));
}
else
{
	System.out.println("Error");
}

	}
	
}
