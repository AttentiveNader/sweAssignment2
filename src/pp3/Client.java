package pp3;

/**
 * @author Paul Adel
 * @version 1.4
 */

/*
 * Class Client represent a client in a bank system.
 * Each client has account.
 * Each client has 5 attributs (name national id, address, phone, account or special account).
 * Client has an account or special account so aggregation takes place.
 * */

public class Client extends Object{

    /*
     * Decleration of attributes the name, address, nationalID, and phone are strings.
     * account is an object from Account used by aggregation.
     * specialAccount is an object from SpecialAccount used by aggregation.
     * Client attributes
     * */

    protected Account account;
    protected SpecialAccount specialAccount;
    protected String name, address;
    protected String nationalID, phone;

    /*
     *Setters and getters methods.
     * from line 24 till 62 contains 5 setters and 5 getters.
     * a setter and a getter for each attribute.
     * */

    /**
     *
     * @return account
     */
    public Account getAccount() {
        return account;
    }

    /**
     *
     * @param account - Client account
     */
    public void setAccount(Account account) {
        this.account = account;
    }

    /**
     *
     * @return nane
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name - Client name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     *
     * @param address - Client address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     *
     * @return nationalID
     */
    public String getNationalID() {
        return nationalID;
    }

    /**
     *
     * @param nationalID - Client ID
     */
    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    /**
     *
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     *
     * @param phone - Client phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @param name - Client name
     * @param address - Client address
     * @param nationalID - Client  ID
     * @param phone - Client phone
     * @param account - Client account
     */

    /* parametrized constructor "Client".
     * the constructor takes name, nationalID, address, phone and account only.
     * it does not take the specialAccount attribute.
     * */

    public Client( String name, String nationalID, String address, String phone, Account account) {
        this.account = account;
        this.name = name;
        this.address = address;
        this.nationalID = nationalID;
        this.phone = phone;
    }

    /**
     * @param name - Client name
     * @param address - Client address
     * @param nationalID - Client national ID
     * @param phone - Client phone
     * @param accS - Client Special account
     */

    /* parametrized constructor "Special Account"
     * the constructor takes name, nationalID, address, phone and specialAcount only.
     * it does not take the account attribute.
     * */

    public Client( String name, String nationalID, String address, String phone, SpecialAccount accS) {
        this.specialAccount = accS;
        this.name = name;
        this.address = address;
        this.nationalID = nationalID;
        this.phone = phone;
    }

    /**
     * @return "Client: " +
     *                 "\nName: " + name +
     *                 "\nAddress: " + address +
     *                 "\nNationalID: " + nationalID +
     *                 "\nPhone: " + phone +
     *                 "\nAccount:" + account
     */

    /* Overriding the method toString.
     * ovriding toString from object class to use System.out.println() to print account details on the screen.
     * */

    @Override
    public String toString() {
        return "Client: " +
                "\nName: " + name +
                "\nAddress: " + address +
                "\nNationalID: " + nationalID +
                "\nPhone: " + phone +
                "\nAccount:" + account;
    }
}

