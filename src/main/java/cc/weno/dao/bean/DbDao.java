package cc.weno.dao.bean;

import lombok.Data;

import java.io.Serializable;

/**

 *
 * @author: kevin
 * @data: 2020/3/1 上午12:05
 * @description: 讲结果认证保存在levelDB中
 */
@Data
public class DbDao implements Serializable {
    /**
     * PBFTmsg消息的时间
     */
    private long time;
    /**
     * 参与认证的节点序号
     */
    private int node;
    /**
     * 参与认证节点的publicKey
     */
    private String publicKey;
    /**
     * 认证结果的视图view
     */
    private int viewNum;
}
