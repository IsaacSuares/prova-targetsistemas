public class Distribuidora {
    public static void main(String[] args) {
        // valores de faturamento por estado
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;
        
        // calcular o valor total mensal da distribuidora
        double total = sp + rj + mg + es + outros;
        
        // calcular o percentual de cada estado em relação ao valor total
        double percSP = (sp / total) * 100;
        double percRJ = (rj / total) * 100;
        double percMG = (mg / total) * 100;
        double percES = (es / total) * 100;
        double percOutros = (outros / total) * 100;
        
        // exibir os resultados
        System.out.println("SP: %.2f%%\n", percSP);
        System.out.println("RJ: %.2f%%\n", percRJ);
        System.out.println("MG: %.2f%%\n", percMG);
        System.out.println("ES: %.2f%%\n", percES);
        System.out.println("Outros: %.2f%%\n", percOutros);
    }
}
