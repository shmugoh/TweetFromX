package com.juanpis;

import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        twtAPI twitterAPI = new twtAPI();

        String postContent;

        System.out.print("Consumer Key: ");
        String ConsumerKey = sc.nextLine();

        System.out.print("Consumer Secret Key: ");
        String ConsumerSecretKey = sc.nextLine();


        System.out.print("Access Token: ");
        String AccessToken  = sc.nextLine();

        System.out.print("Access Secret Token: ");
        String AccessSecretToken = sc.nextLine();

        System.out.print("Tweet: ");
        postContent = sc.nextLine();

        while(postContent.length() > 200) {
            System.out.println("Your tweet passes the 200 character limit. Please try again.");

            System.out.print("Tweet: ");
            postContent = sc.nextLine();
        }

        twitterAPI.tweet(ConsumerKey, ConsumerSecretKey, AccessToken, AccessSecretToken, postContent);

        System.out.println("You can close the program now. If you want to tweet again, come back in" +
                " 16 minutes. But please, don't abuse the Twitter API!");


        Thread.sleep(960000);

    }
}
