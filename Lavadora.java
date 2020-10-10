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
public class Lavadora extends Electrodomestico{
    private final float carga=5;
    private float crga;
    
    public Lavadora(float carga,float precioBase,float peso, String consumoEnergetico, String color){
        super(precioBase,peso,consumoEnergetico,color);
        getCarga(carga);
        
    }
    
    public void getCarga(float carga){
        crga=carga;
    }
    public float setCarga(){
        return(crga);
    }
    public float precioFinal( float precioBase){
        if(crga>30){
            precioBase=precioBase+50;
            return(precioBase);
        }
        else
            return(precioBase);
    }
}
