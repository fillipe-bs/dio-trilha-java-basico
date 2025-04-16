public interface Iphone {
    //Reprodutor Musical
    void tocar();
    void pausar();
    void selecionarMusica(String musica);

    //Aparelho Telefônico
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();

    //Navegador Internet
    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
}
