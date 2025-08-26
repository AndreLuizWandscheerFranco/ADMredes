/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mySocket.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 *
 * @author aluno
 */
public class SocketServidor {
    public static void main(String[] args) {
        try{
            DatagramSocket servidor = new DatagramSocket(1026);
            
            System.out.println("O servidor foi inicializado na porta:"+servidor.getLocalPort());
                            
            byte[] mensagem = new byte[256];
            
            DatagramPacket pacote = new DatagramPacket(mensagem,mensagem.length);
            
             servidor.receive(pacote);
             
             System.out.println(new String(pacote.getData()).trim());
             
             servidor.close();
        }catch(Exception e){
            System.out.println("Ocorreu erro:"+e.getMessage());
        }
    }
}
