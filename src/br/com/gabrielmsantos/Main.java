package br.com.gabrielmsantos;

import br.com.gabrielmsantos.apps.AparelhoTelefonico;
import br.com.gabrielmsantos.apps.NavegadorInternet;
import br.com.gabrielmsantos.apps.ReprodutorMusical;

public class Main {
    public static void main(String[] args) {
        System.out.printf("********* IPHONE *********");
        System.out.printf("\n");

        System.out.printf("\nAparelho Telefonico");
        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
        aparelhoTelefonico.ligar("61 0000-0000");
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();

        System.out.printf("\n\nReprodutor Musical");
        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
        reprodutorMusical.selecionarMusica("Sunflower");

        System.out.printf("\n\nNavegador de Internet");
        NavegadorInternet navegadorInternet = new NavegadorInternet();
        navegadorInternet.exibirPagina("teste.html");
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();
    }
}