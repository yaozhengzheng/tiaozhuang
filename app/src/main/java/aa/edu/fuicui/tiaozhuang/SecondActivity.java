package aa.edu.fuicui.tiaozhuang;

import android.content.Intent;
import android.net.Uri;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private Button bt;
    private EditText edt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //用意图打开第二个activity
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.MESSAGE_KEY);
//        TextView tv = new TextView(this);
//        tv.setText(message);
//        tv.setTextSize(40);
//        RelativeLayout layout= (RelativeLayout) findViewById(R.id.content);
//        layout.addView(tv);
        edt1 = (EditText) findViewById(R.id.edt1_show);
        edt1.setText(message);
        //关联ID
        bt = (Button) findViewById(R.id.bt1_show);
//        bt.setOnClickListener((View.OnClickListener) this);
    }

    public void call(View v) {
        if (v.getId() == R.id.bt1_show) {
            String a = edt1.getText().toString();
            Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + a));
            startActivity(intent);
        }

    }
}
