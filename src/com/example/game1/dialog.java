package com.example.game1;



import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class dialog extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	requestWindowFeature(Window.FEATURE_NO_TITLE);
	setContentView(R.layout.dialogactivity);
	
	Log.e("dialog", " start");
	
	ImageView refresh = (ImageView)findViewById(R.id.direfresh1);
	ImageView menu = (ImageView)findViewById(R.id.dimenu1);
	ImageView forw = (ImageView)findViewById(R.id.difor1);
	ImageView imgstar = (ImageView)findViewById(R.id.distar1);
	TextView text = (TextView)findViewById(R.id.ditext1);
	
    final SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
   int star = sharedPreferences.getInt("stars", 0) ;

   final int level = sharedPreferences.getInt("level", 0) +1;
   int snimka = sharedPreferences.getInt("snimka"+(level-1), 0) ;
   
   if(star==0){
	   imgstar.setImageResource(R.drawable.s1);
	   text.setText("zaguba");
	   forw.setVisibility(View.GONE);
		Log.e("dialog", " start 0");
   }
   if(star==1){
	   imgstar.setImageResource(R.drawable.s2);
	   text.setText("Pozdravleniq");
	   forw.setVisibility(View.VISIBLE);
	   if(snimka<1){
		   SharedPreferences.Editor editor2 = sharedPreferences.edit();
		   editor2.putInt("snimka"+(level-1),1);
		   editor2.putInt("snimka"+(level),0);
		   editor2.commit();  
	   }

		Log.e("dialog", " start 1");
   }
   if(star==2){
	   imgstar.setImageResource(R.drawable.s3);
	   text.setText("Pozdravleniq");
	   forw.setVisibility(View.VISIBLE);
	   if(snimka<2){
		   SharedPreferences.Editor editor2 = sharedPreferences.edit();
		   editor2.putInt("snimka"+(level-1),2);
		   editor2.putInt("snimka"+(level),0);
		   editor2.commit();  
	   }
		Log.e("dialog", " start 2");
   }
   if(star==3){
	   imgstar.setImageResource(R.drawable.s4);
	   text.setText("Pozdravleniq");
	   forw.setVisibility(View.VISIBLE);
	   if(snimka<3){
		   SharedPreferences.Editor editor2 = sharedPreferences.edit();
		   editor2.putInt("snimka"+(level-1),3);
		   editor2.putInt("snimka"+(level),0);
		   editor2.commit();  
	   }
		Log.e("dialog", " start 3");
   }
   
	
	
   menu.setOnClickListener(new OnClickListener() {          
        @Override
        public void onClick(View v) {
        	Log.e("kakvo","kakvo");
        	startActivity(new Intent("com.example.game1.HOMESLIDE")); 
        }
        });
   refresh.setOnClickListener(new OnClickListener() {          
       @Override
       public void onClick(View v) {
       	Log.e("kakvo","kakvo");
       	startActivity(new Intent("com.example.game1.SLIDE1")); 
       }
       });
   forw.setOnClickListener(new OnClickListener() {          
       @Override
       public void onClick(View v) {
       	Log.e("kakvo","kakvo");
 	   SharedPreferences.Editor editor2 = sharedPreferences.edit();
 	   editor2.putInt("level",level);
 	   editor2.commit(); 
       	startActivity(new Intent("com.example.game1.SLIDE1")); 
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

