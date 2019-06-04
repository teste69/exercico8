package Q1Q2;


public class TestaAnimais {
    public static void main(String [] args){
        
        Papagaio p = new Papagaio("Linda",true,"Alô");
        p.talk();
        p.imprime();
        
        Arara a = new Arara("Hadler",true);
        a.talk();
        a.imprime();
        
        Cachorro c = new Cachorro("Brian",4,true);
        c.talk();
        c.imprime();
        
        Vaca v = new Vaca("Carol",4,true);
        v.talk();
        v.imprime();
    }    
}
