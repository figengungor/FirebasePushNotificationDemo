package com.figengungor.firebasepushnotificationdemo;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by figengungor on 1/6/2018.
 */

public class InstanceIdService extends FirebaseInstanceIdService {

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
        String token = FirebaseInstanceId.getInstance().getToken();

        //sends this token to the server
        //sendToServer(token);
    }

    private void sendToServer(String token) {}
}
