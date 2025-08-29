/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.template;

import domain.CodigoError;
import domain.Resultado;
import domain.Template;
import java.io.IOException;
import java.io.*;
import java.nio.file.*;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author SAMUEL
 */
public class CargadorTemplate implements ICargadorTemplate{
    
    

    @Override
    public Resultado<Template> cargar(String ruta) {
        try{
            String contenido = new String(Files.readAllBytes(Paths.get(ruta)));
            
            Set<String> identificadores  = extraerIdentificadores(contenido);
            
            if(identificadores.isEmpty()){
                return Resultado.error(CodigoError.TEMPLATE_SIN_IDENTIFICADORES , "No hay identificadores validos");
            }
            Template template = new Template(contenido, identificadores);
            return Resultado.ok(template, "Template Cargado Correctamente");
            
        }catch(IOException e){
            return Resultado.error(CodigoError.TEMPLATE_INACCESIBLE, "No se pudo leer el template.");
        }
        
    }
    
    
    private Set<String> extraerIdentificadores(String contenido){
        Set<String> identificadores = new HashSet<>();
        int indice = 0;
        
        while(indice < contenido.length()){
             // Buscar el inicio del identificador
            int inicio = contenido.indexOf('<', indice);
            if(inicio == -1)break;
            
             // Buscar el cierre del identificador
            int fin = contenido.indexOf('>', inicio + 1);
            if (fin == -1) break;  // Si no encuentra el '>', rompe el ciclo
            
             // Extraer el identificador
            String id = contenido.substring(inicio + 1, fin).trim();
        
            if (!id.isEmpty() && !id.contains("<") && !id.contains(">")) {
                identificadores.add(id);
            }
            indice = fin + 1;
        
        }
        
        return identificadores;
    }
    
    
    
}
