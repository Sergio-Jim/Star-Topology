/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package star.topology;

/**
 *
 * @author Jimmy Sergio Damiao
 */
public class ServerNode {
   
    
    //Member variables.
    String IPAddress;
    String MACAddress;
    ClientNode Interface1, Interface2, Interface3, Interface4,Interface5,Interface6;
    //Defualt constructor.
    public ServerNode(){
        this.IPAddress = "";
        this.MACAddress = "";
        this.Interface1 = null;
        this.Interface2 = null;
        this.Interface3 = null;
        this.Interface4 = null;
        this.Interface5 = null;
        this.Interface6 = null;
    }
    //To return the interface the client node is connected on to the server.
    public String Interface(String side){
        String Interface = "";
        
        if(side.equalsIgnoreCase("Interface1")){
       
                Interface = "Interface1";
          }else if(side.equalsIgnoreCase("Interface2")){
               Interface = "Interface2";
          }
        else if(side.equalsIgnoreCase("Interface3")){
               Interface = "Interface3";
          }
        else if(side.equalsIgnoreCase("Interface4")){
               Interface = "Interface4";
          }
        else if(side.equalsIgnoreCase("Interface5")){
               Interface = "Interface5";
          }
        else if(side.equalsIgnoreCase("Interface6")){
               Interface = "Interface6";
          }
        else{
            
        }
            
        
        return Interface;
    }

    //ServerNode parameterised constructor.
    public ServerNode(String IPaddress, String MACaddress, ClientNode Interface1, ClientNode Interface2, ClientNode Interface3, ClientNode Interface4, ClientNode Interface5, ClientNode Interface6) {
        this.IPAddress = IPaddress;
        this.MACAddress = MACaddress;
        this.Interface1 = Interface1;
        this.Interface2 = Interface2;
        this.Interface3 = Interface3;
        this.Interface4 = Interface4;
        this.Interface5 = Interface5;
        this.Interface6 = Interface6;
    }
    
}
