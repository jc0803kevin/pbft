package cc.weno.util;

import cc.weno.config.StartConfig;
import cn.hutool.core.io.file.FileWriter;
import cn.hutool.json.JSONUtil;
import cc.weno.dao.bean.ReplayJson;
import cc.weno.dao.node.Node;
import cc.weno.dao.pbft.PbftMsg;
import lombok.extern.slf4j.Slf4j;

/**

 *
 * @author: kevin
 * @data: 2020/2/15 下午10:38
 * @description: pbft算法的工具类
 */
@Slf4j
public class PbftUtil {

    private static boolean flag = true;

    public static String ipJsonPath = StartConfig.basePath+"oldIp.json";


    public static boolean checkMsg(PbftMsg msg) {

        return true;
    }

    public static void save(PbftMsg msg) {
        log.info(String.format("文件写入%s", msg));
    }

    /**
     * 信息写入文件和AllNodeCommonMsg.allNodeAddressMap
     *
     * @param node
     */
    synchronized public static void writeIpToFile(Node node) {
        if (!flag) {
            return;
        }
        log.info(String.format("节点%s写入文件", node.getIndex()));
        FileWriter writer = new FileWriter(ipJsonPath);
        ReplayJson replayJson = new ReplayJson();
        replayJson.setIndex(node.getIndex());
        replayJson.setIp(node.getAddress().getIp());
        replayJson.setPort(node.getAddress().getPort());
        replayJson.setPublicKey(node.getPublicKey());
        String json = JSONUtil.toJsonStr(replayJson);
        writer.append(json + "\n");
        flag = false;
    }

}
