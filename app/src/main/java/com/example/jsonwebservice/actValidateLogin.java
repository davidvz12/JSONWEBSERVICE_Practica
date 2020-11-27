package com.example.jsonwebservice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import com.example.jsonwebservice.WebService.Asynchtask;
import com.example.jsonwebservice.WebService.WebService;

import org.json.JSONException;

import java.util.HashMap;
import java.util.Map;

public class actValidateLogin extends AppCompatActivity implements Asynchtask{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_validate_login);
        Bundle bundle = this.getIntent().getExtras();
        Map<String, String> datos = new HashMap<String, String>();
        WebService ws= new WebService("https://www.breakingbadapi.com/api/characters?name="+ bundle.getString("name") ,
                datos, actValidateLogin.this, actValidateLogin.this);
        ws.execute("GET");
    }

    @Override
    public void processFinish(String result) throws JSONException {
        TextView txtMessage = (TextView)findViewById(R.id.lblMessage);
        txtMessage.setText("Resp:  "  +  result);
    }
}