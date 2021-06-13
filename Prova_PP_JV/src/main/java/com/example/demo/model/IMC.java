package com.example.demo.model;

public class IMC {
	private float altura;
	private float peso;
	private float IMC;
	private String resultado;
	
	public String getResultado() {
		if(IMC < 18.5) {
            this.resultado = IMC + ",você está abaixo do peso, risco: Elevado!";
        }else if(IMC >= 18.5 && IMC < 25) {
            this.resultado = IMC + ",você está no peso ideal, risco: Inexistente!";
        }else if(IMC >= 25 && IMC < 30) {
            this.resultado =IMC +",você está com excesso de peso, risco: Elevado!";
        }else if(IMC >= 30 && IMC < 35) {
            this.resultado = IMC +",você está com obesidade grau 1, risco: Muito Elevado!";
        }else if(IMC >= 35 && IMC < 40) {
            this.resultado = IMC +",você está com obesidade grau 2, risco: Muitíssimo Elevado!";
        }else if(IMC >= 40) {
            this.resultado = IMC +",você está com obesidade grau 3, risco: Obesidade Mórbida!";
        }
        return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	public float getIMC() {
		return IMC;
	}
	public void setIMC(float peso, float altura) {
		IMC = peso/(altura*altura);
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
}