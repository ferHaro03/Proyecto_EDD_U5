
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ferna
 */
public class MetodoBinario {
    private boolean BusquedaBinaria(int datoBuscar, int[] Vector){
        return BusquedaBinaria(Vector,datoBuscar);
    }
    private boolean BusquedaBinaria(int[] Vector,int datoBuscar){
        long starTime=System.nanoTime();
        Arrays.sort(Vector);
        int tam=Vector.length;
        int mitad=tam/2;
        if(Vector[mitad]==datoBuscar){
            return true;
        }
        if(tam<=1) return false;
        
        if(Vector[mitad]>datoBuscar){
            return BusquedaBinaria(Arrays.copyOfRange(Vector,0, mitad),datoBuscar);
        }else{
            return BusquedaBinaria(Arrays.copyOfRange(Vector,mitad++, tam),datoBuscar);
        }//Con recursividad
    }
    
    public String MostrarBi(int datoBuscar, int[] Vector){
        long starTime=System.nanoTime();
        BusquedaBinaria(datoBuscar, Vector);
        long endTime=System.nanoTime();
        long timeElapsed=endTime-starTime;
        return (BusquedaBinaria(datoBuscar, Vector)+" "+"Tiempo="+timeElapsed+" NanoSegundos");
    }
}
