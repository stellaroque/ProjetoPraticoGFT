package exercicio.quatro;

public class Pessoa implements IPessoa {
    String nome;
    String corOLhos;
    String corCabelo;
    String dataNascimento;
    String tipoSangue;
    boolean rh;

    public Pessoa(String nome, String corOLhos, String corCabelo, String dataNascimento, String tipoSangue, boolean rh) {
        this.nome = nome;
        this.corOLhos = corOLhos;
        this.corCabelo = corCabelo;
        this.dataNascimento = dataNascimento;
        this.tipoSangue = tipoSangue;
        this.rh = rh;
    }


}






