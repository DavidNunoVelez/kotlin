import java.util.*

/**
 * Created by 7fbd06 on 25/05/2017.
 */
fun main(args: Array<String>) {




    fun int(min: Int, max: Int): Int = min + Random().nextInt((max - min) + 1)

    val n1=int(0,100)
    val n2=int(0,100)
    val n3=int(0,100)

    if(n1>n2 && n2>n3){
        println(n1)
        println(n2)
        println(n3)
    }else if(n1>n2 &&n2<n3){
        println(n1)
        println(n3)
        println(n2)
    }else if(n1<n2 &&n2<n3){
        println(n3)
        println(n2)
        println(n1)
    }else if(n1<n2 &&n2>n3){
        println(n2)
        println(n3)
        println(n1)
    }else if(n2>n1 &&n1<n3){
        println(n2)
        println(n1)
        println(n3)
    }else if(n3>n2 &&n2>n1) {
        println(n2)
        println(n1)
        println(n3)
    }
}


