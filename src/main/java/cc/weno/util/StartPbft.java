package cc.weno.util;

import cc.weno.config.StartConfig;
import cc.weno.dao.node.Node;
import lombok.extern.slf4j.Slf4j;

/**

 *
 * @author: kevin
 * @data: 2020/2/19 下午7:56
 * @description: 启动
 */
@Slf4j
public class StartPbft {


    public static boolean start() {
        StartConfig startConfig = new StartConfig();
        if (startConfig.startConfig()) {
            if (new Pbft().pubView()) {
                return true;
            }
        }
        return false;
    }
}
