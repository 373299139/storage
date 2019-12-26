package com.example.storage.security.entityBean;

import java.io.Serializable;
import lombok.Data;
/**
* 代码为自动生成 Created by www.magicalcoder.com
* 软件作者：何栋宇 qq:709876443
* 如果你改变了此类 read 请将此行删除
* 欢迎加入官方QQ群:648595928
*/
@Data
public class Permisssion implements Serializable{

    private Integer id;//id
    private String action;//action
    private String url;//url
    private String name;//name
    private String code;//code

}
