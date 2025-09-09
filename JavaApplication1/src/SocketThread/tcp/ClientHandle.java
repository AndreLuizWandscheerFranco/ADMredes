/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SocketThread.tcp;

import java.net.Socket;
import java.util.HashSet;

/**
 *
 * @author aluno
 */
public class ClientHandle extends Thread{
    private Socket client = null;
    private HashSet<Socket> clients = null;
        
    public ClientHandle(Socket client, HashSet<Socket>clients){
        this.client = client;
        this.clients = clients;
    }
    
    public void run(){
        
    }
}
