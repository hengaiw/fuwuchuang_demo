package com.alipay.extension;

import java.util.ArrayList;
import java.util.List;

import com.alipay.api.AlipayClient;
import com.alipay.api.FileItem;
import com.alipay.api.domain.AlipayOpenPublicDefaultExtensionCreateModel;
import com.alipay.api.domain.AlipayOpenPublicPersonalizedExtensionCreateModel;
import com.alipay.api.domain.AlipayOpenPublicPersonalizedExtensionDeleteModel;
import com.alipay.api.domain.ExtensionArea;
import com.alipay.api.domain.LabelRule;
import com.alipay.api.request.AlipayOfflineMaterialImageUploadRequest;
import com.alipay.api.request.AlipayOpenPublicDefaultExtensionCreateRequest;
import com.alipay.api.request.AlipayOpenPublicPersonalizedExtensionBatchqueryRequest;
import com.alipay.api.request.AlipayOpenPublicPersonalizedExtensionCreateRequest;
import com.alipay.api.request.AlipayOpenPublicPersonalizedExtensionDeleteRequest;
import com.alipay.api.response.AlipayOfflineMaterialImageUploadResponse;
import com.alipay.api.response.AlipayOpenPublicDefaultExtensionCreateResponse;
import com.alipay.api.response.AlipayOpenPublicPersonalizedExtensionBatchqueryResponse;
import com.alipay.api.response.AlipayOpenPublicPersonalizedExtensionCreateResponse;
import com.alipay.api.response.AlipayOpenPublicPersonalizedExtensionDeleteResponse;
import com.alipay.factory.AlipayAPIClientFactory;

/**
 * 扩展区接口调用示例
 * 
 * @author liliang
 * @version $Id: AlipayPublicExtension.java, v 0.1 2017年6月28日 下午3:00:10 liliang Exp $
 */
public class AlipayPublicExtension {

    public static void main(String[] args) {
        //        imageUpload();
        personalizedExtensionCreate();
        //        extensionDelete();
        //        batchQueryExtensions();
    }

    //使用alipay.offline.material.image.upload接口预先上传图片
    public static void imageUpload() {
        AlipayClient alipayClient = AlipayAPIClientFactory.getAlipayClient();
        AlipayOfflineMaterialImageUploadRequest request = new AlipayOfflineMaterialImageUploadRequest();
        request.setImageType("jpg");
        request.setImageName("chengzetest001");
        FileItem ImageContent = new FileItem("/Users/liliang/Documents/1.jpg");
        request.setImageContent(ImageContent);
        AlipayOfflineMaterialImageUploadResponse response = null;
        try {
            response = alipayClient.execute(request);
            System.out.println(response.getBody());
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    //默认扩展区创建
    public static void defaultExtensionCreate() {
        AlipayClient alipayClient = AlipayAPIClientFactory.getAlipayClient();
        AlipayOpenPublicDefaultExtensionCreateRequest request = new AlipayOpenPublicDefaultExtensionCreateRequest();
        AlipayOpenPublicDefaultExtensionCreateModel model = new AlipayOpenPublicDefaultExtensionCreateModel();
        List<ExtensionArea> areas = new ArrayList<ExtensionArea>();
        ExtensionArea area = new ExtensionArea();
        area.setType("image");
        area.setGotoUrl("https://baidu.com");
        area.setName("扩展区1");
        area.setHeight(500l);
        //使用alipay.offline.material.image.upload接口预先上传图片
        area.setUrl(
            "https://oalipay-dl-django.alicdn.com/rest/1.0/image?fileIds=JVo6g7dXRHGoGNllHDFYgwAAACMAAQQD&zoom=original");
        areas.add(area);
        model.setAreas(areas);
        request.setBizModel(model);
        AlipayOpenPublicDefaultExtensionCreateResponse response = new AlipayOpenPublicDefaultExtensionCreateResponse();
        try {
            response = alipayClient.execute(request);
            System.out.println(response.getBody());
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    //个性化扩展区创建
    public static void personalizedExtensionCreate() {
        AlipayClient alipayClient = AlipayAPIClientFactory.getAlipayClient();
        AlipayOpenPublicPersonalizedExtensionCreateRequest request = new AlipayOpenPublicPersonalizedExtensionCreateRequest();
        AlipayOpenPublicPersonalizedExtensionCreateModel model = new AlipayOpenPublicPersonalizedExtensionCreateModel();
        List<ExtensionArea> areas = new ArrayList<ExtensionArea>();
        List<LabelRule> labelRules = new ArrayList<LabelRule>();
        ExtensionArea area = new ExtensionArea();
        area.setType("image");
        area.setGotoUrl("https://baidu.com");
        area.setName("扩展区1");
        area.setHeight(500l);
        //使用alipay.offline.material.image.upload接口预先上传图片
        area.setUrl(
            "https://oalipay-dl-django.alicdn.com/rest/1.0/image?fileIds=JVo6g7dXRHGoGNllHDFYgwAAACMAAQQD&zoom=original");
        areas.add(area);
        LabelRule labelRule = new LabelRule();
        labelRule.setLabelId("9");
        labelRule.setLabelValue("湖北");
        labelRules.add(labelRule);
        model.setAreas(areas);
        model.setLabelRule(labelRules);
        request.setBizModel(model);
        AlipayOpenPublicPersonalizedExtensionCreateResponse response = new AlipayOpenPublicPersonalizedExtensionCreateResponse();
        try {
            response = alipayClient.execute(request);
            System.out.println(response.getBody());
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    //化扩展区删除
    public static void extensionDelete() {
        AlipayClient alipayClient = AlipayAPIClientFactory.getAlipayClient();
        AlipayOpenPublicPersonalizedExtensionDeleteRequest request = new AlipayOpenPublicPersonalizedExtensionDeleteRequest();
        AlipayOpenPublicPersonalizedExtensionDeleteModel model = new AlipayOpenPublicPersonalizedExtensionDeleteModel();
        //删除默认扩展区，extension_key为default
        //        model.setExtensionKey("default");
        model.setExtensionKey("2015121600984320_c8cc9dc6-cd22-4b97-b435-0ed1e516b049");
        request.setBizModel(model);
        AlipayOpenPublicPersonalizedExtensionDeleteResponse response = new AlipayOpenPublicPersonalizedExtensionDeleteResponse();
        try {
            response = alipayClient.execute(request);
            System.out.println(response.getBody());
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    //个性化扩展区批量查询
    public static void batchQueryExtensions() {
        AlipayClient alipayClient = AlipayAPIClientFactory.getAlipayClient();
        AlipayOpenPublicPersonalizedExtensionBatchqueryRequest request = new AlipayOpenPublicPersonalizedExtensionBatchqueryRequest();
        AlipayOpenPublicPersonalizedExtensionBatchqueryResponse response = null;
        try {
            response = alipayClient.execute(request);
            System.out.println(response.getBody());
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
