package fe.textgame;

import fe.textgame.frame.Window;

public class game implements Runnable{

    //Initial Variables
    Thread thread;
    boolean running;

    @Override
    public void run() {

    }

    public synchronized void start(){
        if(running) return;

        running = true;
        thread = new Thread(this);
        thread.start();
    }

    public static void main(String[] args) {
        new Window(800, 800, "Just a game", new game());
    }

}
