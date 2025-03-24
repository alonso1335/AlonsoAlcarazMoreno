/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libreria;
/**
 *Clase main del programa, que define un objeto Libreria que realiza varios metodos 
 * @author Alonso
 */
public class Main {
    /**
     * Metodo Main
     * Este metodo es el principal metodo de ejecución del programa
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LibreriaAlcarazMorenoAlonso2425 miLibreriaAlcarazMorenoAlonso2425;
        String mLibreriaAlcarazMorenoAlonso2425;
        int stock;
        int num;
        double dinero;
        double saldoActual;
        double ingreso;
        
        miLibreriaAlcarazMorenoAlonso2425 = new LibreriaAlcarazMorenoAlonso2425("Don Quijote de la Mancha", 10, 45, 120);

        compraQuijoteAlcarazMorenoAlonso2425(miLibreriaAlcarazMorenoAlonso2425);
        
        saldoActual = miLibreriaAlcarazMorenoAlonso2425.obtenerSaldo();
        System.out.println("El saldo al comprar el libro es de "+ saldoActual );        
        mLibreriaAlcarazMorenoAlonso2425 = miLibreriaAlcarazMorenoAlonso2425.obtenerNombre();
        stock = miLibreriaAlcarazMorenoAlonso2425.obtenerStock();
        System.out.println("El libro "+mLibreriaAlcarazMorenoAlonso2425+" tiene un stock de "+stock+" unidades");
        
        añadeIngresoAlcarazMorenoAlonso2425(miLibreriaAlcarazMorenoAlonso2425, "LibroVendido");
    }
    /**
     * Método añadeIngresoAlcarazMorenoAlonso2425
     * En este metodo, se va a realizar la acción de añadir la cantidad del objeto saldo en su atributo
     * @param miLibreriaAlcarazMorenoAlonso2425 Objeto de libreria usado para añadir la cantidad del ingreso
     * @param concepto Concepto del ingreso
     * @throws Exception si la cantidad es negativa
     */
    private static void añadeIngresoAlcarazMorenoAlonso2425(LibreriaAlcarazMorenoAlonso2425 miLibreriaAlcarazMorenoAlonso2425, java.lang.String concepto) {
        double ingreso;
        double saldoActual;
        try
        {
            ingreso = 30.5;
            miLibreriaAlcarazMorenoAlonso2425.aumentarSaldo(ingreso);
            saldoActual = miLibreriaAlcarazMorenoAlonso2425.obtenerSaldo();
            System.out.println("Tu saldo actual después de ingresar es de "+saldoActual+"€");
        } catch (Exception e)
        {
            System.out.println("Fallo al obtener el saldo al ingresar");
        }
    }
    /**
     * Método compraQuijoteAlcarazMorenoAlonso2425
     * En este metodo, se va a realizar la acción de comprar dos unidades del libro "Don Quijote de la Mancha"
     * @param miLibreriaAlcarazMorenoAlonso2425  Objeto de libreria usado para pagar la cantidad de la compra 
     * @throws Exception si el saldo de la cuenta es menor a el necesario o si el stock del libro es inferior al en numero de ejemplares comprados
     */
    private static void compraQuijoteAlcarazMorenoAlonso2425(LibreriaAlcarazMorenoAlonso2425 miLibreriaAlcarazMorenoAlonso2425) {
        String mLibreriaAlcarazMorenoAlonso2425;
        int num;
        double dinero;
        double saldoActual;
        try
        {
            mLibreriaAlcarazMorenoAlonso2425 = "Don Quijote de la Mancha";
            num = 2;    //Número de ejemplares a comprar
            dinero = miLibreriaAlcarazMorenoAlonso2425.obtenerPrecio();
            saldoActual = miLibreriaAlcarazMorenoAlonso2425.obtenerSaldo();
            System.out.println("El libro "+mLibreriaAlcarazMorenoAlonso2425+" vale "+dinero+"€");
            System.out.println("Tu saldo actual es de "+saldoActual+"€");
            miLibreriaAlcarazMorenoAlonso2425.comprarLibro(num);
        } catch (Exception e)
        {
            System.out.println("Error en la compra del libro");
        }
    }
}
