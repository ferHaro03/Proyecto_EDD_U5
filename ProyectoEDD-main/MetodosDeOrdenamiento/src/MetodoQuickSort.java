/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ferna
 */
public class MetodoQuickSort {

     private void Quicksort(int primero,int ultimo, int[] Vector){
        int i,j,pivote,aux;
        i=primero;
        j=ultimo;
        pivote=Vector[(primero+ultimo)/2];
        do{
            while(Vector[i]<pivote){
                i++;
            }
            while(Vector[j]>pivote){
                j--;
            }
            if(i<=j){
                aux=Vector[i];
                Vector[i]=Vector[j];
                Vector[j]=aux;
                i++;
                j--;
            }
        }while(i<=j);
        if(primero<j){
            Quicksort(primero,j,Vector);
        }
        if(i<ultimo){
            Quicksort(i,ultimo,Vector);
        }
    }
    
    public String MostrarQuicksort(int[] Vector){
        long starTime=System.nanoTime();
        Quicksort(0,Vector.length-1, Vector);
        long endTime=System.nanoTime();
        long timeElapsed=endTime-starTime;
        String cad="";
        for(int i=0;i<Vector.length;i++){
            cad+=Vector[i]+" ";
        }
        return cad+"-"+"Tiempo="+timeElapsed+" NanoSegundos";
    }
}
