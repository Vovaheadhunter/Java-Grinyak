public class StopWatch {
    private long startTime;
    private long endTime;
    private long GetSt(){
        return startTime;
    }

    private long GetEnd(){
        return endTime;
    }

    StopWatch(){
        startTime = System.currentTimeMillis();
    }

    void start(){
        startTime = System.currentTimeMillis();
    }

    void stop(){
        endTime = System.currentTimeMillis();
    }

    long getElapsedTime(){
        return endTime - startTime;
    }
}
