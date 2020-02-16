package bd.com.accessibilityservice;

import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ServiceManager serviceManager;
    public static TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        serviceManager = new ServiceManager();
        textView = findViewById(R.id.printLog);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "111111", Toast.LENGTH_SHORT).show();
            }
        });
    /*    textView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Log.e("EVENT",event.toString());
                return false;
            }
        });*/
    }




}
/*/package bd.com.accessibilityservice;

        import android.accessibilityservice.AccessibilityService;
        import android.os.Build;
        import android.util.Log;
        import android.view.KeyEvent;
        import android.view.MotionEvent;
        import android.view.View;
        import android.view.WindowManager;
        import android.view.accessibility.AccessibilityEvent;

        import androidx.annotation.RequiresApi;

        import com.google.gson.Gson;

        import java.util.ArrayList;
        import java.util.List;

        import static android.view.accessibility.AccessibilityEvent.TYPE_WINDOW_CONTENT_CHANGED;

public class KittingAccessibilityService extends AccessibilityService implements View.OnTouchListener {
    List<AccessibilityEvent> allEvent = new ArrayList<>();
    Gson gson = new Gson();

    @Override
    protected void onServiceConnected() {
        Log.e("wwwa", "service connected");
        WindowManager.LayoutParams params = new android.view.WindowManager.LayoutParams(0, 0, 0, 0, 2003, 0x40028, -3);
        View mView = new View(this);

        mView.setOnTouchListener(this);

        WindowManager wm = (WindowManager) getSystemService(WINDOW_SERVICE);
        wm.addView(mView, params);
        super.onServiceConnected();
    }

    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
        if (event.getEventType() != TYPE_WINDOW_CONTENT_CHANGED) {
            Log.e("EVENT_DETAILS", event.toString());

            try {
                Log.e("EVENT_SOURCE", event.getSource().toString());
            } catch (Exception e) {
                Log.e("EVENT_SOURCE", "###########ERROR");
            }
        }
        /*if (event.getEventType() == AccessibilityEvent.TYPE_VIEW_HOVER_ENTER) {
            if (event.getSource() != null) {
                if (event.getSource().isClickable()) {
                    String cDescritpion = "";
                    try {
                        cDescritpion = event.getSource().getContentDescription().toString();
                    } catch (Exception e) {
                    }

                    event.getSource().performAction(AccessibilityNodeInfo.ACTION_CLICK);
                    if (cDescritpion.equals("Back")) {
                        performGlobalAction(GLOBAL_ACTION_BACK);
                    } else if (cDescritpion.equals("Home")) {
                        performGlobalAction(GLOBAL_ACTION_HOME);
                    }else {
                        event.getSource().performAction(AccessibilityNodeInfo.ACTION_CLICK);
                    }

                }
                //event.getSource().getTouchDelegateInfo();
            }
        }*/


//  String json = gson.toJson(allEvent.toString());
//  Log.e("ooood", "onAccessibilityEvent: " + json);

/*        if (event.getEventType() != TYPE_WINDOW_CONTENT_CHANGED) {
            Log.d("wwwa", "EventType " + event.toString().substring(0, 40));
            try {
                Log.d("wwwa", "EventSource " + event.getSource().toString());
            } catch (Exception e) {
                Log.e("wwwa", "EventSource not found");
            }

            Rect rect = new Rect();
            try {
                event.getSource().getBoundsInScreen(rect);
                Log.d("wwwa", "EventSource: " + rect.toString());
            } catch (Exception e) {
                Log.e("wwwa", "Exception happen");
            }
        }*/

    /*}

    @Override
    public void onInterrupt() {

    }

    @Override
    protected boolean onKeyEvent(KeyEvent event) {
        Log.e("wwwa11", "ev " + event.toString());
        return super.onKeyEvent(event);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected boolean onGesture(int gestureId) {
        Log.d("EVENT_SOURCE", "id " + gestureId);
        //    dispatchGesture();
        return super.onGesture(gestureId);

    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        Log.e("ddda",event.getX()+toString());
        return false;
    }
}*/