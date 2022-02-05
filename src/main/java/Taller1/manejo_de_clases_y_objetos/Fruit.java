/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller1.manejo_de_clases_y_objetos;
import java.util.ArrayList;
/**
 * Representa la fruta como un producto.
 * 
 * @author Juan Pablo Gonzalez Marin
 */
public class Fruit {
    /**
     * Representa la variable que capta el nombre de la fruta.
     */
    public String name;
    /**
     * Representa la variable que capta el peso medio de la fruta.
     */
    private Float averageWeight;
    /**
     * Variable que capta los colores de la fruta.
     */
    public ArrayList<String> color= new ArrayList(); 
    /**
     * Variable que capta el valor del consto de compra.
     */
    public int purchasecost;
    /**
     * Crea una instancia de la fruta con los datos enviados.
     * @param name  Trae el nombre de la fruta.
     * @param averageWeight Trae el peso medio de la fruta.
     * @param purchasecost Trae el precio de compra de la fruta.
     */
    public Fruit(String name, Float averageWeight, int purchasecost) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.purchasecost = purchasecost;
    }    
    /**
     * Llama los colores guardados de la fruta desde la variable color.
     * @return Retorna la lista de colores de la fruta
     */
    public ArrayList<String> getColor() {
        return color;
    }    
    /**
     * Guarda el color en una posicion del ArrayList.
     * @param name Trae el color que es guardado en la variable ArrayList de nombre color.
     */
    public void setColor(String name) {
        this.color.add(name);
    }
    
}
