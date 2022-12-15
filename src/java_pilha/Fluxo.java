package java_pilha;

public class Fluxo {
    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        }  catch(ArithmeticException | NullPointerException | MinhaExcecao ex) { //ex � referencia

            String msg = ex.getMessage();
            System.out.println("exception : " + msg);

            ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }
    private static void metodo1(){
        System.out.println("Ini do metodo1");
        metodo2();

        System.out.println("Fim do metodo1");
    }
    private static void metodo2(){
        System.out.println("Ini do metodo2");

        throw  new MinhaExcecao("deu muito errado");

        //System.out.println("fim do metodo2");
    }
}
