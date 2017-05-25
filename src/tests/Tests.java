/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

/**
 *
 * @author Desarrollo234
 */
public class Tests {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Tests test = new Tests();
        MsgLog log = new MsgLog();
        String rutaBase = "C:\\Users\\Desarrollo234\\Desktop\\tuts\\";
     try(Stream<Path> paths = Files.walk(Paths.get(rutaBase))) {
    paths.forEach(filePath -> {  
        try {
            Atributos(filePath);
        } catch (IOException ex) {
            Logger.getLogger(Tests.class.getName()).log(Level.SEVERE, null, ex);
        }
          if (Files.isDirectory(filePath)) {
                try {
                log.write(filePath.toString() + "\r");
            } catch (IOException ex) {
                Logger.getLogger(Tests.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        if (Files.isRegularFile(filePath)) {            
          // System.out.println(filePath.getName(filePath.getNameCount() - 3));
            try {
                log.write("\t"+filePath.getFileName() + "\r");
            } catch (IOException ex) {
                Logger.getLogger(Tests.class.getName()).log(Level.SEVERE, null, ex);
            }
           //test.nuevoNombre(filePath.toString()," - ");
        }
    });
    
} 
    }
    
    
    
    private boolean nuevoNombre (String ruta,String delimitador){
       String[] ext = {};
       String extension = ".";
       String nuevoNombre = "";
       String[] rutas = ruta.split(delimitador);
        if (rutas.length > 1) {         
         ext = rutas[1].split("\\.");
         extension += ext[ext.length - 1] ; 
         nuevoNombre = rutas[0]+extension;
          
        }else{
         ext = rutas[0].split("\\.");
         extension += ext[ext.length - 1] ; 
         nuevoNombre = rutas[0];
         
        }
       
       File oldfile =new File(ruta);
       File newfile =new File(nuevoNombre);
        if(oldfile.renameTo(newfile)){
            System.out.println("Archivo renombrado");
            return true;
        }else{
            System.out.println("Error! no se pudo renombrar el archivo");
            return false;
        }
     
    }
    
    public static void Atributos(Path files) throws IOException{
        Path file = files;
BasicFileAttributes attr = Files.readAttributes(file, BasicFileAttributes.class);

System.out.println("creationTime: " + attr.creationTime());
System.out.println("lastAccessTime: " + attr.lastAccessTime());
System.out.println("lastModifiedTime: " + attr.lastModifiedTime());
    }
            
    
}