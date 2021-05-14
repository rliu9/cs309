package com.example.ape;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.*;
import android.content.Intent;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.example.ape.MainActivity;
import com.example.ape.R;
import com.example.ape.app.AppController;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class ChangeUsernameActivity extends AppCompatActivity {
    String TAG = "MyTAG";
    TextView cusername,nusername,conusername;
    Button bsubmit,bcommunity,bhome,bperson;
    AlertDialog.Builder builder;
    String server_url_rd = "http://coms-309-hv-5.cs.iastate.edu/changepassword.php";
    String server_url_cu = "http://coms-309-hv-5.cs.iastate.edu/changepassword.php";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.change_username_site);
        Log.d(TAG, "onCreate: ");

        cusername = findViewById(R.id.nowusername);
        nusername = findViewById(R.id.newusername);
        conusername = findViewById(R.id.reusername);

        bsubmit = findViewById(R.id.Username_Submit);
        bcommunity = findViewById(R.id.COMMUNITY);
        bhome = findViewById(R.id.HOME);
        bperson = findViewById(R.id.PERSONAL);

        bsubmit.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                final String nowusername = cusername.getText().toString();
                final String newusername = nusername.getText().toString();
                final String conuser = conusername.getText().toString();
                if(!nowusername.isEmpty() && !newusername.isEmpty() && !conuser.isEmpty()){
                    if(newusername == conuser) {
                        StringRequest stringRequest = new StringRequest(Request.Method.POST, server_url_cu, new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                try {
                                    JSONArray jsonArray = new JSONArray(response);
                                    JSONObject jsonObject = jsonArray.getJSONObject(0);
                                    String code = jsonObject.getString("code");
                                    String message = jsonObject.getString("message");
                                    if (code.equals("change_failed")) {
                                        builder.setTitle("Change Failed!");
                                        builder.setMessage("Please check nowusername!");
                                        displayAlert(code);
                                    } else{
                                        builder.setTitle("Change Success!");
                                        builder.setMessage("Change new username success!");
                                        displayAlert(code);
                                    }
                                } catch (JSONException e) {
                                    e.printStackTrace();
                                }
                            }
                        }, new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(ChangeUsernameActivity.this, "Error!", Toast.LENGTH_SHORT).show();
                            }
                        }) {
                            @Override
                            protected Map<String, String> getParams() throws AuthFailureError {
                                Map<String, String> params = new HashMap<String, String>();
                                params.put("username", nowusername);
                                return params;
                            }
                        };
                        AppController.getInstance().addToRequestQueue(stringRequest);
                    }else{
                        builder.setTitle("Information Wrong!");
                        builder.setMessage("The confirm username is different with new username!");
                        displayAlert("information_failed");
                    }
                }
                else{
                    builder.setTitle("Information Wrong!");
                    builder.setMessage("Please enter valid information!");
                    displayAlert("information_failed");
                }
            }
        });

        bcommunity.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                startActivity(new Intent("com.litreily.CommunityActivity"));
            }
        });

        bhome.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                startActivity(new Intent("com.litreily.HomeActivity"));
            }
        });

        bperson.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                startActivity(new Intent("com.litreily.PersonalCenterActivity"));
            }
        });

    }


    public void displayAlert(final String code){
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if(code.equals("change_failed")){
                    clearinformation();
                }else if(code.equals("information_failed")){
                    clearinformation();
                }else {
                    clearinformation();
                    Intent intent = new Intent(ChangeUsernameActivity.this, PersonalCenterActivity.class);
                    startActivity(intent);
                }
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void clearinformation(){
        cusername.setText("");
        nusername.setText("");
        conusername.setText("");
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }
}