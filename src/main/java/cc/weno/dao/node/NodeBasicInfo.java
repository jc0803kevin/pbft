package cc.weno.dao.node;

import lombok.Data;

/**

 *
 * @author: kevin
 * @data: 2020/2/13 下午8:08
 * @description: 结点节本信息
 */
@Data
public class NodeBasicInfo {
    /**
     * 结点地址的信息
     */
    private NodeAddress address;
    /**
     * 这个代表了结点的序号
     */
    private int index;

}
