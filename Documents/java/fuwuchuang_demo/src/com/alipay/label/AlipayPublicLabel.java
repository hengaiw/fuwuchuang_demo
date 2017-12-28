package com.alipay.label;

import java.util.ArrayList;
import java.util.List;

import com.alipay.api.AlipayClient;
import com.alipay.api.domain.AlipayOpenPublicLifeLabelCreateModel;
import com.alipay.api.domain.AlipayOpenPublicLifeLabelDeleteModel;
import com.alipay.api.domain.AlipayOpenPublicLifeLabelModifyModel;
import com.alipay.api.domain.AlipayOpenPublicMatchuserLabelCreateModel;
import com.alipay.api.domain.AlipayOpenPublicMatchuserLabelDeleteModel;
import com.alipay.api.domain.Matcher;
import com.alipay.api.request.AlipayOpenPublicLifeLabelBatchqueryRequest;
import com.alipay.api.request.AlipayOpenPublicLifeLabelCreateRequest;
import com.alipay.api.request.AlipayOpenPublicLifeLabelDeleteRequest;
import com.alipay.api.request.AlipayOpenPublicLifeLabelModifyRequest;
import com.alipay.api.request.AlipayOpenPublicMatchuserLabelCreateRequest;
import com.alipay.api.request.AlipayOpenPublicMatchuserLabelDeleteRequest;
import com.alipay.api.response.AlipayOpenPublicLifeLabelBatchqueryResponse;
import com.alipay.api.response.AlipayOpenPublicLifeLabelCreateResponse;
import com.alipay.api.response.AlipayOpenPublicLifeLabelDeleteResponse;
import com.alipay.api.response.AlipayOpenPublicLifeLabelModifyResponse;
import com.alipay.api.response.AlipayOpenPublicMatchuserLabelCreateResponse;
import com.alipay.api.response.AlipayOpenPublicMatchuserLabelDeleteResponse;
import com.alipay.factory.AlipayAPIClientFactory;

/**
 * 服务窗自定义标签接口调用示例
 * 
 * @author liliang
 *
 */
public class AlipayPublicLabel {

    public static void main(String[] args) {
        createLifeLabel();
        //        modifyLifeLabel();
        //        lifeLabelBatchQuery();
        //        deleteLifeLabel();
        //        matchuserLabelAdd();
        //        matchuserLabelDel();
    }

    //创建自定义标签
    public static void createLifeLabel() {
        AlipayClient alipayClient = AlipayAPIClientFactory.getAlipayClient();
        AlipayOpenPublicLifeLabelCreateRequest request = new AlipayOpenPublicLifeLabelCreateRequest();
        AlipayOpenPublicLifeLabelCreateModel model = new AlipayOpenPublicLifeLabelCreateModel();
        model.setLabelName("线上测试标签005");
        model.setDataType("String");
        request.setBizModel(model);
        AlipayOpenPublicLifeLabelCreateResponse response = null;
        try {
            response = alipayClient.execute(request);
            System.out.println(response.getBody());
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    //修改自定义标签
    public static void modifyLifeLabel() {
        AlipayClient alipayClient = AlipayAPIClientFactory.getAlipayClient();
        AlipayOpenPublicLifeLabelModifyRequest request = new AlipayOpenPublicLifeLabelModifyRequest();
        AlipayOpenPublicLifeLabelModifyModel model = new AlipayOpenPublicLifeLabelModifyModel();
        model.setLabelId("6");
        model.setLabelName("测试标签003");
        request.setBizModel(model);
        AlipayOpenPublicLifeLabelModifyResponse response = null;
        try {
            response = alipayClient.execute(request);
            System.out.println(response.getBody());
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    //批量查询自定义标签
    public static void lifeLabelBatchQuery() {
        AlipayClient alipayClient = AlipayAPIClientFactory.getAlipayClient();
        AlipayOpenPublicLifeLabelBatchqueryRequest request = new AlipayOpenPublicLifeLabelBatchqueryRequest();
        AlipayOpenPublicLifeLabelBatchqueryResponse response = null;
        try {
            response = alipayClient.execute(request);
            System.out.println(response.getBody());
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    //删除自定义标签
    public static void deleteLifeLabel() {
        AlipayClient alipayClient = AlipayAPIClientFactory.getAlipayClient();
        AlipayOpenPublicLifeLabelDeleteRequest request = new AlipayOpenPublicLifeLabelDeleteRequest();
        AlipayOpenPublicLifeLabelDeleteModel model = new AlipayOpenPublicLifeLabelDeleteModel();
        model.setLabelId("6");
        request.setBizModel(model);
        AlipayOpenPublicLifeLabelDeleteResponse response = new AlipayOpenPublicLifeLabelDeleteResponse();
        try {
            response = alipayClient.execute(request);
            System.out.println(response.getBody());
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    //匹配用户打标
    public static void matchuserLabelAdd() {
        AlipayClient alipayClient = AlipayAPIClientFactory.getAlipayClient();
        AlipayOpenPublicMatchuserLabelCreateRequest request = new AlipayOpenPublicMatchuserLabelCreateRequest();
        AlipayOpenPublicMatchuserLabelCreateModel model = new AlipayOpenPublicMatchuserLabelCreateModel();
        model.setLabelId("9");
        model.setLabelValue("湖北");
        List<Matcher> matchers = new ArrayList<Matcher>();
        Matcher matcher = new Matcher();
        //        matcher.setMobileNo("15926225236");
        matcher.setUserId("2088102877563751");
        matchers.add(matcher);
        model.setMatchers(matchers);
        request.setBizModel(model);
        AlipayOpenPublicMatchuserLabelCreateResponse response = null;
        try {
            response = alipayClient.execute(request);
            System.out.println(response.getBody());
        } catch (Exception e) {
            // TODO: handle exception
        }

    }

    //匹配用户标签取消
    public static void matchuserLabelDel() {
        AlipayClient alipayClient = AlipayAPIClientFactory.getAlipayClient();
        AlipayOpenPublicMatchuserLabelDeleteRequest request = new AlipayOpenPublicMatchuserLabelDeleteRequest();
        AlipayOpenPublicMatchuserLabelDeleteModel model = new AlipayOpenPublicMatchuserLabelDeleteModel();
        model.setLabelId("6");
        List<Matcher> matchers = new ArrayList<Matcher>();
        Matcher matcher = new Matcher();
        matcher.setMobileNo("15926225236");
        matchers.add(matcher);
        model.setMatchers(matchers);
        request.setBizModel(model);
        AlipayOpenPublicMatchuserLabelDeleteResponse response = null;
        try {
            response = alipayClient.execute(request);
            System.out.println(response.getBody());
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
