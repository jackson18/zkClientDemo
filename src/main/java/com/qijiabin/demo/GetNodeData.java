package com.qijiabin.demo;

import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.serialize.SerializableSerializer;
import org.apache.zookeeper.data.Stat;

/**
 * ========================================================
 * 日 期：2016年4月11日 上午11:36:24
 * 作 者：jiabin.qi
 * 版 本：1.0.0
 * 类说明：测试三
 * 获取节点数据
 * ========================================================
 * 修订日期     修订人    描述
 */
public class GetNodeData {

	public static void main(String[] args) {
		ZkClient zkClient = new ZkClient("192.168.1.66:2181", 1000, 1000, new SerializableSerializer());
		System.out.println("connect ok");
		
		Stat stat = new Stat();
		UserInfo user = zkClient.readData("/node1", stat);
		System.out.println(user.getName());
		System.out.println(stat);
	}
	
}
