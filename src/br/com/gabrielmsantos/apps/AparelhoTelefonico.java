package br.com.gabrielmsantos.apps;

import br.com.gabrielmsantos.Iphone;

public class AparelhoTelefonico extends Iphone {

    public void ligar(String numero) {
        System.out.printf("\nLigando para o numero: " + numero);
    }

    public void atender() {
        System.out.printf("\nAtendendo liganção.");
    }

    public void iniciarCorreioVoz() {
        System.out.printf("\nIniciando correio de voz.");
    }
}
