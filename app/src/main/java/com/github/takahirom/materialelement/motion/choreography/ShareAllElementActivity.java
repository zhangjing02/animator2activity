package com.github.takahirom.materialelement.motion.choreography;

import android.graphics.Bitmap;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.github.takahirom.materialelement.R;
import com.github.takahirom.materialelement.view.ResourceUtil;

public class ShareAllElementActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.all_element_share_scene2);

        Bitmap bitmap = ResourceUtil.getBitmap(this, R.drawable.ic_choreography);
        RoundedBitmapDrawable circularBitmapDrawable =
                RoundedBitmapDrawableFactory.create(getResources(), bitmap);
        circularBitmapDrawable.setCircular(true);
        final ImageView rowImage = (ImageView) findViewById(R.id.all_element_share_image);
        rowImage.setImageDrawable(circularBitmapDrawable);
    }
}
