package app;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class App {

    private static final String DOMAIN_NAME = "www.frizio.cloud";

    public static void main(String[] args) throws Exception {
        //nameResolution();
        urlManipolation();
    }

    public static void nameResolution() {
        try {
            InetAddress address = InetAddress.getByName( DOMAIN_NAME );
                
            System.out.println( "CanonicalHostName: " + address.getCanonicalHostName() );
            System.out.println( "HostAddress: " + address.getHostAddress() );
            System.out.println( "HostName: " + address.getHostName() );
                
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    public static void urlManipolation() {
        try {
            URL url1 = new URL("http://" + DOMAIN_NAME);
            System.out.println( "Protocollo: " + url1.getProtocol() );
            System.out.println( "Host: " + url1.getHost() );
            System.out.println( "Porta: " + url1.getPort() ); //-1 indica porta non specificata
                
            URL url2 = new URL( url1, "networking" );
            System.out.println( "URL: " + url2 );
                
            URL url3 = new URL( "http", "www.javaboss.it", 80, "/networking" );
            System.out.println( "URL: " + url3 );
            System.out.println( "Porta: " + url3.getPort() );

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

}