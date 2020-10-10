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
public class Electrodomestico {
    private final float precioBase=100,peso=5;
    private final String consumoEnergetico="F";
    private final String color="Blanco";
    
    private float pB,pss;
    private String cE;
    private String clr;
    
    
    public Electrodomestico(float precioBase,float peso, String consumoEnergetico, String color){
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);
        precioFinalFinal(consumoEnergetico,peso,precioBase);
        pss=peso;
    }
    
    
    public void getAtributos(float precioBase,float peso, String consumoEnergetico, String color){
        this.pB=precioBase;
        this.pss=peso;
        this.cE=consumoEnergetico;
        this.clr=color;
    }
    
    private void comprobarConsumoEnergetico(String letra){
        if((letra.equals("A"))||(letra.equals("B"))||(letra.equals("C"))||(letra.equals("D"))||(letra.equals("E"))||(letra.equals("F"))){
        this.cE=letra;
    }
        else
            this.cE=this.consumoEnergetico;
    }
    
    private void comprobarColor(String color){
        if((color.equals("blanco"))||(color.equals("negro"))||(color.equals("rojo"))||(color.equals("azul"))||(color.equals("gris"))){
            this.clr=color;
        }
        else
            this.clr=this.color;
    }
    
    private void precioFinalFinal(String consumo,float peso,float precioBase){
        switch(consumo){
            case "A":
                this.pB=precioBase+100;
                break;
            case "B":
                this.pB=precioBase+80;
                break;
            case "C":
                this.pB=precioBase+60;
                break;
            case "D":
                this.pB=precioBase+50;
                break;
            case "E":
                this.pB=precioBase+30;
                break;
            case "F":
                this.pB=precioBase+10;
                break;
        }
        
        if(peso<=19){
            this.pB=pB+10;
        }
            else if(peso>=20 && peso<=49){
                this.pB=pB+50;
            }
                else if(peso>=50 && peso<=79){
                    this.pB=pB+80;
                }
                    else if(peso<=80){
                        this.pB=pB+100;
                    }
    }
    
    public float setPrecio(){
        return(pB);
    }
    public float setPeso(){
        return(pss);
    }
    public String setConsumo(){
        return(cE);
    }
    public String setColor(){
        return(clr);
    }
    
    
}
