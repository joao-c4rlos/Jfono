public class Exercicio {
   private int id;
   private String nome;
   private String descricao;
   private String som;
   private String tipo;
   private int tempoMin;

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

   private String exemplo;

   public Exercicio() {

   }

   public Exercicio(String nome, String descricao, String som, String tipo, int tempoMin, String exemplo) {
      this.nome = nome;
      this.tipo = tipo;
      this.descricao = descricao;
      this.som = som;
      this.tempoMin = tempoMin;
      this.exemplo = exemplo;
   }

   public Exercicio(String nome, String descricao, String exemplo) {
      this.nome = nome;
      this.exemplo = exemplo;
      this.descricao = descricao;
   }

}

// CTRL+SHIFT+L
// construtor default
