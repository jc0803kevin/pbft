package cc.weno.dao.node;

import cn.hutool.crypto.asymmetric.RSA;
import lombok.Data;

/**

 *
 * @author: kevin
 * @data: 2020/1/22 下午3:22
 * @description: 结点自身的信息
 */
@Data
public class Node extends NodeBasicInfo {


    private static Node node = new Node();

    /**
     * 单例设计模式
     *
     * @return
     */
    public static Node getInstance() {
        return node;
    }

    private Node() {
        RSA rsa = new RSA();
        this.setPrivateKey(rsa.getPrivateKeyBase64());
        this.setPublicKey(rsa.getPublicKeyBase64());
    }


    /**
     * 判断结点是否运行
     */
    private boolean isRun = false;

    /**
     * 视图状态，判断是否ok，
     */
    private volatile boolean viewOK;

    /**
     * 公钥
     */
    private String publicKey;
    /**
     * 私钥
     */
    private String privateKey;
}
