package activeMQ.topic;

import cn.hutool.core.util.NetUtil;

import javax.swing.*;

/**
 * 用于判断activeMQ是否启动
 */
public class ActiveMQUtil {

    public static void main(String[] args) {
        checkServer();
    }
    public static void checkServer() {
        if(NetUtil.isUsableLocalPort(8161)) {
            JOptionPane.showMessageDialog(null, "ActiveMQ 服务器未启动 ");
            System.exit(1);
        }
    }
}