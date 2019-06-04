package Q3;

public class Teste {
    public static void main(String[] args){
        Pessoa p = new Pessoa("Ricardo","R: 13",992399682);
        Fornecedor f = new Fornecedor("Lara","R: 7",836852419,2028,50);
        Empregado e = new Empregado("Marcio","R: 12",773692362,0501,1509,7);
        Administrador a = new Administrador("Ellen","R: 2",6669358,2093,1758,5,500);
        Operario o = new Operario("Guga","R: 4",553698002,0007,1000,100,300,5);
        
        System.out.println("FORNECEDOR");
        System.out.println(f.obterSaldo());
        
        System.out.println("EMPREGADO");
        System.out.println(e.calcularSalario());

        System.out.println("ADMINISTRADOR");
        System.out.println(a.calcularSalario());
        
        System.out.println("OPERARIO");
        System.out.println(o.calcularSalario());
        
    }    
}
