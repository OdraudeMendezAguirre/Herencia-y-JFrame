/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercisioHerencia;

/**
 *
 * @author ODRAUDE MENDEZ AGUIRRE
 */
public class Television extends Electrodomestico {
    private final int resolucion=20;
    private final boolean sintonizadorTDT=false;
    private  int reso;
    private  boolean sintonizador;
    
    
    public Television(int resolucion, boolean sintonizador,float precioBase,float peso, String consumoEnergetico, String color){
        super(precioBase, peso, consumoEnergetico, color);
        reso=resolucion;
        this.sintonizador=sintonizador;
        
    }
    
    
    public float precioFinal(float precioBase){
        if(reso>40){
            precioBase=precioBase+(precioBase*30)/100;
        }
        if (sintonizador==true ){
            precioBase=precioBase+50;
        }
        return(precioBase);
    }
    
    public int setRes(){
        return(reso);
    }
    
    public boolean setSin(){
        return(sintonizador);
    }
}
