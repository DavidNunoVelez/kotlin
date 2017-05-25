import javax.swing.JOptionPane

/**
 * Created by 7fbd06 on 25/05/2017.
 */

fun main(args: Array<String>) {


    fun esPrimo(n:Int): Boolean{
        var contador:Int=2
        var primo: Boolean=true
        while ((primo) && (contador!=n)){
            if (n % contador == 0)
                primo = false
                contador += 1

        }
        return primo
    }

    val numerousuario=JOptionPane.showInputDialog("Escribe un nº: ").toInt()

    for (i in 1..numerousuario){
        if(esPrimo(i)==true){
            println(i)
        }
    }






}