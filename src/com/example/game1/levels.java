package com.example.game1;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;

public class levels {
	
	public boolean[][] 	level1 = new boolean[11][5];
	public String[]		pravilno = new String[21];
	
	int tek;
	public int[] myimg = new int[12];
	
	public void getdata(Context ctx){

        
        for (int i = 0; i < myimg.length; i++) {
            SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(ctx);
            tek = sharedPreferences.getInt("snimka"+i, 0) ;
            if(tek==0){
            	myimg[i]=R.drawable.icon1;
            }
            if(tek==1){
            	myimg[i]=R.drawable.icon2;
            }
            if(tek==2){
            	myimg[i]=R.drawable.icon3;
            }
            if(tek==3){
            	myimg[i]=R.drawable.icon4;
            }
            if(tek==4){
            	myimg[i]=R.drawable.icon5;
            }
		}
        
	}
	
	public void samovednaj(Context ctx){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(ctx);
        
       boolean tek = sharedPreferences.getBoolean("samovednaj", true);
       
       if(tek){
           SharedPreferences.Editor editor2 = sharedPreferences.edit();
           editor2.putInt("snimka0",0);
           editor2.putInt("snimka1",4);
           editor2.putInt("snimka2",4);
           editor2.putInt("snimka3",4);
           editor2.putInt("snimka4",4);
           editor2.putInt("snimka5",4);
           editor2.putInt("snimka6",4);
           editor2.putInt("snimka7",4);
           editor2.putInt("snimka8",4);
           editor2.putInt("snimka9",4);
           editor2.putInt("snimka10",4);
           editor2.putInt("snimka11",4);
           editor2.putBoolean("samovednaj", false);
           editor2.commit();  
           Log.e("samovednaj", " vleze");
       }else{
    	   Log.e("samovednaj", " neeee");
       }

   
	}
	
	
	public void lev1(){
	
		level1[0][0]=true;		level1[0][1]=false;		level1[0][2]=false;		level1[0][3]=false;		level1[0][4]=false;
		level1[1][0]=true;		level1[1][1]=false;		level1[1][2]=true;		level1[1][3]=true;		level1[1][4]=false;
		level1[2][0]=false;		level1[2][1]=true;		level1[2][2]=false;		level1[2][3]=false;		level1[2][4]=true;		
		level1[3][0]=false;		level1[3][1]=false;		level1[3][2]=false;		level1[3][3]=true;		level1[3][4]=false;
		level1[4][0]=false;		level1[4][1]=false;		level1[4][2]=true;		level1[4][3]=false;		level1[4][4]=false;
		level1[5][0]=false;		level1[5][1]=true;		level1[5][2]=false;		level1[5][3]=false;		level1[5][4]=false;
		level1[6][0]=false;		level1[6][1]=true;		level1[6][2]=false;		level1[6][3]=true;		level1[6][4]=false;		
		level1[7][0]=false;		level1[7][1]=false;		level1[7][2]=true;		level1[7][3]=false;		level1[7][4]=true;		
		level1[8][0]=false;		level1[8][1]=false;		level1[8][2]=false;		level1[8][3]=false;		level1[8][4]=true;		
		level1[9][0]=false;		level1[9][1]=false;		level1[9][2]=false;		level1[9][3]=true;		level1[9][4]=false;
		level1[10][0]=false;	level1[10][1]=false;	level1[10][2]=false;	level1[10][3]=false;	level1[10][4]=true;
	

		pravilno[0]="00";		pravilno[1]="10";		pravilno[2]="21";		pravilno[3]="12";		pravilno[4]="13";		pravilno[5]="24";		
		pravilno[6]="33";		pravilno[7]="42";		pravilno[8]="51";		pravilno[9]="61";		pravilno[10]="72";		pravilno[11]="63";		pravilno[12]="74";
		pravilno[13]="84";		pravilno[14]="93";		pravilno[15]="104";

	
	}
	
