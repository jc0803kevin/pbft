package cc.weno.dao.node;

import lombok.Data;

/**

 *
 * @author: kevin
 * @data: 2020/1/22 下午4:04
 * @description: nodeAddress里面保存了结点的通信地址
 */
@Data
public class NodeAddress {
    /**
     * ip地址
     */
    private String ip;
    /**
     * 通信地址的端口号
     */
    private int port;

}
