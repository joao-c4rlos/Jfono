
## Código-fonte com Comentários Técnicos e Didáticos
```java
// Classe principal do projeto. É o ponto de entrada da aplicação.
public class App {
    public static void main(String[] args) throws Exception {
        // Imprime uma mensagem de boas-vindas no console.
        System.out.println("Hello, fono!");

        // --- Demonstração da classe Exercicio ---
        // Cria uma instância (objeto) da classe Exercicio.
        // É usado o construtor com todos os parâmetros.
        Exercicio ex = new Exercicio("kiko", "imitar o kiko oscilando e a lingua vibrando", "rrrrrrrrr", "aquecimento", 3, "rrrrrr");

        // Cria outras instâncias de Exercicio utilizando construtores diferentes (sobrecarga de construtores).
        // Este usa um construtor com nome, descrição e exemplo.
        Exercicio ex1 = new Exercicio("abelha", "som de abelha com a boca", "zzzzzz");

        // Este também usa um construtor com nome, descrição e exemplo.
        Exercicio ex2 = new Exercicio("Bexiga bucal", "O paciente deve encher as bochechas com ar, segurando o ar dentro da boca por alguns segundos, e depois soltar lentamente. Esse exercício fortalece os músculos orofaciais e ajuda no controle da respiração e da articulação.", "Pode ser acompanhado do som de “puff” ao soltar o ar lentamente.");

        Exercicio ex3 = new Exercicio("Trinado da Língua", "O paciente deve tentar fazer o som de “rrrrrr” vibrando a ponta da língua contra o céu da boca (vibrante múltiplo). É um exercício para melhorar a mobilidade e o controle da língua, fundamental para a pronúncia correta de sons vibrantes.", "“rrrrrr” (como no som do motor de carro ou o “r” vibrante em português).");

        Exercicio ex4 = new Exercicio("Repetição de Sílabas", "O paciente deve repetir sílabas específicas em sequência rápida para melhorar a fluência e a articulação. Por exemplo: “pa-pa-pa”, “ta-ta-ta”, “ka-ka-ka”. Isso ajuda na coordenação motora e na clareza da fala.", "exemplo: “pa-pa-pa”, “ta-ta-ta”, “ka-ka-ka”. ");

        // Acessa e imprime os atributos do objeto 'ex' usando os métodos "getters".
        // Demonstra como recuperar os valores armazenados no objeto.
        System.out.println("nome: "+ex.getNome());
        System.out.println("descrição: "+ex.getDescricao());
        System.out.println("som: "+ex.getSom());
        System.out.println("tempo minimo: "+ex.getTempoMin());
        System.out.println("exemplo: "+ex.getExemplo());

        // Acessa e imprime os atributos do objeto 'ex1'. Note que 'tempoMin' e 'tipo' não foram definidos
        // no construtor de 'ex1', então seus valores serão os padrões (0 para int, null para String).
        System.out.println("nome: "+ex1.getNome());
        System.out.println("descrição: "+ex1.getDescricao());
        System.out.println("som: "+ex1.getSom()); // Aqui 'som' foi passado como 'exemplo' no construtor
        System.out.println("tempo minimo: "+ex1.getTempoMin()); // Será 0
        System.out.println("exemplo: "+ex1.getExemplo());

        // Impressões para os demais objetos de Exercicio
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

        // --- Demonstração da classe Paciente ---
        // Cria um objeto Paciente usando seu construtor.
        Paciente pa = new Paciente("João Carlos Ribeiro Gonzaga", "joaocarlosrobeirogonzaga@gmail.com");
        System.out.println("nome: "+ pa.getNome());
        System.out.println("email: "+pa.getEmail());

        // --- Demonstração da classe Clinica ---
        // Cria um objeto Clinica.
        Clinica ca = new Clinica("João Carlos", "40028922/0001-90");

        System.out.println("nome: "+ca.getNome());
        System.out.println("cnpj: "+ca.getCnpj());

        // --- Demonstração da classe Profissional ---
        // Cria um objeto Profissional.
        Profissional pr = new Profissional("Dr.Sinistro", "40028922");

        System.out.println("nome: "+pr.getNome());
        System.out.println("telefone: "+pr.getTelefone());
    }
}

// Representa uma clínica.
public class Clinica {
    String nome; // Atributo para armazenar o nome da clínica.
    String cnpj; // Atributo para armazenar o CNPJ da clínica.
    int id;      // Atributo para um identificador único da clínica (não inicializado no construtor atual).

    // Método setter para definir o nome da clínica.
    public void setNome(String nome){
        this.nome = nome;
    }

    // Método getter para obter o nome da clínica.
    public String getNome() {
        return nome;
    }

    // Método setter para definir o CNPJ da clínica.
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }

    // Método getter para obter o CNPJ da clínica.
    public String getCnpj() {
        return cnpj;
    }

    // Construtor da classe Clinica.
    // É chamado quando um novo objeto Clinica é criado.
    // Inicializa os atributos 'nome' e 'cnpj'.
    public Clinica(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }
}

// Representa um exercício de fonoaudiologia.
public class Exercicio {
    // Atributos privados (encapsulamento) para armazenar as características do exercício.
    // 'private' impede o acesso direto de fora da classe, exigindo o uso de getters e setters.
    private int id;
    private String nome;
    private String descricao;
    private String som;
    private String tipo;
    private int tempoMin;
    private String exemplo; // Adicionado aqui para corresponder aos construtores.

    // Métodos getters para acessar os valores dos atributos privados.
    public String getNome() {
      return nome;
    }

    public String getDescricao() {
      return descricao;
    }

    public String getSom() {
      return som;
    }

    public int getTempoMin() {
      return tempoMin;
    }

    public String getExemplo() {
      return exemplo;
    }

    // Construtor padrão (sem argumentos).
    // Permite criar um objeto Exercicio sem inicializar os atributos no momento da criação.
    public Exercicio() {
        // É comum que construtores padrão não façam nada ou inicializem valores padrão.
    }

    // Sobrecarga de Construtor 1: Construtor completo com todos os atributos.
    // Permite criar um objeto Exercicio fornecendo todos os detalhes de uma vez.
    public Exercicio(String nome, String descricao, String som, String tipo, int tempoMin, String exemplo) {
      this.nome = nome;
      this.tipo = tipo;
      this.descricao = descricao;
      this.som = som;
      this.tempoMin = tempoMin;
      this.exemplo = exemplo;
    }

    // Sobrecarga de Construtor 2: Construtor com nome, descrição e exemplo.
    // Demonstra a "sobrecarga" (overloading), onde métodos/construtores têm o mesmo nome
    // mas diferentes listas de parâmetros.
    public Exercicio(String nome, String descricao, String exemplo) {
      this.nome = nome;
      this.exemplo = exemplo;
      this.descricao = descricao;
      // Note que 'som', 'tipo' e 'tempoMin' não são inicializados aqui,
      // assumindo seus valores padrão (null para String, 0 para int).
    }
}

// Representa um paciente do sistema.
// CTRL+SHIFT+L (Comentário original: Isso é um atalho para formatação ou importação em algumas IDEs, não código Java)
public class Paciente {
    String nome;  // Atributo para armazenar o nome do paciente.
    String email; // Atributo para armazenar o email do paciente.
    int id;       // Atributo para um identificador único do paciente.

    // Métodos de acesso (getters e setters)
    // Método setter para definir o nome do paciente (tipo "procedimento" - não retorna valor).
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método getter para obter o nome do paciente (tipo "função" - retorna um valor String).
    public String getNome() {
        return nome;
    }

    // Método setter para definir o email do paciente.
    public void setEmail(String email) {
        this.email = email;
    }

    // Método getter para obter o email do paciente.
    public String getEmail() {
        return email;
    }

    // Construtor da classe Paciente.
    // É o "construtor default" (no sentido de ser o principal definido pelo programador,
    // não o construtor padrão implícito de Java, que é sem argumentos).
    // Inicializa os atributos 'nome' e 'email' ao criar um objeto Paciente.
    public Paciente(String nome, String email){
        this.email = email;
        this.nome = nome;
    }
}

// Representa um profissional (fonoaudiólogo, por exemplo) do sistema.
public class Profissional {
    String nome;     // Atributo para armazenar o nome do profissional.
    String telefone; // Atributo para armazenar o telefone de contato do profissional.
    int id;          // Atributo para um identificador único do profissional.

    // Método setter para definir o nome do profissional.
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método getter para obter o nome do profissional.
    public String getNome() {
        return this.nome; // 'this' é opcional aqui, mas usado para clareza.
    }

    // Método setter para definir o telefone do profissional.
    public void setTelefone(String teleofne) { // Atenção: "teleofne" - possível erro de digitação, correto seria "telefone"
        this.telefone = teleofne;
    }

    // Método getter para obter o telefone do profissional.
    public String getTelefone() {
        return this.telefone;
    }

    // Construtor da classe Profissional.
    // Inicializa os atributos 'nome' e 'telefone' ao criar um objeto Profissional.
    public Profissional(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }
}
```

