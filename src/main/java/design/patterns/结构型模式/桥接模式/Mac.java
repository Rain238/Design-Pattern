package design.patterns.结构型模式.桥接模式;

/**
 * @author LightRain
 * 扩展抽象化角色(Mac操作系统)
 */
public class Mac extends OpratingSystem {
    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String filename) {
        videoFile.decode(filename);
    }
}
