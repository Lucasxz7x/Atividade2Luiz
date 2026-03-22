package geometria;

import java.util.Scanner;

public class Calculadora {
    private double lado;
    private double base;
    private double altura;
    private double raio;
    private int opcao;

    public void menu() {
        System.out.println("=== Calculadora Java Constructions Inc. ===");
        System.out.println("1.  Calcular Área do Quadrado");
        System.out.println("2. Calcular Área do Retângulo");
        System.out.println("3.  Calcular Área do Círculo");
        System.out.println("4.  Sair");
        System.out.print("Escolha uma opção: ");
    }

    public void executar() {
        Scanner scanner = new Scanner(System.in);
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Digite o tamanho do lado do quadrado: ");
                lado = scanner.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.printf("A área do quadrado é: %.2f\n", areaQuadrado);
                break;
                
            case 2:
                System.out.print("Digite o tamanho da base do retângulo: ");
                base = scanner.nextDouble();
                System.out.print("Digite o tamanho da altura do retângulo: ");
                altura = scanner.nextDouble();
                double areaRetangulo = base * altura;
                System.out.printf("A área do retângulo é: %.2f\n", areaRetangulo);
                break;
                
            case 3:
                System.out.print("Digite o valor do raio do círculo: ");
                raio = scanner.nextDouble();
                double areaCirculo = 3.14 * (raio * raio);
                System.out.printf("A área do círculo é: %.2f\n", areaCirculo);
                break;
                
            case 4:
                System.out.println(" Encerrando o sistema da Java Constructions Inc...");
                break;
                
            default:
                System.out.println(" Opção inválida! Tente novamente.");
                break;
        }
        
        scanner.close();
    }
}