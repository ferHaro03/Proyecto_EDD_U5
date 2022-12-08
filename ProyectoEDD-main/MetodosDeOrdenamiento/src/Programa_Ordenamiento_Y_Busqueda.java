import javax.swing.JOptionPane;

public class Programa_Ordenamiento_Y_Busqueda{
    public static  void main(String[] args){
        
        Vector objetoVector = new Vector(20);
        MetodoBurbuja objetoBurbuja = new MetodoBurbuja();
        MetodoQuickSort objetoQuick = new MetodoQuickSort();
        MetodoShellShort objetoShell = new MetodoShellShort();
        MetodoRadix objetoRadix = new MetodoRadix();
        MetodoSecuencial objetoSecuencial = new MetodoSecuencial();
        MetodoBinario objetoBinario = new MetodoBinario();

        System.out.println(objetoVector.Mostrar()+"-Matriz Normal");
        System.out.println(objetoBurbuja.MostrarMeBur(objetoVector.Vector)+"-Metodo Burbuja");
        System.out.println(objetoQuick.MostrarQuicksort(objetoVector.Vector)+"-Metodo Quicksort");
        System.out.println(objetoShell.MostrarShellShort(objetoVector.Vector)+"-Metodo ShellShort");
        System.out.println(objetoRadix.MostrarRadix(objetoVector.Vector)+"-Metodo Radix");
        int N=Integer.parseInt(JOptionPane.showInputDialog("Valor que quieres Buscar"));
        System.out.println(objetoSecuencial.MostrarBuQue(N, objetoVector.Vector)+"/"+"-Busqueda Secuencial");
        System.out.println(objetoBinario.MostrarBi(N,objetoVector.Vector)+"/"+"-Busqueda Binario");
    }
}