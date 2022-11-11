package java_pilha;

public class FluxoComTratamento {
    public static void main(String[] args) {
        System.out.println("Ini do main");
        //posso colocar ele aqui tambem
        try {
            metodo1();

            //captura arit...       ou  Nullpointer ...
        }  catch(ArithmeticException | NullPointerException ex) { // catch especifico
            //chamando algum membro public da classe (sim tambem é uma classe/objeto)
           String msg = ex.getMessage();
           System.out.println("exception : " + msg);

            //mostrando o rastro
            ex.printStackTrace();
      //  } catch (NullPointerException ex){
           // String msg = ex.getMessage();
     //       System.out.println("NullPointerException  " + msg);
            //
            }
        System.out.println("Fim do main");
    }
    private static void metodo1(){
        System.out.println("Ini do metodo1");
        // posso colocar ele aqui tambem
      //  try {
            metodo2();
       // } catch(ArithmeticException ex){
         //   System.out.println("ERRO : ArithmeticExpection");
        //}
        System.out.println("Fim do metodo1");
    }
    private static void metodo2(){
    System.out.println("Ini do metodo2");
    for (int i = 1; i <=5; i++){
        System.out.println(i);

        // o codigo só irá executar caso de um ERRO  ARITHMETICEXCEPTION
        //problema
      //  try {
            int a = i / 0;
            //arithem... é o problema que aparecer no terminal quando for compilar
            // ex é a variavel
        //} catch(ArithmeticException ex){
         //   System.out.println("ArithmeticExpection");
       // }

        // novo erro de  proposito para estudo
      //  Conta c = null;
      //  c.deposita(); // problematico pq não exite um objeto
    }
        System.out.println("fim do metodo2");
    }
}
