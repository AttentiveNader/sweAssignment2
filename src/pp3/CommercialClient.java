package pp3;

/**
 * @author Paula Adel
 * @version 1.5
 * */

/*
 *Commercial client class inherits from the Client class.
 * Commercial client has commercial ID instead of nationalID which is set to "00000000000000".
 * Commercial client has same attributes as the client but it uses only special accounts.
 * */

public class CommercialClient extends Client {
    public String commercialID;
    /*
     *setters and getters function
     *2 setters and 2 getters for the commercial ID and the specialAccount attributes.
     * */

    /**
     *
     * @return commercialID
     */
    public String getCommercialID() {
        return commercialID;
    }

    /**
     *
     * @param commercialID
     */
    public void setCommercialID(String commercialID) {
        this.commercialID = commercialID;
    }

    /**
     *
     * @return - Commercial client special account
     */
    public SpecialAccount getSpecial_AC(){
        return specialAccount;
    }
    /**
     * @param name - CommercialClient name
     * @param address - CommercialClient address
     * @param commercialID - CommercialClient ID
     * @param phone - CommercialClient phone
     * @param acc - CommercialClient Special account
     */
    /* parametrized constructor
     * the constructor takes name, nationalID, address, phone and specialAcount only
     * */
    public CommercialClient(String name, String commercialID, String address, String phone, SpecialAccount acc) {
        super(name, "00000000000000", address, phone, acc);
        this.commercialID = commercialID;
    }
    /*
     * Overriding the method toString.
     * ovriding toString from object class to use System.out.println() to print account details on the screen.
     * */
    /**
     @return "CommercialClient:" +
     "\nName: " + name +
     "\nAddress: " + address +
     "\ncommercialID: " + commercialID +
     "\nPhone: " + phone +
     "\nAccount: " + specialAccount
      * */
    @Override
    public String toString() {
        return "CommercialClient:" +
                "\nName: " + name +
                "\nAddress: " + address +
                "\ncommercialID: " + commercialID +
                "\nPhone: " + phone +
                "\nAccount: " + specialAccount;
    }
}