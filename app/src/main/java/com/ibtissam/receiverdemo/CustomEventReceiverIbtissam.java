package com.ibtissam.receiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class CustomEventReceiverIbtissam extends BroadcastReceiver {
    @Override
    public void onReceive(Context contextIbtissam, Intent intentIbtissam) {
        if ("com.ibtissam.receiverdemo.CUSTOM_EVENT_IBTISSAM".equals(intentIbtissam.getAction())) {
            String messageIbtissam = intentIbtissam.getStringExtra("message_ibtissam");
            Toast.makeText(contextIbtissam, " Custom reçu par Ibtissam : " + messageIbtissam, Toast.LENGTH_LONG).show();
        }
    }
}
