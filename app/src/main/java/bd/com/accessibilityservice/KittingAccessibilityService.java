package bd.com.accessibilityservice;

import android.accessibilityservice.AccessibilityService;
import android.os.SystemClock;
import android.util.Log;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;

public class KittingAccessibilityService extends AccessibilityService {
    ServiceManager serviceManager;

    @Override
    protected void onServiceConnected() {
        Log.e("KIT", "connected");
        serviceManager = new ServiceManager();
        show();
        super.onServiceConnected();

    }

    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
        Log.e("KIT", "event trigger");

        if (event.getEventType() == AccessibilityEvent.TYPE_VIEW_CLICKED) {

            /* MotionEvent { action=ACTION_DOWN, actionButton=0,
            id[0]=0, x[0]=482.97095, y[0]=63.953125, toolType[0]=TOOL_TYPE_FINGER,
             buttonState=0, metaState=0, flags=0x0, edgeFlags=0x0, pointerCount=1,
              historySize=0, eventTime=35469954, downTime=35469954, deviceId=0, source=0x1002 }
             */
     /*       MotionEvent.PointerProperties[] pointerProperties = new MotionEvent.PointerProperties[1];
            pointerProperties[0] = new MotionEvent.PointerProperties();
            pointerProperties[0].id = 0;


            MotionEvent.PointerCoords[] pointerCoords = new MotionEvent.PointerCoords[1];
            pointerCoords[0] = new MotionEvent.PointerCoords();
            pointerCoords[0].pressure = 1;
            pointerCoords[0].size = 1;
            pointerCoords[0].touchMajor = 1;
            pointerCoords[0].touchMinor = 1;
            pointerCoords[0].x = 482.97095f;
            pointerCoords[0].y = 63.953125f;

            MotionEvent eventa = MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), MotionEvent.ACTION_DOWN, 1, pointerProperties, pointerCoords, 0, 0, 1, 1, 0, 0, 0, 0);


            boolean isCLiked = serviceManager.getInputManager().injectInputEvent(eventa, 0);
            Log.d("KIT", "event is clicked " + isCLiked);*/
        }
    }

    @Override
    public void onInterrupt() {

    }

    private  void show() {
        /* MotionEvent { action=ACTION_DOWN, actionButton=0, id[0]=0, x[0]=269.0, y[0]=107.0, toolType[0]=TOOL_TYPE_FINGER, buttonState=0, metaState=0, flags=0x0, edgeFlags=0x0, pointerCount=1, historySize=0, eventTime=50759420, downTime=50759420, deviceId=7, source=0x1002 }*/
        MotionEvent.PointerProperties[] pointerProperties = new MotionEvent.PointerProperties[1];
        pointerProperties[0] = new MotionEvent.PointerProperties();
        pointerProperties[0].id = 0;


        MotionEvent.PointerCoords[] pointerCoords = new MotionEvent.PointerCoords[1];
        pointerCoords[0] = new MotionEvent.PointerCoords();
        pointerCoords[0].pressure = 1;
        pointerCoords[0].size = 1;
        pointerCoords[0].touchMajor = 1;
        pointerCoords[0].touchMinor = 1;
        pointerCoords[0].x = 482f;
        pointerCoords[0].y = 300f;

        MotionEvent eventa = MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), MotionEvent.ACTION_DOWN, 1, pointerProperties, pointerCoords, 0, 0, 1, 1, 0, 0, InputDevice.SOURCE_TOUCHSCREEN, 0);
        MotionEvent eventa2 = MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), MotionEvent.ACTION_UP, 1, pointerProperties, pointerCoords, 0, 0, 1, 1, 0, 0, InputDevice.SOURCE_TOUCHSCREEN, 0);
        //WindowManager windowmanager = (WindowManager) getSystemService(WINDOW_SERVICE);

        // boolean isCLiked = MainActivity.textView.dispatchTouchEvent(eventa);
        // boolean isCLiked2 = MainActivity.textView.dispatchTouchEvent(eventa2);
        boolean isCLiked = serviceManager.getInputManager2().injectInputEvent(eventa, 0);
        boolean isCLiked2 = serviceManager.getInputManager2().injectInputEvent(eventa2, 0);
        //InjectionManager injectionManager = new InjectionManager(getApplicationContext());
        // injectionManager.injectTouchEventDown(482, 63);
        // injectionManager.injectTouchEventRelease(482, 63);
        Log.e("clicked","##############");
        System.out.print("event is clicked " + isCLiked);
        //  Log.d("KIT", "event is clicked " + isCLiked);
        //   Log.d("KIT", "event is clicked " + isCLiked2);


        //sh -c  "CLASSPATH=/data/app/bd.com.accessibilityservice-2/base.apk /system/bin/app_process /system/bin bd.com.accessibilityservice.Main"
    }
}
