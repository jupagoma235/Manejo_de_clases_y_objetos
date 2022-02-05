/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller1.manejo_de_clases_y_objetos;
import java.util.Date;
/**
 * Representa una cuenta bancaria como un producto financiero del negocio.
 * 
 * @author Juan Pablo Gonzalez Marin
 */
public class Bank_account {
    /**
     * Representa la variable que capta el número de cuenta bancaria.
     */
    private int accountNumber;
    /**
     * Representa la variable que capta el estado de la cuenta bancaria.
     */
    protected boolean activated;
    /**
     * Representa la variable que capta el saldo de la cuenta bancaria.
     */
    protected int saldo;
    /**
     * Representa la variable que capta el nombre del banco al que pertenece la cuenta bancaria.
     */
    public String bank;
    /**
     * Representa la variable que capta el nombre del titular de la cuenta bancaria.
     */
    protected String accountHolder;
   /**
   * Crea una instancia de cuenta de banco con los datos enviados.
   * @param accountNumber Trae el número de cuenta de banco.
   * @param saldo Trae el saldo con el que se crea el registro de la cuenta.
   * @param bank Trae el nombre del banco que expide la cuenta.
   * @param accountHolder Trae el nombre del titular de la cuenta.
   */
    public Bank_account(int accountNumber, int saldo, String bank, String accountHolder) {
        this.accountNumber = accountNumber;
        this.saldo = saldo;
        this.bank = bank;
        this.accountHolder = accountHolder;
    }
    /**
     * Permite sumar o restar al valor del saldo si la cuenta esta activada
     * @param typeofTransaction Trae el tipo de transacción a realizar.
     * @param value Trae el valor que se computara con el saldo segun sea el tipo de transacción.
     */
    public void transaction(String typeofTransaction, int value ){
        if(this.activated==true){
           if(typeofTransaction=="Consignación"){
              this.saldo=this.saldo+value;
           }else{
              this.saldo=this.saldo-value;
           }
        }else{
           System.out.println("La cuenta no se encuentra activa");
        }
    }
    /**
     * Muestra el estado de la cuenta bancaria.
     * @return El estado de la cuenta.
     */
    public boolean isActivated() {
        return activated;
    }
    /**
     * Permite configurar el estado de la variable determinado la activacion de la cuenta.
     * @param activated Estado de la cuenta.
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }
    
    
}
