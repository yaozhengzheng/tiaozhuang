package aa.edu.fuicui.tiaozhuang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button but;
    private EditText edt;
    public static String MESSAGE_KEY="android.intent.category.LAUNCHER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //关联ID
        but= (Button) findViewById(R.id.bt_show);
    }

    public void send(View view) {
        //创建一个意图
        Intent intent=new Intent(this,SecondActivity.class);
        //找到ID
        edt= (EditText) findViewById(R.id.et_show);
        //获取输入框的内容
        String message=edt.getText().toString();
        intent.putExtra(MESSAGE_KEY,message);
        //启动意图
        startActivity(intent);
    }
}
