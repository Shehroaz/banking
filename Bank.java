package com.sherry;

import java.io.Serializable;

public class Bank implements Serializable {
    private Account account;
    /**
     * Default constructor
     */
    public Bank(){
        this.account=new Saving();

    }



    /**
     * Constructor of Bank class that takes all info of user about account and itself
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
    public Bank(String firstName, String lastName, String username,String password,
                String country, int ibanCheckSum, String swiftCode, String accountNumber, String accountType, float amount) throws InValidNameException,
            InValidAccountNumberException, InValidCountryException, InValidIbanCheckSumException, InValidSwiftCodeException,
            NotEnoughAmountException, InValidAmountException {
        this.createAccount(firstName, lastName, password, username, country, ibanCheckSum, swiftCode, accountNumber, accountType,amount);

    }

    /**
     * Create Account that takes all info of user about account and itself
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


    private void createAccount( String firstName, String lastName, String password, String username,
                               String country, int ibanCheckSum, String swiftCode, String accountNumber,String accountType, float amount) throws
            InValidNameException,
            InValidAccountNumberException, InValidCountryException, InValidIbanCheckSumException, InValidSwiftCodeException,
            NotEnoughAmountException, InValidAmountException {
        if (accountType.toUpperCase().equals("SAVINGS")) {
            this.setAccount(new Saving(firstName, lastName, password, username, country, ibanCheckSum,
                    swiftCode, accountNumber, amount));
        } else if (accountType.toUpperCase().equals("CURRENT")){
            this.setAccount(new Current(firstName, lastName, password, username, country, ibanCheckSum,
                    swiftCode, accountNumber, amount));
        }
    }

    /**
     * Create New Account
     *
     * @param account Account of user
     */

    private void setAccount(Account account)
    {
        this.account = account;
    }

    /**
     * Get Account Account of user
     *
     * @return Accouny of user
     */

    public Account getAccount()
    {
        return this.account;
    }

}
