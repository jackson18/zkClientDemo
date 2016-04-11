package com.qijiabin.demo;

import org.I0Itec.zkclient.IZkDataListener;
import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.serialize.BytesPushThroughSerializer;

/**
 * ========================================================
 * 日 期：2016年4月11日 上午11:57:06
 * 作 者：jiabin.qi
 * 版 本：1.0.0
 * 类说明：测试七
 * 监听节点数据变化
 * ========================================================
 * 修订日期     修订人    描述
 */
public class ListenDataChange {

	public static void main(String[] args) throws InterruptedException {
		ZkClient zkClient = new ZkClient("192.168.1.66:2181", 1000, 1000, new BytesPushThroughSerializer());
		System.out.println("connect ok!");
		
		zkClient.subscribeDataChanges("/node1", new ZkDataListen());
		Thread.sleep(Integer.MAX_VALUE);
	}
	
	private static class ZkDataListen implements IZkDataListener {
		
		public void handleDataChange(String dataPath, Object data) throws Exception {
			System.err.println("数据有更新，" + dataPath + ":" + data);
		}
		
		public void handleDataDeleted(String dataPath) throws Exception {
			System.out.println("数据有删除，" + dataPath);
		}
	}
	
}
