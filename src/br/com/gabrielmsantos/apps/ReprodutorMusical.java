package br.com.gabrielmsantos.apps;

import br.com.gabrielmsantos.Iphone;

public class ReprodutorMusical extends Iphone {

    public void tocar() {
        System.out.printf("\nReprodutor musical iniciado.");
    }

    public void pausar() {
        System.out.printf("\nPausando reprodutor.");
    }

    public void selecionarMusica(String musica) {
        System.out.printf("\nSelecionando musica:" + musica);
    }
}
