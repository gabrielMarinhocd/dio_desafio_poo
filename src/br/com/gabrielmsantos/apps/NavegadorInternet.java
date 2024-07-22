package br.com.gabrielmsantos.apps;

import br.com.gabrielmsantos.Iphone;

public class NavegadorInternet extends Iphone {

    public void exibirPagina(String url) {
        System.out.printf("\nExibindo pagina: " + url);
    }

    public void adicionarNovaAba() {
        System.out.printf("\nAdicionando nova Aba.");
    }

    public void atualizarPagina() {
        System.out.printf("\nAtualizando pagina.");
    }
}
