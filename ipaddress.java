import java.net.*;
public class ipaddress{
    public static void main(String[] args){
        try{
            InetAddress myip=InetAddress.getLocalHost();
            System.out.println("my ip address :"+myip.getHostAddress());

        }
        catch(UnknownHostException e){
            System.out.println(e.getMessage());
        }
    }
}