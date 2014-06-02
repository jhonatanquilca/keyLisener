package com.example.keylisener;

import android.os.Bundle;
import android.app.Activity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.EditText;
import android.widget.TextView;

public class KL_MainActivity extends Activity {
	
	TextView tx1;
	EditText et1;
	TextView tx2;
	int cant=0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_kl__main);
		tx1=(TextView)findViewById(R.id.lblTexto1);
		et1=(EditText)findViewById(R.id.txtTexto1);
		tx2=(TextView)findViewById(R.id.lblTexto2);
		
		et1.setOnKeyListener(new OnKeyListener() {
			
			@Override
			public boolean onKey(View v, int keyCode, KeyEvent event) {
				// TODO Auto-generated method stub
				if(event.getAction()==KeyEvent.ACTION_DOWN){					
					if(keyCode==KeyEvent.KEYCODE_VOLUME_UP){
						cant++;
						if(cant==1){
							tx2.setText("Siga digitando");
						}else{
							tx2.setText("");
						}
						
					}
					return true;
					
				}
				return false;
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.kl__main, menu);
		return true;
	}

}
