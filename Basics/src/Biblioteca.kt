class Biblioteca(var libros: ArrayList<Libro> = arrayListOf()) {

    fun agregarLibro(libro: Libro){
        libros.add(libro)
        println("Libro añadido.")
    }

    fun prestarLibro(titulo: String): Boolean{
        for(l in libros){
            if(l.titulo === titulo && l.disponible){
                l.disponible = false
                return true
            }
            else if(l.titulo === titulo && !l.disponible){
                return false
            }
        }

        println("Libro no encontrado.")
        return false
    }



}