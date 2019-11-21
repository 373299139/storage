$(function () {

    getMenuall();
    $("#helang-clock").clock();
    //--------------菜单功能------------------
    $("#ulId li a").click(function(){
        var url=$(this).attr("data-src");
        console.log("值=="+url);
        console.log(url);
        location.href="http://localhost:8080/menuController/getHome?url="+url;
        // $.ajax({
        //     type:"post",
        //     url:"http://localhost:8080/menuController/getHome",
        //     data:{"url":url},
        //     dataType:"HTML",
        //     async:false,
        //     success:function (data) {
        //         console.log(data);
        //         $("#rId").empty();
        //         $("#rId").append(data);
        //     },
        //     error:function (e) {
        //         console.log(e);
        //     }
        // }) ;

    });
});
function getMenuall(){
    $.ajax({
        type:"post",
        url:"http://localhost:8080/menuController/getMenuAll",
        data:{},
        dataType:"json",
        async:false,
        success:function (data) {
            console.log(data);
            if(data.success){
                var sDate = data.object;
                var uLhtml="";
                for (var i=0;i<sDate.length;i++) {
                    uLhtml+= "<li style=\"text-align: center;\" class='list-group-item'><a data-src='"+sDate[i].hUrl+"' >"+sDate[i].hName+"</a></li>";
                }
                $("#ulId").append(uLhtml);
            }
        },
        error:function (e) {
            console.log(e);
        }
    }) ;

}
