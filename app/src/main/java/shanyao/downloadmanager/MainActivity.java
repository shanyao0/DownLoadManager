package shanyao.downloadmanager;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import shanyao.downloadmanager.manager.UpdateManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new UpdateManager(this).checkUpdate(false);
    }
}
