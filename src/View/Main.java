package View;

import Controller.TabelaImparPar;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int[] vet= {2, 3, 6, 7, 14, 23, 22, 1, 4};
        TabelaImparPar p= new TabelaImparPar();
        try {
            p.adiciona(vet);
            p.busca(Integer.parseInt(JOptionPane.showInputDialog("Digite a posição: 0 - Par | 1 - Impar")));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
