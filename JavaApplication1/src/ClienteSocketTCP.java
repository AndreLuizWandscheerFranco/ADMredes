
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class ClienteSocketTCP {
    public static void main(String[] args) {
        try{
            
            Socket cliente = new Socket("localhost",1025);
            
            ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
            Date dataServidor = (Date)entrada.readObject();
            System.out.println("Data do servidor: "+dataServidor.toString());
            entrada.close();
            
        }catch(Exception e){
            System.out.println("Ocorreu um erro: "+e.getMessage());
        }
    }
}
