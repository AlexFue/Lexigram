package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;


public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("3xSlw6Njm2sPYGG0dBfHO1Wv1fJ5ybc4KFyuRzrW")
                .clientKey("Jrie33tCpufDpbdmcyISFXaJnqj5KcoaoGsL4ioe")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
