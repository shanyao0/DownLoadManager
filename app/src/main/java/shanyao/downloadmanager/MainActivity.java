package shanyao.downloadmanager;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;

import java.io.File;

import shanyao.downloadmanager.manager.UpdateManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String fileName = "app-debug.apk";
        String fileStoreDir = Environment.getExternalStorageDirectory().getAbsolutePath() + File
                .separator + "M_DEFAULT_DIR";
        new UpdateManager(this,fileStoreDir,fileName).checkUpdate(false);
    }
}
