package com.sherry;

import java.io.Serializable;

public class Unique implements Serializable {
    private Bank bank;
    public Unique(){
        this.bank=new Bank();
    }

    /**
     * Constructor of UNIQUE class that takes all info of user about account and itself
     *
     * @param firstName First name of the user
     * @param lastName Last name of the user
     * @param username User name of the user
     * @param password password of the user
     * @param country country of the user
     * @param ibanCheckSum Internation Bank Account Number
     * @param swiftCode Swift code of the bank
     * @param accountNumber Account number of Bank Account
     * @param accountType Account type Saving or Current
     * @param amount Initial Amount in account
     * @throws InValidNameException InValid Name Exception
     * @throws InValidAccountNumberException InValid Account Number Exception
     * @throws InValidCountryException Invalid Country Name Exception
     * @throws InValidIbanCheckSumException InValid IBAN Number Exception
     * @throws InValidSwiftCodeException InValid Swift Code Exception
     * @throws NotEnoughAmountException InValid Amount Exception mean account amount is less then withdraw amount
     * @throws InValidAmountException Invalid Amount Exception
     */

    public Unique(String firstName, String lastName, String username, String password,
                  String country, int ibanCheckSum, String swiftCode, String accountNumber, String accountType, float amount) throws InValidNameException,
            InValidAccountNumberException, InValidCountryException, InValidIbanCheckSumException, InValidSwiftCodeException,
            NotEnoughAmountException, InValidAmountException {
        bank = new Bank(firstName, lastName, username, password, country, ibanCheckSum, swiftCode, accountNumber, accountType, amount);


    }

    /**
     * First Name of user
     *
     * @param firstName  First name of the user
     * @throws InValidNameException InValid name Exception
     */
    public void setFirstName(String firstName) throws InValidNameException{
        this.bank.getAccount().getUser().setFirstName(firstName);
    }

    /**
     * Return First Name
     *
     * @return First Name
     */
    public String getFirstName(){
    return this.bank.getAccount().getUser().getFirstName();
    }

    /**
     * Set Last Name
     *
     * @param lastName last name of user
     * @throws InValidNameException InValid name Exception
     */
    public void setLastName(String lastName)throws InValidNameException{
        this.bank.getAccount().getUser().setLastName(lastName);

    }

    /**
     * Last Name of user
     *
     * @return Last Name
     */
    public String getLastName(){
        return this.bank.getAccount().getUser().getLastName();
    }

    /**
     * Set username
     *
     * @param userName username
     * @throws InValidNameException InValid name Exception
     */
    public void setUserName(String userName) throws InValidNameException{
        this.bank.getAccount().getUser().setUsername(userName);

    }

    /**
     * Get Username
     *
     * @return username
     */
    public String getUserName(){
       return this.bank.getAccount().getUser().getUsername();
    }

    /**
     * password of the user
     *
     * @param password password
     * @throws InValidNameException InValid name Exception
     */

    public void setPassword(String password) throws InValidNameException{
        this.bank.getAccount().getUser().setPassword(password);
    }

    /**
     * Get Password
     *
     * @return Password of user
     */
    public String getPassword(){
        return this.bank.getAccount().getUser().getPassword();
    }

    /**
     * Country name is account
     *
     * @param country name of country
     * @throws InValidCountryException InValid Country name Exception
     */

    public void setCountry(String country)throws InValidCountryException{
        this.bank.getAccount().getAccountNumber().setCountry(country);
    }

    /**
     * Country name for account
     * @return Country name
     */
    public String getCountry(){
        return this.bank.getAccount().getAccountNumber().getCountry();
    }

    /**
     * Set International Bank account number
     * @param ibanCheckSum
     * @throws InValidIbanCheckSumException Invalid IBAN CHECKSUM Exceptiom
     */
    public void setIbanCheckSum(int ibanCheckSum) throws InValidIbanCheckSumException{
      this.bank.getAccount().getAccountNumber().setIbanCheckSum(ibanCheckSum);
    }

    /**
     *Get IBAN number
     *
     * @return IBAN number
     */


    public int getIbanCheckSum(){
      return   this.bank.getAccount().getAccountNumber().getIbanCheckSum();
    }

    /**
     *Set Swift code of amount
     * @param swiftCode Swift code of Account Number
     * @throws InValidSwiftCodeException InValid Swift code of Exception
     */

    public void setSwiftCode(String swiftCode) throws InValidSwiftCodeException{
        this.bank.getAccount().getAccountNumber().setSwiftCode(swiftCode);
    }

    /**
     * Get Swift code for account number
     * @return Swift code
     */

    public String getSwiftCode(){
        return this.bank.getAccount().getAccountNumber().getSwiftCode();
    }

    /**
     * Set Account Number
     *
     * @param accountNumber Account Number for bank
     * @throws InValidAccountNumberException Invalid Amount Exception
     */

    public void setAccountNumber(String accountNumber)throws  InValidAccountNumberException{
        this.bank.getAccount().getAccountNumber().setAccountNumber(accountNumber);

    }

    /**
     * Get Account Number
     * @return Account Number
     */

    public String getAccountNumber(){
        return this.bank.getAccount().getAccountNumber().getAccountNumber();
    }

    /**
     * Set AccountType
     *
     * @param accountType Account Type Saving or Current
     * @throws InValidAccountNumberException InValid Account Number Exception
     */

    public void setAccountType(String accountType)throws InValidAccountNumberException{
        this.bank.getAccount().setAccountType(accountType);

    }

    /**
     * Get Account Type
     * @return  Account Type Saving or Current
     */
    public String getAccountType(){
        return this.bank.getAccount().getAccountType();
    }

    /**
     * Amount for account
     * @param amount Amount in account
     * @throws InValidAmountException  InValid Amount Exception
     */

    public void setAmount (float amount)throws InValidAmountException{
        this.bank.getAccount().setAmount(amount);
    }

    /**
     * Get Amount
     *
     * @return amount
     */

    public  float getAmount(){
        return this.bank.getAccount().getAmount();
    }

    /**
     * Amount withdraw from account and remaining amount return after withdraw
     *
     * @param amount Amount in User Account
     * @return Amount in user Account
     * @throws NotEnoughAmountException Not Enough Amount Exception
     * @throws InValidAmountException InValid Amount Exception
     */
    public float withdrawAmount(float amount) throws InValidAmountException,NotEnoughAmountException{
        return this.bank.getAccount().withdrawAmount(amount);
    }
    /**
     * Deposit Amount in Account
     * @param amount Amount in User Account
     * @throws InValidAmountException InValid Amount Exception
     */

    public float depositAmount(float amount) throws InValidAmountException{
        return this.bank.getAccount().depositAmount(amount);
    }
}
