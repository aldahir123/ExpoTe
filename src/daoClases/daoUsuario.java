package daoClases;
import Clases.Usuario;
import java.io.*;
import java.util.ArrayList;

public class daoUsuario {
    
    public static int codusu;
    public static String nomusu;
    public static String apeusu;
    public static String tipousu;
    public static String telfusu;
    private ArrayList<Usuario> usu;
    private String Archivo;
    
    public daoUsuario(String Archivo){
        usu=new ArrayList<Usuario>();
        this.Archivo=Archivo;
        cargar(); //Nunca te olvides de esta madre cuando uses archivos!!
    }
    
    public void agregar(Usuario a){
        usu.add(a);
    }
    public Usuario obtener(int i){
        return usu.get(i);
    }
    public int tamaño(){
        return usu.size();
    }
    public void eliminar(Usuario obj){
        usu.remove(obj);
    }
    public Usuario buscarLogin(String usua,String con){
        for(int i=0;i<tamaño();i++){
            if(usu.get(i).getUsuario().equalsIgnoreCase(usua)&&usu.get(i).getContrasena().equalsIgnoreCase(con)){
                codusu=obtener(i).getCodigo();
                nomusu=obtener(i).getNombre();
                apeusu=obtener(i).getApellidos();
                tipousu=obtener(i).getTipo();
                telfusu =obtener(i).getTelefono();
                return usu.get(i);
            }
        }
        return null;
    }
    public Usuario buscarCod(int cod){
        for(int i=0;i<tamaño();i++){
            if(String.valueOf(usu.get(i).getCodigo()).equalsIgnoreCase(String.valueOf(cod)))
                return usu.get(i);
        }
        return null;
    }
    public int getCorrelativo(){
        if(tamaño()==0){
            return 1;
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
                        obtener(i).getNum_doc()+ ";" +
                        obtener(i).getFecha_nac()+ ";" +
                        obtener(i).getCorreo()+ ";" +
                        obtener(i).getTelefono()+ ";" +
                        obtener(i).getDireccion()+ ";" +
                        obtener(i).getTipo()+ ";" +
                        obtener(i).getUsuario()+ ";" +
                        obtener(i).getContrasena()
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
                Usuario a = new Usuario(Integer.parseInt(array[0].trim()),
                    array[1].trim(),
                    array[2].trim(),
                    array[3].trim(),
                    array[4].trim(),
                    array[5].trim(),
                    array[6].trim(),
                    array[7].trim(),
                    array[8].trim(),
                    array[9].trim(),
                    array[10].trim(),
                    array[11].trim());
                agregar(a);
            }
            br.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
