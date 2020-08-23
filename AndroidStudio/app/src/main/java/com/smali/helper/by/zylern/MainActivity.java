package com.smali.helper.by.zylern;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import android.widget.LinearLayout;
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
import java.util.ArrayList;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Button;
import android.widget.ImageView;
import android.content.Context;
import android.os.Vibrator;
import java.util.Timer;
import java.util.TimerTask;
import android.content.Intent;
import android.net.Uri;
import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.View;

public class MainActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private Toolbar _toolbar;
	private DrawerLayout _drawer;
	private double check = 0;
	private String Share = "";
	
	private ArrayList<Double> double_exit = new ArrayList<>();
	
	private LinearLayout linear24;
	private ScrollView vscroll5;
	private TextView textview2;
	private LinearLayout linear6;
	private LinearLayout linear25;
	private LinearLayout linear8;
	private LinearLayout linear9;
	private LinearLayout linear10;
	private LinearLayout linear11;
	private LinearLayout linear12;
	private LinearLayout linear13;
	private LinearLayout linear14;
	private LinearLayout linear15;
	private LinearLayout linear16;
	private LinearLayout linear17;
	private LinearLayout linear18;
	private LinearLayout linear19;
	private LinearLayout linear20;
	private LinearLayout linear21;
	private LinearLayout linear22;
	private LinearLayout linear23;
	private TextView textview3;
	private Button button1;
	private Button button3;
	private Button button2;
	private Button button4;
	private Button button5;
	private Button button6;
	private Button button8;
	private Button button7;
	private Button button9;
	private Button button10;
	private Button button11;
	private Button button12;
	private Button button13;
	private Button button14;
	private Button button15;
	private Button button16;
	private Button button17;
	private LinearLayout _drawer_linear1;
	private LinearLayout _drawer_linear8;
	private ImageView _drawer_imageview2;
	private TextView _drawer_textview1;
	private LinearLayout _drawer_linear9;
	private LinearLayout _drawer_linear22;
	private LinearLayout _drawer_linear23;
	private LinearLayout _drawer_linear11;
	private LinearLayout _drawer_linear13;
	private LinearLayout _drawer_linear21;
	private ImageView _drawer_imageview5;
	private TextView _drawer_textview3;
	private ImageView _drawer_imageview7;
	private TextView _drawer_textview5;
	private ImageView _drawer_imageview11;
	private TextView _drawer_textview17;
	private ImageView _drawer_imageview9;
	private TextView _drawer_textview6;
	private ImageView _drawer_imageview8;
	private TextView _drawer_textview15;
	private TextView _drawer_textview14;
	
	private Vibrator vibrator;
	private TimerTask time;
	private Intent intent = new Intent();
	private ObjectAnimator animator = new ObjectAnimator();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
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
		_drawer = (DrawerLayout) findViewById(R.id._drawer);ActionBarDrawerToggle _toggle = new ActionBarDrawerToggle(MainActivity.this, _drawer, _toolbar, R.string.app_name, R.string.app_name);
		_drawer.addDrawerListener(_toggle);
		_toggle.syncState();
		
		LinearLayout _nav_view = (LinearLayout) findViewById(R.id._nav_view);
		
		linear24 = (LinearLayout) findViewById(R.id.linear24);
		vscroll5 = (ScrollView) findViewById(R.id.vscroll5);
		textview2 = (TextView) findViewById(R.id.textview2);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		linear25 = (LinearLayout) findViewById(R.id.linear25);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		linear14 = (LinearLayout) findViewById(R.id.linear14);
		linear15 = (LinearLayout) findViewById(R.id.linear15);
		linear16 = (LinearLayout) findViewById(R.id.linear16);
		linear17 = (LinearLayout) findViewById(R.id.linear17);
		linear18 = (LinearLayout) findViewById(R.id.linear18);
		linear19 = (LinearLayout) findViewById(R.id.linear19);
		linear20 = (LinearLayout) findViewById(R.id.linear20);
		linear21 = (LinearLayout) findViewById(R.id.linear21);
		linear22 = (LinearLayout) findViewById(R.id.linear22);
		linear23 = (LinearLayout) findViewById(R.id.linear23);
		textview3 = (TextView) findViewById(R.id.textview3);
		button1 = (Button) findViewById(R.id.button1);
		button3 = (Button) findViewById(R.id.button3);
		button2 = (Button) findViewById(R.id.button2);
		button4 = (Button) findViewById(R.id.button4);
		button5 = (Button) findViewById(R.id.button5);
		button6 = (Button) findViewById(R.id.button6);
		button8 = (Button) findViewById(R.id.button8);
		button7 = (Button) findViewById(R.id.button7);
		button9 = (Button) findViewById(R.id.button9);
		button10 = (Button) findViewById(R.id.button10);
		button11 = (Button) findViewById(R.id.button11);
		button12 = (Button) findViewById(R.id.button12);
		button13 = (Button) findViewById(R.id.button13);
		button14 = (Button) findViewById(R.id.button14);
		button15 = (Button) findViewById(R.id.button15);
		button16 = (Button) findViewById(R.id.button16);
		button17 = (Button) findViewById(R.id.button17);
		_drawer_linear1 = (LinearLayout) _nav_view.findViewById(R.id.linear1);
		_drawer_linear8 = (LinearLayout) _nav_view.findViewById(R.id.linear8);
		_drawer_imageview2 = (ImageView) _nav_view.findViewById(R.id.imageview2);
		_drawer_textview1 = (TextView) _nav_view.findViewById(R.id.textview1);
		_drawer_linear9 = (LinearLayout) _nav_view.findViewById(R.id.linear9);
		_drawer_linear22 = (LinearLayout) _nav_view.findViewById(R.id.linear22);
		_drawer_linear23 = (LinearLayout) _nav_view.findViewById(R.id.linear23);
		_drawer_linear11 = (LinearLayout) _nav_view.findViewById(R.id.linear11);
		_drawer_linear13 = (LinearLayout) _nav_view.findViewById(R.id.linear13);
		_drawer_linear21 = (LinearLayout) _nav_view.findViewById(R.id.linear21);
		_drawer_imageview5 = (ImageView) _nav_view.findViewById(R.id.imageview5);
		_drawer_textview3 = (TextView) _nav_view.findViewById(R.id.textview3);
		_drawer_imageview7 = (ImageView) _nav_view.findViewById(R.id.imageview7);
		_drawer_textview5 = (TextView) _nav_view.findViewById(R.id.textview5);
		_drawer_imageview11 = (ImageView) _nav_view.findViewById(R.id.imageview11);
		_drawer_textview17 = (TextView) _nav_view.findViewById(R.id.textview17);
		_drawer_imageview9 = (ImageView) _nav_view.findViewById(R.id.imageview9);
		_drawer_textview6 = (TextView) _nav_view.findViewById(R.id.textview6);
		_drawer_imageview8 = (ImageView) _nav_view.findViewById(R.id.imageview8);
		_drawer_textview15 = (TextView) _nav_view.findViewById(R.id.textview15);
		_drawer_textview14 = (TextView) _nav_view.findViewById(R.id.textview14);
		vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), ArrayActivity.class);
				startActivity(intent);
			}
		});
		
		button3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), ArrayaccessorsActivity.class);
				startActivity(intent);
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), ComparisionActivity.class);
				startActivity(intent);
			}
		});
		
		button4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), ConstantActivity.class);
				startActivity(intent);
			}
		});
		
		button5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), ConversionActivity.class);
				startActivity(intent);
			}
		});
		
		button6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), GeneralhelpActivity.class);
				startActivity(intent);
			}
		});
		
		button8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Goto01Activity.class);
				startActivity(intent);
			}
		});
		
		button7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), IfcodeActivity.class);
				startActivity(intent);
			}
		});
		
		button9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), InstanceaccessorsActivity.class);
				startActivity(intent);
			}
		});
		
		button10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), InvokeActivity.class);
				startActivity(intent);
			}
		});
		
		button11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), MiscActivity.class);
				startActivity(intent);
			}
		});
		
		button12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), MonitorActivity.class);
				startActivity(intent);
			}
		});
		
		button13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), MoveActivity.class);
				startActivity(intent);
			}
		});
		
		button14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), OperationsActivity.class);
				startActivity(intent);
			}
		});
		
		button15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), ReturnnewActivity.class);
				startActivity(intent);
			}
		});
		
		button16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), StaticaccessorsActivity.class);
				startActivity(intent);
			}
		});
		
		button17.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), SwitchnewActivity.class);
				startActivity(intent);
			}
		});
		
		_drawer_linear1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		_drawer_linear8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		_drawer_imageview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		_drawer_textview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		_drawer_linear9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		_drawer_linear22.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		_drawer_linear23.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		_drawer_linear11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		_drawer_linear13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		_drawer_linear21.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		_drawer_imageview5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), AboutusActivity.class);
				startActivity(intent);
			}
		});
		
		_drawer_textview3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), AboutusActivity.class);
				startActivity(intent);
			}
		});
		
		_drawer_imageview7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent send_mail = new
				Intent(Intent.ACTION_VIEW,
				Uri.parse("mailto:coolzylern@gmail.com"));
				startActivity(send_mail);
			}
		});
		
		_drawer_textview5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent send_mail = new
				Intent(Intent.ACTION_VIEW,
				Uri.parse("mailto:coolzylern@gmail.com"));
				startActivity(send_mail);
			}
		});
		
		_drawer_imageview11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), PrivacyActivity.class);
				startActivity(intent);
			}
		});
		
		_drawer_textview17.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), PrivacyActivity.class);
				startActivity(intent);
			}
		});
		
		_drawer_imageview9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				shareApplication();
			}
		});
		
		_drawer_textview6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				shareApplication();
			}
		});
		
		_drawer_imageview8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Thanks For Using");
				finish();
			}
		});
		
		_drawer_textview15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Thanks For Using");
				finish();
			}
		});
		
		_drawer_textview14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
	}
	private void initializeLogic() {
		time = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						intent.setClass(getApplicationContext(), SplashscreenActivity.class);
						startActivity(intent);
					}
				});
			}
		};
		_timer.schedule(time, (int)(0));
		time = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						animator.setTarget(linear24);
						animator.setPropertyName("translationX");
						animator.setFloatValues((float)(1000), (float)(0));
						animator.setDuration((int)(3000));
						animator.setInterpolator(new BounceInterpolator());
						animator.start();
					}
				});
			}
		};
		_timer.schedule(time, (int)(3000));
		check = 0;
		StrictMode.VmPolicy.Builder builder =     new StrictMode.VmPolicy.Builder();     StrictMode.setVmPolicy(builder.build());     if(Build.VERSION.SDK_INT>=24){       try{         java.lang.reflect.Method m =        StrictMode.class.getMethod(         "disableDeathOnFileUriExposure");        m.invoke(null);        }       catch(Exception e){         showMessage(e.toString());        }     }
		android.graphics.drawable.GradientDrawable zylern = new android.graphics.drawable.GradientDrawable(); zylern.setColor(Color.parseColor("#409FEF"));zylern.setCornerRadius(45); button1.setBackground(zylern);
		button2.setBackground(zylern);
		button3.setBackground(zylern);
		button4.setBackground(zylern);
		button5.setBackground(zylern);
		button6.setBackground(zylern);
		button7.setBackground(zylern);
		button8.setBackground(zylern);
		button9.setBackground(zylern);
		button10.setBackground(zylern);
		button11.setBackground(zylern);
		button12.setBackground(zylern);
		button13.setBackground(zylern);
		button14.setBackground(zylern);
		button15.setBackground(zylern);
		button16.setBackground(zylern);
		button17.setBackground(zylern);
		android.graphics.drawable.RippleDrawable zylernisbest = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{Color.parseColor("#9e9e9e")}), new android.graphics.drawable.ColorDrawable(Color.parseColor("#eeeeee")), null);
		
		_drawer_textview15.setBackground(zylernisbest);
		android.graphics.drawable.RippleDrawable madebyzylern = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{Color.parseColor("#9e9e9e")}), new android.graphics.drawable.ColorDrawable(Color.parseColor("#eeeeee")), null);
		
		_drawer_textview6.setBackground(madebyzylern);
		android.graphics.drawable.RippleDrawable ripdr3 = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{Color.parseColor("#9e9e9e")}), new android.graphics.drawable.ColorDrawable(Color.parseColor("#eeeeee")), null);
		
		_drawer_imageview8.setBackground(ripdr3);
		android.graphics.drawable.RippleDrawable ripdr4 = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{Color.parseColor("#9e9e9e")}), new android.graphics.drawable.ColorDrawable(Color.parseColor("#eeeeee")), null);
		
		_drawer_imageview9.setBackground(ripdr4);
		android.graphics.drawable.RippleDrawable ripdr5 = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{Color.parseColor("#9e9e9e")}), new android.graphics.drawable.ColorDrawable(Color.parseColor("#eeeeee")), null);
		
		_drawer_textview5.setBackground(ripdr5);
		android.graphics.drawable.RippleDrawable ripdr6 = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{Color.parseColor("#9e9e9e")}), new android.graphics.drawable.ColorDrawable(Color.parseColor("#eeeeee")), null);
		
		_drawer_imageview7.setBackground(ripdr6);
		android.graphics.drawable.RippleDrawable ripdr10 = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{Color.parseColor("#9e9e9e")}), new android.graphics.drawable.ColorDrawable(Color.parseColor("#eeeeee")), null);
		
		_drawer_imageview5.setBackground(ripdr10);
		android.graphics.drawable.RippleDrawable ripdr11 = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{Color.parseColor("#9e9e9e")}), new android.graphics.drawable.ColorDrawable(Color.parseColor("#eeeeee")), null);
		
		_drawer_imageview11.setBackground(ripdr11);
		android.graphics.drawable.RippleDrawable ripdr12 = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{Color.parseColor("#9e9e9e")}), new android.graphics.drawable.ColorDrawable(Color.parseColor("#eeeeee")), null);
		
		_drawer_textview17.setBackground(ripdr12);
		android.graphics.drawable.RippleDrawable ripdr9 = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{Color.parseColor("#9e9e9e")}), new android.graphics.drawable.ColorDrawable(Color.parseColor("#eeeeee")), null);
		
		_drawer_textview3.setBackground(ripdr9);
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Override
	public void onBackPressed() {
		check++;
		if (check == 1) {
			SketchwareUtil.showMessage(getApplicationContext(), "Press Back Again To Exit");
		}
		if (check == 2) {
			finish();
		}
	}
	private void _share () {
	}
	private void shareApplication() {       android.content.pm.ApplicationInfo app =       getApplicationContext().getApplicationInfo();       String filePath = app.sourceDir;      Intent intent = new Intent(Intent.ACTION_SEND);       intent.setType("*/*");       java.io.File originalApk = new java.io.File(filePath);       try {         java.io.File tempFile = new java.io.File(getExternalCacheDir() + "/ExtractedApk");          if (!tempFile.isDirectory())          if (!tempFile.mkdirs())          return;          tempFile = new java.io.File(tempFile.getPath() + "/" +          "Smali Helper v1.0.apk");         if (!tempFile.exists())           {           try{             if (!tempFile.createNewFile()) {                return; }            }           catch (java.io.IOException e){}           }          java.io.InputStream in = new java.io.FileInputStream (originalApk);         java.io.OutputStream out = new java.io.FileOutputStream(tempFile);         byte[] buf = new byte[1024];         int len;          while ((len = in.read(buf)) > 0) {             out.write(buf, 0, len);          }          in.close();          out.close();          intent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(tempFile));         startActivity(Intent.createChooser(intent, "Share app via"));      }       catch (java.io.IOException e)       { showMessage(e.toString());       }    }
	{
	}
	
	
	private void _touch (final View _view, final boolean _touch) {
		if (_touch) {
			_view.setOnTouchListener(new View.OnTouchListener() {
				@Override
				public boolean onTouch(View v, MotionEvent event) {
					switch (event.getAction()){
						case MotionEvent.ACTION_DOWN:{
							ObjectAnimator scaleX = new ObjectAnimator();
							scaleX.setTarget(_view);
							scaleX.setPropertyName("scaleX");
							scaleX.setFloatValues(0.9f);
							scaleX.setDuration(100);
							scaleX.start();
							
							ObjectAnimator scaleY = new ObjectAnimator();
							scaleY.setTarget(_view);
							scaleY.setPropertyName("scaleY");
							scaleY.setFloatValues(0.9f);
							scaleY.setDuration(100);
							scaleY.start();
							break;
						}
						case MotionEvent.ACTION_UP:{
							
							ObjectAnimator scaleX = new ObjectAnimator();
							scaleX.setTarget(_view);
							scaleX.setPropertyName("scaleX");
							scaleX.setFloatValues((float)1);
							scaleX.setDuration(100);
							scaleX.start();
							
							ObjectAnimator scaleY = new ObjectAnimator();
							scaleY.setTarget(_view);
							scaleY.setPropertyName("scaleY");
							scaleY.setFloatValues((float)1);
							scaleY.setDuration(100);
							scaleY.start();
							
							break;
						}
					}
					return false;
				}
			});
		}
	}
	
	
	private void _customToast (final String _text) {
		LayoutInflater inflater = getLayoutInflater(); View toastLayout = inflater.inflate(R.layout.custom, null);
		
		TextView textview1 = (TextView) toastLayout.findViewById(R.id.textview1);
		textview1.setText(_text);
		LinearLayout linear1 = (LinearLayout) toastLayout.findViewById(R.id.linear1);
		
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
		gd.setColor(Color.parseColor("#ffffff"));
		gd.setCornerRadius(25);
		gd.setStroke(4, Color.parseColor("#0097a7"));
		linear1.setBackground(gd);
		
		Toast toast = new Toast(getApplicationContext()); toast.setDuration(Toast.LENGTH_SHORT);
		toast.setView(toastLayout);
		toast.show();
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
