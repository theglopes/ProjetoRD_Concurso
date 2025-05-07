
public class Candidato extends Pessoa {
    private String pais;
    private String generoMusical;

    @Override
    public String toString() {
        return "Candidato{" + "pais: " + pais + "\nGenero Musical: " + generoMusical + '}';
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    public Candidato(String pais, int idade, char sexo, String generoMusical, String nome) {
        super(nome, idade, sexo);
        this.pais = pais;
        this.generoMusical = generoMusical;
    }
}
