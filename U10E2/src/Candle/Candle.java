
package Candle;

import java.awt.Color;

public class Candle {    
    
    private Color color;   //Karimnot inc
    private Double altura; 
    private Double precio;
    public static final Double PRICE = 2.0;   
        
    protected void calculaPrecio(){
        
    }
     
    public void setColor(Color color){
        this.color = color;
    }
    
    public Color getColor(){
        return this.color;
    }

    public void setAltura(Double altura){
        this.altura = altura;
        this.precio = altura*PRICE;   
    }
    
    public Double getAltura(){
        return this.altura;
    }
    
}
