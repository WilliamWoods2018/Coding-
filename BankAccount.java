/*
 * Filename:  BankAccount.java
 *
 * Programmer:
 * ULID: 
 *
 * Date:  
 *
 * Class:  IT 168
 * Lecture Section:
 * Lecture Instructor:
 * Lab Section:
 * Lab Instructor:  
 */



/**
 * Handles processing for a bank account
 *
 * @author Cathy Holbrook
 * @author Modified by:wwoods 
 *
 */
public class BankAccount 
{
	private String accountNumber;
	private String firstName;
	private String lastName;
	private double balance;
	private final double OVERDRAFT_CHARGE = 30.00;

	
	public BankAccount(String accountNumber, String firstName, String lastName,
			double balance)
	{
		
		this.accountNumber = accountNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
	}
	/**
	 * 
	 * Gets the amount the customer wants to withdraw, checks to 
	 * be sure they have enough in their balance for the amount,
	 * process the withdrawal or provide an insufficient funds
	 * message.
	 *
	 * @param: withdrawal
	 *
	 */
	public void processWithdrawal(double withdrawal)
	{
		boolean sufficientFunds = validateWithdrawalAmount(withdrawal);
		
		if (sufficientFunds){
			System.out.printf("$%.2f %s", withdrawal, "has been withdrawn from your account");
			balance = balance - withdrawal;
		} else {
			System.out.printf("$%s %.2f", "You do not have sufficient funds to withdraw\n", 
					withdrawal);
			System.out.println("\n$30 overdraft charge has been applied");
			balance = balance - withdrawal;
			balance = balance - OVERDRAFT_CHARGE;
		}
		System.out.printf("\n%s $%.2f", "Your current balance is ", balance);	
	}
	
	/**
	 * @param accountNumber
	 * @param firstName
	 * @param lastName
	 * @param balance
	 */
	

	/**
	 * 
	 * Validates whether there is enough money in the account
	 * for the amount the customer wants to withdraw.
	 *
	 * @param: 	 withdrawal
	 * @return:  sufficientFunds
	 *
	 */
	private boolean validateWithdrawalAmount(double withdrawal)
	{
		boolean sufficientFunds = true;
		
		if (withdrawal >= balance){
			sufficientFunds = false;
		}
		
		return sufficientFunds;
	}
	
	/**
	 *  
	 * Processes a deposit by adding the amount to the balance
	 *
	 * @param: 	 deposit
	 *
	 */
	public void processDeposit(double deposit)
	{
		System.out.printf("\n$%.2f %s", deposit, " has been added to your account\n");
		balance = balance + deposit;
	}
	
	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() 
	{
		return accountNumber;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() 
	{
		return balance;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName()
	{
		return firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName()
	{
		return lastName;
	}
	@Override
	public String toString()
	{
		return accountNumber + "\n" + firstName + "\n" + lastName + 
				"\n" + balance;
	}
	

	/**
	 * @param accountNumber the accountNumber to set
	 */
	//public void setAccountNumber(String accountNumber)
	//{
		//this.accountNumber = accountNumber;
	//}

	/**
	 * @param firstName the firstName to set
	 */
	//public void setFirstName(String firstName)
	//{
		//this.firstName = firstName;
	//}

	/**
	 * @param lastName the lastName to set
	 */
	//public void setLastName(String lastName)
	//{
		//this.lastName = lastName;
	//}

	/**
	 * @param balance the balance to set
	 */
	//public void setBalance(double balance)
	//{
		//this.balance = balance;
	//}

	
}
