package com.sherry;

import java.io.Serializable;

public class Saving extends Account implements Serializable {

    /**
     * Default constructor
     */
    public Saving(){}

    /**
     * Create Constructor for Saving class
     * @param firstName First Name of the user
     * @param lastName Last Name of the user
     * @param password Password of the user
     * @param username Username of the user
     * @param country Country Name of the bank
     * @param ibanCheckSum International Bank Account Number
     * @param swiftCode  Swift code of the Bank
     * @param accountNumber AccountNumber of the Account
     * @param amount Amount of Account
     * @throws InValidNameException InValid Name Exception
     * @throws InValidAccountNumberException InValid Account Number Exception
     * @throws InValidCountryException InValid Country Name Exception
     * @throws InValidIbanCheckSumException InValid International Bank Account Number Exception
     * @throws InValidSwiftCodeException InValid Swift code Exception
     * @throws NotEnoughAmountException Not Enough Amount Exception
     * @throws InValidAmountException InValid Amount Exception
     */
    public Saving(String firstName, String lastName, String password, String username,
                  String country, int ibanCheckSum, String swiftCode, String accountNumber, float amount) throws InValidNameException,
            InValidAccountNumberException, InValidCountryException, InValidIbanCheckSumException, InValidSwiftCodeException, NotEnoughAmountException, InValidAmountException {
        super(firstName, lastName, password, username, country, ibanCheckSum, swiftCode, accountNumber);

        this.depositAmount(amount);

    }

    /**
     * Withdraw amount from account that user provided
     *
     * @param amount Amount Of Account
     * @return Amount remaining in account
     * @throws NotEnoughAmountException Not Enough Amount Exception
     * @throws InValidAmountException InValid Amount Exception
     */
    @Override
    public float withdrawAmount(float amount) throws NotEnoughAmountException, InValidAmountException {
        if (amount > 0) {
            if (this.getAmount() > (amount + 0.02 * amount)) {
              float a  = (float) (this.getAmount() - (amount + 0.02 * amount));
              this.setAmount(a);
                return this.getAmount();
            } else {
                throw new NotEnoughAmountException("you have not enough amount");
            }
        } else {
            throw new InValidAmountException("Amount is InValid");
        }

    }
    @Override
    protected String getAccountType(){
        return this.accountType;
    }
}

