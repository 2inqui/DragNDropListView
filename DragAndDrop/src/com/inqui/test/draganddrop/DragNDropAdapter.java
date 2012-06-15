package com.inqui.test.draganddrop;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class DragNDropAdapter extends BaseAdapter implements DropListener{
	
	ArrayList<Data> data;
	private LayoutInflater mInflater;
	
	Context mContext;
	/**
	 * Fill the adapter with the data contained in JSONArray
	 * 
	 * @param array The JSON Array with the data.
	 * @throws JSONException
	 */
	private void fillData(JSONArray array) throws JSONException{
		for(int i = 0 ; i < array.length() ; i++){
			JSONObject jsonObject = array.getJSONObject(i);
			data.add(new Data(jsonObject.getString("atribute-name"),"",jsonObject.getString("atribute-name")));
		}
		notifyDataSetChanged();
	}
	
	/**
	 * Fill the adapter with temp data.
	 */
	private void fillData(){
		data.add(new Data("Fer","Android",":)"));
		data.add(new Data("Ale","Java",";)"));
		data.add(new Data("Tere","C#",":P"));
		data.add(new Data("Game","SC2","_\\m/"));
		data.add(new Data("Fer","Android",":)"));
		data.add(new Data("Ale","Java",";)"));
		data.add(new Data("Tere","C#",":P"));
		data.add(new Data("Game","SC2","_\\m/"));
		data.add(new Data("Fer","Android",":)"));
		data.add(new Data("Ale","Java",";)"));
		data.add(new Data("Tere","C#",":P"));
		data.add(new Data("Game","SC2","_\\m/"));
		data.add(new Data("Fer","Android",":)"));
		data.add(new Data("Ale","Java",";)"));
		data.add(new Data("Tere","C#",":P"));
		data.add(new Data("Game","SC2","_\\m/"));
		data.add(new Data("Fer","Android",":)"));
		data.add(new Data("Ale","Java",";)"));
		data.add(new Data("Tere","C#",":P"));
		data.add(new Data("Game","SC2","_\\m/"));
		data.add(new Data("Fer","Android",":)"));
		data.add(new Data("Ale","Java",";)"));
		data.add(new Data("Tere","C#",":P"));
		data.add(new Data("Game","SC2","_\\m/"));
		data.add(new Data("Fer","Android",":)"));
		data.add(new Data("Ale","Java",";)"));
		data.add(new Data("Tere","C#",":P"));
		data.add(new Data("Game","SC2","_\\m/"));
		data.add(new Data("Fer","Android",":)"));
		data.add(new Data("Ale","Java",";)"));
		data.add(new Data("Tere","C#",":P"));
		data.add(new Data("Game","SC2","_\\m/"));
		data.add(new Data("Fer","Android",":)"));
		data.add(new Data("Ale","Java",";)"));
		data.add(new Data("Tere","C#",":P"));
		data.add(new Data("Game","SC2","_\\m/"));
		data.add(new Data("Fer","Android",":)"));
		data.add(new Data("Ale","Java",";)"));
		data.add(new Data("Tere","C#",":P"));
		data.add(new Data("Game","SC2","_\\m/"));
		data.add(new Data("Fer","Android",":)"));
		data.add(new Data("Ale","Java",";)"));
		data.add(new Data("Tere","C#",":P"));
		data.add(new Data("Game","SC2","_\\m/"));
		data.add(new Data("Fer","Android",":)"));
		data.add(new Data("Ale","Java",";)"));
		data.add(new Data("Tere","C#",":P"));
		data.add(new Data("Game","SC2","_\\m/"));
		data.add(new Data("Fer","Android",":)"));
		data.add(new Data("Ale","Java",";)"));
		data.add(new Data("Tere","C#",":P"));
		data.add(new Data("Game","SC2","_\\m/"));
		data.add(new Data("Fer","Android",":)"));
		data.add(new Data("Ale","Java",";)"));
		data.add(new Data("Tere","C#",":P"));
		data.add(new Data("Game","SC2","_\\m/"));
		data.add(new Data("Fer","Android",":)"));
		data.add(new Data("Ale","Java",";)"));
		data.add(new Data("Tere","C#",":P"));
		data.add(new Data("Game","SC2","_\\m/"));
		data.add(new Data("Fer","Android",":)"));
		data.add(new Data("Ale","Java",";)"));
		data.add(new Data("Tere","C#",":P"));
		data.add(new Data("Game","SC2","_\\m/"));
		data.add(new Data("Fer","Android",":)"));
		data.add(new Data("Ale","Java",";)"));
		data.add(new Data("Tere","C#",":P"));
		data.add(new Data("Game","SC2","_\\m/"));
		data.add(new Data("Fer","Android",":)"));
		data.add(new Data("Ale","Java",";)"));
		data.add(new Data("Tere","C#",":P"));
		data.add(new Data("Game","SC2","_\\m/"));
		data.add(new Data("Fer","Android",":)"));
		data.add(new Data("Ale","Java",";)"));
		data.add(new Data("Tere","C#",":P"));
		data.add(new Data("Game","SC2","_\\m/"));
		data.add(new Data("Fer","Android",":)"));
		data.add(new Data("Ale","Java",";)"));
		data.add(new Data("Tere","C#",":P"));
		data.add(new Data("Game","SC2","_\\m/"));
		data.add(new Data("Fer","Android",":)"));
		data.add(new Data("Ale","Java",";)"));
		data.add(new Data("Tere","C#",":P"));
		data.add(new Data("Game","SC2","_\\m/"));
		data.add(new Data("Fer","Android",":)"));
		data.add(new Data("Ale","Java",";)"));
		data.add(new Data("Tere","C#",":P"));
		data.add(new Data("Game","SC2","_\\m/"));
		data.add(new Data("Fer","Android",":)"));
		data.add(new Data("Ale","Java",";)"));
		data.add(new Data("Tere","C#",":P"));
		data.add(new Data("Game","SC2","_\\m/"));
		data.add(new Data("Fer","Android",":)"));
		data.add(new Data("Ale","Java",";)"));
		data.add(new Data("Tere","C#",":P"));
		data.add(new Data("Game","SC2","_\\m/"));
	}
	
	public DragNDropAdapter(Context context , JSONArray array){
		data = new ArrayList<DragNDropAdapter.Data>();
		if(array == null)
			fillData();
		else
			try {
				fillData(array);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		mInflater = LayoutInflater.from(context);
		this.mContext = context;
	}
	
	public void moveItem(int from,int to){
		Data aux = data.get(from);
		data.remove(from);
		data.add(to, aux);
		notifyDataSetChanged();
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return data.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return data.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		ViewHolder holder;
		if(arg1 == null){
			arg1 = mInflater.inflate(R.layout.list_item, null);
			holder = new ViewHolder();
			holder.name = (TextView)arg1.findViewById(R.id.list_item_name);
			holder.small = (TextView)arg1.findViewById(R.id.list_item_small);
			holder.etc = (TextView)arg1.findViewById(R.id.list_item_etc);
			arg1.setTag(holder);
		}else{
			holder = (ViewHolder) arg1.getTag();
		}
		
		holder.name.setText(data.get(arg0).name);
		holder.small.setText(data.get(arg0).small);
		holder.etc.setText(data.get(arg0).etc);
		
		return arg1;
	}
	
	private class ViewHolder{
		TextView name,small,etc;
	}
	
	private class Data{
		
		String name;
		String small;
		String etc;
		
		public Data(String a,String b, String c){
			this.name = a;
			this.small = b;
			this.etc = c;
		}
		
	}

	
	@Override
	public void onDrop(int from, int to) {
		moveItem(from, to);
	}

}
