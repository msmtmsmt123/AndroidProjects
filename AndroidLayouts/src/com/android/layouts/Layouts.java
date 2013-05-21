package com.android.layouts;

import com.android.layouts.tablayout.TabLayoutActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Layouts extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		// �ҵ���ťButton0
		Button btn = (Button) findViewById(R.id.Button01);
		// ���ӵ����¼�
		btn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Layouts.this,
						Layout_Framelayout.class);
				setTitle("FrameLayout��ʾ");
				startActivity(intent);
			}
		});

		/*
		 * LinearLayout demo
		 */
		// �ҵ���ť
		btn = (Button) findViewById(R.id.Button02);
		// ���ӵ����¼�
		btn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Layouts.this,
						Layout_Linearlayout.class);
				setTitle("LinearLayout��ʾ");
				startActivity(intent);
			}
		});

		/*
		 * RelativeLayout demo
		 */
		// �ҵ���ť
		btn = (Button) findViewById(R.id.Button03);
		// ���ӵ����¼�
		btn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Layouts.this,
						Layout_Relativelayout.class);
				setTitle("RelativeLayout��ʾ");
				startActivity(intent);
			}
		});

		/*
		 * Layout_RelativeLinearlayout demo
		 */
		// �ҵ���ť
		btn = (Button) findViewById(R.id.Button04);
		// ���ӵ����¼�
		btn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Layouts.this,
						Layout_RelativeLinearlayout.class);
				setTitle("RelativeLayout ��LinearLayout����ʾ");
				startActivity(intent);
			}
		});

		/*
		 * TableLayout demo
		 */
		// �ҵ���ť
		btn = (Button) findViewById(R.id.Button05);
		// ���ӵ����¼�
		btn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Layouts.this,
						Layout_Tablelayout.class);
				setTitle("TableLayout����ʾ");
				startActivity(intent);
			}
		});
		
		
		// Tab Layout
		btn = (Button) findViewById(R.id.ButtonTab);
		btn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Layouts.this,
						TabLayoutActivity.class);
				setTitle("Tab Layout Show");
				startActivity(intent);
			}
		});
	}
	
}