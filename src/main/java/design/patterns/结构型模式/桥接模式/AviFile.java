package design.patterns.结构型模式.桥接模式;

/**
 * @author LightRain
 * Avi视频文件(具体的实现化角色)
 */
public class AviFile implements VideoFile {
    @Override
    public void decode(String filename) {
        System.out.println("Avi视频文件：" + filename);
    }
}
