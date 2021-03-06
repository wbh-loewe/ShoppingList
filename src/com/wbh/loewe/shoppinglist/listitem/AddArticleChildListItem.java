package com.wbh.loewe.shoppinglist.listitem;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;


public class AddArticleChildListItem extends ChildListItem implements TextWatcher {

	private int mGroupPos;
	private int mChildPos;
	private float mQuantity;
	private boolean mSelected;
	private TextView mTxtArticle;
	private TextView mTxtQuantity;
	private TextView mTxtQuantityName;
	
	public AddArticleChildListItem() {
		super();
		this.mGroupPos = -1;
		this.mChildPos = -1;
		this.mSelected = false;
		this.mQuantity = 1;
	}

	public void setGroupPos(int aPos) {
		
		this.mGroupPos = aPos;
	}
	
	public int getGroupPos() {
		
		return this.mGroupPos;
	}
	
	public void setChildPos(int aPos) {
		
		this.mChildPos = aPos;
	}
	
	public int getChildPos() {
		
		return this.mChildPos;
	}
	
	public void setSelected(boolean aSelected) {
		this.mSelected = aSelected;
	}
	
	public boolean getSelected() {
		return this.mSelected;
	}
	
	public void setQuantity(float aValue) {
		this.mQuantity = aValue;
	}
	
	public float getQuantity() {
		return this.mQuantity;
	}
	
	public void setTxtArticle(TextView aView) {
		this.mTxtArticle = aView;
	}
	
	public TextView getTxtArticle() {
		return this.mTxtArticle;
	}
	
	public void setTxtQuantity(TextView aView) {
		this.mTxtQuantity = aView;
	}
	
	public TextView getTxtQuantity() {
		return this.mTxtQuantity;
	}
	
	public void setTxtQuantityName(TextView aView) {
		this.mTxtQuantityName = aView;
	}
	
	public TextView getTxtQuantityName() {
		return this.mTxtQuantityName;
	}
	
	public void afterTextChanged(Editable s) {
		String lText = s.toString();
		float lQuantity = -1;
		if (lText.length() > 0) {
			try {
				lQuantity = Float.valueOf(lText);
			}
			catch (NumberFormatException e) {
				lQuantity = 0; 
			}
		}
		
		if ((lQuantity != -1) && (lQuantity != mQuantity)) {
			mQuantity = lQuantity;
		}
	}

	public void beforeTextChanged(CharSequence s, int start, int count, int after) {
		// TODO Auto-generated method stub
		
	}

	public void onTextChanged(CharSequence s, int start, int before, int count) {
		// TODO Auto-generated method stub
		
	}
}
