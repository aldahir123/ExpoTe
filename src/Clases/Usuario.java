package Clases;
//son empleados y administradores
public class Usuario extends Persona{
    private String fecha_nac,tipo, usuario,contrasena;

    public Usuario(int codigo, String nombre, String apellidos, String sexo, String num_doc, 
            String fecha_nac,String correo, String telefono, String direccion, String tipo, 
            String usuario, String contrasena) {
        super(codigo, nombre, apellidos, sexo, num_doc, correo, telefono, direccion);
        this.fecha_nac = fecha_nac;
        this.tipo = tipo;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    

}
