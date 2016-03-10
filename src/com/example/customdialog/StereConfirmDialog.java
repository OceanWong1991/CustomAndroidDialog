package com.example.customdialog;

import android.app.Dialog;
import android.content.Context;
import android.widget.Button;
import android.widget.TextView;

public class StereConfirmDialog extends Dialog {

	private TextView mTvTitle;
	private TextView mTvMessage;
	private Button mBtOk;
	private Button mBtCancle;

	public StereConfirmDialog(Context context) {
		super(context, R.style.Dialog_Notitle);
		setContentView(R.layout.dialog_confirm);
		initView();
		
	}
	
	

	public StereConfirmDialog(Context context, int layoutId) {
		super(context, R.style.Dialog_Notitle);
		setContentView(layoutId);
		initView();
	}
	
	private void initView() {
		mTvTitle = (TextView) findViewById(R.id.dl_title);
		mTvMessage = (TextView) findViewById(R.id.dl_message);
		mBtOk = (Button) findViewById(R.id.dl_ok);
		mBtCancle = (Button) findViewById(R.id.dl_cancle);
	}
	
	/**
	 * set message to the dialog
	 * @param message
	 */
	public void setMessage(String message) {
		if(message != null)mTvMessage.setText(message);
	}
	
	/**
	 * set title to the dialog
	 * @param title
	 */
	public void setTitle(String title) {
		if (title != null) mTvTitle.setText(title);
	}
	
	/**
	 * set the dialog's positive button name and onClickListener
	 * @param buttonName
	 * @param listener
	 */
	public void setDialogPositiveButton(String buttonName, android.view.View.OnClickListener listener) {
		if(buttonName != null) mBtOk.setText(buttonName);
		mBtOk.setOnClickListener(listener);
	}
	
	/**
	 * set the dialog's negative button name and OnclickListener
	 * @param buttonName
	 * @param listener
	 */
	public void setDialogNagetiveButton(String buttonName, android.view.View.OnClickListener listener) {
		if(buttonName != null) mBtCancle.setText(buttonName);
		mBtCancle.setOnClickListener(listener);
	}

	
	
}
