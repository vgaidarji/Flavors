package com.yopeso.flavors;

import java.util.ArrayList;

/**
 * Created by vgaidarji on 7/21/16.
 */
public interface ApiCallback {
    void onSuccess(ArrayList<Job> jobs);
    void onFailure(Exception e);
}
