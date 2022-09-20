package com.example.game1;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.preference.PreferenceManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class slide1 extends Activity {
	
	

	
	ImageView[][] pole;
	TextView tim;
	TextView title;

	int broistapki;
	levels lev;

	long tektime;
	ImageView timeback;
	int btoijivote;
	boolean neegotov;
	TextView textstart ;
	TextView textend;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.slide1);
		
		TextView leveltext = (TextView)findViewById(R.id.slide1leveltext1);
		 timeback = (ImageView)findViewById(R.id.slide1timeback);
		 
		  textstart = (TextView)findViewById(R.id.slide1start);
		  textend = (TextView)findViewById(R.id.slide1end);
		
		pole = new ImageView[11][5];
		neegotov=false;
		
		//vika se koi level se iska
		lev = new levels();
		btoijivote=12;
		
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
       int tek = sharedPreferences.getInt("level", 0) ;
       
       leveltext.setText("LEVEL "+(tek+1));
		
		if(tek==0){
			lev.lev1();
		}
		if(tek==1){
			lev.lev2();
		}
		if(tek==2){
			lev.lev3();
		}
		if(tek==3){
			lev.lev4();
		}
		if(tek==4){
			lev.lev5();
		}
		if(tek==5){
			lev.lev6();
		}
		if(tek==6){
			lev.lev7();
		}
		if(tek==7){
			lev.lev8();
		}
		if(tek==8){
			lev.lev9();
		}
		if(tek==9){
			lev.lev10();
		}
		if(tek==10){
			lev.lev11();
		}
		if(tek==11){
			lev.lev12();
		}
		
		Intent	 homepage=new Intent("com.example.game1.SLIDE1");
		
		
  
		DisplayMetrics metrics = new DisplayMetrics();
		getWindowManager().getDefaultDisplay().getMetrics(metrics);
		int h = metrics.heightPixels;
		int w = metrics.widthPixels;
		int razmer = 0;
		if(w<h){
			razmer = Math.round(w*0.14f);
		}else{
			razmer = Math.round(h*0.14f);
		}

		
		Typeface myTypeface = Typeface.createFromAsset(getAssets(), "font/myf2.ttf");
		
		title = (TextView)findViewById(R.id.slide1texttitle1);
		
		tim = (TextView)findViewById(R.id.texttime1);
		tim.setTypeface(myTypeface);
		Log.e("Start", " 1");
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 5; j++) {
				String img = "img" + i+ j;
				int resID = getResources().getIdentifier(img, "id", "com.example.game1");
				pole[i][j] = (ImageView)findViewById(resID);
			//	Log.e("pole ", ""+i+" "+j);
				pole[i][j].getLayoutParams().width=razmer;
				pole[i][j].getLayoutParams().height=razmer;
				if(lev.level1[i][j]){
					pole[i][j].setImageResource(R.drawable.a2);
				}
			}
			
		}
		
		broistapki=0;
		
		
		

		time();
		
	

		
		
		

		
	
		
	}
	
	public void onClick(View v) {
	 int c =	v.getId();
	 
	 for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 5; j++) {
				 int p =pole[i][j].getId();
				 int p1 = textstart.getId();
				 int p2 = textend.getId();
					 if((c==p1||c==p2||c==p)&&neegotov){
						 
						 String cmp=Integer.toString(i)+Integer.toString(j);
						 Log.e("pole ", "c==p "+i+j+" "+cmp+lev.level1[i][j]);
							if(lev.level1[i][j]==true){
								Log.e("pole ", "true "+i+j);
								if(lev.pravilno[broistapki].equals(cmp)){
									Log.e("pole ", "cmp "+lev.pravilno[broistapki]+" "+broistapki+" "+cmp);
									pole[i][j].setImageResource(R.drawable.a2);
									broistapki=broistapki+1;
									
									if(i==10&&j==4){
										if(btoijivote>9){
											startstars( 3);
										}else{
											if(btoijivote>5){
												startstars( 2);
											}else{
												startstars( 1);
											}
										}
										
									}
									
								}else{
									 pole[i][j].setImageResource(R.drawable.ic_launcher);
									 Log.e("pole ", "gre666ka ");
									 broistapki=0;
									 restarticon();
									// Toast.makeText(slide1.this, "Please try again :)))", Toast.LENGTH_SHORT).show();
									 if(btoijivote==1){
										 startstars(0);
									 }else{
										 btoijivote=btoijivote-1;
										 tim.setText(""+btoijivote);
										 
									 }
									 
								 }
								
							}else{
								 pole[i][j].setImageResource(R.drawable.ic_launcher);
								 Log.e("pole ", "gre666ka ");
								 broistapki=0;
								 restarticon();
								 //Toast.makeText(slide1.this, "Please try again :)))", Toast.LENGTH_SHORT).show();
								 if(btoijivote==1){
									 startstars(0);
								 }else{
									 btoijivote=btoijivote-1;
									 tim.setText(""+btoijivote);
									 
								 } 
							}
					 }
				}
			}
	 
	
    
	// Toast.makeText(slide1.this, ""+c, Toast.LENGTH_SHORT).show();
	}
	
	private void startstars(int i) {
		// TODO Auto-generated method stub
		
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());

        SharedPreferences.Editor editor2 = sharedPreferences.edit();
        editor2.putInt("stars",i);
        editor2.commit();
		
        Log.e("Stars ", ""+i);
        
        Intent intent=new Intent(getApplicationContext(), dialog.class);
        startActivity(intent);
		
		
	}

	public void restarticon(){
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 5; j++) {
	
					pole[i][j].setImageResource(R.drawable.icon1);
				
			}
			
		}
	}
	
	public void time(){
		new CountDownTimer(30000, 1000) {

		     public void onTick(long millisUntilFinished) {
		    	 tim.setText("" + millisUntilFinished / 1000);
		     }

		     public void onFinish() {
		    	 title.setText("S\nt\na\nr\nt");
		    	 
		    	 for (int i = 0; i < 11; i++) {
		 			for (int j = 0; j < 5; j++) {
		 					pole[i][j].setImageResource(R.drawable.icon1);
		 				}
		 			}
		    	 neegotov=true;
		    	 timeback.setImageResource(R.drawable.heart);
		    	 tim.setText(""+btoijivote);
		 			
		 		}
		     
		  }.start();
	}
	
	public void time2(){
		new CountDownTimer(150000, 1000) {

		     public void onTick(long millisUntilFinished) {
		    	 tim.setText("" + millisUntilFinished / 1000);
		    	 tektime=millisUntilFinished / 1000;
		     }

		     public void onFinish() {
		    	 title.setText("f\ni\nn\ni\ns\nh");
		    	 
		    	// startstars(0);
		 			
		 		}
		     
		  }.start();
		  
		 
	}
	
	// za systemno siob6te nie da ili ne po specalno za new profile
	public void msbox(String str,String str2,final Intent goint)
	{
	    AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);                      
	    dlgAlert.setTitle(str); 
	    dlgAlert.setMessage(str2); 
	    dlgAlert.setPositiveButton("OK",new DialogInterface.OnClickListener() {
	        public void onClick(DialogInterface dialog, int whichButton) {
	        
	        	startActivity(goint);
	          //   finish(); 
	        }
	        
	   });
	    dlgAlert.setNegativeButton("cansel",new DialogInterface.OnClickListener() {
	        public void onClick(DialogInterface dialog, int whichButton) {
	        
	          //   finish(); 
	        }
	        
	   });
	    
	  
	    
	    dlgAlert.create().show();
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
