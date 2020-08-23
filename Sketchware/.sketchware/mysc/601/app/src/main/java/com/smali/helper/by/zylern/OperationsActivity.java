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
import android.widget.Button;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

public class OperationsActivity extends AppCompatActivity {
	
	
	private Toolbar _toolbar;
	
	private ScrollView vscroll1;
	private LinearLayout linear1;
	private LinearLayout linear21;
	private LinearLayout linear22;
	private LinearLayout linear23;
	private LinearLayout linear24;
	private LinearLayout linear25;
	private LinearLayout linear26;
	private LinearLayout linear27;
	private LinearLayout linear28;
	private LinearLayout linear29;
	private LinearLayout linear30;
	private LinearLayout linear84;
	private LinearLayout linear31;
	private LinearLayout linear32;
	private LinearLayout linear33;
	private LinearLayout linear34;
	private LinearLayout linear35;
	private LinearLayout linear36;
	private LinearLayout linear37;
	private LinearLayout linear38;
	private LinearLayout linear39;
	private LinearLayout linear40;
	private LinearLayout linear41;
	private LinearLayout linear42;
	private LinearLayout linear43;
	private LinearLayout linear44;
	private LinearLayout linear45;
	private LinearLayout linear46;
	private LinearLayout linear47;
	private LinearLayout linear48;
	private LinearLayout linear49;
	private LinearLayout linear50;
	private LinearLayout linear51;
	private LinearLayout linear52;
	private LinearLayout linear53;
	private LinearLayout linear54;
	private LinearLayout linear55;
	private LinearLayout linear56;
	private LinearLayout linear57;
	private LinearLayout linear58;
	private LinearLayout linear59;
	private LinearLayout linear60;
	private LinearLayout linear61;
	private LinearLayout linear62;
	private LinearLayout linear63;
	private LinearLayout linear64;
	private LinearLayout linear65;
	private LinearLayout linear66;
	private LinearLayout linear67;
	private LinearLayout linear68;
	private LinearLayout linear69;
	private LinearLayout linear70;
	private LinearLayout linear71;
	private LinearLayout linear72;
	private LinearLayout linear73;
	private LinearLayout linear74;
	private LinearLayout linear75;
	private LinearLayout linear76;
	private LinearLayout linear77;
	private LinearLayout linear78;
	private LinearLayout linear79;
	private LinearLayout linear80;
	private LinearLayout linear81;
	private LinearLayout linear82;
	private LinearLayout linear83;
	private LinearLayout linear15;
	private LinearLayout linear16;
	private LinearLayout linear17;
	private LinearLayout linear18;
	private LinearLayout linear19;
	private LinearLayout linear20;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private LinearLayout linear5;
	private LinearLayout linear6;
	private LinearLayout linear7;
	private LinearLayout linear8;
	private LinearLayout linear9;
	private LinearLayout linear10;
	private LinearLayout linear11;
	private LinearLayout linear12;
	private LinearLayout linear13;
	private LinearLayout linear14;
	private Button button20;
	private Button button22;
	private Button button21;
	private Button button24;
	private Button button23;
	private Button button25;
	private Button button26;
	private Button button28;
	private Button button27;
	private Button button29;
	private Button button83;
	private Button button31;
	private Button button30;
	private Button button33;
	private Button button32;
	private Button button35;
	private Button button34;
	private Button button36;
	private Button button38;
	private Button button37;
	private Button button39;
	private Button button40;
	private Button button41;
	private Button button42;
	private Button button43;
	private Button button44;
	private Button button46;
	private Button button45;
	private Button button47;
	private Button button49;
	private Button button48;
	private Button button50;
	private Button button51;
	private Button button53;
	private Button button52;
	private Button button55;
	private Button button54;
	private Button button56;
	private Button button57;
	private Button button59;
	private Button button58;
	private Button button60;
	private Button button62;
	private Button button61;
	private Button button63;
	private Button button64;
	private Button button65;
	private Button button67;
	private Button button66;
	private Button button68;
	private Button button69;
	private Button button70;
	private Button button71;
	private Button button72;
	private Button button73;
	private Button button74;
	private Button button76;
	private Button button75;
	private Button button77;
	private Button button78;
	private Button button80;
	private Button button79;
	private Button button82;
	private Button button81;
	private Button button2;
	private Button button1;
	private Button button3;
	private Button button4;
	private Button button5;
	private Button button6;
	private Button button7;
	private Button button8;
	private Button button9;
	private Button button10;
	private Button button11;
	private Button button12;
	private Button button13;
	private Button button14;
	private Button button15;
	private Button button17;
	private Button button16;
	private Button button19;
	private Button button18;
	
