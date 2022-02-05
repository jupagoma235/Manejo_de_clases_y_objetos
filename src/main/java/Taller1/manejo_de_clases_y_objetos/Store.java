/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller1.manejo_de_clases_y_objetos;

/**
 * Representa el sitio fisico en donde se desarrolla el negocio. 
 * 
 * @author Juan Pablo Gonzalez Marin
 */
public class Store {
    /**
     * Variable que guarda el nombre de la tienda.
     */
    public String nameStore;
    /**
     * Variable que guarda la ciudad en donde se encuentra la tienda.
     */
    public String cityStore;
    /**
     * Variable que guarda la dirección de la tienda.
     */
    public String addresStore;
    /**
     * Variable que guarda el telefono de la tienda-
     */
    public int phoneStore;
    /**
     * Crea una instancia del objeto tienda con la información enviada.
     * @param nameStore Nombre de la tienda.
     * @param cityStore Ciudad de la tienda.
     * @param addresStore Dirección de la tienda.
     * @param phoneStore Teléfono de la tienda.
     */
    public Store(String nameStore, String cityStore, String addresStore, int phoneStore) {
        this.nameStore = nameStore;
        this.cityStore = cityStore;
        this.addresStore = addresStore;
        this.phoneStore = phoneStore;
    }
    /**
     * Muestra la dirección de la tienda.
     * @return Dirección.
     */
    public String getAddresStore() {
        return addresStore;
    }
    /**
     * Configura el valor de la variable dirección de la tienda.
     * @param addresStore Dirección.
     */
    public void setAddresStore(String addresStore) {
        this.addresStore = addresStore;
    }
    /**
     * Permite visualizar el número de la tienda.
     * @return Teléfono.
     */
    public int getPhoneStore() {
        return phoneStore;
    }
    /**
     * Configura el valor de la variable teléfono de la tienda.
     * @param phoneStore Teléfono.
     */
    public void setPhoneStore(int phoneStore) {
        this.phoneStore = phoneStore;
    }
    
}
