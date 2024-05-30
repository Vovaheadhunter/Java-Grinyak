public class MyTime {
    long hour;
    long minute;
    long second;

    MyTime(){
        hour = System.currentTimeMillis()/1000/60/60%24+10;
        minute = System.currentTimeMillis()/1000/60%60;
        second = System.currentTimeMillis()/1000%60;
    }
    MyTime(long msec){
        hour = msec/1000/60/60%24;
        minute = msec/1000/60%60;
        second = msec/1000%60;
    }

    MyTime(long ph, long pm, long ps){
        hour = ph;
        minute = pm;
        second = ps;
    }

    long GetHour(){
        return hour;
    }

    long GetMin(){
        return minute;
    }

    long GetSec(){
        return second;
    }

    void setTime(long elapseTime){
        hour = elapseTime/1000/60/60%24;
        minute = elapseTime/1000/60%60;
        second = elapseTime/1000%60;
    }
}
