package com.inqui.test.draganddrop;

import android.content.ClipData;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class DragNDropListView extends ListView{

	private DragNDropListView list = this;
	
	private int startPosition;
	private int endPosition;
	
	/**
	 * Object to handle on drop item event.
	 */
	private DropListener dropListener;
	
	public void setDropListener(DropListener d){
		dropListener = d;
	}
	
	/**
	 * Object to handle on item long click event
	 */
	private OnItemLongClickListener onItemLongClick = new OnItemLongClickListener() {

		@Override
		public boolean onItemLongClick(AdapterView<?> arg0, View v,
				int arg2, long arg3) {
			ClipData dragData = ClipData.newPlainText("Dragging", "Some Text");
			startPosition = arg2;
			View view = arg0.getChildAt(arg2);
			
			DragShadowBuilder shadowBuilder = new DragShadowBuilder(view);
			v.startDrag(dragData, shadowBuilder, null, 0);
			return false;
		}
	};
	
	
	/**
	 * Object to handle on drag events.
	 */
	private OnDragListener onDragListener = new OnDragListener() {
		
		@Override
		public boolean onDrag(View v, DragEvent event) {
			
			if(event.getAction() != DragEvent.ACTION_DRAG_ENDED){
				endPosition = list.pointToPosition((int)event.getX(), (int)event.getY());
			}
			if(endPosition != ListView.INVALID_POSITION)
				list.setItemChecked(endPosition, true);
			switch(event.getAction()){
			case DragEvent.ACTION_DRAG_STARTED:
				break;
			case DragEvent.ACTION_DROP:
				break;
			case DragEvent.ACTION_DRAG_ENTERED:
				if(endPosition != ListView.INVALID_POSITION)
					list.setItemChecked(endPosition, true);
			case DragEvent.ACTION_DRAG_ENDED:
				if(dropListener != null && startPosition != ListView.INVALID_POSITION && endPosition != ListView.INVALID_POSITION)
					dropListener.onDrop(startPosition, endPosition);
				break;
			}
			Log.v(null,"Start position: " + startPosition +" End position: " + endPosition);
			return true;
		}
	};
	
	
	/**
	 * Constructor
	 * @param context
	 * @param attrs
	 */
	public DragNDropListView(Context context, AttributeSet attrs) {
		super(context, attrs);
		this.setOnItemLongClickListener(onItemLongClick);
		this.setOnDragListener(onDragListener);
	}
	
	

}
