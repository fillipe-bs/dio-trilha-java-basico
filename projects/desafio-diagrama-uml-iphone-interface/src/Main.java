public class Main {

    public static void main(String[] args) {
        Iphone iphone = new IphoneImplements();
        //Reprodutor musical
        iphone.selecionarMusica("LO-FI MIX JAZZ HIP-HOP");
        iphone.tocar();
        iphone.pausar();

        //Aparelho Telefônico
        iphone.atender();
        iphone.ligar("99999-9999");
        iphone.iniciarCorreioVoz();

        //Navegador Internet
        iphone.adicionarNovaAba();
        iphone.exibirPagina("www.google.com");
        iphone.atualizarPagina();
    }
}  
