public class Profissional {
    String nome;
    String telefone;
    int id;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setTelefone(String teleofne) {
        this.telefone = teleofne;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public Profissional(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

}
