
package Logica_Cliente;

import Helpers.HelperlsValidacion;
import Logica_Negocio.Computador;
import Logica_Negocio.Persona;
import java.util.Scanner;


public class Main {

 
     
   
      public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String marca, serial, tamaño, color;
        String nombre, apellido, cedula, direccion;
        Computador objComputador;
        Persona objPersona;
        int rta, conteo;

        System.out.println("Digite la marca del computador");//MARCA
        marca = scan.nextLine();

        rta = HelperlsValidacion.ValidarVacio(marca);

        while (rta > 0) {
            System.out.println("Digite la marca del computador");
            marca = scan.nextLine();
            rta = HelperlsValidacion.ValidarVacio(marca);
        }

        conteo = HelperlsValidacion.ValidarTodo(marca);

        while (conteo != 0) {
            System.out.println("Digite la marca de la computador");
            marca = scan.nextLine();
            conteo = HelperlsValidacion.ValidarTodo(marca);

        }

        System.out.println("Digite el serial del computador");//SERIAL
        serial = scan.nextLine();

        rta = HelperlsValidacion.ValidarTodoSerial(serial);

        while (rta > 0) {
            System.out.println("Digite el serial del computador");
            serial = scan.nextLine();
            rta = HelperlsValidacion.ValidarTodoSerial(serial);
        }

        conteo = HelperlsValidacion.ValidarTodoSerial(serial);

        while (conteo != 0) {
            System.out.println("Digite el serial de la computador");
            serial = scan.nextLine();
            conteo = HelperlsValidacion.ValidarTodoSerial(serial);

        }

        System.out.println("Digite el tamaño del computador");//TAMAÑO
        tamaño = scan.nextLine();

        rta = HelperlsValidacion.ValidarVacio(tamaño);

        while (rta > 0) {
            System.out.println("Digite el tamaño del computador");
            tamaño = scan.nextLine();
            rta = HelperlsValidacion.ValidarVacio(tamaño);
        }

        conteo = HelperlsValidacion.ValidarTodo(tamaño);

        while (conteo != 0) {
            System.out.println("Digite el tamaño de la computador");
            tamaño = scan.nextLine();
            conteo = HelperlsValidacion.ValidarTodo(tamaño);

        }

        System.out.println("Digite el color del computador");//COLOR
        color = scan.nextLine();

        rta = HelperlsValidacion.ValidarVacio(color);

        while (rta > 0) {
            System.out.println("Digite el color del computador");
            color = scan.nextLine();
            rta = HelperlsValidacion.ValidarVacio(color);
        }

        conteo = HelperlsValidacion.ValidarTodo(color);

        while (conteo != 0) {
            System.out.println("Digite el color de la computador");
            color = scan.nextLine();
            conteo = HelperlsValidacion.ValidarTodo(color);

        }

        objComputador = new Computador(marca, serial, tamaño, color);

        System.out.println("Digite el nombre de la persona");//NOMBRE
        nombre = scan.nextLine();

        rta = HelperlsValidacion.ValidarVacio(nombre);

        while (rta > 0) {
            System.out.println("Digite el nombre de la persona");
            nombre = scan.nextLine();
            rta = HelperlsValidacion.ValidarVacio(nombre);
        }

        conteo = HelperlsValidacion.ValidarTodo(nombre);

        while (conteo != 0) {
            System.out.println("Digite el nombre de la persona");
            nombre = scan.nextLine();
            conteo = HelperlsValidacion.ValidarTodo(nombre);

        }

        System.out.println("Digite el apellido de la persona");//APELLIDO
        apellido = scan.nextLine();

        rta = HelperlsValidacion.ValidarVacio(apellido);

        while (rta > 0) {
            System.out.println("Digite el nombre de la persona");
            apellido = scan.nextLine();
            rta = HelperlsValidacion.ValidarVacio(apellido);
        }

        conteo = HelperlsValidacion.ValidarTodo(apellido);

        while (conteo != 0) {
            System.out.println("Digite el nombre de la persona");
            apellido = scan.nextLine();
            conteo = HelperlsValidacion.ValidarTodo(apellido);

        }

        System.out.println("Digite la cedula de la persona");//CEDULA
        cedula = scan.nextLine();
        rta = HelperlsValidacion.ValidarTodoLetra(cedula);

        while (rta > 0) {
            System.out.println("Digite la cedula de la persona");
            cedula = scan.nextLine();
            rta = HelperlsValidacion.ValidarTodoLetra(cedula);
        }

        conteo = HelperlsValidacion.ValidarTodoLetra(cedula);

        while (conteo != 0) {
            System.out.println("Digite la cedula de la persona");
            cedula = scan.nextLine();
            conteo = HelperlsValidacion.ValidarTodoLetra(cedula);

        }

        System.out.println("Digite la direccion de la persona");//DIRECCION
        direccion = scan.nextLine();

        rta = HelperlsValidacion.ValidarTodo(direccion);

        while (rta > 0) {
            System.out.println("Digite la direccion de la persona");
            direccion = scan.nextLine();
            rta = HelperlsValidacion.ValidarTodoDireccion(direccion);
        }

        conteo = HelperlsValidacion.ValidarTodoDireccion(direccion);

        while (conteo != 0) {
            System.out.println("Digite la direccion de la persona");
            direccion = scan.nextLine();
            conteo = HelperlsValidacion.ValidarTodoDireccion(direccion);

        }

        objPersona = new Persona(nombre, apellido, cedula, direccion, objComputador); //eestoy asociando

        Helpers.HelperImpresion.ImprimirPersona(objPersona);

    }
}