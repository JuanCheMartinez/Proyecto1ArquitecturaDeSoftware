/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services.csv;

import domain.Resultado;
import domain.FilaDatos;
import java.util.List;

/**
 *
 * @author SAMUEL
 */
public interface ILectorCSV {
    
    Resultado<List<FilaDatos>> leer(String ruta);
    
}
