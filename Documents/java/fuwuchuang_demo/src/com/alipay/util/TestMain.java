package com.alipay.util;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradeCreateModel;
import com.alipay.api.domain.AlipayTradePayModel;
import com.alipay.api.request.AlipayTradeCreateRequest;
import com.alipay.api.request.AlipayTradePayRequest;
import com.alipay.api.response.AlipayTradeCreateResponse;
import com.alipay.api.response.AlipayTradePayResponse;
import com.alipay.constants.AlipayServiceEnvConstants;

public class TestMain {

	public static void tradeCreate(){
		AlipayClient client = new DefaultAlipayClient(AlipayServiceEnvConstants.ALIPAY_GATEWAY, AlipayServiceEnvConstants.APP_ID, 
				AlipayServiceEnvConstants.PRIVATE_KEY, "json", AlipayServiceEnvConstants.CHARSET, 
				AlipayServiceEnvConstants.ALIPAY_PUBLIC_KEY, AlipayServiceEnvConstants.SIGN_TYPE);
		AlipayTradeCreateRequest request = new AlipayTradeCreateRequest();
		AlipayTradeCreateModel model = new AlipayTradeCreateModel();
		model.setOutTradeNo("2131231412");
		model.setSellerId("2088102168512190");
		model.setTotalAmount("0.01");
		model.setBuyerLogonId("501624560335vj@sandbox.com");
		model.setSubject("iphone7");
		request.setBizModel(model);
		AlipayTradeCreateResponse response = new AlipayTradeCreateResponse();
		try {
			response = client.execute(request);
			System.out.println(response.getBody());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	public static void tradePay(){
		AlipayClient client = new DefaultAlipayClient(AlipayServiceEnvConstants.ALIPAY_GATEWAY, AlipayServiceEnvConstants.APP_ID, 
				AlipayServiceEnvConstants.PRIVATE_KEY, "json", AlipayServiceEnvConstants.CHARSET, 
				AlipayServiceEnvConstants.ALIPAY_PUBLIC_KEY, AlipayServiceEnvConstants.SIGN_TYPE);
		AlipayTradePayRequest request = new AlipayTradePayRequest();
		AlipayTradePayModel model = new AlipayTradePayModel();
		model.setOutTradeNo("1324124124");
		model.setScene("bar_code");
		model.setAuthCode("289179686864713886");
		model.setSubject("iphone7");
		model.setTotalAmount("0.01");
		request.setBizModel(model);
		AlipayTradePayResponse response = new AlipayTradePayResponse();
		try {
			response = client.execute(request);
			System.out.println(response.getBody());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
//		tradeCreate();
		tradePay();
	}
}
