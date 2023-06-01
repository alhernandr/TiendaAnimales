public class main {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        Usuarios s1 = new Usuarios("Alvaro Hernandez Rodriguez","alvaro@gmail.com","Carretera a la atalaya","44888556G");

        System.out.println(s1.toString());
        s1.EliminarCuenta();
        System.out.println(s1.toString());

    }

}
