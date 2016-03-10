package com.example.customdialog;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        initView();
    }

	private void initView() {
		findViewById(R.id.bt).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				StereConfirmDialog dialog = new StereConfirmDialog(MainActivity.this);
				dialog.setTitle("HELLO THIS IS TITLE!");
				dialog.setMessage("this is the message, this is the message....");
				dialog.show();
				
				
			}
		});
		
	}


}
