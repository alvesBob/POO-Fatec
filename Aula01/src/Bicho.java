public class Bicho {

    private double peso;

    private String nome;

    private String forma;

    private String voa;

    private int numeroPernas;

    public Bicho() {
    }

    public Bicho(double peso, String nome, String forma, String voa, int numeroPernas) {
        this.peso = peso;
        this.nome = nome;
        this.forma = forma;
        this.voa = voa;
        this.numeroPernas = numeroPernas;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String isVoa() {
        return voa;
    }

    public void setVoa(String voa) {
        this.voa = voa;
    }

    public int getNumeroPernas() {
        return numeroPernas;
    }

    public void setNumeroPernas(int numeroPernas) {
        this.numeroPernas = numeroPernas;
    }

    @Override
    public String toString() {
        return "Bicho{" +
                "peso=" + peso +
                ", nome='" + nome + '\'' +
                ", forma='" + forma + '\'' +
                ", voa='" + voa + '\'' +
                ", numeroPernas=" + numeroPernas +
                '}';
    }
}
