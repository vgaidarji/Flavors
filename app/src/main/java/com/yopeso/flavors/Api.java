package com.yopeso.flavors;

/**
 * Created by vgaidarji on 7/21/16.
 */
public abstract class Api {

    ApiCallback callback;

    public Api(ApiCallback callback) {
        this.callback = callback;
    }

    /**
     * Requests list of jobs from API (asynchronously).
     */
    public abstract void requestAllJobs();
}
