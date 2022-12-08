/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ferna
 */
public class MetodoShellShort {
        
    private void ShellShort(int[] Vector){
        for(int salto=Vector.length/2;salto!=0;salto/=2){
            boolean cambios=true;
            while(cambios){
                cambios=false;
                for(int i=salto;i<Vector.length;i++){
                    if(Vector[i-salto]>Vector[i]){
                        int aux=Vector[i];
                        Vector[i]=Vector[i-salto];
                        Vector[i-salto]=aux;
                        cambios=true;
                    }
                }
            }
        }
    }
    public String MostrarShellShort(int[] Vector){
        long starTime=System.nanoTime();
        ShellShort(Vector);
        long endTime=System.nanoTime();
        long timeElapsed=endTime-starTime;
        String cad="";
        for(int i=0;i<Vector.length;i++){
            cad+=Vector[i]+" ";
        }
        return cad+"-"+"Tiempo="+timeElapsed+" NanoSegundos";
    }
}
