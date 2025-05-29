public class Clinica {
    String nome;
    String cnpj;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    int id;

    public Clinica(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;

    }

}
