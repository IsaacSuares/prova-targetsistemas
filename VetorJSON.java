import java.io.FileReader;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class VetorJSON {
    
    public static void main(String[] args) {
        
        // Ler o arquivo "dados.json" e armazenar os dados em um vetor
        JSONParser parser = new JSONParser();
        JSONArray jsonArray = new JSONArray();
        try {
            jsonArray = (JSONArray) parser.parse(new FileReader("dados.json"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // Encontrar o menor e o maior valor de faturamento
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;
        double soma = 0.0;
        int numDiasComFaturamento = 0;
        for (Object obj : jsonArray) {
            JSONObject jsonObj = (JSONObject) obj;
            double valor = (double) jsonObj.get("valor");
            if (valor > 0) {
                if (valor < menor) {
                    menor = valor;
                }
                if (valor > maior) {
                    maior = valor;
                }
                soma += valor;
                numDiasComFaturamento++;
            }
        }
        
        // Calcular a média mensal
        double media = soma / numDiasComFaturamento;
        
        // Contar quantos dias tiveram faturamento acima da média
        int numDiasAcimaDaMedia = 0;
        for (Object obj : jsonArray) {
            JSONObject jsonObj = (JSONObject) obj;
            double valor = (double) jsonObj.get("valor");
            if (valor > media) {
                numDiasAcimaDaMedia++;
            }
        }
        
        // Imprimir os resultados
        System.out.println("Menor valor de faturamento: " + menor);
        System.out.println("Maior valor de faturamento: " + maior);
        System.out.println("Número de dias com faturamento acima da média: " + numDiasAcimaDaMedia);
    }
}
