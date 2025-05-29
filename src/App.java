public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, fono!");

        //calsse Exercicio
        Exercicio ex = new Exercicio("kiko", "imitar o kiko oscilando e a lingua vibrando", "rrrrrrrrr", "aquecimento", 3, "rrrrrr");

        Exercicio ex1 = new Exercicio("abelha", "som de abelha com a boca", "zzzzzz");

        Exercicio ex2 = new Exercicio("Bexiga bucal", "O paciente deve encher as bochechas com ar, segurando o ar dentro da boca por alguns segundos, e depois soltar lentamente. Esse exercício fortalece os músculos orofaciais e ajuda no controle da respiração e da articulação.", "Pode ser acompanhado do som de “puff” ao soltar o ar lentamente.");

        Exercicio ex3 = new Exercicio("Trinado da Língua", "O paciente deve tentar fazer o som de “rrrrrr” vibrando a ponta da língua contra o céu da boca (vibrante múltiplo). É um exercício para melhorar a mobilidade e o controle da língua, fundamental para a pronúncia correta de sons vibrantes.", "“rrrrrr” (como no som do motor de carro ou o “r” vibrante em português).");

        Exercicio ex4 = new Exercicio("Repetição de Sílabas", "O paciente deve repetir sílabas específicas em sequência rápida para melhorar a fluência e a articulação. Por exemplo: “pa-pa-pa”, “ta-ta-ta”, “ka-ka-ka”. Isso ajuda na coordenação motora e na clareza da fala.", "exemplo: “pa-pa-pa”, “ta-ta-ta”, “ka-ka-ka”. ");

        System.out.println("nome: "+ex.getNome());
        System.out.println("descrição: "+ex.getDescricao());
        System.out.println("som: "+ex.getSom());
        System.out.println("tempo minimo: "+ex.getTempoMin());
        System.out.println("exemplo: "+ex.getExemplo());

        System.out.println("nome: "+ex1.getNome());
        System.out.println("descrição: "+ex1.getDescricao());
        System.out.println("som: "+ex1.getSom());
        System.out.println("tempo minimo: "+ex1.getTempoMin());
        System.out.println("exemplo: "+ex1.getExemplo());

        System.out.println("nome: "+ex2.getNome());
        System.out.println("descrição: "+ex2.getDescricao());
        System.out.println("som: "+ex2.getSom());
        System.out.println("tempo minimo: "+ex2.getTempoMin());
        System.out.println("exemplo: "+ex2.getExemplo());

        System.out.println("nome: "+ex3.getNome());
        System.out.println("descrição: "+ex3.getDescricao());
        System.out.println("som: "+ex3.getSom());
        System.out.println("tempo minimo: "+ex3.getTempoMin());
        System.out.println("exemplo: "+ex3.getExemplo());

        System.out.println("nome: "+ex4.getNome());
        System.out.println("descrição: "+ex4.getDescricao());
        System.out.println("som: "+ex4.getSom());
        System.out.println("tempo minimo: "+ex4.getTempoMin());
        System.out.println("exemplo: "+ex4.getExemplo());

        //classe Paciente
        Paciente pa = new Paciente("João Carlos Ribeiro Gonzaga", "joaocarlosrobeirogonzaga@gmail.com");
    
        System.out.println("nome: "+ pa.getNome());
        System.out.println("email: "+pa.getEmail());

        //classe Clinica

        Clinica ca = new Clinica("João Carlos", "40028922/0001-90");
        
        System.out.println("nome: "+ca.getNome());
        System.out.println("cnpj: "+ca.getCnpj());

        //classe Profissional

        Profissional pr = new Profissional("Dr.Sinistro", "40028922");

        System.out.println("nome: "+pr.getNome());
        System.out.println("telefone: "+pr.getTelefone());




    }
}
