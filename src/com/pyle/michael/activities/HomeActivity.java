package com.pyle.michael.activities;

import com.pyle.michael.R;
import com.pyle.michael.contracts.ActivitiesContract.LaunchActivity;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;

public class HomeActivity extends ActionBarActivity implements OnClickListener{
	
	public static final String TAG = "HomeActivity";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home_screen_layout);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.home_screen, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onClick(View clickedView) {
		int id = clickedView.getId();
		
		Intent launchIntent = null;
		
		switch(id){
			case R.id.manage_notes:
				launchIntent = new Intent(this, NotesActivity.class);
				break;
			case R.id.manage_geo_btn:
//				launchIntent.setClass(this, ...);
				break;
			case R.id.manage_friends_btn:
//				launchIntent.setClass(this, ...);
				break;
			default:
				break;
		}
		
		if(launchIntent != null) {
			startActivity(launchIntent);
		}
		else { 
			Log.d(TAG, "intent is null. Unable to launch activity");
		}
	}
}
