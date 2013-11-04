package com.jamesying.xiongbibi;

import com.jamesying.xiongbibi.model.BBRecord;
import com.jamesying.xiongbibi.widget.RecordTextView;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class IndexMainActivity extends Activity {

	private BBRecord record = null;
	private RecordTextView mytxt = null;
	private RecordTextView mytxt2 = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.index_main);
		record = new BBRecord();
		record.setContent("�⼸���е�գ����˸�Android App�����ŶԽ�һ�¹�˾��΢��ƽ̨���Ա��ÿͻ��������ѯ�����о�΢��ƽ̨�У�Ҫע�����¼��㣺 1��΢����֤��Ϣ��ʵ��");
		mytxt = (RecordTextView)findViewById(R.id.mytxt);
		mytxt2 = (RecordTextView)findViewById(R.id.mytxt2);
		//mybtn = (Button)findViewById(R.id.mybtn);
		mytxt.setText(record.getShortContent());
		mytxt2.setText(record.getShortContent());
		mytxt.setOnClickListener(mClickListener);
		mytxt2.setOnClickListener(mClickListener);
	}
	
	private OnClickListener mClickListener = new OnClickListener(){

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			RecordTextView tv = (RecordTextView)v;
			Log.i("tv", String.valueOf(tv.getId()));
			boolean ischecked = tv.getIsChecked();
			if (ischecked){
				tv.setText(record.getShortContent());
			}else{
				tv.setText(record.getContent());
			}

			tv.setIsChecked(!ischecked);
		}
		
	};

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.index_main, menu);
		return true;
	}

}
