public class Maink {
    public static void main(String[] args) {
        
    }
}


class Ali extends Matematiklar{
    
}



class Ronaldo extends Fudbolchilar{

}


class Matematiklar extends Oqituvchilar{
String Alxorazmiymukofotiniolganmi;
    @Override
    public void hissiyot() {
        // TODO Auto-generated method stub
        System.out.println("Bosh qashiladi.......");
    }

}


class Fudbolchilar extends Sportchilar{
String ampulasi;
String buyi;
String ongoyoqda;
String chapoyoqda;
String boshda;
String drebling;
    @Override
    public void hissiyot() {
        // TODO Auto-generated method stub
       System.out.println("SIUUUUUUUUUU"); 
    }
    
}

abstract class Oqituvchilar extends Kasblar{

}



abstract class Sportchilar extends Kasblar{
    
}


abstract class Kasblar{
    String turi;
    String yutuqlari;
    int oyligi;
    String nomi;
    
    abstract public void hissiyot();
}
