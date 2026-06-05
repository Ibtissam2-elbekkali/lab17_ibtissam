package com.ibtissam.receiverdemo;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivityIbtissam extends AppCompatActivity {

    private AirplaneModeReceiverIbtissam airplaneReceiverIbtissam;
    private boolean isReceiverRegisteredIbtissam = false;
    private Button btnToggleAirplaneIbtissam, btnSendCustomIbtissam;
    private TextView tvStatusIbtissam;

    @Override
    protected void onCreate(Bundle savedInstanceStateIbtissam) {
        super.onCreate(savedInstanceStateIbtissam);
        setContentView(R.layout.activity_main_ibtissam);

        airplaneReceiverIbtissam = new AirplaneModeReceiverIbtissam();
        tvStatusIbtissam = findViewById(R.id.tvStatusIbtissam);
        btnToggleAirplaneIbtissam = findViewById(R.id.btnToggleAirplaneIbtissam);
        btnSendCustomIbtissam = findViewById(R.id.btnSendCustomIbtissam);

        btnToggleAirplaneIbtissam.setOnClickListener(v -> toggleAirplaneReceiverIbtissam());
        btnSendCustomIbtissam.setOnClickListener(v -> sendCustomBroadcastIbtissam());
    }

    private void toggleAirplaneReceiverIbtissam() {
        if (!isReceiverRegisteredIbtissam) {
            IntentFilter filterIbtissam = new IntentFilter();
            filterIbtissam.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED);
            
            registerReceiver(airplaneReceiverIbtissam, filterIbtissam);
            isReceiverRegisteredIbtissam = true;
            tvStatusIbtissam.setText("✨ Ibtissam: Receiver Mode Avion ACTIVÉ (dynamique) ✨");
            btnToggleAirplaneIbtissam.setText("Désactiver Receiver Avion Ibtissam");
            btnToggleAirplaneIbtissam.setBackgroundColor(getResources().getColor(R.color.colorAccentIbtissam, getTheme()));
        } else {
            unregisterReceiver(airplaneReceiverIbtissam);
            isReceiverRegisteredIbtissam = false;
            tvStatusIbtissam.setText("✨ Ibtissam: Receiver Mode Avion DÉSACTIVÉ ✨");
            btnToggleAirplaneIbtissam.setText("Activer Receiver Avion Ibtissam");
            btnToggleAirplaneIbtissam.setBackgroundColor(getResources().getColor(R.color.colorPrimaryIbtissam, getTheme()));
        }
    }

    private void sendCustomBroadcastIbtissam() {
        Intent intentIbtissam = new Intent("com.ibtissam.receiverdemo.CUSTOM_EVENT_IBTISSAM");
        intentIbtissam.putExtra("message_ibtissam", "Bonjour Ibtissam depuis le custom broadcast !");
        sendBroadcast(intentIbtissam); 
        
        Toast.makeText(this, "Custom Broadcast envoyé par Ibtissam !", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        if (isReceiverRegisteredIbtissam) {
            unregisterReceiver(airplaneReceiverIbtissam);
        }
        super.onDestroy();
    }
}
