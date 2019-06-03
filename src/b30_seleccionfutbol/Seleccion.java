/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b30_seleccionfutbol;

/**
 *
 * @author lvazquezdorna
 */
public class Seleccion {

    private int id;
    private String nome;
    private String apelido;
    private int edade;

    public Seleccion() {
    }

    public Seleccion(int id, String nome, String apelido, int edade) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.edade = edade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public int getEdade() {
        return edade;
    }

    public void setEdade(int edade) {
        this.edade = edade;
    }

    @Override
    public String toString() {
        return "Plantilla: \n ID :\t" + id + "\n NOME: \t" + nome + "\n APELIDOS: \t" + apelido + "\n EDADE: \t" + edade;
    }

    public void concentrarse() {

        System.out.println("\n\t\tConcentrase a selección");
    }

    public void viaxar() {
        System.out.println("\n\t\tViaxa a selección");
    }

}
