package com.alipay.appinfo;

import com.alipay.api.AlipayClient;
import com.alipay.api.domain.AlipayOpenPublicInfoModifyModel;
import com.alipay.api.request.AlipayOpenPublicInfoModifyRequest;
import com.alipay.api.request.AlipayOpenPublicInfoQueryRequest;
import com.alipay.api.response.AlipayOpenPublicInfoModifyResponse;
import com.alipay.api.response.AlipayOpenPublicInfoQueryResponse;
import com.alipay.factory.AlipayAPIClientFactory;

/**
 * 基础信息设置接口调用示例
 * 
 * @author liliang
 *
 */
public class AlipayPublicInfo {
	
	public static void main(String[] args) {
		appInfoQuery();
	}

	// 服务窗基础信息查询接口
	public static void appInfoQuery() {
		AlipayClient alipayClient = AlipayAPIClientFactory.getAlipayClient();
		AlipayOpenPublicInfoQueryRequest request = new AlipayOpenPublicInfoQueryRequest();
		AlipayOpenPublicInfoQueryResponse response = null;
		try {
			response = alipayClient.execute(request);
			System.out.println(response.getBody());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	//服务窗基础信息修改接口
	public static void appInfoModify(){
		AlipayClient alipayClient = AlipayAPIClientFactory.getAlipayClient();
		AlipayOpenPublicInfoModifyRequest request = new AlipayOpenPublicInfoModifyRequest();
		AlipayOpenPublicInfoModifyModel model = new AlipayOpenPublicInfoModifyModel();
		model.setAppName("测试生活号");
		model.setLogoUrl("http://pic.alipayobjects.com/e/201311/1ZQ");
		model.setPublicGreeting("欢迎光临");
		model.setLicenseUrl("http://pic.alipayobjects.com/e/201311/1ZQ");
		request.setBizModel(model);
		AlipayOpenPublicInfoModifyResponse response = null;
		try {
			response = alipayClient.execute(request);
			System.out.println(response.getBody());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
