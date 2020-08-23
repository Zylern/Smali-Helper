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

public class SmaliinfoActivity extends AppCompatActivity {
	
	
	private Toolbar _toolbar;
	
	private ScrollView vscroll1;
	private LinearLayout linear1;
	private TextView textview1;
	private TextView textview2;
	private TextView textview3;
	private TextView textview4;
	private TextView textview5;
	private TextView textview6;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.smaliinfo);
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
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		textview1 = (TextView) findViewById(R.id.textview1);
		textview2 = (TextView) findViewById(R.id.textview2);
		textview3 = (TextView) findViewById(R.id.textview3);
		textview4 = (TextView) findViewById(R.id.textview4);
		textview5 = (TextView) findViewById(R.id.textview5);
		textview6 = (TextView) findViewById(R.id.textview6);
	}
	private void initializeLogic() {
		setTitle("Smali Information");
		textview2.setText("Dalvik's bytecode has two major classes of types, primitive types and reference types. Reference types are objects and arrays, everything else is a primitive.\n\nPrimitives are represented by a single letter. I didn't come up with these abbreviations - they are what is actually stored in the dex file, in string form. They are specified in the dex-format.html document (dalvik/docs/dex-format.html in the AOSP repository)\n\n•	V - Void - can only be used for return types\n•	Z - Boolean\n•	B - Byte\n•	S - Short\n•	C - Char\n•  I - Integer\n•	J - Long (64 bits)\n•	F - Float\n•	D - Double (64 bits)\n\nObjects take the form of Lpackage/name/ObjectName; - where the leading L indicates that it is an object type, package/name/ is the package that the object is in, ObjectName is the name of the object, and ; denotes the end of the object name. This would be equivalent to package.name.ObjectName in java. Or for a more concrete example, Ljava/lang/String; is equivalent to java.lang.String\n\nArrays take the form [I - this would be an array of integers with a single dimension. i.e. int[] in Java. For arrays with multiple dimensions, you simply add more [ characters. [[I = int[][], [[[I = int[][][], etc. (Note: The maximum number of dimensions you can have is 255).\n\nYou can also have arrays of objects, [Ljava/lang/String; would be an array of Strings.");
		textview4.setText("Methods are always specified in a very verbose form that includes the type that contains the method, the method name, the types of the parameters and the return type. All this information is required for the virtual machine to be able to find the correct method, and to be able to perform static analysis on the bytecode (for verification/optimization purposes)\n\nThey take the form of Lpackage/name/ObjectName;->MethodName(III)Z\n\nIn this example, you should recognize Lpackage/name/ObjectName; as a type. MethodName is obviously the name of the method. (III)Z is the method's signature. III are the parameters (in this case, 3 integers), and Z is the return type (bool).\n\nThe method parameters are listed one right after another, with no separators between them.\n\nHere's a more complex example:\n\nLpackage/name/ObjectName;->MethodName(I[[IILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;\n\nIn java, this would \n\nString MethodName(int, int[][], int, String, Object[])");
		textview6.setText("Fields are likewise always specified in verbose form that includes the type that contains the field, the name of the field, and the type of the field. Again, this is to allow the virtual machine to be able to find the correct field, as well as to perform static analysis on the bytecode.\n\nThey take the form of Lpackage/name/ObjectName;->FieldName:Ljava/lang/String;\n\nThis should be pretty self-explanatory - it is the package  and object name, the field name and the type of the field respectively.");
		textview1.setTextIsSelectable(true);
		textview2.setTextIsSelectable(true);
		textview3.setTextIsSelectable(true);
		textview4.setTextIsSelectable(true);
		textview5.setTextIsSelectable(true);
		textview6.setTextIsSelectable(true);
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
