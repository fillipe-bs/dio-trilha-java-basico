public class IphoneImplements implements Iphone{
    
    private ReprodutorMusical reprodutor = new ReprodutorMusical();
    private AparelhoTelefonico telefone = new AparelhoTelefonico();
    private NavegadorInternet navegador = new NavegadorInternet();
    
    @Override
    public void tocar() {
        reprodutor.tocar();
    }
    @Override
    public void pausar() {
        reprodutor.pausar();
    }
    @Override
    public void selecionarMusica(String musica) {
        reprodutor.selecionarMusica(musica);
    }

    
    @Override
    public void ligar(String numero) {
        telefone.ligar(numero);
    }
    
    @Override
    public void atender() {
        telefone.atender();
    }
    @Override
    public void iniciarCorreioVoz() {
        telefone.iniciarCorreioVoz();
    }

    @Override
    public void exibirPagina(String url) {
        navegador.exibirPagina(url);
    }
    @Override
    public void adicionarNovaAba() {
        navegador.adicionarNovaAba();
    }
    @Override
    public void atualizarPagina() {
        navegador.atualizarPagina();
    }
    
}
