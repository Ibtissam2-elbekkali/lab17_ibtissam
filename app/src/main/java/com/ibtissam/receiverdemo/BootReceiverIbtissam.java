package com.ibtissam.receiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BootReceiverIbtissam extends BroadcastReceiver {
    @Override
    public void onReceive(Context contextIbtissam, Intent intentIbtissam) {
        if (Intent.ACTION_BOOT_COMPLETED.equals(intentIbtissam.getAction())) {
            Toast.makeText(contextIbtissam, "✨ Ibtissam: Téléphone démarré - Receiver statique activé ! ✨", Toast.LENGTH_LONG).show();
        }
    }
}
