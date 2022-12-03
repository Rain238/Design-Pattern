package design.patterns.结构型模式.桥接模式;

/**
 * @author LightRain
 * 视频文件(实现化角色)
 */
public interface VideoFile {
    /**
     * 解码器
     *
     * @param filename 文件名称
     */
    void decode(String filename);
}
