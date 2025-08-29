/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;
import java.util.Collections;
import java.util.Map;
/**
 *
 * @author SAMUEL
 */
public class FilaDatos {
    private final Map<String,String> valores;

    public FilaDatos(Map<String, String> valores) {
        this.valores = valores;
    }

    public Map<String, String> getValores() {
        return Collections.unmodifiableMap(valores);
    }

    @Override
    public String toString() {
        return "FilaDatos{" + "valores=" + valores + '}';
    }
    
    
    
    
}