	public void lev2(){
		
		level1[0][0]=true;		level1[0][1]=false;		level1[0][2]=true;		level1[0][3]=false;		level1[0][4]=false;
		level1[1][0]=false;		level1[1][1]=true;		level1[1][2]=false;		level1[1][3]=true;		level1[1][4]=false;
		level1[2][0]=false;		level1[2][1]=false;		level1[2][2]=false;		level1[2][3]=true;		level1[2][4]=false;
		level1[3][0]=false;		level1[3][1]=false;		level1[3][2]=true;		level1[3][3]=false;		level1[3][4]=false;
		level1[4][0]=false;		level1[4][1]=true;		level1[4][2]=false;		level1[4][3]=false;		level1[4][4]=false;
		level1[5][0]=false;		level1[5][1]=false;		level1[5][2]=true;		level1[5][3]=true;		level1[5][4]=false;
		level1[6][0]=false;		level1[6][1]=false;		level1[6][2]=false;		level1[6][3]=false;		level1[6][4]=true;		
		level1[7][0]=false;		level1[7][1]=false;		level1[7][2]=false;		level1[7][3]=true;		level1[7][4]=false;
		level1[8][0]=false;		level1[8][1]=true;		level1[8][2]=true;		level1[8][3]=false;		level1[8][4]=false;
		level1[9][0]=true;		level1[9][1]=false;		level1[9][2]=false;		level1[9][3]=false;		level1[9][4]=false;
		level1[10][0]=false;	level1[10][1]=true;		level1[10][2]=true;		level1[10][3]=true;		level1[10][4]=true;		

	
		pravilno[0]="00";		pravilno[1]="11";		pravilno[2]="02";		pravilno[3]="13";		pravilno[4]="23";		pravilno[5]="32";		
		pravilno[6]="41";		pravilno[7]="52";		pravilno[8]="53";		pravilno[9]="64";		pravilno[10]="73";		pravilno[11]="82";		pravilno[12]="81";
		pravilno[13]="90";		pravilno[14]="101";		pravilno[15]="102";		pravilno[16]="103";		pravilno[17]="104";	

	
	}
	
	public void lev3(){
		
		level1[0][0]=true;		level1[0][1]=false;		level1[0][2]=false;		level1[0][3]=false;		level1[0][4]=false;
		level1[1][0]=false;		level1[1][1]=true;		level1[1][2]=false;		level1[1][3]=false;		level1[1][4]=false;
		level1[2][0]=true;		level1[2][1]=false;		level1[2][2]=false;		level1[2][3]=false;		level1[2][4]=false;
		level1[3][0]=false;		level1[3][1]=true;		level1[3][2]=false;		level1[3][3]=true;		level1[3][4]=false;
		level1[4][0]=false;		level1[4][1]=false;		level1[4][2]=true;		level1[4][3]=false;		level1[4][4]=true;		
		level1[5][0]=false;		level1[5][1]=false;		level1[5][2]=false;		level1[5][3]=false;		level1[5][4]=true;		
		level1[6][0]=false;		level1[6][1]=false;		level1[6][2]=true;		level1[6][3]=false;		level1[6][4]=true;		
		level1[7][0]=false;		level1[7][1]=true;		level1[7][2]=false;		level1[7][3]=true;		level1[7][4]=false;
		level1[8][0]=false;		level1[8][1]=true;		level1[8][2]=false;		level1[8][3]=false;		level1[8][4]=false;
		level1[9][0]=false;		level1[9][1]=false;		level1[9][2]=true;		level1[9][3]=true;		level1[9][4]=false;
		level1[10][0]=false;	level1[10][1]=false;	level1[10][2]=false;	level1[10][3]=false;	level1[10][4]=true;		

	
		pravilno[0]="00";		pravilno[1]="11";		pravilno[2]="20";		pravilno[3]="31";		pravilno[4]="42";		pravilno[5]="33";		
		pravilno[6]="44";		pravilno[7]="54";		pravilno[8]="64";		pravilno[9]="73";		pravilno[10]="62";		pravilno[11]="71";		pravilno[12]="81";
		pravilno[13]="92";		pravilno[14]="93";		pravilno[15]="104";

	
	}
	
