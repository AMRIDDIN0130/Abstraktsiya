public class Main{
    public static void main(String[] args) {
       Texnika x=new BTR();
       Nexia m=new Nexia();
 
    }
    public static void ovozQani(Texnika Texnika){
        Texnika.ovoz();
    }
        
    }


    class Kirmoshina extends Maishiy{

        @Override
        public void ovoz() {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void yonish() {
            // TODO Auto-generated method stub
            
        }
        
    }


class BTR extends OgirTexnika{

    @Override
    public void yonish() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void ovoz() {
        // TODO Auto-generated method stub
        
    }
    
}

class Nexia extends YengilTexnika{


    @Override
    public void yonish() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void ovoz() {
        // TODO Auto-generated method stub
        
    }
    
}


abstract class OgirTexnika extends Mashina{
    
}



abstract class YengilTexnika extends Mashina{
    
    
}



abstract class Maishiy extends Texnika{

}



abstract class Mashina extends Texnika{

}


abstract class Texnika{
    String tur;
    String yili;
    String quvvat;
    String rang;
    String hajm;
    public abstract void ovoz();
    public abstract void yonish();
}

