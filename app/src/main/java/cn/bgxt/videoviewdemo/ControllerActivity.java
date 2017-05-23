package cn.bgxt.videoviewdemo;

import java.io.File;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class ControllerActivity extends Activity {
	private VideoView vv_video;
	private MediaController mController;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_controller);
		vv_video=(VideoView) findViewById(R.id.vv_video);
		//MediaController
		mController=new MediaController(this);
		File file=new File("/sdcard/ykzzldx.mp4");
		if(file.exists()){
			//
			vv_video.setVideoPath(file.getAbsolutePath());
			//MediaController
			vv_video.setMediaController(mController);

			mController.setMediaPlayer(vv_video);

			mController.setPrevNextListeners(new OnClickListener() {
				
				@Override
				public void onClick(View v) {					
					Toast.makeText(ControllerActivity.this, "adf",0).show();
				}
			}, new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					Toast.makeText(ControllerActivity.this, "asdfa",0).show();
				}
			});
		}
	}
}
