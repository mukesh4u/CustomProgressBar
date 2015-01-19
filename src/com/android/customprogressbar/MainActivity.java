package com.android.customprogressbar;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

	private CustomProgressBar seekbar;
	private ArrayList<ProgressItem> progressItemList;
	private ProgressItem mProgressItem;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		seekbar = ((CustomProgressBar) findViewById(R.id.seekBar0));
		seekbar.getThumb().mutate().setAlpha(0);
		initDataToSeekbar();
	}

	private void initDataToSeekbar() {
		progressItemList = new ArrayList<ProgressItem>();
		// red span
		mProgressItem = new ProgressItem();
		mProgressItem.progressItemPercentage = 20;
		Log.i("Mainactivity", mProgressItem.progressItemPercentage + "");
		mProgressItem.color = R.color.red;
		progressItemList.add(mProgressItem);
		// blue span
		mProgressItem = new ProgressItem();
		mProgressItem.progressItemPercentage = 25;
		mProgressItem.color = R.color.blue;
		progressItemList.add(mProgressItem);
		// green span
		mProgressItem = new ProgressItem();
		mProgressItem.progressItemPercentage = 35;
		mProgressItem.color = R.color.green;
		progressItemList.add(mProgressItem);
		
		//white span
		mProgressItem = new ProgressItem();
		mProgressItem.progressItemPercentage = 20;
		mProgressItem.color =  R.color.white;
		progressItemList.add(mProgressItem);

		
		seekbar.initData(progressItemList);
		seekbar.invalidate();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
