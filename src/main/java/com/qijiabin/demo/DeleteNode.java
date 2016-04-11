package com.qijiabin.demo;

import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.serialize.SerializableSerializer;

/**
 * ========================================================
 * 日 期：2016年4月11日 下午12:02:53
 * 作 者：jiabin.qi
 * 版 本：1.0.0
 * 类说明：测试九
 * 删除节点
 * ========================================================
 * 修订日期     修订人    描述
 */
public class DeleteNode {

	public static void main(String[] args) {
		ZkClient zkClient = new ZkClient("192.168.1.66:2181", 1000, 1000, new SerializableSerializer());
		System.out.println("connect ok");
		
//		boolean flag = zkClient.delete("/node1/data2");
		boolean flag2 = zkClient.deleteRecursive("/node1");
		System.out.println(flag2);
	}
	
}
