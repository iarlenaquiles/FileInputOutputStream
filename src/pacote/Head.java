package pacote;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Head {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("DadosBicicletarUT.csv");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		long inicial = System.currentTimeMillis();
		String s = br.readLine();

		System.out.println(s);
		long t_final = System.currentTimeMillis() - inicial;
		System.out.println("Tempo: " + t_final + " milissegundos");
		br.close();
	}

}
