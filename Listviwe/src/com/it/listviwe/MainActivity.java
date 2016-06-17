package com.it.listviwe;

import java.util.ArrayList;
import java.util.List;

import adapter.Bean;
import adapter.CommonAdapter;
import adapter.ViewHolder;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;

public class MainActivity extends Activity {
	private ListView mListView;
	private List<Bean> mDatas = new ArrayList<Bean>();
	private CommonAdapter<Bean> mAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Bean bean = new Bean();
		bean.setDesc("美女一只,明天送到你的家里，请注意查收");
		bean.setPhone("10086");
		bean.setTime("1000365489");
		bean.setTitle("美女一只");
		for (int i = 0; i < 20; i++) {
			mDatas.add(bean);
		}
		
		mListView = (ListView) findViewById(R.id.list);
//		mAdapter = new CommonAdapter<String>(getApplicationContext(), mDatas,
//				R.layout.item) {
//			@Override
//			public void convert(ViewHolder viewHolder, String item) {
//				viewHolder.setText(R.id.id_tv_title, item);
//			}
//		};
//
//		mListView.setAdapter(mAdapter);
		 mListView.setAdapter(mAdapter = new CommonAdapter<Bean>(
		 getApplicationContext(), mDatas, R.layout.fuzaitem)
		 {
		 @Override
		 public void convert(ViewHolder helper, Bean item)
		 {
		 helper.setText(R.id.tv_title, item.getTitle());
		 helper.setText(R.id.tv_describe, item.getDesc());
		 helper.setText(R.id.tv_phone, item.getPhone());
		 helper.setText(R.id.tv_time, item.getTime());
		//后期点击事件的书写
		 // helper.getView(R.id.tv_title).setOnClickListener(l)
		 }
		
		 });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
