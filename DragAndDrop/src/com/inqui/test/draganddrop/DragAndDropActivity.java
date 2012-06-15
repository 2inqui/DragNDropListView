package com.inqui.test.draganddrop;

import org.json.JSONArray;

import com.inqui.conections.HttpRequest;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;

public class DragAndDropActivity extends Activity{
	
	DragAndDropActivity context = this;
	DragNDropListView list;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        list = (DragNDropListView) findViewById(R.id.drag_n_drop_list);
        DragNDropAdapter adapter = new DragNDropAdapter(context,null);
        list.setAdapter(adapter);
        list.setDropListener(adapter);
        
        /**
         * This task was created to read data from WEB. 
         * Is required see HttpRequest Class in conections package
         */
//        new TaskGetProducts().execute(adapter);
        
        
    }
    
    
    private class TaskGetProducts extends AsyncTask<DragNDropAdapter, Void, JSONArray>{
    	
    	DragNDropAdapter adapter;

		@Override
		protected JSONArray doInBackground(DragNDropAdapter... params) {
			// TODO Auto-generated method stub
			adapter = params[0];
			return HttpRequest.getProducts();
		}

		@Override
		protected void onPostExecute(JSONArray result) {
			// TODO Auto-generated method stub
			super.onPostExecute(result);
			adapter = new DragNDropAdapter(context,result);
			list.setAdapter(adapter);
			list.setDropListener(adapter);
		}
    }
}