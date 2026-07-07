public class Pessoa {

    private String nome;
    private int idade;
    private String cidade;

    public Pessoa(String nome, int idade, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }

    public String toXML() {
        return "<Pessoa>\n" +
                "    <nome>" + nome + "</nome>\n" +
                "    <idade>" + idade + "</idade>\n" +
                "    <cidade>" + cidade + "</cidade>\n" +
                "</Pessoa>";
    }
}