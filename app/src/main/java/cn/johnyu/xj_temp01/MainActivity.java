package cn.johnyu.xj_temp01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv;
    MyViewModel myViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.tv);
       myViewModel= ViewModelProviders.of(this)
                .get(MyViewModel.class);


        myViewModel.getData().observe(this,s->{
            User user=(User)s;
            tv.setText(user.getUname());
        });
    }

    public void change(View view) {
        User user=new User();
        user.setUname("Hello Tom Li");
        myViewModel.setData(user);
    }
}
