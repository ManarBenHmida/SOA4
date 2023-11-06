package org.example;
import proxy.CalculWS;
import proxy.CalculWSService;
public class ClientWS {
public static void main(String[] args) {
 CalculWS proxy = new CalculWSService().getCalculWSPort();
 System.out.println(proxy.somme(4,5));
    }
}
