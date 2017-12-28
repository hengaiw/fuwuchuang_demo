package com.alipay.servlet.auth;

import com.alipay.api.AlipayClient;
import com.alipay.api.domain.AlipayOpenPublicGisQueryModel;
import com.alipay.api.request.AlipayOpenPublicFollowBatchqueryRequest;
import com.alipay.api.request.AlipayOpenPublicGisQueryRequest;
import com.alipay.api.response.AlipayOpenPublicFollowBatchqueryResponse;
import com.alipay.api.response.AlipayOpenPublicGisQueryResponse;
import com.alipay.factory.AlipayAPIClientFactory;

/**
 * 获取关注用户相关信息接口调用示例
 * @author liliang
 *
 */
public class AlipayPublicFollowUser {

	public static void main(String[] args) {
		followlistQuery();
//		gisQuery();
	}
	
	// 获取服务窗关注者列表
	public static void followlistQuery() {
		AlipayClient alipayClient = AlipayAPIClientFactory.getAlipayClient();
		AlipayOpenPublicFollowBatchqueryRequest request = new AlipayOpenPublicFollowBatchqueryRequest();
		request.setBizContent("{}");
		AlipayOpenPublicFollowBatchqueryResponse response = null;
		try {
			response = alipayClient.execute(request);
			System.out.println(response.getBody());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	//获取用户地理位置
	public static void gisQuery() {
		AlipayClient alipayClient = AlipayAPIClientFactory.getAlipayClient();
		AlipayOpenPublicGisQueryRequest request = new AlipayOpenPublicGisQueryRequest();
		AlipayOpenPublicGisQueryModel model = new AlipayOpenPublicGisQueryModel();
		model.setUserId("2088802608984030");
		request.setBizModel(model);
		AlipayOpenPublicGisQueryResponse response = null;
		try {
			response = alipayClient.execute(request);
			System.out.println(response.getBody());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
