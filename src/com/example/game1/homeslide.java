package com.example.game1;

import com.example.game1.ImageAdapter;


import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class homeslide extends Activity {
	GridView gridView;
	static final String[] MOBILE_OS = new String[] { 
		"1",
		"2",
		"3",
		"4",
		"5",
		"6",
		"7",
		"8",
		"9",
		"10",   
		"11",
		"12",
		



		
		};

	levels lev;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		  requestWindowFeature(Window.FEATURE_NO_TITLE);
	        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
	       
		
		setContentView(R.layout.homeslide);
		lev = new levels();
		lev.samovednaj(getApplicationContext());
		lev.getdata(getApplicationContext());
        final Intent	 homepage=new Intent("com.example.game1.SLIDE1");
		   
		gridView = (GridView) findViewById(R.id.gridView1);
		
		               
			gridView.setAdapter(new ImageAdapter(this, MOBILE_OS));
			 
			gridView.setOnItemClickListener(new OnItemClickListener() {
				public void onItemClick(AdapterView<?> parent, View v,
						int position, long id) {
					
				//	pos=position;  
					
				//	calcburn(min,koef,pos);
			        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());

			        SharedPreferences.Editor editor2 = sharedPreferences.edit();
			        editor2.putInt("level",position);
			        editor2.commit();

			        int c = sharedPreferences.getInt("snimka"+position, 0);
			       
			        if(c!=4){
			        	startActivity(homepage); 
			        }else{
			        	Toast.makeText(
								   getApplicationContext(),
								  "nee "+position, Toast.LENGTH_SHORT).show();
			        }
			       
			      
			     
					
				/*	Toast.makeText(
					   getApplicationContext(),
					   ((TextView) v.findViewById(R.id.grid_item_label1))
					   .getText()+" "+position, Toast.LENGTH_SHORT).show(); */
	 
				}
			});
	        
		
	}
	
	
	//kod za natisnat buton po to4no za back***************************
 @Override 
 public boolean onKeyDown(int keyCode, KeyEvent event) {

     switch (keyCode) {
     case KeyEvent.KEYCODE_BACK:
     {
         //your Action code
     //	Toast.makeText(kosh.this, "aaaaaaaaaaa", Toast.LENGTH_LONG).show();	
     //	msbox("Message","sport activitesini durdurmak istiyormusunuz?",nazad);
         return true;
     }

        

     }
     return super.onKeyDown(keyCode, event);
 }
	

}
