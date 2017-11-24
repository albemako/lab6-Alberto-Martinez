/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6.alberto.martinez;

import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;


public class Universo {
    public String nombre;
    
    public ArrayList<Seresvivos>datos = new ArrayList();
    private File archivo=null;

    public Universo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
    
    public Universo(String path, String nombre){
        archivo=new File(path);
        this.nombre=nombre;
    }

    public ArrayList<Seresvivos> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<Seresvivos> datos) {
        this.datos = datos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    
    //extra mutador
    public void setUniverso(Seresvivos p){
        this.datos.add(p);
    }
    
    //metodos de administracion
    public void escribirArchivo()throws IOException{
        FileWriter fw=null;
        BufferedWriter bw=null;
        try {
            fw=new FileWriter(archivo,false);
            bw=new BufferedWriter(fw);
            for (Seresvivos t : datos) {
                bw.write(t.getRaza()+";");
                bw.write(t.getKi()+";");
                bw.write(t.getMax()+";");
                bw.write(t.getPlaneta()+";");
            }
            bw.flush();
        } catch (Exception e) {
        }
        finally{
            bw.close();
            fw.close();
        }
    }
    
    //cargar archivo
    public void cargarArchivo(){
        if(archivo.exists()){
            Scanner sc=null;
            datos=new ArrayList();
            try {
                sc=new Scanner(archivo);
                sc.useDelimiter(";");
                while(sc.hasNext()){
                    datos.add(new Seresvivos(sc.next(),Integer.parseInt(sc.next()),Integer.parseInt(sc.next()),sc.next()));
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
            finally{
                sc.close();
            }
        }//fin if exists
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