	public void lev4(){
		
		level1[0][0]=true;		level1[0][1]=true;		level1[0][2]=false;		level1[0][3]=false;		level1[0][4]=false;
		level1[1][0]=false;		level1[1][1]=false;		level1[1][2]=true;		level1[1][3]=false;		level1[1][4]=false;
		level1[2][0]=false;		level1[2][1]=true;		level1[2][2]=false;		level1[2][3]=false;		level1[2][4]=false;
		level1[3][0]=false;		level1[3][1]=false;		level1[3][2]=true;		level1[3][3]=true;		level1[3][4]=false;
		level1[4][0]=false;		level1[4][1]=false;		level1[4][2]=false;		level1[4][3]=false;		level1[4][4]=true;		
		level1[5][0]=false;		level1[5][1]=false;		level1[5][2]=false;		level1[5][3]=true;		level1[5][4]=false;
		level1[6][0]=false;		level1[6][1]=true;		level1[6][2]=true;		level1[6][3]=false;		level1[6][4]=false;		
		level1[7][0]=true;		level1[7][1]=false;		level1[7][2]=false;		level1[7][3]=false;		level1[7][4]=false;
		level1[8][0]=false;		level1[8][1]=true;		level1[8][2]=true;		level1[8][3]=true;		level1[8][4]=false;
		level1[9][0]=false;		level1[9][1]=false;		level1[9][2]=false;		level1[9][3]=false;		level1[9][4]=true;		
		level1[10][0]=false;	level1[10][1]=false;	level1[10][2]=false;	level1[10][3]=false;	level1[10][4]=true;
	
		pravilno[0]="00";		pravilno[1]="01";		pravilno[2]="12";		pravilno[3]="21";		pravilno[4]="32";		pravilno[5]="33";		
		pravilno[6]="44";		pravilno[7]="53";		pravilno[8]="62";		pravilno[9]="61";		pravilno[10]="70";		pravilno[11]="81";		pravilno[12]="82";
		pravilno[13]="83";		pravilno[14]="94";		pravilno[15]="104";
				

	
	}
	
	public void lev5(){
		
		level1[0][0]=true;		level1[0][1]=true;		level1[0][2]=false;		level1[0][3]=false;		level1[0][4]=false;
		level1[1][0]=false;		level1[1][1]=false;		level1[1][2]=true;		level1[1][3]=false;		level1[1][4]=false;
		level1[2][0]=false;		level1[2][1]=false;		level1[2][2]=true;		level1[2][3]=false;		level1[2][4]=false;
		level1[3][0]=false;		level1[3][1]=false;		level1[3][2]=false;		level1[3][3]=true;		level1[3][4]=false;
		level1[4][0]=false;		level1[4][1]=true;		level1[4][2]=false;		level1[4][3]=false;		level1[4][4]=true;		
		level1[5][0]=true;		level1[5][1]=false;		level1[5][2]=true;		level1[5][3]=true;		level1[5][4]=false;
		level1[6][0]=true;		level1[6][1]=false;		level1[6][2]=false;		level1[6][3]=false;		level1[6][4]=false;		
		level1[7][0]=false;		level1[7][1]=true;		level1[7][2]=false;		level1[7][3]=false;		level1[7][4]=false;
		level1[8][0]=true;		level1[8][1]=false;		level1[8][2]=false;		level1[8][3]=true;		level1[8][4]=false;
		level1[9][0]=false;		level1[9][1]=true;		level1[9][2]=true;		level1[9][3]=false;		level1[9][4]=true;		
		level1[10][0]=false;	level1[10][1]=false;	level1[10][2]=false;	level1[10][3]=false;	level1[10][4]=true;
	

		pravilno[0]="00";		pravilno[1]="01";		pravilno[2]="12";		pravilno[3]="22";		pravilno[4]="33";		pravilno[5]="44";		
		pravilno[6]="53";		pravilno[7]="52";		pravilno[8]="41";		pravilno[9]="50";		pravilno[10]="60";		pravilno[11]="71";		pravilno[12]="80";
		pravilno[13]="91";		pravilno[14]="92";		pravilno[15]="83";		pravilno[16]="94";		pravilno[17]="104";
				

	
	}
	
	public void lev6(){
		

		
		level1[0][0]=true;		level1[0][1]=false;		level1[0][2]=false;		level1[0][3]=false;		level1[0][4]=false;
		level1[1][0]=false;		level1[1][1]=true;		level1[1][2]=false;		level1[1][3]=false;		level1[1][4]=false;
		level1[2][0]=true;		level1[2][1]=false;		level1[2][2]=false;		level1[2][3]=true;		level1[2][4]=false;
		level1[3][0]=false;		level1[3][1]=true;		level1[3][2]=true;		level1[3][3]=false;		level1[3][4]=true;
		level1[4][0]=false;		level1[4][1]=false;		level1[4][2]=false;		level1[4][3]=false;		level1[4][4]=true;
		level1[5][0]=false;		level1[5][1]=false;		level1[5][2]=false;		level1[5][3]=true;		level1[5][4]=false;
		level1[6][0]=false;		level1[6][1]=true;		level1[6][2]=false;		level1[6][3]=false;		level1[6][4]=true;
		level1[7][0]=true;		level1[7][1]=false;		level1[7][2]=true;		level1[7][3]=true;		level1[7][4]=false;
		level1[8][0]=true;		level1[8][1]=false;		level1[8][2]=false;		level1[8][3]=false;		level1[8][4]=false;
		level1[9][0]=false;		level1[9][1]=true;		level1[9][2]=true;		level1[9][3]=true;		level1[9][4]=false;
		level1[10][0]=false;	level1[10][1]=false;	level1[10][2]=false;	level1[10][3]=false;	level1[10][4]=true;
		
		pravilno[0]="00";		pravilno[1]="11";		pravilno[2]="20";		pravilno[3]="31";		pravilno[4]="32";		pravilno[5]="23";		
		pravilno[6]="34";		pravilno[7]="44";		pravilno[8]="53";		pravilno[9]="64";		pravilno[10]="73";		pravilno[11]="72";		pravilno[12]="61";
				pravilno[13]="70";		pravilno[14]="80";		pravilno[15]="91";		pravilno[16]="92";		pravilno[17]="93";		pravilno[18]="104";
						
	}
	
