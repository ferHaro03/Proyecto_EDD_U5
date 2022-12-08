/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ferna
 */
public class Vector {
        int Vector[];
    
    public Vector (int tamano){
        Vector=new int[tamano];
    }
    private void valAleVector(){
        for(int ren=0;ren<Vector.length;ren++){
            Vector[ren]=(int)(long)(Math.random()*75);
        }
    }
        public String Mostrar(){
        valAleVector();
        String cad="";
        for(int i=0;i<Vector.length;i++){
            cad+=Vector[i]+" ";
        }
        return cad;
    }
}
