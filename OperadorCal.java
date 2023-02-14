public class OperadorCal {
    //colete dois números do teclado
    //faça as 4 operações matemáticas
    //delcare também as variáveis soma, mult, divisão, resto, subtração;
    public static void main(String[] Barela){
    Scanner entrada = new Scanner(System.in);
    int numero1=0;
    int numero2=0;
    int soma=0;
    int multiplicacao=0;
    int divisao=0;
    int resto=0;
    int subtracao=0;

    System.out.println("Digite um número");
    numero1=entrada.nextInt();

    System.out.println("Digite outro número");
    numero2=entrada.nextInt();

    soma=numero1+numero2;
    System.out.println("A soma dos dois números é" +soma);

    multiplicacao=numero1*numero2;
    System.out.println("A soma dos dois números é" +multiplicacao);

    divisao=numero1/numero2;
    System.out.println("A soma dos dois números é" +divisao);

    resto=numero1%numero2;
    System.out.println("A soma dos dois números é" +resto);

    subtracao=numero1-numero2;
    System.out.println("A soma dos dois números é" +subtracao);

}
}
