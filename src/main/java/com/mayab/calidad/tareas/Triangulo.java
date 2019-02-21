package com.mayab.calidad.tareas; 

public class Triangulo {

    public Triangulo(){

    } 

    public String tipoTriangulo(int lado1, int lado2, int lado3) {

        if(lado1>0 || lado2 >0 || lado3>0 ){
            if( lado1 == lado2 && lado2 == lado3){
                return "equilatero";
            } else if(lado1 == lado2 && lado2 != lado3 || lado1 == lado3 && lado3 != lado2){
                return "isosceles";
            } else if(lado1 != lado2 && lado2 != lado3) {
                return "escaleno";
            }
        }  
        return "no es un triangulo";           
    }
}