/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ferna
 */
public class MetodoSecuencial {
    private boolean BusquedaSecuencial(int datoBuscar, int[] Vector){
        for(int pos=0;pos<Vector.length-1;pos++){
            if(Vector[pos]==datoBuscar){
                return true;
            }
        }
        return false;
    }
    public String MostrarBuQue(int datoBuscar, int[] Vector){
        long starTime=System.nanoTime();
        BusquedaSecuencial(datoBuscar, Vector);
        long endTime=System.nanoTime();
        long timeElapsed=endTime-starTime;
        return (BusquedaSecuencial(datoBuscar, Vector)+" "+"Tiempo="+timeElapsed+" NanoSegundos");
    }
}
