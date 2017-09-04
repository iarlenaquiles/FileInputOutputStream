package pacote;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CatGrep {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("DadosBicicletarUT.csv");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("informe o texto desejado");
		Scanner sc = new Scanner(System.in);
		String texto = sc.nextLine();
		long inicial = System.currentTimeMillis();
		String s = br.readLine();

		while (s != null) {
			if (s.contains(texto)) {
				System.out.println(s);
			}
			s = br.readLine();
		}

		br.close();
		long t_final = System.currentTimeMillis() - inicial;
		System.out.println("Tempo: " + t_final + " milissegundos");
	}

}
