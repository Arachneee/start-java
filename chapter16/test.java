package chapter16;

import java.util.*;
import java.util.stream.*;

public class test {
    public static void main(String[] args){
        String ip = "192.168.10.100";
        String subnet = "255.255.255.0";

        int[] ipArr = Stream.of(ip.split("\\.")).mapToInt(Integer::parseInt).toArray();
        //System.out.println(Arrays.toString(ipArr));

        int[] subnetArr = Stream.of(subnet.split("\\.")).mapToInt(Integer::parseInt).toArray();
        //System.out.println(Arrays.toString(subnetArr));

        StringBuffer sbip = new StringBuffer("네트워크 주소:");
        StringBuffer hostip = new StringBuffer("호스트 주소:");

        for(int i=0;i<ipArr.length;i++){
            sbip.append((ipArr[i] & subnetArr[i])+".");
            hostip.append((ipArr[i] & ~subnetArr[i])+".");
        }
        System.out.println(sbip);
        System.out.println(hostip);
    }
}
