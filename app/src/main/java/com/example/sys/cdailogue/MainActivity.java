package com.example.sys.cdailogue;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
    }
    public class ViewDialog{
        public void showDialog(Activity activity,String msg)
        {
            final Dialog dialog = new Dialog(activity);
            dialog.requestWindowFeature( Window.FEATURE_NO_TITLE);
            dialog.setCancelable(false);
           dialog.setContentView( R.layout.activity_main);
            TextView t=dialog.findViewById( R.id.tv );
            t.setText( msg );
            Button b=dialog.findViewById( R.id.b );
            b.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialog.dismiss();
                }
            } );
            dialog.show();
        }
    }
}
