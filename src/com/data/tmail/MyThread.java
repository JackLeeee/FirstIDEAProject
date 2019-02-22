package com.data.tmail;

public class MyThread extends Thread {
    public void run() {
        try {
            //监控持续的分钟数
            Monitor.monitorButton(10);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
