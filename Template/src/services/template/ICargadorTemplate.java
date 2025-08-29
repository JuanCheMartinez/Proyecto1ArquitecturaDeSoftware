/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services.template;
import domain.Resultado;
import domain.Template;
import java.util.Set;
/**
 *
 * @author SAMUEL
 */
public interface ICargadorTemplate {
    Resultado<Template> cargar(String ruta);
}
