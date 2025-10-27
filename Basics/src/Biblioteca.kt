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

    fun devolverLibro(titulo: String): Boolean {
        for (l in libros) {
            if (l.titulo === titulo && !l.disponible) {
                l.disponible = true
                println("Libro devuelto.")
                return true
            }
        }

        println("Libro no encontrado.")
        return false
    }

    fun listarLibros(){
        for (l in libros){
            l.toString()
        }
        println()
    }

    fun buscarPorAutor(autor: String): List<Libro>{
        var lista: MutableList<Libro> = mutableListOf()
        for (l in libros){
            if(l.autor === autor){
                lista.add(l)
            }
        }

        return lista
    }


}