	public void lev7(){
		
		level1[10][4]=true;		level1[10][3]=false;	level1[10][2]=false;	level1[10][1]=false;	level1[10][0]=false;
		level1[9][4]=true;		level1[9][3]=false;		level1[9][2]=true;		level1[9][1]=true;		level1[9][0]=false;
		level1[8][4]=false;		level1[8][3]=true;		level1[8][2]=false;		level1[8][1]=false;		level1[8][0]=true;		
		level1[7][4]=false;		level1[7][3]=false;		level1[7][2]=false;		level1[7][1]=true;		level1[7][0]=false;
		level1[6][4]=false;		level1[6][3]=false;		level1[6][2]=true;		level1[6][1]=false;		level1[6][0]=false;
		level1[5][4]=false;		level1[5][3]=true;		level1[5][2]=false;		level1[5][1]=false;		level1[5][0]=false;
		level1[4][4]=false;		level1[4][3]=true;		level1[4][2]=false;		level1[4][1]=true;		level1[4][0]=false;		
		level1[3][4]=false;		level1[3][3]=false;		level1[3][2]=true;		level1[3][1]=false;		level1[3][0]=true;		
		level1[2][4]=false;		level1[2][3]=false;		level1[2][2]=false;		level1[2][1]=false;		level1[2][0]=true;		
		level1[1][4]=false;		level1[1][3]=false;		level1[1][2]=false;		level1[1][1]=true;		level1[1][0]=false;
		level1[0][4]=false;		level1[0][3]=false;		level1[0][2]=false;		level1[0][1]=false;		level1[0][0]=true;
	
		pravilno[15]="104";		pravilno[14]="94";		pravilno[13]="83";		pravilno[12]="92";		pravilno[11]="91";		pravilno[10]="80";		
		pravilno[9]="71";		pravilno[8]="62";		pravilno[7]="53";		pravilno[6]="43";		pravilno[5]="32";		pravilno[4]="41";		pravilno[3]="30";
		pravilno[2]="20";		pravilno[1]="11";		pravilno[0]="00";		
	}
	
	
	public void lev8(){
		
		level1[10][4]=true;		level1[10][3]=false;	level1[10][2]=true;		level1[10][1]=false;	level1[10][0]=false;
		level1[9][4]=false;		level1[9][3]=true;		level1[9][2]=false;		level1[9][1]=true;		level1[9][0]=false;
		level1[8][4]=false;		level1[8][3]=false;		level1[8][2]=false;		level1[8][1]=true;		level1[8][0]=false;
		level1[7][4]=false;		level1[7][3]=false;		level1[7][2]=true;		level1[7][1]=false;		level1[7][0]=false;
		level1[6][4]=false;		level1[6][3]=true;		level1[6][2]=false;		level1[6][1]=false;		level1[6][0]=false;
		level1[5][4]=false;		level1[5][3]=false;		level1[5][2]=true;		level1[5][1]=true;		level1[5][0]=false;
		level1[4][4]=false;		level1[4][3]=false;		level1[4][2]=false;		level1[4][1]=false;		level1[4][0]=true;		
		level1[3][4]=false;		level1[3][3]=false;		level1[3][2]=false;		level1[3][1]=true;		level1[3][0]=false;
		level1[2][4]=false;		level1[2][3]=true;		level1[2][2]=true;		level1[2][1]=false;		level1[2][0]=false;
		level1[1][4]=true;		level1[1][3]=false;		level1[1][2]=false;		level1[2][1]=false;		level1[1][0]=false;
		level1[0][4]=false;		level1[0][3]=true;		level1[0][2]=true;		level1[0][1]=true;		level1[0][0]=true;		

	
		pravilno[0]="00";		pravilno[1]="01";		pravilno[2]="02";		pravilno[3]="03";		pravilno[4]="14";		pravilno[5]="23";		
		pravilno[6]="22";		pravilno[7]="31";		pravilno[8]="40";		pravilno[9]="51";		pravilno[10]="52";		pravilno[11]="63";		pravilno[12]="72";
		pravilno[13]="81";		pravilno[14]="91";		pravilno[15]="102";		pravilno[16]="93";		pravilno[17]="104";	

	
	}
	
