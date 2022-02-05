/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller1.manejo_de_clases_y_objetos;
import java.time.LocalDate;
/**
 * Representa una factura como documento de una transacción.
 * 
 * @author Juan Pablo Gonzalez Marin
 */
public class Invoice {
    /**
    *Representa la varialbe que crea el número la factura de venta. 
    */
    private int numberInvoice;
    /**
    *Representa la razón social del cliente. 
    */
    public String client;
    /**
    *Representa la dirección del cliente. 
    */
    public String AddresClient;
    /**
    *Representa el telefono del cliente. 
    */
    public int phoneClient;
    /**
    *Representa el nombre del producto de la orden de compra. 
    */
    public String productName;
    /**
    *Representa la cantidad del producto en kilos por el que esta hecha la orden de compra. 
    */
    private int amount;
    /**
     * Variable que capta el valor del consto de compra del producto.
     */
    private int purchasecost;
    /**
     * Variable que muestra el costo bruto.
     */
    private float grossValue;
    /**
     * Variable que muestra el impuesto a pagar.
     */
    private float tax;
    /**
     * Variable que muestra el porcentaje de ganacia determinado por el negocio.
     */
    private float percentageProfit;
    /**
     * Variable que muestra el valor neto de la factura.
     */
    private float netWorth; 
    /**
     * Se instancia variable de objeto LocalDate para que capture la fecha actual
     */
    protected LocalDate salesDate = LocalDate.now();
    /**
     * Crea una instancia del objeto factura con la información enviada y el llamado al metodo CalculateValue;
     * @param client Nombre del cliente que realiza la compra.
     * @param AddresClient Dirección del cliente que realiza la compra
     * @param phoneClient Direccion del cliente que realiza la compra
     * @param productName Nombre del producto adquirido.
     * @param amount Cantidad del producto en kilos.
     * @param purchasecost Valor de un kilo de producto
     */
    public Invoice(String client, String AddresClient, int phoneClient, String productName, int amount, int purchasecost) {
        this.client = client;
        this.AddresClient = AddresClient;
        this.phoneClient = phoneClient;
        this.productName = productName;
        this.amount = amount;
        this.purchasecost = purchasecost;
        CalculateValue();
        this.numberInvoice=this.numberInvoice++;        
    }
    /**
     * Calcula el valor neto tomando la cantidad por el valor del kilo y posteriormente suma el factor de ganancia e impuestos.
     */
    private void CalculateValue(){
        this.grossValue= this.amount*this.purchasecost;
        this.netWorth=(this.grossValue*(this.percentageProfit/100))*(this.tax/100);                
    }
    /**
     * Muestra la dirección del cliente dueño de la factura.
     * @return Dirección del cliente.
     */
    public String getAddresClient() {
        return AddresClient;
    }
    /**
     * Configura una dirección apartir de los datos enviados
     * @param AddresClient Representa la variable de dirección del cliente.
     */
    public void setAddresClient(String AddresClient) {
        this.AddresClient = AddresClient;
    }
    /**
    * Muestra el valor del impuesto configurado. 
    * @return Valor de impuesto
    */
    public float getTax() {
        return tax;
    }
    /**
     * Configura el valor del impuesto a partir de la información enviada.
     * @param tax Impuesto.
     */
    public void setTax(float tax) {
        this.tax = tax;
        CalculateValue();
    }
    /**
     * Permite ver el porcentaje de ganacia configurado por el negocio.
     * @return Valor de porcentaje de ganancia.
     */
    public float getPercentageProfit() {
        return percentageProfit;
    }
    /**
     * Configura el valor del porcentaje de ganacia configurado por el negocio.
     * @param percentageProfit Porcentaje de ganancia.
     */
    public void setPercentageProfit(float percentageProfit) {
        this.percentageProfit = percentageProfit;
        CalculateValue();
    }    
}
