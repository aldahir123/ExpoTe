
package Clases;

public class Cliente extends Persona{
    private String tipo_doc, edad;

    public Cliente(
            int codigo, 
            String nombre, 
            String apellidos, 
            String sexo, 
            String tipo_doc, 
            String num_doc, 
            String edad, 
            String correo, 
            String telefono, 
            String direccion) {
        super(codigo, nombre, apellidos, sexo, num_doc, correo, telefono, direccion);
        this.tipo_doc = tipo_doc;
        this.edad = edad;
    }

    public String getTipo_doc() {
        return tipo_doc;
    }

    public void setTipo_doc(String tipo_doc) {
        this.tipo_doc = tipo_doc;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    
  
}
