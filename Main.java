public class Main {

  public static void main(String[] args){

    Meses março = Meses.MARÇO;
    Meses abril = Meses.ABRIL;
    System.out.println("O mês de março equivale ao numero: "+ março.getValor());
    System.out.println("O próximo mês é: " + Meses.ABRIL);

    System.out.println();

    Tamanho pequeno = Tamanho.P;
    Tamanho grande = Tamanho.G;
    Tamanho medio = Tamanho.M;
    System.out.println("O Maior tamanho é o: " + grande.getTamanho());
    System.out.println("Eu recomendaria o: " + medio.getTamanho());

    System.out.println();

    Camisa Jose = new Camisa ("Verde", "Colcci, " + medio.getTamanho(), 800);
    Camisa Carlos = new Camisa ("Rosa", "Adidas, " +pequeno.getTamanho(), 200);
    Camisa Maria = new Camisa ("Preta", "Hering, " + grande.getTamanho(), 500);

    System.out.println(Jose);
    System.out.println(Carlos);
    System.out.println(Maria);

  }
}