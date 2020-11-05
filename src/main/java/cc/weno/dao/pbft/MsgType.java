package cc.weno.dao.pbft;
/**

 *
 * @author: kevin
 * @data: 2020/2/14 上午11:35
 * @description: 消息类型
 */
public class MsgType {
    /**
     * 请求视图
     */
    public static final int GET_VIEW = -1;

    /**
     * 变更视图
     */
    public static final int CHANGE_VIEW = 0;

    /**
     * 预准备阶段
     */
    public static final int PRE_PREPARE = 1;

    /**
     * 准备阶段
     */
    public static final int PREPARE = 2;

    /**
     * 提交阶段
     */
    public static final int COMMIT = 3;

    /**
     * ip消息回复回复阶段
     */
    public static final int CLIENT_REPLAY = 4;
}
