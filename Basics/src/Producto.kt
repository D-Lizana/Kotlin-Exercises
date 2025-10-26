class Producto(val nombre: String, val precio: Double, val stock: Int?) {

    fun mostrarInfo(){
        println("Producto: $nombre, precio: $precio, ${stock?: "Stock no disponible"}")
    }
}