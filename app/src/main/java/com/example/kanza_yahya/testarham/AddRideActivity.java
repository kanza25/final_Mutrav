package com.example.kanza_yahya.testarham;


        import android.app.DatePickerDialog;
        import android.app.ProgressDialog;
        import android.app.TimePickerDialog;
        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.text.TextUtils;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.Button;
        import android.widget.DatePicker;
        import android.widget.EditText;
        import android.widget.Spinner;
        import android.widget.TextView;
        import android.widget.TimePicker;
        import android.widget.Toast;

        import com.google.firebase.database.DatabaseReference;
        import com.google.firebase.database.FirebaseDatabase;

        import java.text.DateFormat;
        import java.util.Calendar;
        import java.util.Objects;
        import android.app.Dialog;
        import android.content.Intent;
        import android.content.SharedPreferences;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;

        import com.google.android.gms.common.ConnectionResult;
        import com.google.android.gms.common.GoogleApiAvailability;

public class AddRideActivity extends AppCompatActivity{
    //ProgressDialog
    private ProgressDialog mRegProgress;
    DateFormat formatDateTime = DateFormat.getDateTimeInstance();
    Calendar datetime = Calendar.getInstance();
    private TextView text;
    private EditText etName;
    private EditText ettype;
    Spinner spinnergender;
    private EditText etphone;
    private EditText etcarnum;
    private EditText etseats;
    private EditText etcar_name;
    private EditText etsource;
    private EditText etdestination;
    private EditText etfare;
    private Button btn_addride;


    DatabaseReference dbReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addride);
        dbReference = FirebaseDatabase.getInstance().getReference("rides");

        mRegProgress = new ProgressDialog(this);

        text =(TextView) findViewById(R.id.txt_datetime);
        btn_addride = (Button) findViewById(R.id.btn_addride);
        etName = (EditText) findViewById(R.id.etName);
        ettype = (EditText) findViewById(R.id.ettype);
        etphone = (EditText) findViewById(R.id.etphone);
        spinnergender = (Spinner) findViewById(R.id.spinnergender);
        etcarnum = (EditText) findViewById(R.id.etcarnum);
        etseats = (EditText) findViewById(R.id.etseats);
        etcar_name = (EditText) findViewById(R.id.etcar_name);
        etsource = (EditText) findViewById(R.id.etsource);
        etdestination = (EditText) findViewById(R.id.etdestination);
        etfare = (EditText) findViewById(R.id.etfare);

        etsource.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddRideActivity.this, MapActivity.class);
                startActivity(intent);
            }
        });
        etdestination.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddRideActivity.this, MapActivity.class);
                startActivity(intent);


            }
        });
        Bundle bn = getIntent().getExtras();
        if (bn != null) {
            String snameeee = bn.getString("snameKey");
            etsource.setText(String.valueOf(snameeee));

            String dnameee = bn.getString("dnameKey");
            etdestination.setText(String.valueOf(dnameee));
        }
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateDate();
                updateTime();
            }
        });
        updateTextALbel();
        btn_addride.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AddRide();
                clear();
            }
        });
    }
    private void  clear(){
        etName.setText("");
       ettype.setText("");
        etphone.setText("");
     etcarnum.setText("");
        etseats.setText("");
        etcar_name.setText("");
      etsource.setText("");
       etdestination.setText("");
       etfare.setText("");

       /* Intent intent = new Intent(AddRideActivity.this,FindRideActivity.class);
        startActivity(intent);*/

    }
    private void AddRide(){
        String Name = etName.getText().toString();
        String etype = ettype.getText().toString();
        String phone=etphone.getText().toString();
        String carnum=etcarnum.getText().toString();
        String seats=etseats.getText().toString();
        String cname=etcar_name.getText().toString();
        String source=etsource.getText().toString();
        String destination=etdestination.getText().toString();
        String fare=etfare.getText().toString();
        String datetime=text.getText().toString();
        String gender = spinnergender.getSelectedItem().toString();
        if (!TextUtils.isEmpty(Name)||!TextUtils.isEmpty(etype)||!TextUtils.isEmpty(phone)||!TextUtils.isEmpty(carnum)||!TextUtils.isEmpty(seats)||!TextUtils.isEmpty(cname)||!TextUtils.isEmpty(source)||!TextUtils.isEmpty(destination)||!TextUtils.isEmpty(datetime)||!TextUtils.isEmpty(fare)){
            String Id =  dbReference.push().getKey();
            Rides rides = new Rides(Id,Name,etype,phone,carnum,seats,cname,source,destination,datetime,fare,gender);
            dbReference.child(Id).setValue(rides);
            Toast.makeText(getApplicationContext(), "Ride Added Successfully", Toast.LENGTH_LONG).show();

        }else{
            Toast.makeText(getApplicationContext(), "Please fill the fields", Toast.LENGTH_LONG).show();
        }
    }
    private void updateDate(){
        new DatePickerDialog(this,d,datetime.get(Calendar.YEAR),datetime.get(Calendar.MONTH),datetime.get(Calendar.DAY_OF_MONTH)).show();
    }
    private void updateTime(){
        new TimePickerDialog(this,t,datetime.get(Calendar.HOUR_OF_DAY),datetime.get(Calendar.MINUTE),true).show();
    }
    DatePickerDialog.OnDateSetListener d=new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int monthofYear, int dayofmonth) {
            datetime.set(Calendar.YEAR,year);
            datetime.set(Calendar.MONTH,monthofYear);
            datetime.set(Calendar.DAY_OF_MONTH,dayofmonth);
            updateTextALbel();
        }
    };
    TimePickerDialog.OnTimeSetListener t=new TimePickerDialog.OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker view, int hourofday, int minute) {

            datetime.set(Calendar.HOUR_OF_DAY,hourofday);
            datetime.set(Calendar.MINUTE,minute);
            updateTextALbel();
        }
    };
    private void updateTextALbel(){
        text.setText(formatDateTime.format(datetime.getTime()));
    }
}