---

## `README.md` Profissional

# Projeto FonoCare: Monitoramento de Exercícios Vocais

Este projeto visa desenvolver um sistema de apoio para profissionais da fonoaudiologia, clínicas e pacientes, focado na prevenção e monitoramento de distúrbios vocais através da gestão de exercícios terapêuticos.

---

## 🎯 Problema Solucionado

Professores e outros profissionais da voz frequentemente enfrentam problemas como rouquidão, fadiga vocal e outras doenças das cordas vocais devido ao uso intensivo e, muitas vezes, inadequado da voz. A falta de um monitoramento eficaz e de acesso a exercícios preventivos e terapêuticos adequados agrava essa situação.

O **FonoCare** surge para suprir essa lacuna, oferecendo uma plataforma que permite a fonoaudiólogos e clínicas:

* **Prescrever e monitorar exercícios:** Personalizando rotinas para cada paciente.
* **Acompanhar o progresso:** Garantindo a adesão ao tratamento e a eficácia das intervenções.
* **Educar pacientes:** Fornecendo descrições claras e exemplos dos exercícios.

O sistema apoia diretamente a **clínica** na organização, o **profissional** na gestão de seus pacientes e, principalmente, o **paciente** na manutenção da saúde vocal e prevenção de complicações.

---

## 🛠️ Tecnologias Utilizadas

