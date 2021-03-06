package nuclearcoder.discordbot;

import nuclearcoder.discordbot.database.Database;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class TimerKeepAlive extends TimerTask {

    private static final long KEEP_ALIVE = TimeUnit.SECONDS.toMillis(5);

    final AtomicBoolean alive = new AtomicBoolean(true);

    private final Timer timer;

    TimerKeepAlive()
    {
        this.timer = new Timer("keepAlive", false);
        timer.schedule(this, KEEP_ALIVE, KEEP_ALIVE);
    }

    @Override public void run()
    {
        if (alive.get())
        {
            Database.keepAlive();
        }
        else
        {
            timer.cancel();
        }
    }

}
