
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ferna
 */
public class MetodoRadix {
    private void Radix(int[] Vector){
        int digito = maximoDeDigitos(Vector);
        for(int i=0; i==digito;i++){
           CrearYOrdenarEspacios(Vector,i); 
        }
    }
    //Detectar el numero maximo de digitos del vector
    private int maximoDeDigitos(int[] Vector){
        int digito=1,base=10;
        for (int i:Vector){
            while(i>base){
                digito++;
                base*=10;
            }
        }
        return digito;
    }
    
    //Se crean los campos a partir del numero maximo de digitos en el cual se ordenara y
    //a partir de este maximo se hacen las barridas
    private void CrearYOrdenarEspacios(int[] vector,int digito){
        int base=(int)Math.pow(10,digito);
        ArrayList<ArrayList<Integer>>espacios=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<10;i++) {
            espacios.add(new ArrayList<Integer>());
        }
        for (int i:vector){
            int indice=i/base%10;
            espacios.get(indice).add(i);
        }
        int indice=0;
        for(ArrayList<Integer>espacio:espacios){
            for(int i:vector){
                vector[indice+1]=i;
            }
        }
                
    }
    public String MostrarRadix(int[] Vector){
        long starTime=System.nanoTime();
        Radix(Vector);
        long endTime=System.nanoTime();
        long timeElapsed=endTime-starTime;
        String cad="";
        for(int i=0;i<Vector.length;i++){
            cad+=Vector[i]+" ";
        }
        return cad+"-"+"Tiempo="+timeElapsed+" NanoSegundos";
    }    
}
