package by.tiranid.model;

import java.sql.Date;
import java.sql.Time;

public class EntityUtils {

    public static WorkDaysEntity createTestWorkDaysEntity(String date, Byte iters, String time)  {
        WorkDaysEntity record = new WorkDaysEntity();

        record.setWorkDate(Date.valueOf(date));
        record.setIterations(iters);
        record.setWorkTime(time);

        return record;
    }

    public static WorkItersEntity createTestWorkItersEntity(String date, String time) throws Exception {
        WorkItersEntity record = new WorkItersEntity();
        record.setDdate(Date.valueOf(date));
        record.setTtime(Time.valueOf(time));
        return record;
    }

    public static long getCurrentDateTimeWithRound() {
        long time = new java.util.Date().getTime();
        // Round up to a second (ms)
        long accuracy = 1000;
        int k = 0;
        if (time % accuracy >= 500) {
            k = 1000;
        }
        return (time / accuracy * accuracy + k);
    }


}
