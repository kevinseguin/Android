package com.dev.kevin.rssfeed;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;

public class RssFeedActivity extends Activity implements MyListFragment.OnItemSelectedListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rssfeed);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.rss_feed, menu);
		return true;
	}

	@Override
	public void onRssItemSelected(String link) {
		  DetailFragment fragment = (DetailFragment) getFragmentManager()
		            .findFragmentById(R.id.detailFragment);
		        if (fragment != null && fragment.isInLayout()) {
		          fragment.setText(link);
		        } else {
		        	Intent intent = new Intent (getApplicationContext(), DetailActivity.class);
		        	intent.putExtra(DetailActivity.EXTRA_URL, link);
		        	startActivity(intent);
		        	
		        }
		        
		  }
		    
		
	}

 
