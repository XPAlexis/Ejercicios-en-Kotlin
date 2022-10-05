import java.awt.List
var costoJuego: Double = 0.0
var descuento: Double = 0.0
var precioFinal: Double = 0.0

fun main(args: Array<String>) {
    println("VALOR DEL VIDEOJUEGO: ")
    costoJuego = readLine()!!.toDouble()
    Descuento()
}

fun Descuento(){
    if (costoJuego > 180){
        precioFinal= costoJuego * 0.16
        descuento = costoJuego - precioFinal
        println("El precio final es igual a $precioFinal")
        println("El descuento es $descuento")


    }else{
        println("El producto no cuenta con un descuento disponible")
        println("El precio sin descuento es $costoJuego")
    }
    lista()

}
fun lista(){
    val lista = listOf(costoJuego, descuento, precioFinal)
    print(lista)
}