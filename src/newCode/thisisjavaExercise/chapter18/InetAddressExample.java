package src.newCode.thisisjavaExercise.chapter18;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
    public static void main(String[] args) {

        try {
            InetAddress local = InetAddress.getLocalHost();
            System.out.println("내 컴퓨텉 주소: " + local.getHostAddress());

            InetAddress[] iaArr = InetAddress.getAllByName("www.google.com");
            for (InetAddress remote : iaArr) {
                System.out.println("IP : " + remote.getHostAddress());
            }


        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }
}
