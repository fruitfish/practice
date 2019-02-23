package com.parsedomainname;

/**
 * Created by GanShu on 2017/1/7 0007.
 */
import java.net.InetAddress;
import java.net.UnknownHostException;
public class ParseDomainNameUtil {
    InetAddress myServer = null;
    InetAddress myIPaddress = null;
    String domainName = null;
    public ParseDomainNameUtil(String domainName) {
        this.domainName = domainName;
    }
    public InetAddress getServerIP() {
        try {
            myServer = InetAddress.getByName(domainName);
        } catch (UnknownHostException e) {
        }
        return (myServer);
    }
    // 取得LOCALHOST的IP地址
    public InetAddress getMyIP() {
        try {
            myIPaddress = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
        }
        return (myIPaddress);
    }
    public static void main(String[] args) {
        ParseDomainNameUtil pdn = new ParseDomainNameUtil("v2.openapi.ele.me");
        System.out.println("Your host IP is: " + pdn.getMyIP().getHostAddress());
        System.out.println("The Server IP is :" + pdn.getServerIP().getHostAddress());
    }
}