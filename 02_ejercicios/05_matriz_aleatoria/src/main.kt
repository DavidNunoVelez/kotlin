import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import javax.swing.JOptionPane

/**
 * Created by 7fbd06 on 25/05/2017.
 */
fun main(args: Array<String>) {

    val br=BufferedReader(InputStreamReader(System.`in`))

    fun int(min: Int, max: Int): Int = min + Random().nextInt((max - min) + 1)

    val filas=JOptionPane.showInputDialog("Introduce el nº de filas: ").toInt()
    val columnas= JOptionPane.showInputDialog("Introduce el nº de columnas: ").toInt()


}