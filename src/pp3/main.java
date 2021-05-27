/**
@Author Name:Nader Atef,Paula Adel,Andrew Naseif
Date:22/4/2021
 @version 1.1
 */
package pp3;
import java.util.Scanner;
public class main {
    /**
     * shows the menu for the user
     */
    public static void printMenu() {
        System.out.println("1-Add New Client");
        System.out.println("2-list All Accounts / clients");
        System.out.println("3-withdraw/Deposit");
        System.out.println("4-Exit");

    }
    public static void main(String[] args) {
        String num;
        String name,address,ADI,phone;
        Scanner sc = new Scanner(System.in);
        Bank b1 = new Bank("Cairo Bank", "33st Nile,cairo egypt", 15689);
        while (true) {
            printMenu();
            num = sc.nextLine();
            if(num.equals("1")){
                System.out.println("Add Name ");
                name =sc.nextLine();
                System.out.println("add address");
                address=sc.nextLine();
                System.out.println("add National ID");
                ADI=sc.nextLine();
                System.out.println("Enter phone");
                phone=sc.nextLine();
                SpecialAccount acc=new SpecialAccount();
                CommercialClient cl=new CommercialClient(name,ADI,address,phone ,acc);
                b1.addClient(cl);
            }else if (num.contains("2")){
                b1.printAll_C();
            }else if (num.contains("3")){
                String check;
                System.out.println("1-Deposite");
                System.out.println("2-withdraw");
                check=sc.nextLine();
                if(check.contains("1")){
                    System.out.println("Enter Your ID");
                    int i=sc.nextInt();
                    System.out.println("enter your amount in LE");
                    int amount=sc.nextInt();
                    b1.arrayList_CL[i-1].getSpecial_AC().deposit(amount);
                    sc.skip("\n");
                }else {
                    System.out.println("Enter Your ID");
                    int i=sc.nextInt();
                    System.out.println("enter your amount in LE");
                    int amount=sc.nextInt();
                    b1.arrayList_CL[i-1].getSpecial_AC().withdraw(amount);
                    sc.skip("\n");
                }
            }else
                break;
        }

    }


}

