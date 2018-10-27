package com.example.user.androidcomponent.reciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.user.androidcomponent.P028SendBroadcast;

public class P028GetBroadcastReciever extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        Bundle bundle= intent.getExtras();
        String message= bundle.getString(P028SendBroadcast.BROADCAST_KEY);

        Toast.makeText(context, "Broadcast Reciever "+message, Toast.LENGTH_SHORT).show();

    }

}
