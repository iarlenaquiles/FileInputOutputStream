package pacote;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HeadLinhas {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("DadosBicicletarUT.csv");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("informe a quantidade de linhas");
		Scanner sc = new Scanner(System.in);
		int qtdLinhas = sc.nextInt();
		int cont = 0;
		long inicial = System.currentTimeMillis();
		String s = br.readLine();

		while (cont < qtdLinhas) {
			System.out.println(s);
			s = br.readLine();
			cont++;
		}
		br.close();
		long t_final = System.currentTimeMillis() - inicial;
		System.out.println("Tempo: " + t_final + " milissegundos");
	}

}
