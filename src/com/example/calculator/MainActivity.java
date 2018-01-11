package com.example.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.widget.SimpleCursorAdapter.ViewBinder;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity implements View.OnClickListener{

	Button n1, n2, n3, n4, n5, n6, n7, n8, n9, n0;
	Button op_point, op_equls, op_plus, op_minus, op_multiply, op_divide;
	TextView output;
	String text_to_display = "";
	String s_number = "";
	double number_1 = 0;
	double number_2 = 0;
	int op_code = 0;
	double ans = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        output = (TextView) findViewById (R.id.output);
        n1 = (Button) findViewById (R.id.n1);
        n2 = (Button) findViewById (R.id.n2);
        n3 = (Button) findViewById (R.id.n3);
        n4 = (Button) findViewById (R.id.n4);
        n5 = (Button) findViewById (R.id.n5);
        n6 = (Button) findViewById (R.id.n6);
        n7 = (Button) findViewById (R.id.n7);
        n8 = (Button) findViewById (R.id.n8);
        n9 = (Button) findViewById (R.id.n9);
        n0 = (Button) findViewById (R.id.n0);
        
        op_plus = (Button) findViewById(R.id.op_plus);
        op_minus = (Button) findViewById(R.id.op_minus);
        op_multiply = (Button) findViewById(R.id.op_multiply);
        op_divide = (Button) findViewById(R.id.op_divide);
        
        op_point = (Button) findViewById(R.id.op_point);
        op_equls = (Button) findViewById(R.id.op_equals);
        
        
       
        n0.setOnClickListener(this);
        n1.setOnClickListener(this);
        n2.setOnClickListener(this);
        n3.setOnClickListener(this);
        n4.setOnClickListener(this);
        n5.setOnClickListener(this);
        n6.setOnClickListener(this);
        n7.setOnClickListener(this);
        n8.setOnClickListener(this);
        n9.setOnClickListener(this);
        
        op_plus.setOnClickListener(this);
        op_equls.setOnClickListener(this);
        op_minus.setOnClickListener(this);
        op_multiply.setOnClickListener(this);
        op_divide.setOnClickListener(this);
        op_point.setOnClickListener(this);
        
        output.setOnTouchListener(new View.OnTouchListener() {
			
			@Override
			public boolean onTouch(View arg0, MotionEvent arg1) {
				Toast.makeText(getApplicationContext(), "Touched", Toast.LENGTH_LONG).show();		
				return false;
			}
		});
        
        
}
	@Override
	public void onClick(View e) {
		
		switch (e.getId()){
		case R.id.n0:
			s_number = s_number + "0";
			upDateDisplay(s_number);
			break;
		case R.id.n1:
			s_number = s_number + "1";
			upDateDisplay(s_number);
			break;
		case R.id.n2:
			s_number = s_number + "2";
			upDateDisplay(s_number);
			break;
		case R.id.n3:
			s_number = s_number + "3";
			upDateDisplay(s_number);
			break;
		case R.id.n4:
			s_number = s_number + "4";
			upDateDisplay(s_number);
			break;
		case R.id.n5:
			s_number = s_number + "5";
			upDateDisplay(s_number);
			break;
		case R.id.n6:
			s_number = s_number + "6";
			upDateDisplay(s_number);
			break;
		case R.id.n7:
			s_number = s_number + "7";
			upDateDisplay(s_number);
			break;
		case R.id.n8:
			s_number = s_number + "8";
			upDateDisplay(s_number);
			break;
		case R.id.n9:
			s_number = s_number + "9";
			upDateDisplay(s_number);
			break;
		case R.id.op_point:
			s_number = s_number + ".";
			op_point.setEnabled(false);
			upDateDisplay(s_number);
			break;
		case R.id.op_plus:
			number_1 = Double.parseDouble(s_number);
			s_number = "";
			op_code = 1;
			op_point.setEnabled(true);
			upDateDisplay("");
			break;
		case R.id.op_minus:
			number_1 = Double.parseDouble(s_number);
			s_number = "";
			op_code = 2;
			op_point.setEnabled(true);
			upDateDisplay("");
			break;
		case R.id.op_multiply:
			number_1 = Double.parseDouble(s_number);
			s_number = "";
			op_point.setEnabled(true);
			op_code = 3;
			upDateDisplay("");
			break;
		case R.id.op_divide:
			number_1 = Double.parseDouble(s_number);
			s_number = "";
			op_code = 4;
			op_point.setEnabled(true);
			upDateDisplay("");
			break;
		
		case R.id.op_equals:
			number_2 = Double.parseDouble(s_number);
			s_number = "";
			op_point.setEnabled(true);
			switch (op_code){
			case 1:
				ans = number_1 + number_2;
				upDateDisplay(String.valueOf(ans));
				break;
			case 2:
				ans = number_1 - number_2;
				upDateDisplay(String.valueOf(ans));
				break;
			case 3:
				ans = number_1 * number_2;
				upDateDisplay(String.valueOf(ans));
				break;
			case 4:
				ans = number_1 / number_2;
				upDateDisplay(String.valueOf(ans));
				break;
			}
		}
	}
	
	public void upDateDisplay(String data){
		output.setText(data);
	}
}