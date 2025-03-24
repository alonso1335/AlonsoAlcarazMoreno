/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria;
/**
 * Clase libreria
 * @author Alonso
 */
public class LibreriaAlcarazMorenoAlonso2425 {

    /**
     * @return Nombre 
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom 
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return Precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio 
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo 
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    private String nom;
    private int cantidad;
    private double precio;
    private double saldo;
    //Constructor sin argumentos
    /**
     * Constructor sin parametros
     */
    public LibreriaAlcarazMorenoAlonso2425(){}
    //constructor con parámetros para inicializar todas las propiedades de la clase
    /**
     * Constructor con parametros para inicializar cada atributo
     */
    public LibreriaAlcarazMorenoAlonso2425(String nom, int cantidad, double precio, double saldo){
        this.nom = nom;                 //Nombre del libro
        this.cantidad = cantidad;       //Cantidad de ejemplares que hay en stock
        this.precio = precio;           //Precio unitario del libro
        this.saldo = saldo;             //Saldo en la cuenta de la librería
    }
    //Método que devuelve el nombre del libro
    /**
     * @return Nombre Método que devuelve el nombre del libro
     */
    public String obtenerNombre(){
        return getNom();
    }
    //Método que devuelve el precio del libro
    /**
     * 
     * @return Precio Método que devuelve el precio del libro
     */
    public double obtenerPrecio(){
        return getPrecio();
    }
    //Método que devuelve la cantidad de libros de ese ejemplar que quedan para vender
    /**
     * 
     * @return Cantidad Método que devuelve la cantidad de libros de ese ejemplar que quedan para vender
     */
    public int obtenerStock(){
        return getCantidad();
    }
    //Método para obtener el saldo en la cuenta
    /**
     * 
     * @return Saldo Método para obtener el saldo en la cuenta
     */
    public double obtenerSaldo(){
        return getSaldo();
    }
    //Método para aumentar el saldo
    /**
     * Metodo para aumentar el saldo
     * @param saldomas saldo que se desea aumentar
     * @throws Exception si el dinero que se quiere introducir (saldomas) es negativo
     */
    public void aumentarSaldo(double saldomas) throws Exception{
        if (saldomas<0)
            throw new Exception("No se puede sacar dinero de la cuenta de la librería");
        setSaldo(getSaldo() + saldomas);
    }
    //Método para comprar un ejemplar de un libro, actualiza el stock y el saldo
    /**
     * Metodo para comprar un ejemplar de un libro, actualiza el stock y el saldo
     * @param canti cantidad de ejemplares que se quieren comprar
     * @throws Exception si la cantidad de ejemplares deseada es mayor a el stock
     * o si la misma cantidad es negativa
     */
    public void comprarLibro(int canti) throws Exception{
        if (canti <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa de libros");
        setCantidad(getCantidad() - canti);
        if (getSaldo() <= getPrecio())
            throw new Exception ("No hay suficiente saldo para comprar");
        setSaldo(getSaldo() - getPrecio());
    }
}
