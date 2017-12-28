

/**

 * Alipay.com Inc.

 * Copyright (c) 2004-2014 All Rights Reserved.

 */

package com.alipay.constants;


/**
 * 支付宝服务窗环境常量（demo中常量只是参考，需要修改成自己的常量值）
 * 
 * @author taixu.zqq
 * @version $Id: AlipayServiceConstants.java, v 0.1 2014年7月24日 下午4:33:49 taixu.zqq Exp $
 */
public class AlipayServiceEnvConstants {

    /**支付宝公钥-从支付宝生活号详情页面获取*/
	public static final String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAsJoR3EqbWxAdzgr4DuJ7zVEA/WXm17EBZweUdTJoLtYMYA45FfdkmYKZ6YOJajezvruQentyFD7GV7ADDF8Ha28AX5HfEw0ohko7qN205FyPMOJZWKPTbqN0HoUN06gm+vC94T99kN9LY/hwfcGNThZNkyR8oFrvJ/XlU6Do4uSNONqZqBH3fix7uI8b3yALe+dG+nAGrppMSAcvHhzVHIDU9QYih6LFno1ihadjZFGJ+BcVHrWe+Fyi44viJLDAx1mJleOebyY4x3qjPAWfxTCalBnNIzLZBj3I0HiB0ULR8+A5s0hE5HBouarXVDor400ETwjjIBH4QPsios1fWwIDAQAB";
    
    /**签名编码-视支付宝服务窗要求*/
    public static final String SIGN_CHARSET      = "GBK";

    /**字符编码-传递给支付宝的数据编码*/
    public static final String CHARSET           = "GBK";

    /**签名类型-视支付宝服务窗要求*/
    public static final String SIGN_TYPE         = "RSA2";
    
    /**开发者账号PID*/
    public static final String PARTNER           = "2088821931362757";

    /** 服务窗appId  */
    //TODO !!!! 注：该appId必须设为开发者自己的生活号id  
    public static final String APP_ID            = "2017121400751631";

    //TODO !!!! 注：该私钥为测试账号私钥  开发者必须设置自己的私钥 , 否则会存在安全隐患 
    public static final String PRIVATE_KEY       = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCa8hT0htU2WOuQDiFLqlh3mI0pfM4bh2MQ+ZoNpW1fxTzwI8FIFWN9QL9yripUT+JvpJ2JdGYe//BiPTxSxMA5cz+vJb1KqP3ToIOysEBI2sszA3uc1Wjqz3UxlXnzqwAhtqBZ+Xc/HfR+FbYxFwjbbBQ1hzm1NSvSI5ot6t2y+3bSy9Ju2kZm8yaPFwpqsoCfmZOSrZGGQAk+ntHnKWgrKIdDi4Qq7cx6ATQ6elmEXfHiK8Jif0+Rpm8cjFP/QtTgQNwfvsm2DNjJU92WdG67Vx94XCa4gkPyDNkylxsU0FfW0F8pYnxrc+q4UB3Bvbuc8MMvw8MkMkt2JikJpdIVAgMBAAECggEABOCf9j6UUZyk9ajsNWSMWl9r+iVam5U8chlZVxqhAcXEsE5/1BQQSK4UGLkQzgyhtR/6cYw/drRZzc3dq0FUR7qwA4Rtm/8L1nCUFLjlnSV+BgITDxHMtq+HIeNxrlDwtR75lzt6HHuF6b4nOQ5fkgCp9jFmiKS+12OVg+KDzhF9zLNUkPA0WmtVB0/yJrS9u2BMLxQZPqxVH7dVr7ukjdXZ4I6Bf8x3A9oEg4Zax2aSE2p8TPOH2lpdIn7ifThV6HUxeCxHVJlr3rex1/yRvRFDL8kEQRWYc9ed02XjPg//Q4Noxmp0eHwV/gusIuW4zW+KLlKpxnGLIVfT3QVjQQKBgQDX2zxb6z3q62l4hCg8NvLP43r7B7ySEQHzUhiX/TNQLhOVsepFMIUbfIdJL60fhxHwzj4hUmBEWm9flXEpxzNeevn5CuRzIlpJpqK8jM1qMEWoSBhsOBaoiRzr5ABN15Sc+3Os2wgG+nibfXTiyBQCs8v6jgK8AEzo02D8tLkmsQKBgQC3wu38v1O6Vbqj6U6rn7iv2gWVhJPjsJxLxf/JG08IC6yeYJD7rteHIdS1Hoxpy34ztWzblGxgexDndrlCR5fyY2co5jnTbYIa+A7/E4dI1qO8zDjNuSYMppoY3HX2Uc1/Gw+5ZqWMSBYtlbuQhwU29750w2bs8Zl+kgXsUcqCpQKBgQCcwvgb3UTTVfH79yZtTI6ckZ0fr+evwLBE8Gsx/k2EvmG0xkfXxbv1UUPCz+AP1H0f//g5JOUK3w6hQRu09pkE1ZSy28k7IEin0l+/RRZtNu9vniQ2e6lg7mrVmXjrD1Q7iZXhhBRZVQ/ABKWdiSaXK9JIfVfZBvLT56c4/1qzkQKBgAvUbbO2sXIucKx6qYjc6GvRskhU15xx0y4BmhzdODJBZiRv/QVm1RMq92GNjOaGpiI4DMD6BhwT8BumhfihWUPOaGa2o4Rb6WNJEtYS8MOcpb/SudlskOmBlCwDjUiFLaCAInwCAqhMP7lBiWideJV4T3d+2NJqH0KJrf3vqgTNAoGAHaxjq+RaxIfT3lPsFSaE8FIL4gAhn9t/ypUwukIZTuQrRhsWgFEMDmF8Th6IdU0SEunl7Bc6oeLxpd+uoU2A6ZwGmelDuhmmRvNv4lrymi9OaZlV68g6K/43mvIIB2ppfrDQTI6zh2CWgqObeMf9ak4OUZ8JFw0JhN/CkcQW96w=";
    
    //TODO !!!! 注：该公钥为测试账号公钥  开发者必须设置自己的公钥 ,否则会存在安全隐患
    public static final String PUBLIC_KEY        = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAmvIU9IbVNljrkA4hS6pYd5iNKXzOG4djEPmaDaVtX8U88CPBSBVjfUC/cq4qVE/ib6SdiXRmHv/wYj08UsTAOXM/ryW9Sqj906CDsrBASNrLMwN7nNVo6s91MZV586sAIbagWfl3Px30fhW2MRcI22wUNYc5tTUr0iOaLerdsvt20svSbtpGZvMmjxcKarKAn5mTkq2RhkAJPp7R5yloKyiHQ4uEKu3MegE0OnpZhF3x4ivCYn9PkaZvHIxT/0LU4EDcH77JtgzYyVPdlnRuu1cfeFwmuIJD8gzZMpcbFNBX1tBfKWJ8a3PquFAdwb27nPDDL8PDJDJLdiYpCaXSFQIDAQAB";
    /**支付宝网关*/
    public static final String ALIPAY_GATEWAY    = "https://openapi.alipay.com/gateway.do";

    /**授权访问令牌的授权类型*/
    public static final String GRANT_TYPE        = "authorization_code";
}