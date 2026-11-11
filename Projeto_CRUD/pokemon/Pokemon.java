package pokemon;
public class Pokemon {
    public String nome;
    public int nivel;
    public String tipo;
    public int altura;
    public int peso;
    public String ataque;

    public Pokemon() {}
    
    public Pokemon(String nome, int nivel, String tipo, int altura, int peso, String ataque) {
        this.nome = nome;
        this.nivel = nivel;
        this.tipo = tipo;
        this.altura = altura;
        this.peso = peso;
        this.ataque = ataque;
    }

    public void atacar() {
        System.out.println(nome + " está usando " + ataque);
    }
}