package com.example.game1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); 
        
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
       
        setContentView(R.layout.activity_main);  
          
		final Intent	 homepage=new Intent("com.example.game1.HOMESLIDE");
	    
		Thread splashscreen = new Thread(){
			public void run(){
				try{  
					sleep(1000);    
					Log.v("vleze ", "v 3");
					startActivity(homepage);     
					  
				} 
				catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
				finally{
				finish();	
				}
			}   
		};
		
		splashscreen.start();
        
    }
}
