/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller1.manejo_de_clases_y_objetos;
import java.time.LocalDate;

/**
 * Representa el documento interno orden de compra generado por el pedido de un cliente.
 * 
 * @author Juan Pablo Gonzalez Marin
 */
public class Order {
    /**
    *Representa la varialbe que crea el número de la orden de compra. 
    */
    private int numberofOrder;
    /**
    *Representa el nombre del vendedor que realiza la venta. 
    */
    protected int idVendor;
    /**
    *Representa el nombre del producto de la orden de compra. 
    */
    public String productName;
    /**
    *Representa la cantidad del producto en kilos por el que esta hecha la orden de compra. 
    */
    public int amount;
     /**
    *Representa la aprobacion para dar tramite a la orden de compra. 
    */
    protected boolean aprove=false;
    /**
     * Se instancia variable de objeto LocalDate para que capture la fecha actual
     */
    protected LocalDate salesDate = LocalDate.now();
    /**
     * Crea una instancia de la orden con los datos envisdos.
     * @param idVendor Identificador del vendedor.
     * @param productName Nombre del producto.
     * @param amount Cantidad del producto en kilos.
     */
    public Order(int idVendor, String productName, int amount) {
        this.idVendor = idVendor;
        this.productName = productName;
        this.amount = amount;
        this.numberofOrder=this.numberofOrder++;
    }
    /**
     * Muestra la cantidad de producto en kilos que esta solicitando la orden.
     * @return Cantidad de producto.
     */
    public int getAmount() {
        return amount;
    }
    /**
     * Cargar un valor en la variable cantidad.
     * @param amount cantidad de producto en kilos.
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }
    /**
     * Muestra el estado de aprobación de la orden.
     * @return El estado de la orden indicando si es falso o verdedero.
     */
    public boolean isaprove() {
        return aprove;
    }
    /**
     * Configura la variable aprove para indicar si la orden es aceptada o no.
     * @param aprove Variable que determina si es aporbada o no.
     */
    public void setaprove(boolean aprove) {
        this.aprove = aprove;
    }
    
}
