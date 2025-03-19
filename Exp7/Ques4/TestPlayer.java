package Exp7.Ques4;

public class TestPlayer {
    public static void main(String[] args) {
        // Create an instance of MusicPlayer
        Playable player = new MusicPlayer();

        // Test the methods
        player.play();   // Calls play() method
        player.pause();  // Calls pause() method
        player.stop();   // Calls stop() method
    }
}