package com.alipay.generalize;

import com.alipay.api.AlipayClient;
import com.alipay.api.domain.AlipayOpenPublicQrcodeCreateModel;
import com.alipay.api.domain.AlipayOpenPublicShortlinkCreateModel;
import com.alipay.api.domain.CodeInfo;
import com.alipay.api.domain.Scene;
import com.alipay.api.request.AlipayOpenPublicQrcodeCreateRequest;
import com.alipay.api.request.AlipayOpenPublicShortlinkCreateRequest;
import com.alipay.api.response.AlipayOpenPublicQrcodeCreateResponse;
import com.alipay.api.response.AlipayOpenPublicShortlinkCreateResponse;
import com.alipay.factory.AlipayAPIClientFactory;

/**
 * 推广支持接口调用示例
 * @author liliang
 *
 */
public class AlipayOpenGeneralize {

	// 带参推广二维码接口
	public static void qrcodeCreate() {
		AlipayClient alipayClient = AlipayAPIClientFactory.getAlipayClient();
		AlipayOpenPublicQrcodeCreateRequest request = new AlipayOpenPublicQrcodeCreateRequest();
		AlipayOpenPublicQrcodeCreateModel model = new AlipayOpenPublicQrcodeCreateModel();
		CodeInfo codeInfo = new CodeInfo();
		Scene scene = new Scene();
		scene.setSceneId("1");
		codeInfo.setGotoUrl("https://xxxxxx.com");
		codeInfo.setScene(scene);
		model.setCodeInfo(codeInfo);
		model.setCodeType("TEMP");
		model.setExpireSecond("1800");
		model.setShowLogo("Y");
		request.setBizModel(model);
		System.out.println(request.getBizContent());
		AlipayOpenPublicQrcodeCreateResponse response = new AlipayOpenPublicQrcodeCreateResponse();
		try {
			response = alipayClient.execute(request);
			System.out.println(response.getBody());
		} catch (Exception e) {
			// TODO: 异常处理
		}
	}

	// 带参推广短链接接口
	public static void shortlinkCreate() {
		AlipayClient alipayClient = AlipayAPIClientFactory.getAlipayClient();
		AlipayOpenPublicShortlinkCreateRequest request = new AlipayOpenPublicShortlinkCreateRequest();
		AlipayOpenPublicShortlinkCreateModel model = new AlipayOpenPublicShortlinkCreateModel();
		model.setSceneId("2");
		model.setRemark("门店1支付推广");
		request.setBizModel(model);
		AlipayOpenPublicShortlinkCreateResponse response = new AlipayOpenPublicShortlinkCreateResponse();
		try {
			response = alipayClient.execute(request);
			System.out.println(response.getBody());
		} catch (Exception e) {
			// TODO: 异常处理
		}
	}
	
	public static void main(String[] args) {
		qrcodeCreate();
//		shortlinkCreate();
	}
}
