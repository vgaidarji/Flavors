package com.yopeso.flavors;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // NetworkManager implementation depends on current flavor
        Api manager = new NetworkManager(new ApiCallback() {
            @Override
            public void onSuccess(ArrayList<Job> jobs) {
                // show list of jobs
            }

            @Override
            public void onFailure(Exception e) {
                // show error
            }
        });

        manager.requestAllJobs();
    }
}
