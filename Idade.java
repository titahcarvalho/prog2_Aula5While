package prog2_aula5;
import java.util.Scanner;
public class Idade {

	public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);
        int dia,mes,ano,diaNasc, mesNasc, anoNasc, idade;
        
        
        System.out.println("Digite o dia atual: ");
        dia = entrada.nextInt();

        System.out.println("Digite o mês atual: ");
        mes = entrada.nextInt();

        System.out.println("Digite o ano atual: ");
        ano = entrada.nextInt();

        System.out.println("A data de hoje é: " + dia + "/" + mes + "/" + ano + " !\n " );
        
        System.out.println("Digite o dia de seu nascimento: ");
        diaNasc = entrada.nextInt();

        System.out.println("Digite o mes de seu nascimento: ");
        mesNasc = entrada.nextInt();
        
        System.out.println("Digite o ano de seu nascimento: ");
        anoNasc = entrada.nextInt();
        
        if (mes < mesNasc || (mes == mesNasc && dia < diaNasc)) {
        	idade = ((ano - anoNasc) - 1);
        } else {
        	idade = ano - anoNasc;
        }        
                                  
        if (idade < 18) {
            System.out.println(" *ATENÇÃO!* \n \n >>> Menor de 18 anos. Acesso negado! <<<");
        } else {
            System.out.println(" Você é maior de idade com " + idade + " anos. Acesso livre! \n Seja bem-vindo!");
          
        }
 
            entrada.close();

	}

}
