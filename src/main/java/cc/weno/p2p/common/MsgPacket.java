package cc.weno.p2p.common;

import org.tio.core.intf.Packet;

/**

 *
 * @author: kevin
 * @data: 2020/2/12 上午12:06
 * @description: Packet包
 */
public class MsgPacket extends Packet {

    private static final long serialVersionUID = -172060606924066412L;
    /**
     * 消息头的长度
     */
    public static final int HEADER_LENGHT = 4;
    public static final String CHARSET = "utf-8";
    private byte[] body;

    public byte[] getBody() {
        return body;
    }

    public void setBody(byte[] body) {
        this.body = body;
    }
}
