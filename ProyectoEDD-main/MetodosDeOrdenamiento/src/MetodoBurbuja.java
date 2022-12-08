/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ferna
 */
public class MetodoBurbuja {

    private void MetodoBurbuja(int[] Vector){
        int aux;
        for(int i=0;i<Vector.length;i++){
            for(int j=0;j<Vector.length-1;j++){
                if(Vector[j]>Vector[j+1]){
                    aux=Vector[j];
                    Vector[j]=Vector[j+1];
                    Vector[j+1]=aux;
                }
            }
        }
    }

    public String MostrarMeBur(int[] Vector){
        long starTime=System.nanoTime();
        MetodoBurbuja(Vector);
        long endTime=System.nanoTime();
        long timeElapsed=endTime-starTime;
        String cad="";
        for(int i=0;i<Vector.length;i++){
            cad+=Vector[i]+" ";
        }
        return cad+"-"+"Tiempo="+timeElapsed+" NanoSegundos";
    }
}
