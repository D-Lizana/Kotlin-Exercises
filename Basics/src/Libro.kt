class Libro(val titulo: String, val autor: String, var disponible: Boolean) {

    override fun toString(): String {
        return "Titulo: $titulo, Autor: $autor, Disponible: $disponible."
    }


}