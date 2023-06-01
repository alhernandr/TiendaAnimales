
 /**
  *
  * @author Alvaro Hernandez
  */
public class Usuarios {
    private String NombreCompleto;
    private String mail;
    private String Direccion;
    private String DNI;

     /**
      *
      * @param nombreCompleto
      * @param mail
      * @param Direccion
      * @param DNI
      */

    public Usuarios(String nombreCompleto, String mail, String Direccion, String DNI){
        this.NombreCompleto = nombreCompleto;
        this.mail = mail;
        this.Direccion = Direccion;
        this.DNI = DNI;
    }

     /**
      *
      * @param id
      *  crea el pedido con los articulos selecciones
      */

    public void CrearPedido(String id){

    }

     /**
      *
      * @param id
      * elimina el pedido creado
      */

    public void EliminarPedido(String id){

    }

     /**
      *
      * return void elimina la cuenta
      */
    public void EliminarCuenta(){
        this.NombreCompleto = null;
        this.mail = null;
        this.DNI = null;
        this.Direccion = null;
    }

     /**
      *
      * @return String genera todos los datos
      */
    public String toString() {
        return "Socio" + '\n' +
                "NombreCompleto= " + NombreCompleto + '\n' +
                "mail='" + mail + '\n' +
                "Direccion='" + Direccion + '\n' +
                "DNI='" + DNI;
    }
}
