package pacote;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class App {
	private static final String entrada = "mozilla.pdf";
	private static final String saida = "mozilla_copia.pdf";

	public static void main(String[] args) throws IOException {
		File arquivo = new File(entrada);
		File arquivoSaida = new File(saida);
		
		InputStream is = new FileInputStream(arquivo);
		OutputStream os = new FileOutputStream(arquivoSaida);
		int b;
		long inicial = System.currentTimeMillis();
		while((b = is.read()) != -1){
			os.write(b);
		}
		long t_final = System.currentTimeMillis() - inicial;
		System.out.println("Tempo: " + t_final + " milissegundos");
		is.close();
		os.close();
	}

	
}
