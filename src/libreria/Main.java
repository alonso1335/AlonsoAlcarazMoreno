/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libreria;
/**
 *
 * @author leonor
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LibreriaAlcarazMorenoAlonso2425 miLibreriaXXX;
        String mLibreriaAlcarazMorenoAlonso2425;
        int stock;
        int num;
        double dinero;
        double saldoActual;
        double ingreso;
        
        miLibreriaXXX = new LibreriaAlcarazMorenoAlonso2425("Don Quijote de la Mancha", 10, 45, 120);

        compraQuijoteAlcarazMorenoAlonso2425(miLibreriaXXX);
        
        saldoActual = miLibreriaXXX.obtenerSaldo();
        System.out.println("El saldo al comprar el libro es de "+ saldoActual );        
        mLibreriaAlcarazMorenoAlonso2425 = miLibreriaXXX.obtenerNombre();
        stock = miLibreriaXXX.obtenerStock();
        System.out.println("El libro "+mLibreriaAlcarazMorenoAlonso2425+" tiene un stock de "+stock+" unidades");
        
        añadeIngresoAlcarazMorenoAlonso2425(miLibreriaXXX, "LibroVendido");
    }

    private static void añadeIngresoAlcarazMorenoAlonso2425(LibreriaAlcarazMorenoAlonso2425 miLibreriaXXX, java.lang.String concepto) {
        double ingreso;
        double saldoActual;
        try
        {
            ingreso = 30.5;
            miLibreriaXXX.aumentarSaldo(ingreso);
            saldoActual = miLibreriaXXX.obtenerSaldo();
            System.out.println("Tu saldo actual después de ingresar es de "+saldoActual+"€");
        } catch (Exception e)
        {
            System.out.println("Fallo al obtener el saldo al ingresar");
        }
    }

    private static void compraQuijoteAlcarazMorenoAlonso2425(LibreriaAlcarazMorenoAlonso2425 miLibreriaXXX) {
        String mLibreriaAlcarazMorenoAlonso2425;
        int num;
        double dinero;
        double saldoActual;
        try
        {
            mLibreriaAlcarazMorenoAlonso2425 = "Don Quijote de la Mancha";
            num = 2;    //Número de ejemplares a comprar
            dinero = miLibreriaXXX.obtenerPrecio();
            saldoActual = miLibreriaXXX.obtenerSaldo();
            System.out.println("El libro "+mLibreriaAlcarazMorenoAlonso2425+" vale "+dinero+"€");
            System.out.println("Tu saldo actual es de "+saldoActual+"€");
            miLibreriaXXX.comprarLibro(num);
        } catch (Exception e)
        {
            System.out.println("Error en la compra del libro");
        }
    }
}
