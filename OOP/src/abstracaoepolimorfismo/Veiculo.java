package abstracaoepolimorfismo;

public abstract class Veiculo {
    
    private String chassi;
    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    
    // Método abstrato
    public abstract void ligar();
}
