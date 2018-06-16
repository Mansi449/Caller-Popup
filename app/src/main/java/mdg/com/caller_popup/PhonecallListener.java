package mdg.com.caller_popup;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import android.util.Log;

/**
 * Created by mansi on 17/6/18.
 */

public class PhonecallListener extends BroadcastReceiver {
    String caller_number;
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.e("incoming","call");
        caller_number = intent.getStringExtra(TelephonyManager.EXTRA_INCOMING_NUMBER);
        Log.e("caller no.: ", caller_number);
    }
}
