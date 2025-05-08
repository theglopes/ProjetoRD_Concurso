
public class Candidato extends Pessoa {
    private String pais;
    private String generoMusical;

    public String toString() {
    return "Nome: " + getNome() +
           "\nIdade: " + getIdade() +
           "\nSexo: " + getSexo() +
           "\nPaís: " + pais +
           "\nGênero Musical: " + generoMusical;
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

    public Candidato(String nome, int idade, char sexo, String pais, String generoMusical) {
        super(nome, idade, sexo);
        this.pais = pais;
        this.generoMusical = generoMusical;
    }
}
