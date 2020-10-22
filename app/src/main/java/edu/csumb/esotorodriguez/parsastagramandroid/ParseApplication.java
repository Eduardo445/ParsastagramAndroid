package edu.csumb.esotorodriguez.parsastagramandroid;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("TssMs2zGlQzhUy4M5xIs1WfKyG5K2HvIbhCmkXHj")
                .clientKey("cMIiCHbCNHEeuRwMWZE49djPzD0CAaucZm9jV79f")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
