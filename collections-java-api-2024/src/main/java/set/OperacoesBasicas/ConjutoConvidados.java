package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjutoConvidados {
    //atributos
    private Set<Convidado> convidadoSet;

    public ConjutoConvidados() {
        this.convidadoSet = new HashSet<>();    
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet){
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return  convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }




    public static void main(String[] args) {
        ConjutoConvidados conjuntoConvidados = new ConjutoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do set de convidados.");

        
         // Adicionando convidados ao conjunto
            conjuntoConvidados.adicionarConvidado("Alice", 1234);
            conjuntoConvidados.adicionarConvidado("Bob", 1235);
            conjuntoConvidados.adicionarConvidado("Charlie", 1235);
            conjuntoConvidados.adicionarConvidado("David", 1236);

            conjuntoConvidados.exibirConvidados();

            System.out.println("Existem " + conjuntoConvidados.contarConvidados() + "convidado(s) dentro do Set convidados");

            conjuntoConvidados.removerConvidadoPorCodigoConvite(1236);

            System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set convidados.");

            conjuntoConvidados.exibirConvidados();

    }
}
    
