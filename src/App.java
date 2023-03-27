public class App {
    public static void piramideDeNumeros(int valor){
        for ( int i = 1; i <= valor; i++){
            int linha = 0;

            for ( int j = 0; j < i; j++){
                linha = linha * 10 + i;
            }
            
            System.out.println(linha);
        }
    }

    public static void main(String[] args) throws Exception {
        piramideDeNumeros(3);
    }
}
