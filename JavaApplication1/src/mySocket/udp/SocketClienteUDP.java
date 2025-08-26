/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mySocket.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author aluno
 */
public class SocketClienteUDP {
    public static void main(String[] args) {
        try{
           DatagramSocket cliente = new DatagramSocket ();
           
            System.out.println("Serviço socket UDP ativo");
           
           String mensagem = "Ola mundo";
           
           DatagramPacket segmento = new DatagramPacket(mensagem.getBytes(), mensagem.getBytes().length, InetAddress.getByName("localhoste"),1026);
           
            System.out.println("A mensagem foi enviada pela porta:"+cliente.getLocalPort());
           
           cliente.send(segmento);
           
           cliente.close();
           
        }catch(Exception e ){
            System.out.println("Ocorreu um erro"+e.getMessage());
        }
    }
  
}
