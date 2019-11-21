$(function () {
    // FormData这个对象能打包一个表单的所有数据
    $("#subId").click(function () {
        var sendData = new FormData($('#headupload')[0]);
        $.ajax({
            url:'http://localhost:8080/menuController/upFile',
            data:sendData,
            type : 'post',
            cache:false,//文件不设置缓存
            processData: false,//数据不被转换为字符串
            contentType: false,//上传文件时使用，避免 JQuery 对其操作
            dataType:"json",
            success:function (res) {
                if(res.success){
                    // 重新加载页面
                    location.reload();
                }
            },
            error:function () {
            },
            async:false
        })
    });
});
