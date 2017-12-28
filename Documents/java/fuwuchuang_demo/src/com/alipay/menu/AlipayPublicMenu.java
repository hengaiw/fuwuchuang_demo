package com.alipay.menu;

import java.util.ArrayList;
import java.util.List;

import com.alipay.api.AlipayClient;
import com.alipay.api.FileItem;
import com.alipay.api.domain.AlipayOpenPublicMenuCreateModel;
import com.alipay.api.domain.AlipayOpenPublicMenuModifyModel;
import com.alipay.api.domain.AlipayOpenPublicPersonalizedMenuCreateModel;
import com.alipay.api.domain.AlipayOpenPublicPersonalizedMenuDeleteModel;
import com.alipay.api.domain.ButtonObject;
import com.alipay.api.domain.LabelRule;
import com.alipay.api.request.AlipayOfflineMaterialImageUploadRequest;
import com.alipay.api.request.AlipayOpenPublicMenuBatchqueryRequest;
import com.alipay.api.request.AlipayOpenPublicMenuCreateRequest;
import com.alipay.api.request.AlipayOpenPublicMenuModifyRequest;
import com.alipay.api.request.AlipayOpenPublicPersonalizedMenuCreateRequest;
import com.alipay.api.request.AlipayOpenPublicPersonalizedMenuDeleteRequest;
import com.alipay.api.response.AlipayOfflineMaterialImageUploadResponse;
import com.alipay.api.response.AlipayOpenPublicMenuBatchqueryResponse;
import com.alipay.api.response.AlipayOpenPublicMenuCreateResponse;
import com.alipay.api.response.AlipayOpenPublicMenuModifyResponse;
import com.alipay.api.response.AlipayOpenPublicPersonalizedMenuCreateResponse;
import com.alipay.api.response.AlipayOpenPublicPersonalizedMenuDeleteResponse;
import com.alipay.factory.AlipayAPIClientFactory;

/**
 * 服务窗菜单相关接口调用示例
 * 
 * @author liliang
 *
 */
public class AlipayPublicMenu {

    public static void main(String[] args) {
        //        imageUpload();
        //        createMenu();
        //      modifyMenu();
        //        createPersonalizedMenu();
        //        deletePersonalizedMenu();
        menuBatchQuery();
    }

    //使用alipay.offline.material.image.upload接口预先上传图片
    public static void imageUpload() {
        AlipayClient alipayClient = AlipayAPIClientFactory.getAlipayClient();
        AlipayOfflineMaterialImageUploadRequest request = new AlipayOfflineMaterialImageUploadRequest();
        request.setImageType("jpg");
        request.setImageName("chengzetest001");
        FileItem ImageContent = new FileItem("/Users/liliang/Documents/picture/3.jpg");
        request.setImageContent(ImageContent);
        AlipayOfflineMaterialImageUploadResponse response = null;
        try {
            response = alipayClient.execute(request);
            System.out.println(response.getBody());
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    // 创建生活号默认菜单信息
    public static void createMenu() {
        AlipayClient alipayClient = AlipayAPIClientFactory.getAlipayClient();
        AlipayOpenPublicMenuCreateRequest request = new AlipayOpenPublicMenuCreateRequest();
        AlipayOpenPublicMenuCreateModel model = new AlipayOpenPublicMenuCreateModel();
        List<ButtonObject> list = new ArrayList<ButtonObject>();
        ButtonObject button = new ButtonObject();
        button.setName("测试");
        button.setActionType("link");
        button.setActionParam("www.baidu.com");
        list.add(button);
        model.setButton(list);
        model.setType("text");
        request.setBizModel(model);
        AlipayOpenPublicMenuCreateResponse response = null;
        try {
            response = alipayClient.execute(request);
            System.out.println(response.getBody());
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    // 生活号默认菜单更新
    public static void modifyMenu() {
        AlipayClient alipayClient = AlipayAPIClientFactory.getAlipayClient();
        AlipayOpenPublicMenuModifyRequest request = new AlipayOpenPublicMenuModifyRequest();
        AlipayOpenPublicMenuModifyModel model = new AlipayOpenPublicMenuModifyModel();
        List<ButtonObject> list = new ArrayList<ButtonObject>();
        ButtonObject button = new ButtonObject();
        button.setName("测试");
        button.setActionType("link");
        button.setActionParam("www.baidu.com");
        list.add(button);
        model.setButton(list);
        model.setType("text");
        request.setBizModel(model);
        AlipayOpenPublicMenuModifyResponse response = null;
        try {
            response = alipayClient.execute(request);
            System.out.println(response.getBody());
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    //创建个性化菜单
    public static void createPersonalizedMenu() {
        AlipayClient alipayClient = AlipayAPIClientFactory.getAlipayClient();
        AlipayOpenPublicPersonalizedMenuCreateRequest request = new AlipayOpenPublicPersonalizedMenuCreateRequest();
        AlipayOpenPublicPersonalizedMenuCreateModel model = new AlipayOpenPublicPersonalizedMenuCreateModel();
        model.setType("icon");
        List<ButtonObject> list = new ArrayList<ButtonObject>();
        ButtonObject button = new ButtonObject();
        button.setName("测试");
        button.setActionType("link");
        button.setActionParam("www.baidu.com");
        button.setIcon(
            "https://oalipay-dl-django.alicdn.com/rest/1.0/image?fileIds=OPwy4WqdSaWKYaLCe6-mqQAAACMAAQED&zoom=original");
        list.add(button);
        model.setButton(list);
        List<LabelRule> labelRules = new ArrayList<LabelRule>();
        LabelRule labelRule = new LabelRule();
        labelRule.setLabelId("15");
        labelRule.setLabelValue("湖北");
        labelRules.add(labelRule);
        model.setLabelRule(labelRules);
        request.setBizModel(model);
        AlipayOpenPublicPersonalizedMenuCreateResponse response = null;
        try {
            response = alipayClient.execute(request);
            System.out.println(response.getBody());
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    //个性化菜单删除
    public static void deletePersonalizedMenu() {
        AlipayClient alipayClient = AlipayAPIClientFactory.getAlipayClient();
        AlipayOpenPublicPersonalizedMenuDeleteRequest request = new AlipayOpenPublicPersonalizedMenuDeleteRequest();
        AlipayOpenPublicPersonalizedMenuDeleteModel model = new AlipayOpenPublicPersonalizedMenuDeleteModel();
        model.setMenuKey("");
        request.setBizModel(model);
        AlipayOpenPublicPersonalizedMenuDeleteResponse response = null;
        try {
            response = alipayClient.execute(request);
            System.out.println(response.getBody());
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    //菜单批量查询
    public static void menuBatchQuery() {
        AlipayClient alipayClient = AlipayAPIClientFactory.getAlipayClient();
        AlipayOpenPublicMenuBatchqueryRequest request = new AlipayOpenPublicMenuBatchqueryRequest();
        AlipayOpenPublicMenuBatchqueryResponse response = null;
        try {
            response = alipayClient.execute(request);
            System.err.println(response.getBody());
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
