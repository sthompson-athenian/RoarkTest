import org.jcodec.api.FrameGrab;
import org.jcodec.api.JCodecException;
import org.jcodec.common.model.Picture;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws JCodecException, IOException {
        int frameNumber = 42;
        Picture picture = FrameGrab.getFrameFromFile(new File("video.mp4"), frameNumber);
    }
}
