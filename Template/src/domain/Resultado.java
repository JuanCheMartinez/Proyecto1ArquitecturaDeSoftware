/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

public class Resultado<T> {
    private boolean exito;
    private CodigoError codigo;
    private T dato;
    private String mensaje;

    // Constructor exitoso
    public static <T> Resultado<T> ok(T dato, String mensaje) {
        Resultado<T> resultado = new Resultado<>();
        resultado.exito = true;
        resultado.codigo = CodigoError.OK;
        resultado.dato = dato;
        resultado.mensaje = mensaje;
        return resultado;
    }

    // Constructor de error
    public static <T> Resultado<T> error(CodigoError codigo, String mensaje) {
        Resultado<T> resultado = new Resultado<>();
        resultado.exito = false;
        resultado.codigo = codigo;
        resultado.mensaje = mensaje;
        return resultado;
    }

    // Getters y setters
    public boolean isExito() {
        return exito;
    }

    public CodigoError getCodigo() {
        return codigo;
    }

    public T getDato() {
        return dato;
    }

    public String getMensaje() {
        return mensaje;
    }
}


