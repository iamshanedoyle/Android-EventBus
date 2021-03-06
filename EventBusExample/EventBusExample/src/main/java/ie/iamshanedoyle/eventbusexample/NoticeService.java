package ie.iamshanedoyle.eventbusexample;

import android.app.IntentService;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;

/**
 * Created by shane on 14/12/2013.
 */
public class NoticeService extends IntentService {

    public static final String BROADCAST = "ie.iamshanedoyle.eventbusexample.BROADCAST";

    private static Intent broadcast = new Intent(BROADCAST);

    public NoticeService() {
        super("NoticeService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        LocalBroadcastManager.getInstance(this).sendBroadcast(broadcast);
    }
}
