package cc.weno.dao.bean;

import lombok.Data;

/**

 *
 * @author: kevin
 * @data: 2020/2/18 下午11:59
 * @description: ip json信息
 */
@Data
public class ReplayJson {
    private int index;
    private String ip;
    private int port;
    private String publicKey;
}
