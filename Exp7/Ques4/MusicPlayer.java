package Exp7.Ques4;

public class MusicPlayer implements Playable {
    
    @Override
    public void play() {
        System.out.println("🎵 Music is playing...");
    }

    @Override
    public void pause() {
        System.out.println("⏸️ Music is paused.");
    }

    @Override
    public void stop() {
        System.out.println("⏹️ Music is stopped.");
    }
}