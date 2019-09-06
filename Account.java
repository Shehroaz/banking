package com.sherry;

import java.io.Serializable;

public  abstract  class Account implements Serializable {
    private User user;
public String accountType=null;



    private AccountNumber accountNumber;
    private float amount = 0;
    /**
     * Default constructor
     */

    public Account(){
        this.user=new User();
        this.accountNumber=new AccountNumber();
    }
    /**
     * Create Constructor for Account class
     *
     * @param firstName     First Name of the user
     * @param lastName      Last Name of the user
     * @param password      Password of the user
     * @param username      Username of the user
     * @param country       Country Name of the bank
     * @param ibanCheckSum  International Bank Account Number
     * @param swiftCode     Swift code of the Bank
     * @param accountNumber AccountNumber of the Account
     * @throws InValidNameException          InValid Name Exception
     * @throws InValidAccountNumberException InValid Account Number Exception
     * @throws InValidCountryException       InValid Country Name Exception
     * @throws InValidIbanCheckSumException  InValid International Bank Account Number Exception
     * @throws InValidSwiftCodeException     InValid Swift code Exception
     */
    public Account(String firstName, String lastName, String password, String username,
                   String country, int ibanCheckSum, String swiftCode, String accountNumber) throws InValidNameException,
            InValidAccountNumberException, InValidCountryException, InValidIbanCheckSumException, InValidSwiftCodeException {
        this.setUser(firstName, lastName, password, username);
        this.setAccountNumber(country, ibanCheckSum, swiftCode, accountNumber);
    }

    /**
     *
     *@param firstName     First Name of the user
     *@param lastName      Last Name of the user
     *@param password      Password of the user
     *@param username      Username of the user
     *@throws InValidNameException          InValid Name Exception
     */

    protected void setUser(String firstName, String lastName, String password, String username) throws InValidNameException {
        this.user = new User(firstName, lastName, password, username);
    }

    /**
     *
     * @return user name
     */

    public User getUser() {
        return user;
    }

    /**
     * Account Number of user
     *
     * @param country country name in Account Number
     * @param ibanCheckSum IBAN name is Account Number
     * @param swiftCode SwifCode in Account Number
     * @param accountNumber Account number
     * @throws InValidAccountNumberException InValid Account Number Exception
     * @throws InValidCountryException  InValid Country name Exception
     * @throws InValidIbanCheckSumException  InValid CheckSum Exception
     * @throws InValidSwiftCodeException  InValid SwiftCode Exception
     */

    protected void setAccountNumber(String country, int ibanCheckSum, String swiftCode, String accountNumber) throws InValidAccountNumberException, InValidCountryException, InValidIbanCheckSumException, InValidSwiftCodeException {
        this.accountNumber = new AccountNumber(country, ibanCheckSum, swiftCode, accountNumber);
    }

    /**
     * Get Account Number
     *
     * @return Account Number
     */

    public AccountNumber getAccountNumber() {
        return accountNumber;
    }

    /**
     * Amount withdraw from account and remaining amount return after withdraw
     *
     * @param amount Amount in User Account
     * @return Amount in user Account
     * @throws NotEnoughAmountException Not Enough Amount Exception
     * @throws InValidAmountException InValid Amount Exception
     */

    public abstract float withdrawAmount(float amount) throws NotEnoughAmountException, InValidAmountException;

    /**
     * Deposit Amount in Account
     * @param amount Amount in User Account
     * @throws InValidAmountException InValid Amount Exception
     */
    public float depositAmount(float amount) throws InValidAmountException {
        if (amount > 0) {
            this.amount += amount;
            return this.amount;
        } else {
            throw new InValidAmountException("Amount is InValid");
        }

    }

    /**
     *Amount for account
     *
     * @param amount
     * @throws InValidAmountException InValid Amount Exception
     */

    protected void setAmount(float amount)throws  InValidAmountException {
        this.amount = amount;
    }
    /**
     * Get Amount
     *
     * @return amount
     */

    protected float getAmount() {
        return amount;
    }

    /**
     * Get Account Type
     *
     * @return Account Type Current or Savings
     */

    abstract protected String getAccountType();

    /**
     * Set AccountType
     *
     * @param accountType Account Type Saving or Current
     */

    protected void setAccountType(String accountType){
        this.accountType=accountType;
    }
}

