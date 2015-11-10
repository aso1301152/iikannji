package com.example.iikanji;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Login extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);

		//ログインボタンでＴＯＰへ
				ImageView logpict = (ImageView)findViewById(R.id.imageView2);
						logpict.setOnClickListener(new View.OnClickListener() {
							public void onClick(View v) {
								Intent loginte = new Intent(Login.this,Top.class);
								startActivity(loginte);
							}
						});

		//IDがない場合ユーザ設定（名前の設定）へ
				ImageView yuzapict = (ImageView)findViewById(R.id.imageView2);
						yuzapict.setOnClickListener(new View.OnClickListener() {
							public void onClick(View v) {
						Intent yuzainte = new Intent(Login.this,NameSetting.class);
								startActivity(yuzainte);
							}
						});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
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
