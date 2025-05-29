public class Paciente {
    String nome;
    String email;
    int id;

    // métodos de acesso
    // procedimento

    public void setNome(String nome) {
        this.nome = nome;
    }

    // função- retorno String, int, double...
    public String getNome() {
        return nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public Paciente(String nome, String email){
        this.email = email;
        this.nome = nome;
    }

}
