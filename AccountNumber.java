package com.sherry;

import java.io.Serializable;

public class AccountNumber implements Serializable {
    private String country;
    private String accountNumber;
    private int ibanCheckSum;
    private String swiftCode;

    /**
     * Default constructor
     */
    public AccountNumber(){}

    /**
     * Create Account Number of user by giving details
     *
     * @param country       Country Name of the bank
     * @param ibanCheckSum  International Bank Account Number
     * @param swiftCode     Swift code of the Bank
     * @param accountNumber AccountNumber of the Account
     * @throws InValidAccountNumberException InValid Account Number Exception
     * @throws InValidCountryException       InValid Country Name Exception
     * @throws InValidIbanCheckSumException  InValid International Bank Account Number Exception
     * @throws InValidSwiftCodeException     InValid Swift code Exception
     */
    public AccountNumber(String country, int ibanCheckSum, String swiftCode, String accountNumber) throws InValidAccountNumberException, InValidCountryException, InValidSwiftCodeException, InValidIbanCheckSumException {
        this.setCountry(country);
        this.setAccountNumber(accountNumber);
        this.setIbanCheckSum(ibanCheckSum);
        this.setSwiftCode(swiftCode);

    }

    /**
     * Create Account Number
     *
     * @param accountNumber AccountNumber of the Account
     * @throws InValidAccountNumberException InValid Account Number Exception
     */

    public void setAccountNumber(String accountNumber) throws InValidAccountNumberException {
        if (accountNumber.matches("^[\\w]{16}$")) {
            this.accountNumber = accountNumber;
        } else {
            throw new InValidAccountNumberException("Account Number is InValid");
        }
    }

    /**
     * Get Account Number
     *
     * @return
     */

    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * create Iban Check Sum
     *
     * @param ibanCheckSum International Bank Account Number
     * @throws InValidIbanCheckSumException InValid International Bank Account Number Exception
     */

    public void setIbanCheckSum(int ibanCheckSum) throws InValidIbanCheckSumException {
        if (String.valueOf(ibanCheckSum).matches("^\\d{2}$")) {
            this.ibanCheckSum = ibanCheckSum;
        } else {

            throw new InValidIbanCheckSumException("Invalid CheckSum");
        }
    }

    /**
     * Get Iban Check Sum
     *
     * @return
     */

    public int getIbanCheckSum() {
        return ibanCheckSum;
    }

    /**
     * Set Country Name
     *
     * @param country
     * @throws InValidCountryException Invalid Country Name Exception
     */

    public void setCountry(String country) throws InValidCountryException {
        if (country.matches("^\\w{2}$")) {
            this.country = country;
        } else {
            throw new InValidCountryException("Country name must be of atleast 2 or more Alphabet's");
        }
    }

    public String getCountry() {
        return country;
    }

    /**
     * Create Swift code
     *
     * @param swiftCode
     * @throws InValidSwiftCodeException InValid Swift Code Exception
     */


    public void setSwiftCode(String swiftCode) throws InValidSwiftCodeException {
        if (swiftCode.matches("^[a-zA-Z]{4}$")) {
            this.swiftCode = swiftCode;
        } else {
            throw new InValidSwiftCodeException("");
        }
    }

    /**
     * Get Swift code
     *
     * @return
     */

    public String getSwiftCode() {
        return swiftCode;
    }
}
