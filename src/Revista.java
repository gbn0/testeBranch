package src;

public class Revista extends ItensColecionaveis {

    private int anoPublicacao;
    private int volume;
    private String editora;
    private String assuntos;

    public Revista(int c, String n, String d, int a, int v, String e, String as) {

        // super(c,n,d);
        this.anoPublicacao = a;
        this.volume = v;
        this.editora = e;
        this.assuntos = as;
    }
}
