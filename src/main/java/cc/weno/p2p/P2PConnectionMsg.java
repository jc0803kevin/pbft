package cc.weno.p2p;

import org.tio.client.ClientChannelContext;

import java.util.Map;

/**

 *
 * @author: kevin
 * @data: 2020/2/13 下午7:47
 * @description: p2p网络的连接信息
 * 这个里面有：
 * 1. 自己作为服务端所连接的client信息
 * 2. 自己作为客户端与server的上下文
 */
public class P2PConnectionMsg {

    /**
     * 代表结点的client
     */
    public static Map<Integer,ClientChannelContext> CLIENTS;


}
