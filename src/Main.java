import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String arquivo = "src/pessoas.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {

            String linha;

            while ((linha = br.readLine()) != null) {

                String[] dados = linha.split(";");

                Pessoa pessoa = new Pessoa(
                        dados[0],
                        Integer.parseInt(dados[1]),
                        dados[2]
                );

                System.out.println(pessoa.toXML());
                System.out.println();

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}