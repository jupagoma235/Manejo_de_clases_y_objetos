/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller1.manejo_de_clases_y_objetos;
import java.util.Date;

/**
 * Representa una persona que tiene un rol dentro del negocio.
 * 
 * @author Juan Pablo Gonzalez Marin
 */
public class Person {
    /**
     * Representa la variable que capta el nombre de la persona.
     */
    public String name;
    /**
     * Representa la variable que capta el primer apellido de la persona.
     */
    public String lastName1;
    /**
     * Representa la variable que capta el segundo apellido de la persona.
     */
    public String lastName2;
    /**
     * Representa la variable que capta la fecha de nacimiento de la persona.
     */
    public Date dateBirth;
    /**
     * Representa la variable que capta la estatura de la persona.
     */
    public Float heigth;
    /**
     * Representa la variable que identifica en el sistema a la persona.
     */
    private int id;
    /**
     * Representa la variable que capta el número de teléfono de la persona.
     */
    public int document;
    /**
     * Representa la variable que capta el número de teléfono de la persona.
     */
    public int phone;
    /**
     * Representa la variable que capta la dirección de la persona.
     */
    public String addres;
    /**
     * Representa la variable que capta la dirección de correo de la persona.
     */
    public String email;
    /**
     * Representa la variable que capta el sexo de la persona
     */
    protected char sex;
    /**
     * Representa la variable que capta el tipo de sangre de la persona
     */
    protected String bloodType;

    /**
     * Crea una instancia de la persona con los datos enviados.
     * @param name  Nombre de la persona.
     * @param lastName1 Primer apellido de la persona.
     * @param lastName2 Segundo apellido de la persona.
     * @param dateBirth Año de nacimiento de la persona.
     * @param heigth Altura de la persona.
     * @param document Documento de identidad de la persona
     * @param phone Teléfono de contacto de la persona.
     * @param addres Dirección de la persona.
     * @param email Dirección de correo de la persona.
     * @param sex Sexo de la persona.
     * @param bloodType Tipo de sangre de la persona.
     */
    public Person(String name, String lastName1, String lastName2, Date dateBirth, Float heigth, int document, int phone, String addres, String email, char sex, String bloodType) {
        this.name= name;
        this.lastName1=lastName1;
        this.lastName2=lastName2;
        this.dateBirth=dateBirth;
        this.heigth=heigth;
        this.document=document;
        this.phone=phone;
        this.addres=addres;
        this.email=email;
        this.sex=sex;
        this.bloodType=bloodType;
        id=id++;
    }
    /**
    * Llama el nombre de la persona desde la variable name.
    * @return El nombre de la persona.
    */
    public String getName() {
        return name;
    }
    /**
     * Guarda el valor del nombre de la persona en la variable name
     * @param name Trae el nombre de la persona que es guardado en la variable publica name.
     */
    public void setName(String name) {
        this.name = name;
    }
}
