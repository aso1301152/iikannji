package com.example.iikanji;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

public class AllRoom extends Activity {

	// ListView用アダプタ
    SimpleAdapter mAdapter = null;
    // ListView に設定するデータ
    List<Map<String, String>> mList = null;

//Testのコードをここにいれます！！！

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_all_room);

		// ListView 用アダプタのリストを生成
        mList = new ArrayList<Map<String, String>>();

        // ListView 用アダプタを生成
        mAdapter = new SimpleAdapter(
                this,
                mList,
                android.R.layout.simple_list_item_2,
                new String [] {"title", "content"},
                new int[] {android.R.id.text1, android.R.id.text2}
                );

        // ListView にアダプターをセット
        ListView list = (ListView)findViewById(R.id.listView);
        list.setAdapter(mAdapter);

        // ListView のアイテム選択イベント
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(
                    AdapterView<?> parent, View view, int pos, long id) {
            }
            });


		// コンテキストメニューに ListView を登録
		registerForContextMenu(list);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.all_room, menu);
		return true;
	}

		// コンテキストメニュー作成処理
	@Override
	    public void onCreateContextMenu(ContextMenu menu, View view, ContextMenuInfo info)
	    {
	        super.onCreateContextMenu(menu, view, info);
	        getMenuInflater().inflate(R.menu.sakujo_context, menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		AdapterContextMenuInfo info = (AdapterContextMenuInfo)item.getMenuInfo();
		switch(item.getItemId()) {
        case R.id.action_del:
            // [削除] 選択処理
            // ファイル削除
          //  if (!mFileName.isEmpty()) {
               // if (this.deleteFile(mFileName)).get("filename"))) {
                    Toast.makeText(this, R.string.msg_del, Toast.LENGTH_SHORT).show();
                }

             // リストから削除
                mList.remove(info.position);
                // ListView のデータ変更を表示に反映
                mAdapter.notifyDataSetChanged();
         //       break;
         //   default:
        //        break;
         //   }

            return false;
        }
	}
