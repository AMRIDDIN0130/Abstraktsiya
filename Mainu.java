public class Mainu {
    public static void main(String[] args) {
        Usimliklar usimliklar=new Jannat();
        Atirgul a=new Atirgul();

      
    }
}


class Atirgul extends Mevasiz{

    @Override
    public void hid() {
        // TODO Auto-generated method stub
        
    }
    
}

class Jannat extends Olma{
    
}

class Olma extends Mevali{

    @Override
    public void hid() {
        // TODO Auto-generated method stub
        System.out.println("");
    }
    
}



abstract class Mevasiz extends Usimliklar{
    String ostirishdanmaqsad;
    
    
} 




abstract class Mevali extends Usimliklar{
    String mevahajmi;
    String mevarangi;
    String tami;
    public  void yegandagiovoz() {
        System.out.println("Mevani yedim");
    }
} 


abstract class Usimliklar{
    String tur;
    String rang;
    String nomi;
    public abstract void hid();
}