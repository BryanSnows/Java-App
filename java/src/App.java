public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hassam meu idolo");
        Celular celularA = new Celular();
        celularA.nome = "iphone 12";
        celularA.tamanhoTela = 6.1f;
        celularA.espacoArmazenamento = 256;
        celularA.sistemaOperacionaL =  "iOS";

        System.out.format("Celular %s com tela de %f, %d e SO %s", celularA.nome, celularA.tamanhoTela, celularA.espacoArmazenamento, celularA.sistemaOperacionaL);
    }
}
