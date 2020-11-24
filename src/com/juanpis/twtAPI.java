package com.juanpis;

import twitter4j.TwitterException;
import twitter4j.conf.ConfigurationBuilder;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.Status;

public class twtAPI {
    public Object tweet;
    public static boolean isTweetMaximum(int t) {
        if (t < 280) {
            return false;
        } else {
            return true;
        }
    }
    
    public static void tweet(String CS, String CSS, String AT, String AST, String post) { // why
        Main GUI = new Main();
        ConfigurationBuilder OATH = new ConfigurationBuilder();
        OATH.setDebugEnabled(true)
                .setOAuthConsumerKey(CS)
                .setOAuthConsumerSecret(CSS)
                .setOAuthAccessToken(AT)
                .setOAuthAccessTokenSecret(AST);
        TwitterFactory tf = new TwitterFactory(OATH.build());
        Twitter twt = tf.getInstance();

        try {
            Status status = twt.updateStatus(post);
            GUI.successSignal();
        } 
        catch (TwitterException name) {
            GUI.errorSignal();
        } }
}
