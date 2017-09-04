package pacote;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class WC {
	public static void main(String[] args) throws IOException {
		File f = new File("DadosBicicletarUT.csv");
		InputStream is = new FileInputStream(f);
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		int cont = 0;
		long inicial = System.currentTimeMillis();
		String s = br.readLine();

		while (s != null) {
			s = br.readLine();
			cont++;
		}
		System.out.println("Quantidade de linhas: " + cont);
		long tamanho = f.length();
		System.out.println(f.getName() + " Tamanho: " + tamanho + " bytes");
		br.close();
		
		long t_final = System.currentTimeMillis() - inicial;
		System.out.println("Tempo: " + t_final + " milissegundos");
	}
}
