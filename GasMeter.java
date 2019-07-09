/*
 *File Name: GasMeter.java
 *
 *Programmer: William Woods
 *ULID: wwoods
 *
 *Date: Oct 22, 2014
 *
 *Class: IT 168
 *Lecture Section: 12
 *Lecture Instructor: Pat Matsuda
 *Lab Section: 12
 *Lab Instructor: Nasiba AL-Rawi  
 */

/**
 * <insert class description here>
 *
 * @author wwoods
 *
 */
public class GasMeter
{
	private String accountNumber;
	private String streetAddress;
	private String city;
	private double therms;

	public GasMeter(String accountNumber, String streetAddress, String city,
			double therms)
	{

		this.accountNumber = accountNumber;
		this.streetAddress = streetAddress;
		this.city = city;
		this.therms = therms;
	}

	public double calculateCost(int day)
	{
		double cost = determineRate(day) * therms;
		return cost;
	}

	private double determineRate(int day)
	{
		if(day >= 27){
			double rate = .04;
			return rate;
		}
		else if(day <= 8){
			double rate = .06;
			return rate;
		}
		else{
			double rate = .05;
			return rate;
		}
		
	}

	public String getAccountNumber()
	{
		return accountNumber;
	}

	public String getStreetAddress()
	{
		return streetAddress;
	}

	public String getCity()
	{
		return city;
	}

	public double getTherms()
	{
		return therms;
	}

}