	public void lev9(){
		
		level1[10][4]=true;		level1[10][3]=false;	level1[10][2]=false;	level1[10][1]=false;	level1[10][0]=false;
		level1[9][4]=false;		level1[9][3]=true;		level1[9][2]=false;		level1[9][1]=false;		level1[9][0]=false;
		level1[8][4]=true;		level1[8][3]=false;		level1[8][2]=false;		level1[8][1]=false;		level1[8][0]=false;
		level1[7][4]=false;		level1[7][3]=true;		level1[7][2]=false;		level1[7][1]=true;		level1[7][0]=false;
		level1[6][4]=false;		level1[6][3]=false;		level1[6][2]=true;		level1[6][1]=false;		level1[6][0]=true;		
		level1[5][4]=false;		level1[5][3]=false;		level1[5][2]=false;		level1[5][1]=false;		level1[5][0]=true;		
		level1[4][4]=false;		level1[4][3]=false;		level1[4][2]=true;		level1[4][1]=false;		level1[4][0]=true;		
		level1[3][4]=false;		level1[3][3]=true;		level1[3][2]=false;		level1[3][1]=true;		level1[3][0]=false;
		level1[2][4]=false;		level1[2][3]=true;		level1[2][2]=false;		level1[2][1]=false;		level1[2][0]=false;
		level1[1][4]=false;		level1[1][3]=false;		level1[1][2]=true;		level1[1][1]=true;		level1[1][0]=false;
		level1[0][4]=false;		level1[0][3]=false;		level1[0][2]=false;		level1[0][1]=false;		level1[0][0]=true;		

	
		pravilno[0]="00";		pravilno[1]="11";		pravilno[2]="12";		pravilno[3]="23";		pravilno[4]="33";		pravilno[5]="42";		
		pravilno[6]="31";		pravilno[7]="40";		pravilno[8]="50";		pravilno[9]="60";		pravilno[10]="71";		pravilno[11]="62";		pravilno[12]="73";
		pravilno[13]="84";		pravilno[14]="93";		pravilno[15]="104";

	
	}
	
	public void lev10(){
		
		level1[10][4]=true;		level1[10][3]=true;		level1[10][2]=false;	level1[10][1]=false;	level1[10][0]=false;
		level1[9][4]=false;		level1[9][3]=false;		level1[9][2]=true;		level1[9][1]=false;		level1[9][0]=false;
		level1[8][4]=false;		level1[8][3]=true;		level1[8][2]=false;		level1[8][1]=false;		level1[8][0]=false;
		level1[7][4]=false;		level1[7][3]=false;		level1[7][2]=true;		level1[7][1]=true;		level1[7][0]=false;
		level1[6][4]=false;		level1[6][3]=false;		level1[6][2]=false;		level1[6][1]=false;		level1[6][0]=true;		
		level1[5][4]=false;		level1[5][3]=false;		level1[5][2]=false;		level1[5][1]=true;		level1[5][0]=false;
		level1[4][4]=false;		level1[4][3]=true;		level1[4][2]=true;		level1[4][1]=false;		level1[4][0]=false;		
		level1[3][4]=true;		level1[3][3]=false;		level1[3][2]=false;		level1[3][1]=false;		level1[3][0]=false;
		level1[2][4]=false;		level1[2][3]=true;		level1[2][2]=true;		level1[2][1]=true;		level1[2][0]=false;
		level1[1][4]=false;		level1[1][3]=false;		level1[1][2]=false;		level1[1][1]=false;		level1[1][0]=true;		
		level1[0][4]=false;		level1[0][3]=false;		level1[0][2]=false;		level1[0][1]=false;		level1[0][0]=true;
	
		pravilno[0]="00";		pravilno[1]="10";		pravilno[2]="21";		pravilno[3]="22";		pravilno[4]="23";		pravilno[5]="34";		
		pravilno[6]="43";		pravilno[7]="42";		pravilno[8]="51";		pravilno[9]="60";		pravilno[10]="71";		pravilno[11]="72";		pravilno[12]="83";
		pravilno[13]="92";		pravilno[14]="103";		pravilno[15]="104";
				

	
	}
	
