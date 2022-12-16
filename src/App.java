import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("O código a seguir utiliza o input de notas, calcula o somatório e realiza a média.");
        MediaAluno();
        System.out.println(
                "O código a seguir utiliza os inputs de lado de um triângulo e diz se o triângulo existe. Se existe, diz o tipo do triângulo.");
        Triangulo();
        System.out.println("O código a seguir calcula a infração de um veículo baseado na velocidade.");
        Veiculo();
        System.out.println("O código a seguir calcula o IMC de uma pessoa.");
        Imc();
        System.out.println("O código a seguir utiliza o input de voto, em seguir usa switch case para decidir o voto.");
        Voto();
    }

    private static void MediaAluno() {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Insira a quantidade de notas: ");
            int quantidadeNotas = scan.nextInt();
            Double notas = 0d;
            for (int i = 0; i < quantidadeNotas; i++) {
                System.out.println("Insira a nota: ");
                int nota = scan.nextInt();
                if (nota < 0 || nota > 10) {
                    System.out.println("Nota inválida, execute o programa novamente.");
                    System.exit(1);
                } else {
                    notas += nota;
                }
            }
            System.out.println(notas);

            Double media = notas / quantidadeNotas;
            System.out.println("O somatório das notas é: " + notas);
            System.out.println("A média do aluno é: " + media);

            String resultado = media > 7 ? "ALUNO APROVADO!"
                    : (media > 5 ? "Você está de recuperação." : "ALUNO REPROVADO!");

            System.out.println(resultado);
        }
    }

    private static void Triangulo() {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite 3 Lados");
            int lado1 = scan.nextInt();
            int lado2 = scan.nextInt();
            int lado3 = scan.nextInt();

            if (lado1 > (lado2 + lado3) || (lado2 > (lado1 + lado3)) || (lado3 > (lado1 + lado2))) {
                System.out.println("Não é triângulo");
            } else if ((lado1 == lado2) && (lado2 == lado3)) {
                System.out.println("Equilátero");
            } else if ((lado1 == lado2) || (lado2 == lado3) || (lado3 == lado1)) {
                System.out.println("Isósceles");
            } else {
                System.out.println("Escaleno");
            }
        }
    }

    private static void Veiculo() {
        try (Scanner scan = new Scanner(System.in)) {
            Double velocidadeLeve = 50 * 1.1;
            int velocidadeMedia = 70;
            int velocidadeGrave = 90;
            int velocidadeGravissima = 110;

            System.out.println("Informe a velocidade do Veículo: ");
            int velocidade = scan.nextInt();

            if (velocidade < velocidadeLeve) {
                System.out.println("Isento");
            } else if (velocidade < velocidadeMedia) {
                System.out.println("3 pontos na carteira");
            } else if (velocidade < velocidadeGrave) {
                System.out.println("5 pontos na carteira");
            } else if (velocidade < velocidadeGravissima) {
                System.out.println("7 pontos na carteira");
            } else {
                System.out.println("7 pontos na carteira e veículo apreendido");
            }
        }
    }

    private static void Imc() {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Informa a sua altura.");
            Double altura = scan.nextDouble();
            System.out.println("Informe o seu peso.");
            Double peso = scan.nextDouble();

            Double imc = (peso / Math.pow(altura, 2));
            if (imc < 18.5) {
                System.out.println("Seu imc é: " + imc + " Peso abaixo do normal.");
            } else if (imc < 24.9) {
                System.out.println("Seu imc é: " + imc + " Peso normal.");
            } else if (imc < 29.9) {
                System.out.println("Seu imc é: " + imc + " Excesso de peso");
            } else if (imc < 34.9) {
                System.out.println("Seu imc é: " + imc + " Obesidade grau 1");
            } else if (imc < 39.9) {
                System.out.println("Seu imc é: " + imc + " Obesidade grau 2");
            } else if (imc > 40) {
                System.out.println("Seu imc é: " + imc + " Obesidade grau 3");
            }
        }
    }

    private static void Voto() {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println(
                    "Vote no Pernalonga com o número 20, Patolino com o número 30 ou Lola Bunny com o número 40. Se não votar em ninguém seu voto será anulado");
            String voto = scan.nextLine();
            switch (voto) {
                case "20":
                    System.out.println("Você votou no Pernalonga");
                    break;
                case "30":
                    System.out.println("Você votou no Patolino");
                    break;
                case "40":
                    System.out.println("Você votou na Lola Bunny");
                    break;
                default:
                    System.out.println("Você votou nulo");
            }
        }

    }


    
}
