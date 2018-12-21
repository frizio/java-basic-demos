package app;

import java.lang.management.ManagementFactory;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
        System.out.println("Java version: " + System.getProperty("java.version"));
        System.out.println("");
        System.out.println("Java Virtual Machine specification version: " + System.getProperty("java.vm.specification.version"));
        System.out.println("Java Virtual Machine specification vendor: " + System.getProperty("java.vm.specification.vendor"));
        System.out.println("Java Virtual Machine specification name: " + System.getProperty("java.vm.specification.name"));
        System.out.println("");
        System.out.println("Java Virtual Machine implementation version: " + System.getProperty("java.vm.version"));
        System.out.println("Java Virtual Machine implementation vendor: " + System.getProperty("java.vm.vendor"));
        System.out.println("Java Virtual Machine implementation name: " + System.getProperty("java.vm.name"));
        System.out.println("");
        System.out.println("Java Runtime Environment specification version: " + System.getProperty("java.specification.version"));
        System.out.println("Java Runtime Environment specification vendor: " + System.getProperty("java.specification.vendor"));
        System.out.println("Java Runtime Environment specification name: " + System.getProperty("java.specification.name"));
        System.out.println("");
        System.out.println("JVM version from ManagementFactory " + ManagementFactory.getRuntimeMXBean().getVmVersion());
        System.out.println( "Name " + ManagementFactory.getRuntimeMXBean().getName() );
        System.out.println("");
        
        System.out.println("SYSTEM PROPERTIES");
        Map<String, String> map = ManagementFactory.getRuntimeMXBean().getSystemProperties();
        for ( Map.Entry<String, String> entry : map.entrySet() ) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


    }
}