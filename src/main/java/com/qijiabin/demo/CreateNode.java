package com.qijiabin.demo;

import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.serialize.SerializableSerializer;
import org.apache.zookeeper.CreateMode;

/**
 * ========================================================
 * 日 期：2016年4月11日 上午11:32:34
 * 作 者：jiabin.qi
 * 版 本：1.0.0
 * 类说明：测试二
 * 建立节点
 * ========================================================
 * 修订日期     修订人    描述
 */
public class CreateNode {

	public static void main(String[] args) {
		ZkClient zkClient = new ZkClient("192.168.1.66:2181", 1000, 1000, new SerializableSerializer());
		System.out.println("connect ok!");
		
		UserInfo user = new UserInfo(1, "jack");
		String path = zkClient.create("/node1/data2", user, CreateMode.PERSISTENT);
		System.out.println(path);
	}
	
}
