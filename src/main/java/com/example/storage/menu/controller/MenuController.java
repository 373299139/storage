package com.example.storage.menu.controller;

import com.example.storage.menu.entityBean.Hmenu;
import com.example.storage.menu.service.MenuService;
import com.example.storage.utils.BaseController;
import com.example.storage.utils.Json;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Controller
@RequestMapping("/menuController")
@Log4j2
public class MenuController extends BaseController {
    @Autowired
    private MenuService menuService;

    @RequestMapping("/getMenuAll")
    public void getMenuAll(HttpServletResponse HttpServletResponse, HttpServletRequest HttpServletRequest){
        List<Hmenu> list  =  menuService.getMenuAll();
        Json j = new Json();
        if(list!=null&&list.size()>0){
            j.setMsg("成功");
            j.setObject(list);
            j.setSuccess(true);
        }else{
            j.setMsg("失败");
            j.setSuccess(false);
        }
        super.writeJson(j,HttpServletResponse);
    }

    /**
     *   菜单跳转
     * @param url 路径
     * @return 返回页面
     */
    @RequestMapping("/getHome")
    public String getHome(String url){
        if(!url.equals("")){
            return url;
        }else{
            return "error";
        }
    }

    @RequestMapping("/upFile")
    public void upFile(String fileNmae, String fileType,@RequestParam("file") MultipartFile file,HttpServletResponse Response  ){
        Json j = new Json();
        String filename = file.getOriginalFilename();   //校验文件名
        String contentType = file.getContentType();     //校验文件类型
        long size = file.getSize();                     //校验文件大小
        log.info("文件名：{}，文件的类型：{},文件的大小：{}", filename,contentType,size);
        try {
            //restorePath存储目录，在配置文件中存储，通过@value拿到。
            String filePath = "E:\\java\\bootProject\\storage\\src\\main\\resources\\static";
            File parentPath = new File(filePath + LocalDate.now().format(DateTimeFormatter.ISO_LOCAL_DATE));
            if (!parentPath.exists()){
                parentPath.mkdir();     //判断父路径是否存在，不存在就创建出来
            }
            File newFile = new File(parentPath , filename);
            file.transferTo(newFile);   //复制文件
            String resultPath = newFile.getPath();
            log.info("上传文成，文件路径为：" + resultPath);
            j.setSuccess(true);
            j.setMsg("成功");
        } catch (IOException e) {
            e.printStackTrace();
            j.setSuccess(false);
            j.setMsg("异常");
        }
        super.writeJson(j,Response);
    }
}
