import java.util.*

/**
 * Created by 7fbd06 on 25/05/2017.
 */
fun main(args: Array<String>) {


    fun int(min: Int, max: Int): Int = min + Random().nextInt((max - min) + 1)

    val datos = arrayOf(int(0,100),int(0,100),int(0,100),int(0,100),int(0,100),
            int(0,100),int(0,100),int(0,100),int(0,100),int(0,100))



    fun visualizar(array: Array<Int>) {
        for(i in array){
            println(i)
        }
    }

    fun buscarMayor(array: Array<Int>){
            val max=array.max()
            println("El valor máximo del array es: $max")
    }

    fun buscarMenor(array: Array<Int>){
            val min=array.min()
            println("El valor mínimo del array es: $min")
    }

    fun existe(array: Array<Int>, n:Int):Boolean{
        var existe:Boolean=false
        for(i in array){
            if(i==n)
                return true
        }
        return existe
    }


    visualizar(datos)
    println()
    buscarMayor(datos)
    println()
    buscarMenor(datos)
    if(existe(datos, 20)==true){
        println("Existe")
    }else{
        println("No existe")
    }
}