package com.example.fotolaboratoty;


import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		TextView txt = (TextView) findViewById(R.id.textView1);
		Typeface font = Typeface.createFromAsset(getAssets(), "BoomtownDeco.ttf");
		txt.setTypeface(font);
		
		View oButton=findViewById(R.id.button1);
		oButton.setOnClickListener(this);
	}


	@Override
	public void onClick(View v) {
		  switch (v.getId()) {
	      case R.id.button1:
	        Intent i = new Intent(this, NewOrder.class);
	        startActivity(i);
	        break;
	      
	      }

}
}
