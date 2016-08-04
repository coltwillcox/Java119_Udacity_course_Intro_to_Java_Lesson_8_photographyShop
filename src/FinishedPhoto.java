// Optional
// Does your design use FinishedPhoto objects?
// If so, fill in this class with your code.

import java.util.ArrayList;

public class FinishedPhoto {

    private ArrayList<Picture> album;
    private ArrayList<String> photographers;

    public FinishedPhoto() {
        album = new ArrayList<>();
        photographers = new ArrayList<>();
    }

    public void addPhoto(String photo, String photographer) {
        album.add(new Picture(photo));
        photographers.add(photographer);
    }

    public void drawAlbum() {
        double x = 0;
        double y = 0;
        for (int i = 0; i < album.size(); i++) {
            album.get(i).translate(x, 0);
            album.get(i).draw();
            y = album.get(i).getHeight();
            (new Text(x, y, photographers.get(i))).draw();
            x += album.get(i).getWidth();
        }
    }

}