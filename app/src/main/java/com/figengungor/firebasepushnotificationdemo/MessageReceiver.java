package com.figengungor.firebasepushnotificationdemo;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by figengungor on 1/6/2018.
 */

public class MessageReceiver extends FirebaseMessagingService {

    public MessageReceiver() {
        super();
    }

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);

      /*final String title = remoteMessage.getData().get("title");
        final String message = remoteMessage.getData().get("body");*/

        String title = remoteMessage.getNotification().getTitle();
        String message = remoteMessage.getNotification().getBody();

        NotificationUtils.notifyUser(this, title, message);
    }


}
