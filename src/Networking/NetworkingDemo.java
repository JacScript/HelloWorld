package Networking;

import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.util.Arrays;

public class NetworkingDemo {
    public static void main(String[] args) throws UnknownHostException {
        String url = "www.kaimaembe.com";

        Inet4Address inet4Address = (Inet4Address) Inet4Address.getByName(url);

        System.out.println("Address : " + Arrays.toString(inet4Address.getAddress()));

        //getHostAddress() method
        System.out.println("Host Address :  " + inet4Address.getHostAddress());

//        //isAnyLocalAddress() method
        System.out.println("isAnyLocalAddress : " + inet4Address.isAnyLocalAddress());
//
//        //isLinkLocalAddress() method
        System.out.println("isLinkLocalAddress : " + inet4Address.isLinkLocalAddress());
//
//        //isLoopbackAddress() method
        System.out.println("isLoopBackAddress : " + inet4Address.isLoopbackAddress());
//
//        //isSiteLocalAddress() method
        System.out.println("isSiteLocalAddress : " +  inet4Address.isSiteLocalAddress());
//
//        //hashCode() method
        System.out.println("hashCode : " + inet4Address.hashCode());
    }
}
