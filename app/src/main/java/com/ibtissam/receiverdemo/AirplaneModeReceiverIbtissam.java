package com.ibtissam.receiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AirplaneModeReceiverIbtissam extends BroadcastReceiver {

    @Override
    public void onReceive(Context contextIbtissam, Intent intentIbtissam) {
        if (Intent.ACTION_AIRPLANE_MODE_CHANGED.equals(intentIbtissam.getAction())) {
            boolean isAirplaneOnIbtissam = intentIbtissam.getBooleanExtra("state", false);
            
            String messageIbtissam = isAirplaneOnIbtissam 
                ? "✨ Ibtissam: Mode Avion ACTIVÉ - Plus de connexion ! ✨" 
                : "✨ Ibtissam: Mode Avion DÉSACTIVÉ - Connexions rétablies ✨";
            
            Toast.makeText(contextIbtissam, messageIbtissam, Toast.LENGTH_LONG).show();
        }
    }
}