	public void lev11(){
		
		level1[10][4]=true;		level1[10][3]=true;		level1[10][2]=false;	level1[10][1]=false;	level1[10][0]=false;
		level1[9][4]=false;		level1[9][3]=false;		level1[9][2]=true;		level1[9][1]=false;		level1[9][0]=false;
		level1[8][4]=false;		level1[8][3]=false;		level1[8][2]=true;		level1[8][1]=false;		level1[8][0]=false;
		level1[7][4]=false;		level1[7][3]=false;		level1[7][2]=false;		level1[7][1]=true;		level1[7][0]=false;
		level1[6][4]=false;		level1[6][3]=true;		level1[6][2]=false;		level1[6][1]=false;		level1[6][0]=true;		
		level1[5][4]=true;		level1[5][3]=false;		level1[5][2]=true;		level1[5][1]=true;		level1[5][0]=false;
		level1[4][4]=true;		level1[4][3]=false;		level1[4][2]=false;		level1[4][1]=false;		level1[4][0]=false;		
		level1[3][4]=false;		level1[3][3]=true;		level1[3][2]=false;		level1[3][1]=false;		level1[3][0]=false;
		level1[2][4]=true;		level1[2][3]=false;		level1[2][2]=false;		level1[2][1]=true;		level1[2][0]=false;
		level1[1][4]=false;		level1[1][3]=true;		level1[1][2]=true;		level1[1][1]=false;		level1[1][0]=true;		
		level1[0][4]=false;		level1[0][3]=false;		level1[0][2]=false;		level1[0][1]=false;		level1[0][0]=true;
	

		pravilno[0]="00";		pravilno[1]="10";		pravilno[2]="21";		pravilno[3]="12";		pravilno[4]="13";		pravilno[5]="24";		
		pravilno[6]="33";		pravilno[7]="44";		pravilno[8]="54";		pravilno[9]="63";		pravilno[10]="52";		pravilno[11]="51";		pravilno[12]="60";
		pravilno[13]="71";		pravilno[14]="82";		pravilno[15]="92";		pravilno[16]="103";		pravilno[17]="104";
				

	
	}
	
	public void lev12(){
		

		
		level1[10][4]=true;		level1[10][3]=false;	level1[10][2]=false;	level1[10][1]=false;	level1[10][0]=false;
		level1[9][4]=false;		level1[9][3]=true;		level1[9][2]=false;		level1[9][1]=false;		level1[9][0]=false;
		level1[8][4]=true;		level1[8][3]=false;		level1[8][2]=false;		level1[8][1]=true;		level1[8][0]=false;
		level1[7][4]=false;		level1[7][3]=true;		level1[7][2]=true;		level1[7][1]=false;		level1[7][0]=true;
		level1[6][4]=false;		level1[6][3]=false;		level1[6][2]=false;		level1[6][1]=false;		level1[6][0]=true;
		level1[5][4]=false;		level1[5][3]=false;		level1[5][2]=false;		level1[5][1]=true;		level1[5][0]=false;
		level1[4][4]=false;		level1[4][3]=true;		level1[4][2]=false;		level1[4][1]=false;		level1[4][0]=true;
		level1[3][4]=true;		level1[3][3]=false;		level1[3][2]=true;		level1[3][1]=true;		level1[3][0]=false;
		level1[2][4]=true;		level1[2][3]=false;		level1[2][2]=false;		level1[2][1]=false;		level1[2][0]=false;
		level1[1][4]=false;		level1[1][3]=true;		level1[1][2]=true;		level1[1][1]=true;		level1[1][0]=false;
		level1[0][4]=false;		level1[0][3]=false;		level1[0][2]=false;		level1[0][1]=false;		level1[0][0]=true;
		
		pravilno[0]="00";		pravilno[1]="11";		pravilno[2]="12";		pravilno[3]="13";		pravilno[4]="24";		pravilno[5]="34";		
		pravilno[6]="43";		pravilno[7]="32";		pravilno[8]="31";		pravilno[9]="40";		pravilno[10]="51";		pravilno[11]="60";		pravilno[12]="70";
		pravilno[13]="81";		pravilno[14]="72";		pravilno[15]="73";		pravilno[16]="84";		pravilno[17]="93";		pravilno[18]="104";
						
	}
}
