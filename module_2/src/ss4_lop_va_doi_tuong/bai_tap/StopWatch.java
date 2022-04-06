package ss4_lop_va_doi_tuong.bai_tap;

import java.time.LocalTime;
import java.util.Date;

public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;

    public StopWatch() {
    startTime=LocalTime.now();
    }

    public StopWatch(LocalTime startTime, LocalTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public LocalTime getStart(LocalTime startTime) {
        return startTime;
    }
    public LocalTime getStop(LocalTime endTime) {
        return endTime;
    }
    public void start(){
        this.startTime=LocalTime.now();
        getStart(startTime);
    }
    public void end(){
        this.endTime=LocalTime.now();
        getStop(endTime);
    }

    public void getElapsedTime() {
       int ElapsedTime=endTime.toSecondOfDay()*100 - startTime.toSecondOfDay()*100;
        System.out.print("so mili giay dem duoc la: "+ElapsedTime);
    }
}
