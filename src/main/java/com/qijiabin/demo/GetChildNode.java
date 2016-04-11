package com.qijiabin.demo;

import java.util.List;

import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.serialize.SerializableSerializer;

/**
 * ========================================================
 * 日 期：2016年4月11日 上午11:46:13
 * 作 者：jiabin.qi
 * 版 本：1.0.0
 * 类说明：测试六
 * 获取子节点
 * ========================================================
 * 修订日期     修订人    描述
 */
public class GetChildNode {

	public static void main(String[] args) {
		ZkClient zkClient = new ZkClient("192.168.1.66:2181", 1000, 1000, new SerializableSerializer());
		System.out.println("connect ok!");
		
		List<String> list = zkClient.getChildren("/node1");
		for (String string : list) {
			System.out.println(string);
		}
	}
	
}
