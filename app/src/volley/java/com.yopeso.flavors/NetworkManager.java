package com.yopeso.flavors;

/**
 * Created by vgaidarji on 7/21/16.
 */
public class NetworkManager extends Api {
    public NetworkManager(ApiCallback callback) {
        super(callback);
    }

    @Override
    public void requestAllJobs() {
        // initialise Volley
        // prepare and send a request
        // on success - send to MainActivity list of jobs through callback
        // on failure - notify MainActivity accordingly
    }
}
