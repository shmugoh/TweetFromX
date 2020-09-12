package com.juanpis;

import twitter4j.TwitterException;
import twitter4j.conf.ConfigurationBuilder;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.Status;
import twitter4j.api.TweetsResources;
import twitter4j.auth.AccessToken;
import twitter4j.auth.RequestToken;

public class twtAPI {

    public Object tweet;

    private static boolean isTweeted;
    private static String tweetSuccessful = ("Tweet has been posted successfully.");
    private static String noConnectionError = ("No internet connection available, " +
            "please connect to the internet and try again.");

    public static String tweet(String CS, String CSS, String AT, String AST, String post) { // why

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
            return tweetSuccessful;
        } catch (TwitterException name) {
            return noConnectionError;
        } finally {
            return noConnectionError;
        }


        }


}
