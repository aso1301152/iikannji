package com.example.iikanji;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		//ルーム作成おしたらログインへ
		ImageView makepict = (ImageView)findViewById(R.id.imageView2);
				makepict.setOnClickListener(new View.OnClickListener() {
					public void onClick(View v) {
						Intent makeinte = new Intent(MainActivity.this,Login.class);
						startActivity(makeinte);
					}
				});

		//ルーム検索おしたらログインへ
		ImageView seachpict = (ImageView)findViewById(R.id.imageView3);
				seachpict.setOnClickListener(new View.OnClickListener() {
					public void onClick(View v) {
						Intent seachinte = new Intent(MainActivity.this,Login.class);
						startActivity(seachinte);
					}
				});

		//参加状況押したらログインへ
		ImageView jokyopict = (ImageView)findViewById(R.id.imageView4);
				jokyopict.setOnClickListener(new View.OnClickListener() {
					public void onClick(View v) {
						Intent jokyoint = new Intent(MainActivity.this,Login.class);
						startActivity(jokyoint);
					}
				});

		//割勘機能へ
		ImageView waripict = (ImageView)findViewById(R.id.imageView5);
				waripict.setOnClickListener(new View.OnClickListener() {
					public void onClick(View v) {
						Intent wariinte = new Intent(MainActivity.this,Warikan.class);
						startActivity(wariinte);
					}
				});

		//ユーザー設定へ
		ImageView namepict = (ImageView)findViewById(R.id.imageView6);
				namepict.setOnClickListener(new View.OnClickListener() {
					public void onClick(View v) {
						Intent nameinte = new Intent(MainActivity.this,NameSetting.class);
						startActivity(nameinte);
					}
				});

		//ログインへ
		ImageView logpict = (ImageView)findViewById(R.id.imageView7);
				logpict.setOnClickListener(new View.OnClickListener() {
					public void onClick(View v) {
						Intent loginte = new Intent(MainActivity.this,Login.class);
						startActivity(loginte);
					}
				});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
