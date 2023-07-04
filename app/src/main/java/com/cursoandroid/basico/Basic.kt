package com.cursoandroid.basico
//variables globales
var usuario="Todos"

//Constante
const val ESPECIE ="Humano"

const val SEPARADORTITULO="=============="
const val SEPARADORSUBTITULO="--------------"

fun main(){
    print("Hola mundo")
    println() //salto de linea en el texto

    //variable locales
    nuevoTitulo(titulo = "VARIABLES LOCALES")

    var edad: Int = 30 //var permite cambiar el valor o reasignar valor

    val nombre = "Rojas" //val no permite reasignacion de valor
    println(edad)
    edad=20
    println(edad)
    println(nombre)

    var job:String //variable vacia de tipo cadena
    job = "Oficial de policia"
    println(job)

    val lengua: String
    lengua ="Kotlin"
    println(lengua)

    //Variable global
    println(usuario)

    //Constantes
    println(ESPECIE)

    //string templates (concatenar texto con variables)
    println("Mi nombre es $nombre")
    println("Mi edad es ${edad}")

    //tipos de datos
    nuevoTitulo(titulo = "TIPO DE DATOS")
    //Char es para un solo caracter y va entre comillas simples
    val char: Char ='a'
    val char2: Char ='g'
    print(char)
    print(char2)
    println()

    //String es una cadena de texto
    val string:String = "Cadena de texto"

    //Boolean es para falso (0) o verdadero (1)
    val boolean:Boolean = true //true=1 y false=0
    println(boolean)

    //Numericos
    //8 bit -128 to 127
    val trabajos:Byte = 3
    println("$trabajos son los trabajos realizados")

    //16 bit -32768 to 32767
    val diasTrabajados:Short = 200
    println("$diasTrabajados dias trabajados en la vida")

    //32 bit -2,147,483,648 to 2,147,483,647
    val minutosTrabajados: Int = 288000
    println("$minutosTrabajados minutos trabajados en la vida")

    //64 bit -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    val milisegundosTrabajados: Long = 17280000000
    println("$milisegundosTrabajados milisegundos trabajados en la vida")

    //32 bit para decimales cortos
    val altura: Float = 1.75f
    println("${altura}m es la altura")

    //64 bit para decimales largos
    val ancho: Double = 1.75333333
    println("${ancho}m es la anchura")

    nuevoTitulo(titulo = "FUNCIONES Y ARGUMENTOS")
    //LLAMAMOS A FUNCIONES
    Basic()
    arguments(nombre)
    funcionDos(edad)

    //RETURN
    println(returnData())

    //SOBRECARGA
    overload(edad)
    overload(job)
    overload(job, lengua)

}
fun overload(job: String, lengua: String){
    println("Mi trabajo es: $job con $lengua")
}

fun overload(job: String) {
    println("Mi trabajo es: $job")
}

fun overload(edad: Int) {
    println("Mi edad es: $edad")
}

fun returnData(): String {
    return "Datos retornados con ReturnData"
}

fun funcionDos(edad: Int) {
    println("Mi edad es $edad")
}

fun arguments(nombre: String): Unit {
    println("Hola $nombre")
}

fun Basic(){
    println("hola")
}
fun nuevoTitulo(titulo: String){
    println()
    print("$SEPARADORTITULO $titulo $SEPARADORTITULO")
    println()
}
fun nuevoSubtitulo(titulo: String){
    println()
    println("$SEPARADORSUBTITULO $titulo $SEPARADORSUBTITULO")

}

