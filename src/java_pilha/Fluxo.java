package java_pilha;

public class Fluxo {
    public static void main(String[] args) {
        System.out.println("Ini do main");
        metodo1();
        System.out.println("Fim do main");
    }
    private static void metodo1(){
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }
    private static void metodo2(){
    System.out.println("Ini do metodo2");
    for (int i = 1; i <=5; i++){
        System.out.println(i);

        // o codigo só irá executar caso de um ERRO  ARITHMETICEXCEPTION

        //problema
        try {
            int a = i / 0;
            //arithem... é o problema que aparecer no terminal quando for compilar
            // ex é a variavel
        } catch(ArithmeticException ex){
            System.out.println("ArithmeticExpection");
        }
    }
        System.out.println("fim do metodo2");
    }
}
