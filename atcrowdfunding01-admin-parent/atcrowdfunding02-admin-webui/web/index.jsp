<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <base href="http://${pageContext.request.serverName}:${pageContext.request.serverPort}/">
    <script type="text/javascript" src="jquery/jquery-2.1.1.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#btn1").click(function () {
                $.ajax({
                    "url": "send/array01.html",   //请求目标资源地址
                    "type": "post", //请求方式
                    "data": {
                        "array": [5, 8, 12]
                    },   //要发送的请求参数
                    "dataType": "text", //如何对待服务器端返回的数据（数据格式）
                    "success": function (response) { //成功处理请求后调用的回调函数
                        alert(response + "   success");
                    },
                    "error": function (response) {   //响应失败调用的回调函数
                        alert(response + "   error");
                    }
                })
            });
        });

        $(function () {
            $("#btn2").click(function () {
                $.ajax({
                    "url": "send/array02.html",   //请求目标资源地址
                    "type": "post", //请求方式
                    "data": {
                        "array[0]": 5,
                        "array[1]": 8,
                        "array[2]": 12
                    },   //要发送的请求参数
                    "dataType": "text", //如何对待服务器端返回的数据（数据格式）
                    "success": function (response) { //成功处理请求后调用的回调函数
                        alert(response + "   success");
                    },
                    "error": function (response) {   //响应失败调用的回调函数
                        alert(response + "   error");
                    }
                })
            });
        });

        $(function () {
            $("#btn3").click(function () {
                //准备好要发送给服务器端的数组
                var array = [5, 8, 12];
                //将JSON数组转换为JSON字符串
                var requestBody = JSON.stringify(array);

                $.ajax({
                    "url": "send/array03.html",   //请求目标资源地址
                    "type": "post", //请求方式
                    "data": requestBody,   //请求体
                    "contentType": "application/json;charset=UTF-8",  //设置请求体的内容类型
                    "dataType": "text", //如何对待服务器端返回的数据（数据格式）
                    "success": function (response) { //成功处理请求后调用的回调函数
                        alert(response + "   success");
                    },
                    "error": function (response) {   //响应失败调用的回调函数
                        alert(response + "   error");
                    }
                })
            });
        });

        $(function () {
            $("#btn4").click(function () {
                //准备好要发送给服务器端的数组
                var student = {
                    "stuId": 5,
                    "stuName": "tom",
                    "address": {
                        "province": "广东",
                        "city": "深圳",
                        "street": "后端"
                    },
                    "subjectList": [
                        {
                            "subjectName": "JavaSE",
                            "subjectScore": 100
                        }, {
                            "subjectName": "SSM",
                            "subjectScore": 99
                        }
                    ],
                    "map": {
                        "k1": "v1",
                        "k2": "v2"
                    }
                };
                //将JSON数组转换为JSON字符串
                var requestBody = JSON.stringify(student);

                $.ajax({
                    "url": "send/array04.json",   //请求目标资源地址
                    "type": "post", //请求方式
                    "data": requestBody,   //请求体
                    "contentType": "application/json;charset=UTF-8",  //设置请求体的内容类型
                    "dataType": "json", //如何对待服务器端返回的数据（数据格式）
                    "success": function (response) { //成功处理请求后调用的回调函数
                        console.log(response + "   success");
                    },
                    "error": function (response) {   //响应失败调用的回调函数
                        console.log(response + "   error");
                    }
                });
            });
        });

        $("#btn5").click(function (){
            alert("aaa...");
            layer.msg("layer弹窗");
        })
    </script>
</head>
<body>
<a href="test/ssm.html">测试SSM环境</a><br>
<button id="btn1">Send[] one</button>
<button id="btn2">Send[] two</button>
<button id="btn3">Send[] three</button>
<button id="btn4">Send Compose Object</button>
<button id="btn5">点我弹框</button>
</body>
</html>
