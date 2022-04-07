package ss4_lop_va_doi_tuong.bai_tap;

import java.time.LocalTime;
import java.util.Date;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
    }

    public StopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();

    }

    public void end() {
        this.endTime = System.currentTimeMillis();

    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }
}

class TextStopWatch {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();

        stopWatch.start();
        long a = 1;
        long b = 2;
        long c = 3;
        for (long i = 0; i < 1000000000; i++) {
            a = b;
            c = a;
        }
        stopWatch.end();
        System.out.print(stopWatch.getElapsedTime());
    }
}

