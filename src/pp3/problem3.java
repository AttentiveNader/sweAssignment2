package pp3;
public class problem3 {
    public static void main(String[] args){
        Bank b1=new Bank("Cairo","1St_cairo_street",1965);
        System.out.println(b1.getName());
        System.out.println(b1.getAddress());
        System.out.println(b1.getPhone());
        SpecialAccount Acc1 = new SpecialAccount(5);
        SpecialAccount Acc2= new SpecialAccount(20);
        SpecialAccount acc3 =new SpecialAccount(50);
        CommercialClient Cli1=new CommercialClient("Andrew", "300200100500", "36St_nile street","0125968456",Acc1);
        CommercialClient Cli2=new CommercialClient("Paula", "200600800400", "23St_roxy Street ", "0111155995",Acc2);
        CommercialClient cli3=new CommercialClient("Nader", "900600300100", "14st_Giza_street", "01522689023",acc3);
        b1.addClient(Cli1);
        b1.addClient(Cli2);
        b1.addClient(cli3);
        b1.printAll_C();
        SpecialAccount ac4=new SpecialAccount(100);
        b1.addAccount(ac4);
        b1.printAll_A();


    }
}
