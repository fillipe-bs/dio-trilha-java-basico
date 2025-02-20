    public class Usuario {
        public static void main(String[] args) throws Exception {
            SmartTv smartTv = new SmartTv();

            System.out.println("Configuração Inicial da TV:\n");
            System.out.println("TV Ligada? " + smartTv.ligada);
            System.out.println("Canal Inicial: " + smartTv.canal);
            System.out.println("Volume Inicial: " + smartTv.volume + "\n");
            
            System.out.println("Configuração do Usuário após ligar TV:\n");
            smartTv.ligar();
            System.out.println("TV Ligada? " + smartTv.ligada);
            
            smartTv.trocarCanal(100);
            System.out.println("Canal Trocado para: " + smartTv.canal);
            smartTv.trocarCanal(12);
            System.out.println("Canal Trocado para: " + smartTv.canal);
            
            smartTv.aumentarVolume();
            smartTv.aumentarVolume();
            smartTv.aumentarVolume();
            smartTv.aumentarVolume();
            smartTv.aumentarVolume();
            smartTv.aumentarVolume();
            smartTv.aumentarVolume();
            System.out.println("Volume Alterado para: " + smartTv.volume);
            smartTv.diminuirVolume();
            System.out.println("Volume Alterado para: " + smartTv.volume);

        }
    }
