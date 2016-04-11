package com.qijiabin.demo;

import java.util.List;

import org.I0Itec.zkclient.IZkChildListener;
import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.serialize.SerializableSerializer;

/**
 * ========================================================
 * 日 期：2016年4月11日 上午11:56:40
 * 作 者：jiabin.qi
 * 版 本：1.0.0
 * 类说明：测试八
 * 监听子节点数据变化
 * ========================================================
 * 修订日期     修订人    描述
 */
public class ListenChildDataChange {

	public static void main(String[] args) throws InterruptedException {
		ZkClient zkClient = new ZkClient("192.168.1.66:2181", 1000, 1000, new SerializableSerializer());
		System.out.println("connect ok");
		
		zkClient.subscribeChildChanges("/node1", new ZkChildListen());
		Thread.sleep(Integer.MAX_VALUE);
	}
	
	private static class ZkChildListen implements IZkChildListener {
		public void handleChildChange(String parentPath, List<String> currentChilds) throws Exception {
			System.out.println("子节点有变化！");
			System.out.println(parentPath);
			System.out.println(currentChilds.toString());
		}
	}
	
}
