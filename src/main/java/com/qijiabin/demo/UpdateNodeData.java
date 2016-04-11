package com.qijiabin.demo;

import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.serialize.SerializableSerializer;

/**
 * ========================================================
 * 日 期：2016年4月11日 上午11:39:20
 * 作 者：jiabin.qi
 * 版 本：1.0.0
 * 类说明：测试四
 * 修改节点数据
 * ========================================================
 * 修订日期     修订人    描述
 */
public class UpdateNodeData {

	public static void main(String[] args) {
		ZkClient zkClient = new ZkClient("192.168.1.66:2181", 1000, 1000, new SerializableSerializer());
		System.out.println("connect ok");
		
		UserInfo user = new UserInfo(2, "jackson");
		
		zkClient.writeData("/node1", user);
	}
	
}