Este projeto foi desenvolvido utilizando os seguintes pilares tecnológicos:

* **Linguagem de Programação:** Java (com foco em Programação Orientada a Objetos)

---

## 🚀 Funcionalidades Principais (Baseado na Estrutura Atual)

Atualmente, o projeto demonstra a capacidade de:

* **Gerenciar Exercícios:** Criação e exibição de detalhes sobre exercícios vocais (nome, descrição, som, tipo, tempo mínimo, exemplo).
* **Cadastrar Pacientes:** Registro de informações básicas de pacientes (nome, e-mail).
* **Cadastrar Profissionais:** Registro de informações básicas de profissionais (nome, telefone).
* **Cadastrar Clínicas:** Registro de informações básicas de clínicas (nome, CNPJ).

## 💡 Competências Desenvolvidas na Semana

Durante a semana de desenvolvimento deste projeto, focamos intensamente na consolidação e aplicação de conceitos fundamentais da **Programação Orientada a Objetos (POO)**, que são a base para a construção de software robusto e escalável. As principais competências desenvolvidas incluem:

* **Criação de Classes:** Entendimento e aplicação do conceito de classes como moldes para objetos.
* **Definição de Atributos:** Modelagem de dados através da declaração de variáveis que representam as características de um objeto.
* **Criação de Métodos:** Desenvolvimento de funcionalidades e comportamentos que os objetos podem executar.
* **Instanciação de Objetos:** Aprendizado do processo de criação de instâncias de classes, dando "vida" aos modelos.
* **Implementação de Construtores:** Criação de métodos especiais para inicializar objetos, incluindo sobrecarga de construtores para diferentes cenários de inicialização.
* **Sobrecarga de Métodos:** Capacidade de criar múltiplos métodos com o mesmo nome, mas com diferentes assinaturas (número e/ou tipo de parâmetros), aumentando a flexibilidade do código.
* **Utilização de `static`:** Compreensão e aplicação do modificador `static` para membros de classe (atributos e métodos) que pertencem à classe em si, e não a uma instância específica.
* **Métodos Getters e Setters:** Implementação de métodos de acesso e modificação para atributos (encapsulamento), promovendo a segurança e o controle sobre os dados dos objetos.
* **Sintaxe para Construção:** Domínio da sintaxe básica e avançada para a definição de classes, métodos, atributos e a lógica de programação em Java.

Essas habilidades são cruciais para a construção de sistemas organizados, reutilizáveis e de fácil manutenção.
