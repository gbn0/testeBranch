package src;

import java.util.ArrayList;

public class ItensColecionaveis {

    private int codigo;
    private String nome;
    private String dataAquisicao;
    private ArrayList<String> listaAutores;
    private ArrayList<Livro> livros;
    private ArrayList<Cd> cds;
    private ArrayList<Revista> revistas;
    private ArrayList<Dvd> dvds;

    public ItensColecionaveis(int codigo, String nome, String data) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataAquisicao = data;
        this.listaAutores = new ArrayList<String>();
        this.livros = new ArrayList<Livro>();
        this.cds = new ArrayList<Cd>();
        this.revistas = new ArrayList<Revista>();
        this.dvds = new ArrayList<Dvd>();
    }

    public ArrayList<Cd> ImprimirListaCd () {
        return 
    }

    public ArrayList<Dvd> ImprimirListaDvd () {
        return 
    }

    public ArrayList<Livro> imprimirListaLivros () {
        return
    }

    

}