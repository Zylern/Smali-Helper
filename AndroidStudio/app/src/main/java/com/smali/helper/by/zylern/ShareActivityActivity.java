package com.smali.helper.by.zylern;

import androidx.appcompat.app.AppCompatActivity;
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
import android.widget.LinearLayout;
import android.widget.Button;
import android.view.View;

public class ShareActivityActivity extends AppCompatActivity {
	
	
	private Toolbar _toolbar;
	
	private LinearLayout linear7;
	private LinearLayout linear8;
	private Button button6;
	private Button button7;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.share_activity);
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
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		button6 = (Button) findViewById(R.id.button6);
		button7 = (Button) findViewById(R.id.button7);
		
		button6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		button7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
	}
	private void initializeLogic() {
		StrictMode.VmPolicy.Builder builder =     new StrictMode.VmPolicy.Builder();     StrictMode.setVmPolicy(builder.build());     if(Build.VERSION.SDK_INT>=24){       try{         java.lang.reflect.Method m =        StrictMode.class.getMethod(         "disableDeathOnFileUriExposure");        m.invoke(null);        }       catch(Exception e){         showMessage(e.toString());        }     }
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	private void _share () {
	}
	private void shareApplication() {       android.content.pm.ApplicationInfo app =       getApplicationContext().getApplicationInfo();       String filePath = app.sourceDir;      Intent intent = new Intent(Intent.ACTION_SEND);       intent.setType("*/*");       java.io.File originalApk = new java.io.File(filePath);       try {         java.io.File tempFile = new java.io.File(getExternalCacheDir() + "/ExtractedApk");          if (!tempFile.isDirectory())          if (!tempFile.mkdirs())          return;          tempFile = new java.io.File(tempFile.getPath() + "/" +          "Smali Helper v1.0.apk");         if (!tempFile.exists())           {           try{             if (!tempFile.createNewFile()) {                return; }            }           catch (java.io.IOException e){}           }          java.io.InputStream in = new java.io.FileInputStream (originalApk);         java.io.OutputStream out = new java.io.FileOutputStream(tempFile);         byte[] buf = new byte[1024];         int len;          while ((len = in.read(buf)) > 0) {             out.write(buf, 0, len);          }          in.close();          out.close();          intent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(tempFile));         startActivity(Intent.createChooser(intent, "Share app via"));      }       catch (java.io.IOException e)       { showMessage(e.toString());       }    }
	{
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
