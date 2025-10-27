import java.util.*

fun main(){

    ejercicio1("Efren", 30)
    ejercicio2(descuento = 0.3, precio = 100)
    ejercicio3()
    ejercicio4()
    ejercicio5()
    ejercicio6()

}

fun ejercicio1(nombre: String?, edad: Int){
    var nombre: String? = nombre
    val edad: Int = edad

    println("Hola ${nombre?: "Usuario desconocido"} tienes $edad años.")
}

fun ejercicio2(precio: Int, descuento: Double = 0.1, aplicarIva: Boolean = true): Double{

    var precioFinal = precio - (precio*descuento)

    if(aplicarIva){
        precioFinal *= 1.21
    }

    return precioFinal
}

fun ejercicio3(){

    var producto = Producto("Martillo",10.99,5)
    var producto2 = Producto(nombre = "Fregona",precio = 5.99, null)

    producto.mostrarInfo()
    producto2.mostrarInfo()
}

fun ejercicio4(){

    var coche = Coche("Nissan")
    var coche2 = Coche("Hyundai")
    var coche3 = Coche("Toyota")
    var moto = Moto("Honda")
    var moto2 = Moto("Kawasaki")

    var vehiculos: List<Vehiculo> = listOf(coche,coche2,coche3, moto,moto2)

    for(v in vehiculos){
        v.acelerar()
    }
}

fun ejercicio5(){

    var calculadora = Calculadora()

    println(calculadora.sumar(10,10))

    println(calculadora.dividir(10.0,0.0)?: "No se puede dividir entre 0.")

}

fun ejercicio6(){
    var biblioteca = Biblioteca();

    var libro1 = Libro("Dale", "Chicha", true)
    var libro2 = Libro("Dale", "Chicha", true)
    var libro3 = Libro("Dale", "Chicha", true)
    var libro4 = Libro("Dale", "Chicha", true)
    var libro5 = Libro("Dale", "Chicha", true)

    biblioteca.agregarLibro(libro1)
    biblioteca.agregarLibro(libro2)
    biblioteca.agregarLibro(libro3)
    biblioteca.agregarLibro(libro4)
    biblioteca.agregarLibro(libro5)

    biblioteca.listarLibros()
    println(biblioteca.buscarPorAutor("Chicha"))


}