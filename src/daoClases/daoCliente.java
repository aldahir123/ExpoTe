
package daoClases;

import Clases.Cliente;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class daoCliente {
    
    private ArrayList<Cliente> usu;
    private String Archivo;
    
    public daoCliente(String Archivo){
        usu=new ArrayList<Cliente>();
        this.Archivo=Archivo;
        cargar();
    }
    
    public void agregar(Cliente a){
        usu.add(a);
    }
    public Cliente obtener(int i){
        return usu.get(i);
    }
    public int tamaño(){
        return usu.size();
    }
    public void eliminar(Cliente obj){
        usu.remove(obj);
    }
    public Cliente buscarCod(int cod){
        for(int i=0;i<tamaño();i++){
            if(String.valueOf(usu.get(i).getCodigo()).equalsIgnoreCase(String.valueOf(cod))){
                return usu.get(i);
            }
        }
        return null;
    }
    public int getCorrelativo(){
        if(tamaño()==0){
            return 4000;
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
                        obtener(i).getNombre()+ ";" +
                        obtener(i).getApellidos()+ ";" +
                        obtener(i).getSexo()+ ";" + 
                        obtener(i).getTipo_doc()+ ";" + 
                        obtener(i).getNum_doc()+ ";" +
                        obtener(i).getEdad()+ ";" +
                        obtener(i).getCorreo()+ ";" +
                        obtener(i).getTelefono()+ ";" +
                        obtener(i).getDireccion()
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
                Cliente c = new Cliente(Integer.parseInt(array[0].trim()),
                    array[1].trim(),
                    array[2].trim(),
                    array[3].trim(),
                    array[4].trim(),
                    array[5].trim(),
                    array[6].trim(),
                    array[7].trim(),
                    array[8].trim(),
                    array[9].trim());
                agregar(c);
            }
            br.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
