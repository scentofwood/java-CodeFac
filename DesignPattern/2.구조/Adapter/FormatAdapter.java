public class FormatAdapter implements MediaPlayer {
    private MediaPackage media;

    public FormatAdapter(MediaPackage media) {
        this.media = media;
    }

    @Override
    public void play(String filename) {
        // TODO Auto-generated method stub
        System.out.print("Using Adapter --> ");
        media.palyFile(filename);
    }
    
}
