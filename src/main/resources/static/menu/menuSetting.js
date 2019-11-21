jQuery(function($) {
    getMenuallS();
});
function getMenuallS(){
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
                var tr="";
                for (var i=0;i<sDate.length;i++) {
                    // uLhtml+= "<li style=\"text-align: center;\" class='list-group-item'><a data-src='"+sDate[i].hUrl+"' >"+sDate[i].hName+"</a></li>";
                    tr+="<tr><td style='display: none'>"+sDate[i].hId+"</td>";
                    tr+="<td >"+sDate[i].hName+"</td>";
                    tr+="<td >"+sDate[i].hUrl+"</td>";
                    tr+="<td >"+sDate[i].hStatus+"</td>";
                    tr+="<td ><button type=\"button\" class=\"btn btn-info\">信息按钮</button>" +
                        "<button type=\"button\" class=\"btn btn-warning\">警告按钮</button>" +
                        "</td></tr>";
                }
                $("#bodId").append(tr);
            }
        },
        error:function (e) {
            console.log(e);
        }
    }) ;

}
