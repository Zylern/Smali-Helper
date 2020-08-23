package com.smali.helper.by.zylern;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
import androidx.appcompat.widget.Toolbar;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.graphics.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.text.*;
import android.widget.ScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class RegisterinfoActivity extends AppCompatActivity {
	
	
	private Toolbar _toolbar;
	
	private ScrollView vscroll4;
	private LinearLayout linear6;
	private TextView textview11;
	private TextView textview12;
	private TextView textview13;
	private TextView textview14;
	private TextView textview15;
	private TextView textview16;
	private TextView textview17;
	private TextView textview18;
	private TextView textview19;
	private TextView textview20;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.registerinfo);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		_toolbar = (Toolbar) findViewById(R.id._toolbar);
		setSupportActionBar(_toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				onBackPressed();
			}
		});
		vscroll4 = (ScrollView) findViewById(R.id.vscroll4);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		textview11 = (TextView) findViewById(R.id.textview11);
		textview12 = (TextView) findViewById(R.id.textview12);
		textview13 = (TextView) findViewById(R.id.textview13);
		textview14 = (TextView) findViewById(R.id.textview14);
		textview15 = (TextView) findViewById(R.id.textview15);
		textview16 = (TextView) findViewById(R.id.textview16);
		textview17 = (TextView) findViewById(R.id.textview17);
		textview18 = (TextView) findViewById(R.id.textview18);
		textview19 = (TextView) findViewById(R.id.textview19);
		textview20 = (TextView) findViewById(R.id.textview20);
	}
	private void initializeLogic() {
		setTitle("Register Information");
		textview14.setText("There are two ways to specify how many registers are available in a method. the .registers directive specifies the total number of registers in the method, while the alternate .locals directive specifies the number of non-parameter registers in the method. The total number of registers would also include however many registers are needed to hold the method parameters.");
		textview16.setText("When a method is invoked, the parameters to the method are placed into the last n registers. If a method has 2 arguments, and 5 registers (v0-v4), the arguments would be placed into the last 2 registers - v3 and v4.\n\nThe first parameter to a non-static methods is always the object that the method is being invoked on (the this object)\n\nFor example, let's say you are writing a non-static method LMyObject;->callMe(II)V. This method has 2 integer parameters, but it also has an implicit LMyObject; parameter before both integer parameters, so there are a total of 3 arguments to the method.\n\nLet's say you specify that there are 5 registers in the method (v0-v4), with either the .registers 5 directive or the .locals 2 directive (i.e. 2 local registers + 3 parameter registers). When the method is invoked, the object that the method is being invoked on (i.e. the this reference) will be in v2, the first integer parameter will be in v3, and the second integer parameter will be in v4.\n\nFor static methods it's the same thing, except there isn't an implicit this argument.");
		textview18.setText("There are two naming schemes for registers - the normal v# naming scheme and the p# naming scheme for parameter registers. The first register in the p# naming scheme is the first parameter register in the method. So let's go back to the previous example of a method with 3 arguments and 5 total registers. The following table shows the normal v# name for each register, followed by the p# name for the parameter registers\n\n•	v0		The first local register\n•	v1		The second local register\n•	v2	 p0	The first parameter register\n•	v3	 p1	The second parameter register\n•	v4	 p2	The third parameter register\n\nYou can reference parameter registers by either name - it makes no difference.\n\nMotivation for introducing parameter registers:\n\nThe p# naming scheme was introduced as a practical matter, to solve a common annoyance when editing smali code.\n\nSay you have an existing method with a number of parameters and you are adding some code to the method, and you discover that you need an extra register. You think \"No big deal, I'll just increase the number of registers specified in the .registers directive!\".\n\nUnfortunately, it isn't quite that easy. Keep in mind that the method parameters are stored in the last registers in the method. If you increase the number of registers - you change which registers the method arguments get put into. So you would have to change the .registers directive and renumber every parameter register.\n\nBut if the p# naming scheme was used to reference parameter registers throughout the method, you can easily change the number of registers in the method, without having to worry about renumbering any existing registers.");
		textview20.setText("As mentioned previously, long and double primitives (J and D respectively) are 64 bit values, and require 2 registers. This is important to keep in mind when you are referencing method arguments. For example, let's say you have a (non-static) method LMyObject;->MyMethod(IJZ)V. The parameters to the method are LMyObject;, int, long, bool. So this method would require 5 registers for all of its parameters.\n\n•	p0	           this\n•	p1	           I\n•	p2, p3	     J\n•	p4	          Z\n\nAlso, when you are invoking the method later on, you do have to specify both registers for any double-wide arguments in the register list for the invoke-kind instruction.");
		textview11.setTextIsSelectable(true);
		textview12.setTextIsSelectable(true);
		textview13.setTextIsSelectable(true);
		textview14.setTextIsSelectable(true);
		textview15.setTextIsSelectable(true);
		textview16.setTextIsSelectable(true);
		textview17.setTextIsSelectable(true);
		textview18.setTextIsSelectable(true);
		textview19.setTextIsSelectable(true);
		textview20.setTextIsSelectable(true);
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}
