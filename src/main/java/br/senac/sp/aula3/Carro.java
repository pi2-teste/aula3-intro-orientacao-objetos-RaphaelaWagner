/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.aula3;

/**
 *
 * @author fernando.fernandes
 */
public class Carro {

    public static String fabricante;
    public String[] rodas;
    public String cor;
    public String modelo;
    public int velocidadeAtual;
    public int gasolina;
    public int max_gasolina;

    public int getGasolina() {
        return gasolina;
    }

    public void setGasolina(int gasolina) {
        this.gasolina = gasolina;
    }

    public int getMax_gasolina() {
        return max_gasolina;
    }

    public void setMax_gasolina(int max_gasolina) {
        this.max_gasolina = max_gasolina;
    }

    // Definir um construtor vazio
    public Carro() {
        this.gasolina = 20;
        this.max_gasolina = 40;
    }

    // Definir um construtor 
    public Carro(int maxgasolina) {
        this.gasolina = 20;
        this.max_gasolina = maxgasolina;
    }

    // Método Get
    public static String getFabricante() {
        return fabricante;
    }

    // Método Get
    public String[] getRodas() {
        return rodas;
    }

    // Método Get
    public String getCor() {
        return cor;
    }

    // Método Get
    public String getModelo() {
        return modelo;
    }

    // Método Get
    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    // Método Set
    public static void setFabricante(String fabricante) {
        Carro.fabricante = fabricante;
    }

    // Método Set
    public void setRodas(String[] rodas) {
        this.rodas = rodas;
    }

    // Método Set
    public void setCor(String cor) {
        this.cor = cor;
    }

    // Método Set
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Método Set
    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }
// Método que descreve modelo e cor do carro

    public String descreve() {

        if (this.modelo == null) {
            return "Um carro";
        }
        if (this.cor == null) {
            return "Um " + this.modelo;
        }

        return "Um " + this.modelo + " na cor " + this.cor;
    }
// Método Abastece

    public void abastece(int quantgasolina) {
        if (quantgasolina + gasolina > max_gasolina) {
            gasolina = 40;
        } else {
            gasolina += quantgasolina;
        }
    }
}
