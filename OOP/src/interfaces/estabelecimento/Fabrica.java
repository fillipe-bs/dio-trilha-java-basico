package interfaces.estabelecimento;

import interfaces.equipamentos.copiadora.Copiadora;
import interfaces.equipamentos.copiadora.Xerox;
import interfaces.equipamentos.digitalizadora.Digitalizadora;
import interfaces.equipamentos.digitalizadora.Scanner;
// import interfaces.equipamentos.impressora.Deskjet;
import interfaces.equipamentos.impressora.Impressora;
// import interfaces.equipamentos.impressora.Laserjet;
import interfaces.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        // Impressora impressora = new Deskjet();
        // Impressora impressora = new Laserjet();
        Impressora impressora = new EquipamentoMultifuncional();
        impressora.imprimir();

        Copiadora copiadora = new Xerox();
        copiadora.copiar();
        
        Digitalizadora digitalizadora = new Scanner();
        digitalizadora.digitalizar();
    }
}
