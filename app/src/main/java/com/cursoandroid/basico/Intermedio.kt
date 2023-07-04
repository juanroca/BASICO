package com.cursoandroid.basico

fun main(){
    nuevoTitulo(titulo = "Sentencias condiconales")
    //if
    nuevoSubtitulo(titulo = "If")
    if (true){
        println("Condicion exitosa")
    }

    //igualdad
    nuevoSubtitulo(titulo = "Equality")
    if (1==1){
        println("1 es igual a 1")
    }

    //igual a
    nuevoSubtitulo(titulo = "Equals")
    val al ="Tego"
    if (al.equals("Tego")){
        println("Es lo mismo")
    }

    nuevoTitulo(titulo = "OPERADORES LOGICOS")
    if (1!=2){ //no es igual
        println("1 es diferente de 2")
    }
    if (1==1 || 1<2){ // or, o
        println("1 es igual o menor a 2")
    }
    if (1!=2 && 1<2) {//and, y
        println("1 es diferente y menor que 2")
    }
    //Anidacion
    if (1==1){
        if (1<2){
            println("if anidado")
        }
    }
}