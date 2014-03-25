package com.stalker;

import android.app.IntentService;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.location.Location;

import com.google.android.gms.location.LocationClient;

public class LocationService extends IntentService {

	public LocationService() {
		super("Fused Location Service");
	}
	
	public LocationService(String name) {
		super("Fused Location Service");
	}

	@Override
	protected void onHandleIntent(Intent intent) {
		Location location = intent.getParcelableExtra(LocationClient.KEY_LOCATION_CHANGED);
		if(location != null) {
			//TODO Do the stuff you want to do when the location changes..
			
			//Sample Notification
			Notification notification = new Notification();
			NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
			notificationManager.notify("Location Changed..", 1, notification);
		}
	}
}