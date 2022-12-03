package design.patterns.结构型模式.桥接模式;

/**
 * @author LightRain
 * 扩展抽象化角色(Windows操作系统)
 */
public class Windows extends OpratingSystem {
    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String filename) {
        videoFile.decode(filename);
    }
}
