package Controller;

import Biblioteca.ListaObject.Lista;

import java.io.IOException;

public class TabelaImparPar {

    Lista[] vetTabela;

    public TabelaImparPar(){
        vetTabela= new Lista[2];
        for (int i=0; i<2; i++){
            vetTabela[i]= new Lista();
        }
    }

    private int hashcode(int valor){
        int posicao;
        if (valor % 2 == 0){
            posicao= 0;
        }
        else {
            posicao= 1;
        }
        return posicao;
    }

    public void adiciona(int[] valor) throws Exception {
        int tamanho= valor.length;
        for (int i=0; i<tamanho; i++){
            int hash= hashcode(valor[i]);
            Lista l= vetTabela[hash];
            if (l.isEmpty()){
                l.addFirst(valor[i]);
            }
            else {
                l.addLast(valor[i]);
            }

        }
    }

    public void busca(int posicao) throws Exception{
        Lista l= vetTabela[posicao];
        int tamanho= l.size();
        for (int i=0; i<tamanho; i++){
            System.out.println(l.get(i));
        }
    }
}
