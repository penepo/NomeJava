import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Nomeex {
	public static void main (String []Args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o ID");
		int id = sc.nextInt();
		System.out.println("Digite o seu nome");
		String nome= sc.next();
		System.out.println("Me fale a data");
		String dataNascimentoStr = sc.next();
		Date dataNascimento = null;
		try {
			dataNascimento = new 
					SimpleDateFormat("DD/MM/YYYY").parse(dataNascimentoStr);
			
		}catch (ParseException e) {
			System.out.println("Formato de data errado ");
			return;
		}
		System.out.println("A data é:" + dataNascimentoStr);
		System.out.println("O nome é:" + nome);
		System.out.println("O id é:" + id);
	
	
	
	}




























}
