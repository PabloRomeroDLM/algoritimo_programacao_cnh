import java.util.Scanner;

	class HelloWorld {
	    public static void main(String[] args) {

	        Scanner read = new Scanner(System.in);
	        int numb1, numb2, numb3;
	        System.out.println("quantas questoes voce acertou no exame psicotecnico: ");
	        numb1 = read.nextInt();
	        System.out.println("quantos pontos voce fez no exame de legislacao: ");
	        numb2 = read.nextInt();
	        System.out.println("quantos pontos voce fez no exame pratico: ");
	        numb3 = read.nextInt();
	        
	        if(numb1==45 && numb2>=21 && numb3>=20){
	            System.out.printf("aprovado");
	        }
	        else {
	            System.out.printf("reprovado");
	        }
	        }
	}	