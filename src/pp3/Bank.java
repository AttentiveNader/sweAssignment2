package pp3;

/**
 * @author Andrew Nasief
 * @version 1.0.12
 */
/*
 * Class Bank represent a bank system.
 * clients and accounts list in it.
 * Each Bank has 7 attributes (name , address, phone, arrayList_AC,arrayList_CL,count_AC,count_CL).
 * bank list an account and its client so composition takes place.
 * */

public class Bank extends Object {
    /*
     * Declaration of attributes the name and address are strings.
     * Declaration of attributes the phone is int.
     * arrayList_AC is an list of object from SpecialAccount used by composition.
     * arrayList_CL is an list of object from CommercialClient used by composition.
     * Bank attributes
     * */
    //Bank attributes
    private String name;
    private String address;
    private int phone;
    public SpecialAccount[] arrayList_AC;
    public CommercialClient[] arrayList_CL;
    //Static counters for set accounts and users
    static int count_AC = 0;
    static int count_CL = 0;

    /**
     * Default constructor "Bank".
     * the constructor get the default variables.
     */
    public Bank() {
        arrayList_AC = new SpecialAccount[100];
        arrayList_CL = new CommercialClient[100];
        name = null;
        address = null;
        phone = 1234567;
    }

    /**
     * parametrized constructor "Bank".
     * the constructor takes name, address and phone..
     */
    /**
     *
     * @param name
     * @param address
     * @param phone
     */
    public Bank(String name, String address, int phone) {
        arrayList_AC = new SpecialAccount[100];
        arrayList_CL = new CommercialClient[100];
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    /**
     * Setter
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Setter
     *
     * @param address
     */

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Setter
     *
     * @param phone
     */
    public void setPhone(int phone) {
        this.phone = phone;
    }

    /**
     * Getter
     *
     * @return
     */
    public String getName() {
        return ("Bank_Name: " + name);
    }

    /**
     * Getter
     *
     * @return
     */

    public String getAddress() {
        return ("Bank_Address: " + address);
    }

    /**
     * Getter
     *
     * @return
     */
    public int getPhone() {
        System.out.print("Bank_number: ");
        return (phone);
    }

    /**
     * function to print all accounts in the list
     * didn't take any parameter
     */
    public void printAll_A() {
        for (int i = 0; i < count_AC; i++) {
            System.out.println(arrayList_AC[i]);
        }
    }

    /**
     *  function to add account in the list
     * take parameter(SpecialAccount)
     * @param a
     */
    public void addAccount(SpecialAccount a) {
        arrayList_AC[count_AC] = a;
        count_AC++;
    }

    /**
     * function to print all Clients in the list
     * didn't take any parameter
     */
    public void printAll_C() {
        for (int i = 0; i < count_AC; i++) {
            System.out.println(arrayList_CL[i]);
        }
    }


    /**
     * function to add Client in the list
     * take parameter(CommercialClient)
     * @param AC
     */
    public void addClient(CommercialClient AC) {
        arrayList_AC[count_AC] = AC.getSpecial_AC();
        arrayList_CL[count_CL] = AC;
        count_CL++;
        count_AC++;
    }

}




