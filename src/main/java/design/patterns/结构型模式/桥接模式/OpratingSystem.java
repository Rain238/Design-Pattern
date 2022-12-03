package design.patterns.结构型模式.桥接模式;

/**
 * 抽象的操作系统类(抽象化角色)
 */
public abstract class OpratingSystem {
    /**
     * 声明videoFile变量
     */
    protected VideoFile videoFile;

    public OpratingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    /**
     * 播放视频文件
     *
     * @param filename 视频文件
     */
    public abstract void play(String filename);
}
