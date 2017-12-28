<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<script>
		function pay(){
			AlipayJSBridge.call("tradePay",{
			  	tradeNO: "2016030221001004420046465109"
			    }, function(result){
			    	alert(result.resultCode);
			    	alert(result.callbackUrl);
			    	alert(result.memo);
			    	alert(result.result);
			   });
		};
	
          
</script>
<input type="button" value="hahhaaa" onclick="pay();" />

</body>
</html>