package me.wangyuwei.particle;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import me.wangyuwei.particleview.ParticleView;

/**
 * 作者： 巴掌 on 16/8/31 15:18
 * Github: https://github.com/JeasonWong
 */
public class TestActivity extends AppCompatActivity {

    ParticleView mPvGithub;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_test);

        mPvGithub = (ParticleView) findViewById(R.id.pv_github);

        mPvGithub.startAnim();

        mPvGithub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPvGithub.startAnim();
            }
        });

        mPvGithub.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(TestActivity.this, MainActivity.class);
                TestActivity.this.startActivity(intent);
                finish();
                return true;
            }
        });

    }
}
