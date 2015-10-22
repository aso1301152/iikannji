package com.example.iikanji;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class RoomHensyu extends Activity {


	private String str[] = {"項目1","項目2","項目3","項目4","項目5","項目6","項目7","項目8","項目9","項目10"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_room_hensyu);				//エラーが出る行＿田上

		ListView listView = (ListView)findViewById(R.id.listView);
		MyListAdapter adapter = new MyListAdapter(this,R.layout.row,str);
		listView.setAdapter(adapter);
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.room_hensyu, menu);
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
