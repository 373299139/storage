$(function () {
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
                    uLhtml+= "<li class='list-group-item'><a href='#'>"+sDate[i].hName+"</a></li>";
                    // alert(s[i].hPid);
                    // alert(s[i].hId);
                }
                $("#ulId").append(uLhtml);
            }
        },
        error:function (e) {
            console.log(e);
        }
    }) ;
});