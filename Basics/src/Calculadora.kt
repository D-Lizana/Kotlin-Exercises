class Calculadora {

    fun sumar(a: Int, b: Int): Int{
        return a+b
    }

    fun dividir(a:Double, b:Double): Double?{
        if(b.toInt()==0){
            return null
        }
        else{
            return a/b
        }
    }

}