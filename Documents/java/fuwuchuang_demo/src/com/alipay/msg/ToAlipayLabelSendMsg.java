package com.alipay.msg;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.AlipayClient;
import com.alipay.api.request.AlipayOpenPublicMessageSingleSendRequest;
import com.alipay.api.response.AlipayOpenPublicMessageSingleSendResponse;
import com.alipay.factory.AlipayAPIClientFactory;

import net.sf.json.JSONObject;

/**
 * 服务窗组发消息（标签组发消息接口）
 * @author liliang
 *
 */
public class ToAlipayLabelSendMsg {

	//单发模板消息，需要先领取对应的消息模板，参数要根据要使用的模板样式来拼接，具体说明可参见开放平台接口文档
	public static void main(String[] args) {
		AlipayClient alipayClient = AlipayAPIClientFactory.getAlipayClient();
		AlipayOpenPublicMessageSingleSendRequest request = new AlipayOpenPublicMessageSingleSendRequest();
		Map<String, Object> bizMap = new HashMap<String, Object>();
		bizMap.put("to_user_id", "2088802608984030");
		Map<String, Object> templateMap = new HashMap<String, Object>();
		templateMap.put("template_id", "2cadf4d7b89648fd87a30c8ee3b4b505");
		Map<String, Object> contextMap = new HashMap<String, Object>();
		contextMap.put("head_color", "#85be53");
		contextMap.put("url", "http://m.baidu.com");
		contextMap.put("action_name", "查看详情");
		Map<String, Object> first = new HashMap<String, Object>();
		first.put("value", "亲爱的李亮同学你好，现在是李亮在给你发消息");
		Map<String, Object> keyword1 = new HashMap<String, Object>();
		keyword1.put("value", "12345");
		Map<String, Object> keyword2 = new HashMap<String, Object>();
		keyword2.put("value", "测试交易");
		Map<String, Object> keyword3 = new HashMap<String, Object>();
		keyword3.put("value", "2016-08-02 15:16:00");
		Map<String, Object> keyword4 = new HashMap<String, Object>();
		keyword4.put("value", "宝剑锋从磨砺出，梅花香自苦寒来！");
		Map<String, Object> remark = new HashMap<String, Object>();
		remark.put("value", "哈哈哈哈");
		contextMap.put("first", first);
		contextMap.put("keyword1", keyword1);
		contextMap.put("keyword2", keyword2);
		contextMap.put("keyword3", keyword3);
		contextMap.put("keyword4", keyword4);
		contextMap.put("remark", remark);
		templateMap.put("context", contextMap);
		bizMap.put("template", templateMap);
		request.setBizContent(JSONObject.fromObject(bizMap).toString());
		System.out.println(request.getBizContent());
		AlipayOpenPublicMessageSingleSendResponse response = null;
		try {
			response = alipayClient.execute(request);
			System.out.println(response.getBody());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
