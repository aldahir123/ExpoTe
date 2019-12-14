
package daoClases;

import Clases.Venta;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class daoVenta {
    private ArrayList<Venta> ven;
    private String Archivo;
    
    public daoVenta(String Archivo){
        ven=new ArrayList<Venta>();
        this.Archivo=Archivo;
        cargar(); //Nunca te olvides de esta madre cuando uses archivos!!
    }
    
    public void agregar(Venta a){
        ven.add(a);
    }
    public Venta obtener(int i){
        return ven.get(i);
    }
    public int tamaño(){
        return ven.size();
    }
    public void eliminar(Venta obj){
        ven.remove(obj);
    }
    public int getCorrelativo(){
        if(tamaño()==0){
            return 20500;
        }else{
            return obtener(tamaño() - 1).getCodigo()+1;
        }      
    }
    /*Implementar Archivos*/
   public void grabar(){
     try{  
         PrintWriter pw;
         String linea;
         pw = new PrintWriter(new FileWriter(Archivo));         
         for(int i=0;i<tamaño();i++){
             linea = (obtener(i).getCodigo()+ ";" + 
                     obtener(i).getFecha()+ ";" +
                     obtener(i).getCod_car()+ ";" +
                     obtener(i).getCod_vend()+ ";" +
                     obtener(i).getCod_cli()
                     );
             pw.println(linea); 
         }  
         pw.close();
      }
      catch(Exception e){
         System.out.println(e.getMessage());
      }      
    }
    public void cargar(){
        try{
            BufferedReader br;
            String linea = null;
            String[] array = null;
            
            br = new BufferedReader(new FileReader(Archivo));
            while((linea = br.readLine())!= null){
                array = linea.split(";");
                Venta a = new Venta(Integer.parseInt(array[0].trim()),
                    array[1].trim(),
                    array[2].trim(),
                    array[3].trim(),
                    array[4].trim());
                agregar(a);
            }
            br.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
