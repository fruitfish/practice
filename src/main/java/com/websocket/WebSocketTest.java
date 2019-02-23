package com.websocket;

import eleme.openapi.ws.sdk.Bootstrap;
import eleme.openapi.ws.sdk.config.BusinessHandle;
import eleme.openapi.ws.sdk.config.Config;
import eleme.openapi.ws.sdk.config.ElemeSdkLogger;
import eleme.openapi.ws.sdk.entity.Account;
import eleme.openapi.ws.sdk.exception.UnableConnectionException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GanShu on 2017/12/8 0008.
 */
public class WebSocketTest {

    public static void main(String[] args) {
        //QpYgf8cKVb#
        //Account account = new Account("Tab3kZjvNV", "5678d16f463c04fe1e77705c422794b95fe33f2d");
        Account account = new Account("rwAultvNnO", "5eb2889936cebc336587fffe82b4e4f9");


        List<Account> accounts = new ArrayList<>();
        accounts.add(account);
        Config config = new Config(accounts,
                new BusinessHandle() {
                    @Override
                    public boolean onMessage(String message) {
                        return true;
                    }
                },
                new ElemeSdkLogger() {
                    @Override
                    public void info(String message) {
                        System.out.println(message);
                    }

                    @Override
                    public void error(String message) {
                        System.out.println(message);
                    }
                }
        );
        try {
            Bootstrap.start(config);
        } catch (UnableConnectionException e) {
            e.printStackTrace();
        }
    }

}
