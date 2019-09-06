package com.sherry;

import java.io.Serializable;

public class Current extends Account  implements Serializable {

    /**
     * Default constructor
     */
    public Current(){}

    /**
     * Create Constructor for Current class
     *
     * @param firstName     First Name of the user
     * @param lastName      Last Name of the user
     * @param password      Password of the user
     * @param username      Username of the user
     * @param country       Country Name of the bank
     * @param ibanCheckSum  International Bank Account Number
     * @param swiftCode     Swift code of the Bank
     * @param accountNumber AccountNumber of the Account
     * @param amount        Account of Bank
     * @throws InValidNameException          InValid Name Exception
     * @throws InValidAccountNumberException InValid Account Number Exception
     * @throws InValidCountryException       InValid Country Name Exception
     * @throws InValidIbanCheckSumException  InValid International Bank Account Number Exception
     * @throws InValidSwiftCodeException     InValid Swift code Exception
     * @throws NotEnoughAmountException      Not Enough Amount Exception
     * @throws InValidAmountException        InValid Amount Exception
     */

    public Current(String firstName, String lastName, String password, String username,
                   String country, int ibanCheckSum, String swiftCode, String accountNumber, float amount) throws InValidNameException,
            InValidAccountNumberException, InValidCountryException, InValidIbanCheckSumException, InValidSwiftCodeException,
            NotEnoughAmountException, InValidAmountException {
        super(firstName, lastName, password, username, country, ibanCheckSum, swiftCode, accountNumber);

        this.depositAmount(amount);

    }


    /**
     * Amount withdraw from account and remaining amount return after withdraw
     *
     * @param amount Amount in Account of Bank
     * @return Remaining Amount in Account
     * @throws NotEnoughAmountException Not Enough Amount Exception
     * @throws InValidAmountException   InValid Amount Exception
     */
    @Override
    public float withdrawAmount(float amount) throws NotEnoughAmountException, InValidAmountException {
        if (amount > 0) {
            if (this.getAmount() > amount) {
                float a=this.getAmount() - amount;
                this.setAmount(a);
                return this.getAmount();
            } else {
                throw new NotEnoughAmountException("you have not enough amount");
            }
        } else {
            throw new InValidAmountException("Amount is InValid");
        }

    }
    /**
     * Get Account Type
     * @return  Account Type Saving or Current
     */
    @Override
    protected String getAccountType(){
        return this.accountType;
    }
}
