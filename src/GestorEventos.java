import java.io.*;
import java.util.ArrayList;

public class GestorEventos {
    private ArrayList<Usuario> listado_usuarios;
    GestorEventos(){
        this.listado_usuarios=new ArrayList<>();
        try {
            info_inicial();
        }catch (IOException ex){
            System.out.println("Problema en la comunicación el fichero");
        }
    }
    public void info_inicial() throws IOException{
        //GENERAR INFORMACIÓN
        //Crear 4 asistentes y 2 administradores, guardarlos en el fichero.
        FileOutputStream fos=null;
        ObjectOutputStream oos=null;
        FileInputStream fis=null;
        ObjectInputStream ois=null;
        listado_usuarios.add(new Asistente("Lolo","Pepo","pepe@gmail.com","12345","699838377",null,"12345678Z"));
        listado_usuarios.add(new Asistente("Pepa","Pepo","pepa@gmail.com","12345","699150111",null,"48728296J"));
        listado_usuarios.add(new Administrador("Lola","Pepo","lola@gmail.com","12345","699150111",null,2));

        /*try {
             fos=new FileOutputStream("usuarios.dat");
             oos=new ObjectOutputStream(fos);
             for (Usuario u: listado_usuarios){
                 oos.writeObject(u);
             }


        }catch (FileNotFoundException ex){
            ex.printStackTrace();

        }finally {
            fos.close();
            oos.flush();
            oos.close();
        }*/

        try {
            fis=new FileInputStream("usuarios.dat");
            ois=new ObjectInputStream(fis);
            while (true){
                Usuario u=(Usuario) ois.readObject();
                listado_usuarios.add(u);
                if (u instanceof Asistente) System.out.println("Asistente");
                else System.out.println("Administrador");
            }


        }catch (EOFException eof){
            System.out.println("Fichero leído");

        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        }catch (ClassNotFoundException cnf){
            cnf.printStackTrace();
        }
        finally {
            fis.close();
            ois.close();
        }
    }
}
