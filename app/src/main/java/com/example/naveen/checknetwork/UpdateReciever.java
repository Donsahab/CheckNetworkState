package com.example.naveen.checknetwork;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

public class UpdateReciever extends android.content.BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        ConnectivityManager cm =
                (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        if (netInfo != null && netInfo.isConnectedOrConnecting()) {
            Toast.makeText(context, "Network Available Now", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(context, "Network Error", Toast.LENGTH_SHORT).show();
        }
    }
}
