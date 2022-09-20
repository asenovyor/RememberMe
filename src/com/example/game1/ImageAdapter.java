package com.example.game1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemClickListener;

public class ImageAdapter extends BaseAdapter {
	private Context context;
	private final String[] mobileValues;
	levels lev;
/*	public int[] myimg = {
		R.drawable.icon1,
		R.drawable.icon2,
		R.drawable.icon3,
		R.drawable.icon4,
		R.drawable.icon5,
		R.drawable.icon2,
		R.drawable.icon2,
		R.drawable.icon2,
		R.drawable.icon2,
		R.drawable.icon2,
		R.drawable.icon2,
		R.drawable.icon2

		

	};
	*/
	public ImageAdapter(Context context, String[] mobileValues) {
		this.context = context;
		this.mobileValues = mobileValues;
		lev = new levels();
		lev.getdata(context);
	}
 
	public View getView(int position, View convertView, ViewGroup parent) {
 
		LayoutInflater inflater = (LayoutInflater) context
			.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
 
		View gridView;
		

 
		if (convertView == null) {
 
			gridView = new View(context);
 
			// get layout from mobile.xml
			gridView = inflater.inflate(R.layout.mobile, null);
			Log.e("slide4", "2");
			// set value into textview
			TextView textView = (TextView) gridView.findViewById(R.id.grid_item_label1);
			textView.setText(mobileValues[position]);
			
			ImageView imageView = (ImageView) gridView.findViewById(R.id.grid_item_image1);
 
			String mobile = mobileValues[position];
			
			imageView.setImageResource(lev.myimg[position]);
				/*
			if (mobile.equals("Windows")) {
				imageView.setImageResource(R.drawable.s1);
			} else if (mobile.equals("iOS")) {
				imageView.setImageResource(R.drawable.s1);
			} else if (mobile.equals("Blackberry")) {
				imageView.setImageResource(R.drawable.s1);
			} else {
				imageView.setImageResource(R.drawable.s1);
			}
 			*/
		} else {
			gridView = (View) convertView;
		}
 
		return gridView;
	}
 
	@Override
	public int getCount() {
		return mobileValues.length;
	}
 
	@Override
	public Object getItem(int position) {
		return null;
	}
 
	@Override
	public long getItemId(int position) {
		return 0;
	}


 
}