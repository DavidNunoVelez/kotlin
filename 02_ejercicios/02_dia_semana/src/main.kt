/**
 * Created by 7fbd06 on 25/05/2017.
 */
import java.io.BufferedReader
import java.io.InputStreamReader
import javax.swing.JOptionPane

/**
 * Created by 7fbd06 on 25/05/2017.
 */
fun main(args: Array<String>) {

    val br= BufferedReader(InputStreamReader(System.`in`))

    val numero=JOptionPane.showInputDialog("Escribe un numero comprendido entre el 1 y el 7: ").toInt()

    when(numero){
        1 -> JOptionPane.showMessageDialog(null,"Lunes")
        2 -> JOptionPane.showMessageDialog(null,"Martes")
        3 -> JOptionPane.showMessageDialog(null,"Miércoles")
        4 -> JOptionPane.showMessageDialog(null,"Jueves")
        5 -> JOptionPane.showMessageDialog(null,"Viernes")
        6 -> JOptionPane.showMessageDialog(null,"Sábado")
        7 -> JOptionPane.showMessageDialog(null,"Domingo")
        else -> JOptionPane.showMessageDialog(null,"Ese nº no está entre el 1 y el 7, listill@...")
    }

}