	private Intent intent = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.operations);
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
		linear21 = (LinearLayout) findViewById(R.id.linear21);
		linear22 = (LinearLayout) findViewById(R.id.linear22);
		linear23 = (LinearLayout) findViewById(R.id.linear23);
		linear24 = (LinearLayout) findViewById(R.id.linear24);
		linear25 = (LinearLayout) findViewById(R.id.linear25);
		linear26 = (LinearLayout) findViewById(R.id.linear26);
		linear27 = (LinearLayout) findViewById(R.id.linear27);
		linear28 = (LinearLayout) findViewById(R.id.linear28);
		linear29 = (LinearLayout) findViewById(R.id.linear29);
		linear30 = (LinearLayout) findViewById(R.id.linear30);
		linear84 = (LinearLayout) findViewById(R.id.linear84);
		linear31 = (LinearLayout) findViewById(R.id.linear31);
		linear32 = (LinearLayout) findViewById(R.id.linear32);
		linear33 = (LinearLayout) findViewById(R.id.linear33);
		linear34 = (LinearLayout) findViewById(R.id.linear34);
		linear35 = (LinearLayout) findViewById(R.id.linear35);
		linear36 = (LinearLayout) findViewById(R.id.linear36);
		linear37 = (LinearLayout) findViewById(R.id.linear37);
		linear38 = (LinearLayout) findViewById(R.id.linear38);
		linear39 = (LinearLayout) findViewById(R.id.linear39);
		linear40 = (LinearLayout) findViewById(R.id.linear40);
		linear41 = (LinearLayout) findViewById(R.id.linear41);
		linear42 = (LinearLayout) findViewById(R.id.linear42);
		linear43 = (LinearLayout) findViewById(R.id.linear43);
		linear44 = (LinearLayout) findViewById(R.id.linear44);
		linear45 = (LinearLayout) findViewById(R.id.linear45);
		linear46 = (LinearLayout) findViewById(R.id.linear46);
		linear47 = (LinearLayout) findViewById(R.id.linear47);
		linear48 = (LinearLayout) findViewById(R.id.linear48);
		linear49 = (LinearLayout) findViewById(R.id.linear49);
		linear50 = (LinearLayout) findViewById(R.id.linear50);
		linear51 = (LinearLayout) findViewById(R.id.linear51);
		linear52 = (LinearLayout) findViewById(R.id.linear52);
		linear53 = (LinearLayout) findViewById(R.id.linear53);
		linear54 = (LinearLayout) findViewById(R.id.linear54);
		linear55 = (LinearLayout) findViewById(R.id.linear55);
		linear56 = (LinearLayout) findViewById(R.id.linear56);
		linear57 = (LinearLayout) findViewById(R.id.linear57);
		linear58 = (LinearLayout) findViewById(R.id.linear58);
		linear59 = (LinearLayout) findViewById(R.id.linear59);
		linear60 = (LinearLayout) findViewById(R.id.linear60);
		linear61 = (LinearLayout) findViewById(R.id.linear61);
		linear62 = (LinearLayout) findViewById(R.id.linear62);
		linear63 = (LinearLayout) findViewById(R.id.linear63);
		linear64 = (LinearLayout) findViewById(R.id.linear64);
		linear65 = (LinearLayout) findViewById(R.id.linear65);
		linear66 = (LinearLayout) findViewById(R.id.linear66);
		linear67 = (LinearLayout) findViewById(R.id.linear67);
		linear68 = (LinearLayout) findViewById(R.id.linear68);
		linear69 = (LinearLayout) findViewById(R.id.linear69);
		linear70 = (LinearLayout) findViewById(R.id.linear70);
		linear71 = (LinearLayout) findViewById(R.id.linear71);
		linear72 = (LinearLayout) findViewById(R.id.linear72);
		linear73 = (LinearLayout) findViewById(R.id.linear73);
		linear74 = (LinearLayout) findViewById(R.id.linear74);
		linear75 = (LinearLayout) findViewById(R.id.linear75);
		linear76 = (LinearLayout) findViewById(R.id.linear76);
		linear77 = (LinearLayout) findViewById(R.id.linear77);
		linear78 = (LinearLayout) findViewById(R.id.linear78);
		linear79 = (LinearLayout) findViewById(R.id.linear79);
		linear80 = (LinearLayout) findViewById(R.id.linear80);
		linear81 = (LinearLayout) findViewById(R.id.linear81);
		linear82 = (LinearLayout) findViewById(R.id.linear82);
		linear83 = (LinearLayout) findViewById(R.id.linear83);
		linear15 = (LinearLayout) findViewById(R.id.linear15);
		linear16 = (LinearLayout) findViewById(R.id.linear16);
		linear17 = (LinearLayout) findViewById(R.id.linear17);
		linear18 = (LinearLayout) findViewById(R.id.linear18);
		linear19 = (LinearLayout) findViewById(R.id.linear19);
		linear20 = (LinearLayout) findViewById(R.id.linear20);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		linear14 = (LinearLayout) findViewById(R.id.linear14);
		button20 = (Button) findViewById(R.id.button20);
		button22 = (Button) findViewById(R.id.button22);
		button21 = (Button) findViewById(R.id.button21);
		button24 = (Button) findViewById(R.id.button24);
		button23 = (Button) findViewById(R.id.button23);
		button25 = (Button) findViewById(R.id.button25);
		button26 = (Button) findViewById(R.id.button26);
		button28 = (Button) findViewById(R.id.button28);
		button27 = (Button) findViewById(R.id.button27);
		button29 = (Button) findViewById(R.id.button29);
		button83 = (Button) findViewById(R.id.button83);
		button31 = (Button) findViewById(R.id.button31);
		button30 = (Button) findViewById(R.id.button30);
		button33 = (Button) findViewById(R.id.button33);
		button32 = (Button) findViewById(R.id.button32);
		button35 = (Button) findViewById(R.id.button35);
		button34 = (Button) findViewById(R.id.button34);
		button36 = (Button) findViewById(R.id.button36);
		button38 = (Button) findViewById(R.id.button38);
		button37 = (Button) findViewById(R.id.button37);
		button39 = (Button) findViewById(R.id.button39);
		button40 = (Button) findViewById(R.id.button40);
		button41 = (Button) findViewById(R.id.button41);
		button42 = (Button) findViewById(R.id.button42);
		button43 = (Button) findViewById(R.id.button43);
		button44 = (Button) findViewById(R.id.button44);
		button46 = (Button) findViewById(R.id.button46);
		button45 = (Button) findViewById(R.id.button45);
		button47 = (Button) findViewById(R.id.button47);
		button49 = (Button) findViewById(R.id.button49);
		button48 = (Button) findViewById(R.id.button48);
		button50 = (Button) findViewById(R.id.button50);
		button51 = (Button) findViewById(R.id.button51);
		button53 = (Button) findViewById(R.id.button53);
		button52 = (Button) findViewById(R.id.button52);
		button55 = (Button) findViewById(R.id.button55);
		button54 = (Button) findViewById(R.id.button54);
		button56 = (Button) findViewById(R.id.button56);
		button57 = (Button) findViewById(R.id.button57);
		button59 = (Button) findViewById(R.id.button59);
		button58 = (Button) findViewById(R.id.button58);
		button60 = (Button) findViewById(R.id.button60);
		button62 = (Button) findViewById(R.id.button62);
		button61 = (Button) findViewById(R.id.button61);
		button63 = (Button) findViewById(R.id.button63);
		button64 = (Button) findViewById(R.id.button64);
		button65 = (Button) findViewById(R.id.button65);
		button67 = (Button) findViewById(R.id.button67);
		button66 = (Button) findViewById(R.id.button66);
		button68 = (Button) findViewById(R.id.button68);
		button69 = (Button) findViewById(R.id.button69);
		button70 = (Button) findViewById(R.id.button70);
		button71 = (Button) findViewById(R.id.button71);
		button72 = (Button) findViewById(R.id.button72);
		button73 = (Button) findViewById(R.id.button73);
		button74 = (Button) findViewById(R.id.button74);
		button76 = (Button) findViewById(R.id.button76);
		button75 = (Button) findViewById(R.id.button75);
		button77 = (Button) findViewById(R.id.button77);
		button78 = (Button) findViewById(R.id.button78);
		button80 = (Button) findViewById(R.id.button80);
		button79 = (Button) findViewById(R.id.button79);
		button82 = (Button) findViewById(R.id.button82);
		button81 = (Button) findViewById(R.id.button81);
		button2 = (Button) findViewById(R.id.button2);
		button1 = (Button) findViewById(R.id.button1);
		button3 = (Button) findViewById(R.id.button3);
		button4 = (Button) findViewById(R.id.button4);
		button5 = (Button) findViewById(R.id.button5);
		button6 = (Button) findViewById(R.id.button6);
		button7 = (Button) findViewById(R.id.button7);
		button8 = (Button) findViewById(R.id.button8);
		button9 = (Button) findViewById(R.id.button9);
		button10 = (Button) findViewById(R.id.button10);
		button11 = (Button) findViewById(R.id.button11);
		button12 = (Button) findViewById(R.id.button12);
		button13 = (Button) findViewById(R.id.button13);
		button14 = (Button) findViewById(R.id.button14);
		button15 = (Button) findViewById(R.id.button15);
		button17 = (Button) findViewById(R.id.button17);
		button16 = (Button) findViewById(R.id.button16);
		button19 = (Button) findViewById(R.id.button19);
		button18 = (Button) findViewById(R.id.button18);
		
		button20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), AddDoubleActivity.class);
				startActivity(intent);
			}
		});
		
		button22.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Adddouble_2addrActivity.class);
				startActivity(intent);
			}
		});
		
		button21.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), AddfloatActivity.class);
				startActivity(intent);
			}
		});
		
		button24.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Addfloat_2addrActivity.class);
				startActivity(intent);
			}
		});
		
		button23.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), AddIntActivity.class);
				startActivity(intent);
			}
		});
		
		button25.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), AddInt2addrActivity.class);
				startActivity(intent);
			}
		});
		
		button26.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Addintlit8Activity.class);
				startActivity(intent);
			}
		});
		
		button28.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Addintlit16Activity.class);
				startActivity(intent);
			}
		});
		
		button27.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), AddlongActivity.class);
				startActivity(intent);
			}
		});
		
		button29.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Addlong2addrActivity.class);
				startActivity(intent);
			}
		});
		
		button83.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), AndintActivity.class);
				startActivity(intent);
			}
		});
		
		button31.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Andint2addrActivity.class);
				startActivity(intent);
			}
		});
		
		button30.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Andintlit8Activity.class);
				startActivity(intent);
			}
		});
		
		button33.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Andintlit16Activity.class);
				startActivity(intent);
			}
		});
		
		button32.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), AndlongActivity.class);
				startActivity(intent);
			}
		});
		
		button35.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Andlong2addrActivity.class);
				startActivity(intent);
			}
		});
		
		button34.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), DivdoubleActivity.class);
				startActivity(intent);
			}
		});
		
		button36.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Divdouble2addrActivity.class);
				startActivity(intent);
			}
		});
		
		button38.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), DivfloatActivity.class);
				startActivity(intent);
			}
		});
		
		button37.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Divfloat2addrActivity.class);
				startActivity(intent);
			}
		});
		
		button39.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), DivintActivity.class);
				startActivity(intent);
			}
		});
		
		button40.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Divint2addrActivity.class);
				startActivity(intent);
			}
		});
		
		button41.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Divintlit8Activity.class);
				startActivity(intent);
			}
		});
		
		button42.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Divintlit16Activity.class);
				startActivity(intent);
			}
		});
		
		button43.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), DivlongActivity.class);
				startActivity(intent);
			}
		});
		
		button44.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Divlong2addrActivity.class);
				startActivity(intent);
			}
		});
		
		button46.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), MuldoubleActivity.class);
				startActivity(intent);
			}
		});
		
		button45.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), MuldoublewaddrActivity.class);
				startActivity(intent);
			}
		});
		
		button47.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), MulfloatActivity.class);
				startActivity(intent);
			}
		});
		
		button49.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Mulfloat2addrActivity.class);
				startActivity(intent);
			}
		});
		
		button48.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), MulintActivity.class);
				startActivity(intent);
			}
		});
		
		button50.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Mulint2addrActivity.class);
				startActivity(intent);
			}
		});
		
		button51.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Mulintlit8Activity.class);
				startActivity(intent);
			}
		});
		
		button53.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Mulintlit16Activity.class);
				startActivity(intent);
			}
		});
		
		button52.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), MullongActivity.class);
				startActivity(intent);
			}
		});
		
		button55.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Mullong2addrActivity.class);
				startActivity(intent);
			}
		});
		
		button54.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), OrintActivity.class);
				startActivity(intent);
			}
		});
		
		button56.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Orint2addrActivity.class);
				startActivity(intent);
			}
		});
		
		button57.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Orintlit8Activity.class);
				startActivity(intent);
			}
		});
		
		button59.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Orintlit16Activity.class);
				startActivity(intent);
			}
		});
		
		button58.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), OrlongActivity.class);
				startActivity(intent);
			}
		});
		
		button60.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Orlong2addrActivity.class);
				startActivity(intent);
			}
		});
		
		button62.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), RemdoubleActivity.class);
				startActivity(intent);
			}
		});
		
		button61.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Remdouble2addrActivity.class);
				startActivity(intent);
			}
		});
		
		button63.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), RemfloatActivity.class);
				startActivity(intent);
			}
		});
		
		button64.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Remfloat2addrActivity.class);
				startActivity(intent);
			}
		});
		
		button65.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), RemintActivity.class);
				startActivity(intent);
			}
		});
		
		button67.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Remint2addrActivity.class);
				startActivity(intent);
			}
		});
		
		button66.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Remintlit8Activity.class);
				startActivity(intent);
			}
		});
		
		button68.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Remintlit16Activity.class);
				startActivity(intent);
			}
		});
		
		button69.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), RemlongActivity.class);
				startActivity(intent);
			}
		});
		
		button70.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Remlong2addrActivity.class);
				startActivity(intent);
			}
		});
		
		button71.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), ShlintActivity.class);
				startActivity(intent);
			}
		});
		
		button72.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Shlint2addrActivity.class);
				startActivity(intent);
			}
		});
		
		button73.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Shlintlit8Activity.class);
				startActivity(intent);
			}
		});
		
		button74.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), ShllongActivity.class);
				startActivity(intent);
			}
		});
		
		button76.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Shllong2addrActivity.class);
				startActivity(intent);
			}
		});
		
		button75.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), ShrintActivity.class);
				startActivity(intent);
			}
		});
		
		button77.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Shrint2addrActivity.class);
				startActivity(intent);
			}
		});
		
		button78.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Shrintlit8Activity.class);
				startActivity(intent);
			}
		});
		
		button80.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), ShrlongActivity.class);
				startActivity(intent);
			}
		});
		
		button79.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Shrlong2addrActivity.class);
				startActivity(intent);
			}
		});
		
		button82.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), SubdoubleActivity.class);
				startActivity(intent);
			}
		});
		
		button81.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Subdouble2addrActivity.class);
				startActivity(intent);
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), SubfloatActivity.class);
				startActivity(intent);
			}
		});
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Subfloat2addrActivity.class);
				startActivity(intent);
			}
		});
		
		button3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), SubintActivity.class);
				startActivity(intent);
			}
		});
		
		button4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Subint2addrActivity.class);
				startActivity(intent);
			}
		});
		
		button5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Subintlit8Activity.class);
				startActivity(intent);
			}
		});
		
		button6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Subintlit16Activity.class);
				startActivity(intent);
			}
		});
		
		button7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), SublongActivity.class);
				startActivity(intent);
			}
		});
		
		button8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Sublong2addrActivity.class);
				startActivity(intent);
			}
		});
		
		button9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), UshrintActivity.class);
				startActivity(intent);
			}
		});
		
		button10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Ushrint2addrActivity.class);
				startActivity(intent);
			}
		});
		
		button11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Ushrintlit8Activity.class);
				startActivity(intent);
			}
		});
		
		button12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), UshrlongActivity.class);
				startActivity(intent);
			}
		});
		
		button13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Ushrlong2addrActivity.class);
				startActivity(intent);
			}
		});
		
		button14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), XorintActivity.class);
				startActivity(intent);
			}
		});
		
		button15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Xorint2addrActivity.class);
				startActivity(intent);
			}
		});
		
		button17.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Xorintlit8Activity.class);
				startActivity(intent);
			}
		});
		
		button16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Xorintlit16Activity.class);
				startActivity(intent);
			}
		});
		
		button19.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), XorlongActivity.class);
				startActivity(intent);
			}
		});
		
		button18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Xorlong2addrActivity.class);
				startActivity(intent);
			}
		});
	}
	private void initializeLogic() {
		setTitle("Operations");
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
		button18.setBackground(zylern);
		button19.setBackground(zylern);
		button20.setBackground(zylern);
		button21.setBackground(zylern);
		button22.setBackground(zylern);
		button23.setBackground(zylern);
		button24.setBackground(zylern);
		button25.setBackground(zylern);
		button26.setBackground(zylern);
		button27.setBackground(zylern);
		button28.setBackground(zylern);
		button29.setBackground(zylern);
		button30.setBackground(zylern);
		button31.setBackground(zylern);
		button32.setBackground(zylern);
		button33.setBackground(zylern);
		button34.setBackground(zylern);
		button35.setBackground(zylern);
		button36.setBackground(zylern);
		button37.setBackground(zylern);
		button38.setBackground(zylern);
		button39.setBackground(zylern);
		button40.setBackground(zylern);
		button41.setBackground(zylern);
		button42.setBackground(zylern);
		button43.setBackground(zylern);
		button44.setBackground(zylern);
		button45.setBackground(zylern);
		button46.setBackground(zylern);
		button47.setBackground(zylern);
		button48.setBackground(zylern);
		button49.setBackground(zylern);
		button50.setBackground(zylern);
		button51.setBackground(zylern);
		button52.setBackground(zylern);
		button53.setBackground(zylern);
		button54.setBackground(zylern);
		button55.setBackground(zylern);
		button56.setBackground(zylern);
		button57.setBackground(zylern);
		button58.setBackground(zylern);
		button59.setBackground(zylern);
		button60.setBackground(zylern);
		button61.setBackground(zylern);
		button62.setBackground(zylern);
		button63.setBackground(zylern);
		button64.setBackground(zylern);
		button65.setBackground(zylern);
		button66.setBackground(zylern);
		button67.setBackground(zylern);
		button68.setBackground(zylern);
		button69.setBackground(zylern);
		button70.setBackground(zylern);
		button71.setBackground(zylern);
		button72.setBackground(zylern);
		button73.setBackground(zylern);
		button74.setBackground(zylern);
		button75.setBackground(zylern);
		button76.setBackground(zylern);
		button77.setBackground(zylern);
		button78.setBackground(zylern);
		button79.setBackground(zylern);
		button80.setBackground(zylern);
		button81.setBackground(zylern);
		button82.setBackground(zylern);
		button83.setBackground(zylern);
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
