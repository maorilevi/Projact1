package projact.finalprojact.projact;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class myMainScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void TosignscreenOnClick(View view)
    {
        Intent intent = new Intent(this,sign_up.class);
        startActivity(intent);
    }

}
