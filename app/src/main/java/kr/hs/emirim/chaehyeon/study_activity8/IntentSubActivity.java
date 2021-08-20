package kr.hs.emirim.chaehyeon.study_activity8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IntentSubActivity extends AppCompatActivity {

    Button pre_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_sub);

        pre_btn = findViewById(R.id.pre_btn);
        pre_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                Intent i = new Intent( MainActivity.this, IntentSubActivity.class);
//                startActivity( i );
                finish();//액티비티를 종료
            }
        });
    }
}