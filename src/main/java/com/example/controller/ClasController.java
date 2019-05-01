package com.example.controller;

import com.example.mappers.BookMapper;
import com.example.model.Book;
import com.example.model.Clas;
import com.example.service.ClasService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Description:
 * @Author:Sevenx:
 * @Time:2018-12-15
 */
@Controller
@RequestMapping(value = "/clas")
public class ClasController {

    @Autowired
    private ClasService clasService;

    @Autowired
    private BookMapper bookMapper;
    //@ResponseBody
    //@RequestMapping(value = "/add", produces = {"application/json;charset=UTF-8"})
    //public int addUser(User user) {
    //    return userService.addUser(user);
    //}


    //@ResponseBody
    //@RequestMapping(value = "/find")
    //public User findOne() {
    //    return userService.findOne();
    //}
    //
    //@ResponseBody
    //@RequestMapping(value = "/pageHelper/{pageNum}/{pageSize}")
    //public PageInfo<User> findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize) {
    //    PageHelper.startPage(pageNum, pageSize);
    //
    //    List<User> users = userService.findAllUser();
    //    return new PageInfo<User>(users);
    //}

    @ResponseBody
    @RequestMapping(value = "/one/{id}")
    public Clas findAllUser(@PathVariable("id") int id) {

        return clasService.selectByPrimaryKey(id);
    }

    @ResponseBody
    @RequestMapping(value = "/some")
    public String findAllUser1() {

        return "{\n"+
            "    \"code\": 0,\n"+
            "    \"message\": \"OK\",\n"+
            "    \"data\": [\n"+
            "        {\n"+
            "            \"id\": 1,\n"+
            "            \"section\": \"暂无监测\",\n"+
            "            \"goods\": [\n"+
            "                {\n"+
            "                    \"goods_id\": 3,\n"+
            "                    \"goods_thumb\": \" \",\n"+
            "                    \"goods_name\": \" \"\n"+
            "                }\n"+
            "            ]\n"+
            "        }\n"+
            "    ]\n"+
            "}";
    }
    
      @ResponseBody
    @RequestMapping(value = "/some1")
    public String findAllUser1() {

        return "{\n"+
            "    \"code\": 0,\n"+
            "    \"message\": \"OK\",\n"+
            "    \"data\": [\n"+
            "        {\n"+
            "            \"id\": 1,\n"+
            "            \"section\": \"监测\",\n"+
            "            \"goods\": [\n"+
            "                {\n"+
            "                    \"goods_id\": 3,\n"+
            "                    \"goods_thumb\": \"设备名称\",\n"+
            "                    \"goods_name\": \"枕巾\"\n"+
            "                },\n"+
            "                {\n"+
            "                    \"goods_id\": 2,\n"+
            "                    \"goods_thumb\": \"设备编号\",\n"+
            "                    \"goods_name\": \"6f599bb8ec0eac83a66322b6170c4ebd\"\n"+
            "                },\n"+
            "                {\n"+
            "                    \"goods_id\": 3,\n"+
            "                    \"goods_thumb\": \"规格\",\n"+
            "                    \"goods_name\": \"80*24\"\n"+
            "                },\n"+
            "                {\n"+
            "                    \"goods_id\": 3,\n"+
            "                    \"goods_thumb\": \"材质\",\n"+
            "                    \"goods_name\": \"棉\"\n"+
            "                },\n"+
            "                {\n"+
            "                    \"goods_id\": 3,\n"+
            "                    \"goods_thumb\": \"颜色\",\n"+
            "                    \"goods_name\": \"乳白色\"\n"+
            "                },\n"+
            "                {\n"+
            "                    \"goods_id\": 3,\n"+
            "                    \"goods_thumb\": \"生产日期\",\n"+
            "                    \"goods_name\": \"2018-3-5\"\n"+
            "                }\n"+
            "            ]\n"+
            "        },\n"+
            "        {\n"+
            "            \"id\": 2,\n"+
            "            \"section\": \"使用情况\",\n"+
            "            \"goods\": [\n"+
            "                {\n"+
            "                    \"goods_id\": 3,\n"+
            "                    \"goods_thumb\": \"耐久度\",\n"+
            "                    \"goods_name\": \"良好\"\n"+
            "                },\n"+
            "                {\n"+
            "                    \"goods_id\": 2,\n"+
            "                    \"goods_thumb\": \"使用次数\",\n"+
            "                    \"goods_name\": \"3\"\n"+
            "                },\n"+
            "                {\n"+
            "                    \"goods_id\": 3,\n"+
            "                    \"goods_thumb\": \"清洗地点\",\n"+
            "                    \"goods_name\": \"德勤\"\n"+
            "                },\n"+
            "                {\n"+
            "                    \"goods_id\": 3,\n"+
            "                    \"goods_thumb\": \"清洗时间\",\n"+
            "                    \"goods_name\": \"2019-4-29\"\n"+
            "                },\n"+
            "                {\n"+
            "                    \"goods_id\": 3,\n"+
            "                    \"goods_thumb\": \"检验人\",\n"+
            "                    \"goods_name\": \"马东明\"\n"+
            "                }\n"+
            "            ]\n"+
            "        },\n"+
            "        {\n"+
            "            \"id\": 2,\n"+
            "            \"section\": \"用户反馈\",\n"+
            "            \"goods\": [\n"+
            "                {\n"+
            "                    \"goods_id\": 3,\n"+
            "                    \"goods_thumb\": \"是否异味\",\n"+
            "                    \"goods_name\": \"否\"\n"+
            "                },\n"+
            "                {\n"+
            "                    \"goods_id\": 2,\n"+
            "                    \"goods_thumb\": \"用户投诉\",\n"+
            "                    \"goods_name\": \"无\"\n"+
            "                }\n"+
            "            ]\n"+
            "        }\n"+
            "    ]\n"+
            "}";
    }
    
      @ResponseBody
    @RequestMapping(value = "/some2")
    public String findAllUser1() {

        return "{\n"+
            "    \"code\": 0,\n"+
            "    \"message\": \"OK\",\n"+
            "    \"data\": [\n"+
            "        {\n"+
            "            \"id\": 1,\n"+
            "            \"section\": \"监测\",\n"+
            "            \"goods\": [\n"+
            "                {\n"+
            "                    \"goods_id\": 3,\n"+
            "                    \"goods_thumb\": \"设备名称\",\n"+
            "                    \"goods_name\": \"床单\"\n"+
            "                },\n"+
            "                {\n"+
            "                    \"goods_id\": 2,\n"+
            "                    \"goods_thumb\": \"设备编号\",\n"+
            "                    \"goods_name\": \"cf7d7bcb6371cf31de53c958d6c4a2f6\"\n"+
            "                },\n"+
            "                {\n"+
            "                    \"goods_id\": 3,\n"+
            "                    \"goods_thumb\": \"规格\",\n"+
            "                    \"goods_name\": \"200*200\"\n"+
            "                },\n"+
            "                {\n"+
            "                    \"goods_id\": 3,\n"+
            "                    \"goods_thumb\": \"材质\",\n"+
            "                    \"goods_name\": \"棉\"\n"+
            "                },\n"+
            "                {\n"+
            "                    \"goods_id\": 3,\n"+
            "                    \"goods_thumb\": \"颜色\",\n"+
            "                    \"goods_name\": \"乳白色\"\n"+
            "                },\n"+
            "                {\n"+
            "                    \"goods_id\": 3,\n"+
            "                    \"goods_thumb\": \"生产日期\",\n"+
            "                    \"goods_name\": \"2018-3-7\"\n"+
            "                },\n"+
            "                {\n"+
            "                    \"goods_id\": 3,\n"+
            "                    \"goods_thumb\": \"生产厂商\",\n"+
            "                    \"goods_name\": \"济南天亚\"\n"+
            "                },\n"+
            "                {\n"+
            "                    \"goods_id\": 3,\n"+
            "                    \"goods_thumb\": \"材料来源\",\n"+
            "                    \"goods_name\": \"济南\"\n"+
            "                }\n"+
            "            ]\n"+
            "        },\n"+
            "        {\n"+
            "            \"id\": 2,\n"+
            "            \"section\": \"使用情况\",\n"+
            "            \"goods\": [\n"+
            "                {\n"+
            "                    \"goods_id\": 3,\n"+
            "                    \"goods_thumb\": \"耐久度\",\n"+
            "                    \"goods_name\": \"良好\"\n"+
            "                },\n"+
            "                {\n"+
            "                    \"goods_id\": 2,\n"+
            "                    \"goods_thumb\": \"使用次数\",\n"+
            "                    \"goods_name\": \"4\"\n"+
            "                },\n"+
            "                {\n"+
            "                    \"goods_id\": 3,\n"+
            "                    \"goods_thumb\": \"清洗地点\",\n"+
            "                    \"goods_name\": \"德勤\"\n"+
            "                },\n"+
            "                {\n"+
            "                    \"goods_id\": 3,\n"+
            "                    \"goods_thumb\": \"清洗时间\",\n"+
            "                    \"goods_name\": \"2019-4-5\"\n"+
            "                },\n"+
            "                {\n"+
            "                    \"goods_id\": 3,\n"+
            "                    \"goods_thumb\": \"检验人\",\n"+
            "                    \"goods_name\": \"马东明\"\n"+
            "                }\n"+
            "            ]\n"+
            "        },\n"+
            "        {\n"+
            "            \"id\": 2,\n"+
            "            \"section\": \"用户反馈\",\n"+
            "            \"goods\": [\n"+
            "                {\n"+
            "                    \"goods_id\": 3,\n"+
            "                    \"goods_thumb\": \"是否异味\",\n"+
            "                    \"goods_name\": \"否\"\n"+
            "                },\n"+
            "                {\n"+
            "                    \"goods_id\": 2,\n"+
            "                    \"goods_thumb\": \"用户投诉\",\n"+
            "                    \"goods_name\": \"无\"\n"+
            "                },{\n"+
            "                    \"goods_id\": 3,\n"+
            "                    \"goods_thumb\": \"清洗时间\",\n"+
            "                    \"goods_name\": \"2019-4-29\"\n"+
            "                },\n"+
            "                {\n"+
            "                    \"goods_id\": 3,\n"+
            "                    \"goods_thumb\": \"检验人\",\n"+
            "                    \"goods_name\": \"罗明\"\n"+
            "                }\n"+
            "            ]\n"+
            "        },\n"+
            "        {\n"+
            "            \"id\": 2,\n"+
            "            \"section\": \"材料来源\",\n"+
            "            \"goods\": [\n"+
            "                {\n"+
            "                    \"goods_id\": 3,\n"+
            "                    \"goods_thumb\": \"棉\",\n"+
            "                    \"goods_name\": \"济南德利\"\n"+
            "                },\n"+
            "                {\n"+
            "                    \"goods_id\": 2,\n"+
            "                    \"goods_thumb\": \"组装\",\n"+
            "                    \"goods_name\": \"济南\"\n"+
            "                },{\n"+
            "                    \"goods_id\": 3,\n"+
            "                    \"goods_thumb\": \"纺织材料\",\n"+
            "                    \"goods_name\": \"南宁希尔\"\n"+
            "                },\n"+
            "                {\n"+
            "                    \"goods_id\": 3,\n"+
            "                    \"goods_thumb\": \"合格检验人\",\n"+
            "                    \"goods_name\": \"董细明\"\n"+
            "                }\n"+
            "            ]\n"+
            "        }\n"+
            "    ]\n"+
            "}";
    }
    
      @ResponseBody
    @RequestMapping(value = "/some3")
    public String findAllUser1() {

        return "{\n"+
            "    \"code\": 0,\n"+
            "    \"message\": \"OK\",\n"+
            "    \"data\": [\n"+
            "        {\n"+
            "            \"id\": 1,\n"+
            "            \"section\": \"监测\",\n"+
            "            \"goods\": [\n"+
            "                {\n"+
            "                    \"goods_id\": 3,\n"+
            "                    \"goods_thumb\": \"设备名称\",\n"+
            "                    \"goods_name\": \"呼吸灯\"\n"+
            "                },\n"+
            "                {\n"+
            "                    \"goods_id\": 2,\n"+
            "                    \"goods_thumb\": \"设备编号\",\n"+
            "                    \"goods_name\": \"1bff52510ddf2494f97a75628dc7c9e2\"\n"+
            "                },\n"+
            "                {\n"+
            "                    \"goods_id\": 3,\n"+
            "                    \"goods_thumb\": \"规格\",\n"+
            "                    \"goods_name\": \"20*20\"\n"+
            "                },\n"+
            "                {\n"+
            "                    \"goods_id\": 3,\n"+
            "                    \"goods_thumb\": \"颜色\",\n"+
            "                    \"goods_name\": \"浅灰色\"\n"+
            "                },\n"+
            "                {\n"+
            "                    \"goods_id\": 3,\n"+
            "                    \"goods_thumb\": \"生产日期\",\n"+
            "                    \"goods_name\": \"2018-3-7\"\n"+
            "                },\n"+
            "                {\n"+
            "                    \"goods_id\": 3,\n"+
            "                    \"goods_thumb\": \"生产厂商\",\n"+
            "                    \"goods_name\": \"义乌罗马奥\"\n"+
            "                }\n"+
            "            ]\n"+
            "        },\n"+
            "        {\n"+
            "            \"id\": 2,\n"+
            "            \"section\": \"使用情况\",\n"+
            "            \"goods\": [\n"+
            "                {\n"+
            "                    \"goods_id\": 3,\n"+
            "                    \"goods_thumb\": \"耐久度\",\n"+
            "                    \"goods_name\": \"良好\"\n"+
            "                },\n"+
            "                {\n"+
            "                    \"goods_id\": 3,\n"+
            "                    \"goods_thumb\": \"检验人\",\n"+
            "                    \"goods_name\": \"谢宁\"\n"+
            "                }\n"+
            "            ]\n"+
            "        },\n"+
            "        {\n"+
            "            \"id\": 2,\n"+
            "            \"section\": \"用户反馈\",\n"+
            "            \"goods\": [\n"+
            "                {\n"+
            "                    \"goods_id\": 2,\n"+
            "                    \"goods_thumb\": \"用户投诉\",\n"+
            "                    \"goods_name\": \"无\"\n"+
            "                }\n"+
            "            ]\n"+
            "        },\n"+
            "        {\n"+
            "            \"id\": 2,\n"+
            "            \"section\": \"设备监控\",\n"+
            "            \"goods\": [\n"+
            "                {\n"+
            "                    \"goods_id\": 3,\n"+
            "                    \"goods_thumb\": \"灯泡\",\n"+
            "                    \"goods_name\": \"良好\"\n"+
            "                },\n"+
            "                {\n"+
            "                    \"goods_id\": 2,\n"+
            "                    \"goods_thumb\": \"光线质量\",\n"+
            "                    \"goods_name\": \"弱\"\n"+
            "                },\n"+
            "                {\n"+
            "                    \"goods_id\": 3,\n"+
            "                    \"goods_thumb\": \"使用次数\",\n"+
            "                    \"goods_name\": \"94\"\n"+
            "                },\n"+
            "                {\n"+
            "                    \"goods_id\": 3,\n"+
            "                    \"goods_thumb\": \"合格检验人\",\n"+
            "                    \"goods_name\": \"孟谢雨\"\n"+
            "                }\n"+
            "            ]\n"+
            "        }\n"+
            "    ]\n"+
            "}";
    }
    //@ResponseBody
    //@RequestMapping(value = "/neteasy")
    //public String findNetEasy() {
    //
    //    String res = "{\"other\":{\"refresh\":\"A\",\"miss\":\"02\"},\"news\":[{\"addata\":null,\"category\":\"新闻\"," +
    //            "\"channel\":null,\"digest\":\"苹果暂停了718个中国区的App下载，搜索疑似“遭下架”应用\",\"docid\":\"E1KT79DR0001899N\",\"imgsrc3gtype\":3,\"imgsrcFrom\":null,\"isTop\":null,\"link\":\"https://3g.163.com/all/article/E1KT79DR0001899N.html\",\"liveInfo\":null,\"picInfo\":[{\"height\":null,\"ref\":null,\"url\":\"http://cms-bucket.nosdn.127.net/2018/11/27/c74f9d39d4b040958c671e6978b9cad9.jpeg\",\"width\":null}],\"ptime\":\"2018-11-27 17:43:35\",\"source\":\"中新经纬\",\"tag\":\"\",\"tcount\":35082,\"title\":\"苹果暂停718个中国区App下载 \\\"拼多多\\\"\\\"搜狗\\\"等中招了\",\"type\":\"doc\",\"typeid\":\"\",\"unlikeReason\":null,\"videoInfo\":null},{\"addata\":null,\"category\":\"新闻\",\"channel\":null,\"digest\":\"检察机关批准逮捕7名泉港碳九泄漏事故相关责任人，5人涉嫌重大\",\"docid\":\"E1KPINR00001899O\",\"imgsrc3gtype\":3,\"imgsrcFrom\":null,\"isTop\":null,\"link\":\"https://3g.163.com/all/article/E1KPINR00001899O.html\",\"liveInfo\":null,\"picInfo\":[{\"height\":null,\"ref\":null,\"url\":\"http://cms-bucket.nosdn.127.net/2018/11/27/0356597feccd4a92a8effbff1fb632b7.jpeg\",\"width\":null}],\"ptime\":\"2018-11-27 16:39:56\",\"source\":\"福建检察\",\"tag\":\"\",\"tcount\":943,\"title\":\"福建检察机关批准逮捕7名泉港碳九泄露事故相关责任人\",\"type\":\"doc\",\"typeid\":\"\",\"unlikeReason\":null,\"videoInfo\":null},{\"addata\":null,\"category\":\"新闻\",\"channel\":null,\"digest\":\"上海携程亲子园虐童案今日宣判，8名被告人均因犯虐待被看护人罪\",\"docid\":\"E1KLAPND0001899O\",\"imgsrc3gtype\":3,\"imgsrcFrom\":null,\"isTop\":null,\"link\":\"https://3g.163.com/all/article/E1KLAPND0001899O.html\",\"liveInfo\":null,\"picInfo\":[{\"height\":null,\"ref\":null,\"url\":\"http://cms-bucket.nosdn.127.net/2018/11/27/760aa95f0fa746959682a4ede5bbf0fa.jpeg\",\"width\":null}],\"ptime\":\"2018-11-27 15:25:41\",\"source\":\"央视新闻移动网\",\"tag\":\"\",\"tcount\":8904,\"title\":\"上海携程亲子园虐童案宣判:8名被告人被判1年到1年半不等\",\"type\":\"doc\",\"typeid\":\"\",\"unlikeReason\":null,\"videoInfo\":null},{\"addata\":null,\"category\":\"新闻\",\"channel\":null,\"digest\":\"当地时间25日，三艘乌克兰军舰硬闯俄罗斯领海遭俄方扣押。据外\",\"docid\":\"E1I3KKFT0001875O\",\"imgsrc3gtype\":3,\"imgsrcFrom\":null,\"isTop\":null,\"link\":\"https://3g.163.com/all/article/E1I3KKFT0001875O.html\",\"liveInfo\":null,\"picInfo\":[{\"height\":null,\"ref\":null,\"url\":\"http://cms-bucket.nosdn.127.net/2018/11/26/fdbb4283231a41f586f470688ea480bf.png\",\"width\":null}],\"ptime\":\"2018-11-26 15:38:00\",\"source\":\"海外网\",\"tag\":\"\",\"tcount\":17699,\"title\":\"局势升级！乌克兰国防部宣布进入全面战备状态\",\"type\":\"doc\",\"typeid\":\"\",\"unlikeReason\":null,\"videoInfo\":null},{\"addata\":null,\"category\":\"新闻\",\"channel\":null,\"digest\":\"世界首例免疫艾滋病的基因编辑婴儿在深圳诞生。深圳市卫生计生委\",\"docid\":\"E1I2V8S80001875N\",\"imgsrc3gtype\":3,\"imgsrcFrom\":null,\"isTop\":null,\"link\":\"https://3g.163.com/all/special/S1543214687417.html\",\"liveInfo\":null,\"picInfo\":[{\"height\":null,\"ref\":null,\"url\":\"http://cms-bucket.nosdn.127.net/2018/11/26/1381510865324a9592f9cee0f203421a.png\",\"width\":null}],\"ptime\":\"2018-11-26 15:26:20\",\"source\":\"新京报\",\"tag\":\"专题\",\"tcount\":7127,\"title\":\"\\\"首例免疫艾滋病基因编辑婴儿\\\"未经医学伦理报备\",\"type\":\"special\",\"typeid\":\"S1543214687417\",\"unlikeReason\":null,\"videoInfo\":null},{\"addata\":null,\"category\":\"新闻\",\"channel\":null,\"digest\":\"“这事件已经远远超出了技术问题的范畴，后果不可预测，一定是伦\",\"docid\":\"E1HUR49S0001875P\",\"imgsrc3gtype\":3,\"imgsrcFrom\":null,\"isTop\":null,\"link\":\"https://3g.163.com/all/article/E1HUR49S0001875P.html\",\"liveInfo\":null,\"picInfo\":[{\"height\":null,\"ref\":null,\"url\":\"http://cms-bucket.nosdn.127.net/2018/11/26/93930d772add4830a04d6085a1885131.jpeg\",\"width\":null}],\"ptime\":\"2018-11-26 14:14:10\",\"source\":\"第一财经\",\"tag\":\"\",\"tcount\":11484,\"title\":\"首例免疫艾滋婴儿诞生 专家:伦理争论的焦点 后果不可预测\",\"type\":\"doc\",\"typeid\":\"\",\"unlikeReason\":null,\"videoInfo\":null},{\"addata\":null,\"category\":\"新闻\",\"channel\":null,\"digest\":\"科学家贺建奎宣布，一对名为露露和娜娜的基因编辑婴儿于11月在\",\"docid\":\"E1HMIDMR0001899N\",\"imgsrc3gtype\":3,\"imgsrcFrom\":null,\"isTop\":null,\"link\":\"https://3g.163.com/all/article/E1HMIDMR0001899N.html\",\"liveInfo\":null,\"picInfo\":[{\"height\":null,\"ref\":null,\"url\":\"http://cms-bucket.nosdn.127.net/2018/11/26/456b6ab138bc4fb1a704bbbf4ccab8b7.jpeg\",\"width\":null}],\"ptime\":\"2018-11-26 11:49:36\",\"source\":\"人民网-人民日报\",\"tag\":\"\",\"tcount\":30078,\"title\":\"中国科学家宣布:世界首例免疫艾滋病的基因编辑婴儿诞生\",\"type\":\"doc\",\"typeid\":\"\",\"unlikeReason\":null,\"videoInfo\":null},{\"addata\":null,\"category\":\"新闻\",\"channel\":null,\"digest\":\"25日，随着大篷车移民冲向美国边境围栏，美国对这些移民投掷了\",\"docid\":\"E1HINGPM0001875O\",\"imgsrc3gtype\":3,\"imgsrcFrom\":null,\"isTop\":null,\"link\":\"https://3g.163.com/all/article/E1HINGPM0001875O.html\",\"liveInfo\":null,\"picInfo\":[{\"height\":null,\"ref\":null,\"url\":\"http://cms-bucket.nosdn.127.net/2018/11/26/da9090b978024260810ba575ed3f72f0.jpeg\",\"width\":null}],\"ptime\":\"2018-11-26 10:42:29\",\"source\":\"环球时报-环球网\",\"tag\":\"\",\"tcount\":57720,\"title\":\"美国向大篷车移民动手了！扔催泪瓦斯、关闭口岸\",\"type\":\"doc\",\"typeid\":\"\",\"unlikeReason\":null,\"videoInfo\":null},{\"addata\":null,\"category\":\"新闻\",\"channel\":null,\"digest\":\"中国地震台网正式测定：11月26日07时57分在台湾海峡发生\",\"docid\":\"E1HA59FP0001899N\",\"imgsrc3gtype\":3,\"imgsrcFrom\":null,\"isTop\":null,\"link\":\"https://3g.163.com/all/article/E1HA59FP0001899N.html\",\"liveInfo\":null,\"picInfo\":[{\"height\":null,\"ref\":null,\"url\":\"http://cms-bucket.nosdn.127.net/2018/11/26/276471b108354a13932e203b85b6d79b.jpeg\",\"width\":null}],\"ptime\":\"2018-11-26 08:12:43\",\"source\":\"地震局网站\",\"tag\":\"\",\"tcount\":14560,\"title\":\"台湾海峡发生6.2级地震震源深度20千米 福建震感强烈\",\"type\":\"doc\",\"typeid\":\"\",\"unlikeReason\":null,\"videoInfo\":null},{\"addata\":null,\"category\":\"新闻\",\"channel\":null,\"digest\":\"克里米亚当局表示，乌克兰海军三艘舰艇非法越过俄罗斯国界，从黑\",\"docid\":\"E1GJ4T5P00018AOR\",\"imgsrc3gtype\":3,\"imgsrcFrom\":null,\"isTop\":null,\"link\":\"https://3g.163.com/all/article/E1GJ4T5P00018AOR.html\",\"liveInfo\":null,\"picInfo\":[{\"height\":null,\"ref\":null,\"url\":\"http://cms-bucket.nosdn.127.net/2018/11/26/82683b17dd1f45e28e48fc23c15387bd.jpeg\",\"width\":null}],\"ptime\":\"2018-11-26 01:40:51\",\"source\":\"海外网\",\"tag\":\"\",\"tcount\":11663,\"title\":\"乌克兰3艘军舰穿越刻赤海峡 克里米亚当局:西方挑唆\",\"type\":\"doc\",\"typeid\":\"\",\"unlikeReason\":null,\"videoInfo\":null}],\"bottom\":[{\"addata\":{\"activityADInfo\":null,\"adposition\":0,\"cbnum\":2647,\"prevent\":\"\",\"url\":\"https://g.163.com/ur?site=netease&affiliate=3g&cat=homepage&type=wap_float&location=1\"},\"category\":null,\"channel\":null,\"digest\":null,\"docid\":null,\"imgsrc3gtype\":null,\"imgsrcFrom\":null,\"isTop\":null,\"link\":null,\"liveInfo\":null,\"picInfo\":[],\"ptime\":null,\"source\":null,\"tag\":null,\"tcount\":null,\"title\":null,\"type\":null,\"typeid\":null,\"unlikeReason\":null,\"videoInfo\":null}],\"list\":[{\"addata\":null,\"category\":\"新闻\",\"channel\":null,\"digest\":\"海峡有隔阻，不阻云彩飞。一湾浅浅的海峡，让台湾与大陆隔海相望\",\"docid\":\"E4KG9UAP000189FH\",\"imgsrc3gtype\":1,\"imgsrcFrom\":\"doc\",\"isTop\":null,\"link\":\"https://3g.163.com/all/article/E4KG9UAP000189FH.html\",\"liveInfo\":null,\"picInfo\":[{\"height\":null,\"ref\":null,\"url\":\"http://cms-bucket.nosdn.127.net/2019/01/03/dc9a5674714246a59ab1e10915bb483e.jpeg\",\"width\":null}],\"ptime\":\"2019-01-03 20:44:56\",\"source\":\"央视新闻移动网\",\"tag\":\"\",\"tcount\":602,\"title\":\"习近平的“同胞情”\",\"type\":\"doc\",\"typeid\":\"\",\"unlikeReason\":null,\"videoInfo\":null},{\"addata\":null,\"category\":\"新闻\",\"channel\":null,\"digest\":\"序2018年1月1日，天安门。霞光洒满金色的北京。天安门城楼\",\"docid\":\"E4K5RAAG000189FH\",\"imgsrc3gtype\":0,\"imgsrcFrom\":null,\"isTop\":null,\"link\":\"https://3g.163.com/all/article/E4K5RAAG000189FH.html\",\"liveInfo\":null,\"picInfo\":[],\"ptime\":\"2019-01-03 17:42:11\",\"source\":\"央视新闻移动网$\",\"tag\":\"\",\"tcount\":671,\"title\":\"纪录片《改革2018》：致每一个追梦人\",\"type\":\"doc\",\"typeid\":\"\",\"unlikeReason\":null,\"videoInfo\":null},{\"addata\":null,\"category\":\"推荐\",\"channel\":null,\"digest\":\"\",\"docid\":\"DEBDQCMPjiangtingting\",\"imgsrc3gtype\":2,\"imgsrcFrom\":null,\"isTop\":null,\"link\":\"https://3g.163.com/idol/photoview/0003/651213.html#&rec=idol.i.list&channel=idol\",\"liveInfo\":null,\"picInfo\":[{\"height\":null,\"ref\":null,\"url\":\"http://cms-bucket.nosdn.127.net/05be04a1b9694c50a225a2b467e1116320180401221905.jpeg\",\"width\":null},{\"height\":null,\"ref\":null,\"url\":\"http://cms-bucket.nosdn.127.net/303991aa5f5a4659908961563023d2d920180401221908.jpeg\",\"width\":null},{\"height\":null,\"ref\":null,\"url\":\"http://cms-bucket.nosdn.127.net/5a27f2f9b77f4d92a997b1f156bba8be20180401221910.jpeg\",\"width\":null}],\"ptime\":\"2018-04-01 22:22:59\",\"source\":\"\",\"tag\":\"\",\"tcount\":3562,\"title\":\"张柏芝穿牛仔衣搭配印花裙满满少女感\",\"type\":\"wap-photoset-0003|651213\",\"typeid\":\"\",\"unlikeReason\":null,\"videoInfo\":null},{\"addata\":null,\"category\":\"新闻\",\"channel\":null,\"digest\":\"1月5日，2018-2019赛季乒超联赛第十三轮正在进行，但\",\"docid\":\"E4OTQEA3000187VE\",\"imgsrc3gtype\":1,\"imgsrcFrom\":null,\"isTop\":null,\"link\":\"https://3g.163.com/all/article/E4OTQEA3000187VE.html\",\"liveInfo\":null,\"picInfo\":[{\"height\":null,\"ref\":null,\"url\":\"http://cms-bucket.nosdn.127.net/2019/01/05/4043c8bdebad481b94b4e9503f266aa4.png\",\"width\":null}],\"ptime\":\"2019-01-05 13:51:00\",\"source\":\"澎湃新闻\",\"tag\":\"\",\"tcount\":155,\"title\":\"乒超天津权健改名天津队 乒协:先改名 其它在调查\",\"type\":\"doc\",\"typeid\":\"\",\"unlikeReason\":null,\"videoInfo\":null},{\"addata\":null,\"category\":\"新闻\",\"channel\":null,\"digest\":\"2001年5月26日下午一桩命案震惊了整个商城县陈氏夫妇在家\",\"docid\":\"E4OD67EO0001875P\",\"imgsrc3gtype\":1,\"imgsrcFrom\":null,\"isTop\":null,\"link\":\"https://3g.163.com/all/article/E4OD67EO0001875P.html\",\"liveInfo\":null,\"picInfo\":[{\"height\":null,\"ref\":null,\"url\":\"http://cms-bucket.nosdn.127.net/2019/01/05/b69008a9108e42c182b819f8228a3357.png\",\"width\":null}],\"ptime\":\"2019-01-05 09:07:26\",\"source\":\"河南都市频道\",\"tag\":\"\",\"tcount\":6885,\"title\":\"男子入室杀害夫妇抢走男婴 孩子叫了凶手17年爸爸\",\"type\":\"doc\",\"typeid\":\"\",\"unlikeReason\":null,\"videoInfo\":null},{\"addata\":null,\"category\":\"新闻\",\"channel\":null,\"digest\":\"1月4日，河北秦皇岛一女子在行走途中被疑似高空坠落的冰块砸中\",\"docid\":\"E4OV83030001875P\",\"imgsrc3gtype\":1,\"imgsrcFrom\":null,\"isTop\":null,\"link\":\"https://3g.163.com/all/article/E4OV83030001875P.html\",\"liveInfo\":null,\"picInfo\":[{\"height\":null,\"ref\":null,\"url\":\"http://cms-bucket.nosdn.127.net/2019/01/05/c13cbcb681bf4b25b62228a2eb136110.png\",\"width\":null}],\"ptime\":\"2019-01-05 14:23:01\",\"source\":\"中国青年网\",\"tag\":\"\",\"tcount\":424,\"title\":\"女子被坠冰砸中头当场身亡 事发时孩子就在身边\",\"type\":\"doc\",\"typeid\":\"\",\"unlikeReason\":null,\"videoInfo\":null},{\"addata\":null,\"category\":\"新闻\",\"channel\":null,\"digest\":\"今天的《中国纪检监察报》介绍了内蒙古在开展警示教育中用好活反\",\"docid\":\"E4OBBV6V0001875N\",\"imgsrc3gtype\":1,\"imgsrcFrom\":null,\"isTop\":null,\"link\":\"https://3g.163.com/all/article/E4OBBV6V0001875N.html\",\"liveInfo\":null,\"picInfo\":[{\"height\":null,\"ref\":null,\"url\":\"http://cms-bucket.nosdn.127.net/2019/01/05/fb4e344e9947482cb7482a06738e07cb.png\",\"width\":null}],\"ptime\":\"2019-01-05 08:35:37\",\"source\":\"北京青年报\",\"tag\":\"\",\"tcount\":454,\"title\":\"厅官将卫生间改密室放4千万现金 5台点钞机清点1夜\",\"type\":\"doc\",\"typeid\":\"\",\"unlikeReason\":null,\"videoInfo\":null},{\"addata\":null,\"category\":\"新闻\",\"channel\":null,\"digest\":\"你会不会对一个人一见钟情，关键是看脸。当然，环境和你当时的心\",\"docid\":\"E4NIJRTC00018M4D\",\"imgsrc3gtype\":3,\"imgsrcFrom\":null,\"isTop\":null,\"link\":\"https://3g.163.com/all/article/E4NIJRTC00018M4D.html?rec=i.exc\",\"liveInfo\":null,\"picInfo\":[{\"height\":null,\"ref\":null,\"url\":\"http://cms-bucket.nosdn.127.net/2019/01/05/4126a6298e9147dea253203c6acc97ab.png\",\"width\":null}],\"ptime\":\"2019-01-05 01:23:01\",\"source\":\"网易浪潮工作室\",\"tag\":\"独家\",\"tcount\":3687,\"title\":\"一见钟情，说到底还是要看脸\",\"type\":\"doc\",\"typeid\":\"独家\",\"unlikeReason\":null,\"videoInfo\":null},{\"addata\":null,\"category\":\"新闻\",\"channel\":null,\"digest\":\"自2018年9月开学至今，浙江三门县实验小学不断出现学生流鼻\",\"docid\":\"E4OLM2920001875P\",\"imgsrc3gtype\":1,\"imgsrcFrom\":null,\"isTop\":null,\"link\":\"https://3g.163.com/all/article/E4OLM2920001875P.html\",\"liveInfo\":null,\"picInfo\":[{\"height\":null,\"ref\":null,\"url\":\"http://cms-bucket.nosdn.127.net/2019/01/05/a3af30f9e2284abbb524650287256f5e.png\",\"width\":null}],\"ptime\":\"2019-01-05 11:35:54\",\"source\":\"澎湃新闻\",\"tag\":\"\",\"tcount\":1452,\"title\":\"浙江一小学毒跑道致学生腹痛头晕 通报:校长被免职\",\"type\":\"doc\",\"typeid\":\"\",\"unlikeReason\":null,\"videoInfo\":null},{\"addata\":null,\"category\":\"新闻\",\"channel\":null,\"digest\":\"海外网1月5日电近日，101岁的“台独”大佬史明又出来刷存在\",\"docid\":\"E4OLE29S0001875P\",\"imgsrc3gtype\":1,\"imgsrcFrom\":null,\"isTop\":null,\"link\":\"https://3g.163.com/all/article/E4OLE29S0001875P.html\",\"liveInfo\":null,\"picInfo\":[{\"height\":null,\"ref\":null,\"url\":\"http://cms-bucket.nosdn.127.net/2019/01/05/7608e4a3da3c4ab993098db1a08db9d2.png\",\"width\":null}],\"ptime\":\"2019-01-05 11:31:32\",\"source\":\"海外网\",\"tag\":\"\",\"tcount\":1209,\"title\":\"101岁\\\"台独\\\"大佬叫嚣\\\"400年台独\\\" 网友:老糊涂了\",\"type\":\"doc\",\"typeid\":\"\",\"unlikeReason\":null,\"videoInfo\":null}],\"focus\":[{\"addata\":null,\"category\":\"推荐\",\"channel\":null,\"digest\":\"\",\"docid\":\"E4P43G25bjjixueying\",\"imgsrc3gtype\":3,\"imgsrcFrom\":null,\"isTop\":null,\"link\":\"https://3g.163.com/all/photoview/0001/2298941.html\",\"liveInfo\":null,\"picInfo\":[{\"height\":null,\"ref\":null,\"url\":\"http://cms-bucket.nosdn.127.net/2019/01/05/8d268c5afe234520887446611efd74c1.jpeg\",\"width\":null}],\"ptime\":\"2019-01-05 15:47:54\",\"source\":\"中国青年网\",\"tag\":\"图集\",\"tcount\":1,\"title\":\"美国政府\\\"停摆\\\" 新人领不到结婚证\",\"type\":\"photoset\",\"typeid\":\"00AO0001|2298941\",\"unlikeReason\":null,\"videoInfo\":null},{\"addata\":{\"activityADInfo\":null,\"adposition\":2,\"cbnum\":2644,\"prevent\":\"\",\"url\":\"https://g.163.com/ur?site=netease&affiliate=3g&cat=homepage&type=wap_focus&location=1\"},\"category\":null,\"channel\":null,\"digest\":null,\"docid\":null,\"imgsrc3gtype\":null,\"imgsrcFrom\":null,\"isTop\":null,\"link\":null,\"liveInfo\":null,\"picInfo\":[],\"ptime\":null,\"source\":null,\"tag\":null,\"tcount\":null,\"title\":null,\"type\":null,\"typeid\":null,\"unlikeReason\":null,\"videoInfo\":null},{\"addata\":null,\"category\":\"推荐\",\"channel\":null,\"digest\":\"\",\"docid\":\"0001set2298929\",\"imgsrc3gtype\":3,\"imgsrcFrom\":null,\"isTop\":null,\"link\":\"https://3g.163.com/all/photoview/0001/2298929.html\",\"liveInfo\":null,\"picInfo\":[{\"height\":null,\"ref\":null,\"url\":\"http://cms-bucket.nosdn.127.net/2019/01/05/a8af2af8d6df48a680d1d59418e9a236.jpeg\",\"width\":null}],\"ptime\":\"2019-01-05 09:13:59\",\"source\":\"中国新闻网\",\"tag\":\"图集\",\"tcount\":884,\"title\":\"\\\"复兴号\\\"绿皮车亮相北京 全车WIFI\",\"type\":\"photoset\",\"typeid\":\"00AN0001|2298929\",\"unlikeReason\":null,\"videoInfo\":null},{\"addata\":{\"activityADInfo\":null,\"adposition\":4,\"cbnum\":2645,\"prevent\":\"\",\"url\":\"https://g.163.com/ur?site=netease&affiliate=3g&cat=homepage&type=wap_focus&location=2\"},\"category\":null,\"channel\":null,\"digest\":null,\"docid\":null,\"imgsrc3gtype\":null,\"imgsrcFrom\":null,\"isTop\":null,\"link\":null,\"liveInfo\":null,\"picInfo\":[],\"ptime\":null,\"source\":null,\"tag\":null,\"tcount\":null,\"title\":null,\"type\":null,\"typeid\":null,\"unlikeReason\":null,\"videoInfo\":null},{\"addata\":null,\"category\":\"推荐\",\"channel\":null,\"digest\":\"\",\"docid\":\"E4O3PD1Vbjjike\",\"imgsrc3gtype\":3,\"imgsrcFrom\":null,\"isTop\":null,\"link\":\"https://3g.163.com/all/photoview/0001/2298927.html\",\"liveInfo\":null,\"picInfo\":[{\"height\":null,\"ref\":null,\"url\":\"http://cms-bucket.nosdn.127.net/2019/01/05/b1a2cdaea3e047a28cefe5859e16148d.jpeg\",\"width\":null}],\"ptime\":\"2019-01-05 06:23:09\",\"source\":\"视觉中国\",\"tag\":\"图集\",\"tcount\":149,\"title\":\"美新一届国会启动 议员持\\\"圣典\\\"宣誓\",\"type\":\"photoset\",\"typeid\":\"00AO0001|2298927\",\"unlikeReason\":null,\"videoInfo\":null},{\"addata\":{\"activityADInfo\":null,\"adposition\":6,\"cbnum\":2646,\"prevent\":\"\",\"url\":\"https://g.163.com/ur?site=netease&affiliate=3g&cat=homepage&type=wap_focus&location=3\"},\"category\":null,\"channel\":null,\"digest\":null,\"docid\":null,\"imgsrc3gtype\":null,\"imgsrcFrom\":null,\"isTop\":null,\"link\":null,\"liveInfo\":null,\"picInfo\":[],\"ptime\":null,\"source\":null,\"tag\":null,\"tcount\":null,\"title\":null,\"type\":null,\"typeid\":null,\"unlikeReason\":null,\"videoInfo\":null},{\"addata\":null,\"category\":\"推荐\",\"channel\":null,\"digest\":\"\",\"docid\":\"DE2FUOB6jiangtingting\",\"imgsrc3gtype\":3,\"imgsrcFrom\":null,\"isTop\":null,\"link\":\"https://3g.163.com/idol/article/DE2CHPK800038FO9.html#starId=13&rec=idol.i.focus&channel=idol\",\"liveInfo\":null,\"picInfo\":[{\"height\":null,\"ref\":null,\"url\":\"http://cms-bucket.nosdn.127.net/03d077b351414cca8ddc4ab178392d5020180329110606.jpeg\",\"width\":null}],\"ptime\":\"2018-03-29 11:07:09\",\"source\":\"\",\"tag\":\"\",\"tcount\":0,\"title\":\"范冰冰被要范丞丞签名 “吐槽”自己都要不到门票\",\"type\":\"wap-doc-DE2CHPK800038FO9\",\"typeid\":\"\",\"unlikeReason\":null,\"videoInfo\":null},{\"addata\":{\"activityADInfo\":null,\"adposition\":8,\"cbnum\":3030,\"prevent\":\"\",\"url\":\"https://g.163.com/ur?site=netease&affiliate=3g&cat=homepage&type=wap_focus&location=4\"},\"category\":null,\"channel\":null,\"digest\":null,\"docid\":null,\"imgsrc3gtype\":null,\"imgsrcFrom\":null,\"isTop\":null,\"link\":null,\"liveInfo\":null,\"picInfo\":[],\"ptime\":null,\"source\":null,\"tag\":null,\"tcount\":null,\"title\":null,\"type\":null,\"typeid\":null,\"unlikeReason\":null,\"videoInfo\":null},{\"addata\":null,\"category\":\"推荐\",\"channel\":null,\"digest\":\"\",\"docid\":\"E4JM1F7Gganwenbin\",\"imgsrc3gtype\":3,\"imgsrcFrom\":null,\"isTop\":null,\"link\":\"https://3g.163.com/all/photoview/0001/2298897.html\",\"liveInfo\":null,\"picInfo\":[{\"height\":null,\"ref\":null,\"url\":\"http://cms-bucket.nosdn.127.net/2019/01/03/88f72702101f422b882516c824dca563.jpeg\",\"width\":null}],\"ptime\":\"2019-01-03 13:05:55\",\"source\":\"网易新闻\",\"tag\":\"图集\",\"tcount\":917,\"title\":\"嫦娥四号成功着陆 传回首张月背图\",\"type\":\"photoset\",\"typeid\":\"00AN0001|2298897\",\"unlikeReason\":null,\"videoInfo\":null},{\"addata\":null,\"category\":\"推荐\",\"channel\":null,\"digest\":\"\",\"docid\":\"E4JDL193ganwenbin\",\"imgsrc3gtype\":3,\"imgsrcFrom\":null,\"isTop\":null,\"link\":\"https://3g.163.com/all/photoview/0001/2298892.html\",\"liveInfo\":null,\"picInfo\":[{\"height\":null,\"ref\":null,\"url\":\"http://cms-bucket.nosdn.127.net/2019/01/03/e42bc64d3e0e44a2a1bad5844f4d0ae3.jpeg\",\"width\":null}],\"ptime\":\"2019-01-03 10:39:19\",\"source\":\"央视新闻\",\"tag\":\"图集\",\"tcount\":2705,\"title\":\"白银连环杀人案罪犯高承勇 今日被执行死刑\",\"type\":\"photoset\",\"typeid\":\"00AP0001|2298892\",\"unlikeReason\":null,\"videoInfo\":null},{\"addata\":null,\"category\":\"推荐\",\"channel\":null,\"digest\":\"\",\"docid\":\"E4C8VCH8bjzhaoyaping\",\"imgsrc3gtype\":1,\"imgsrcFrom\":null,\"isTop\":null,\"link\":\"https://3g.163.com/all/photoview/0001/2298825.html\",\"liveInfo\":null,\"picInfo\":[{\"height\":null,\"ref\":null,\"url\":\"http://cms-bucket.nosdn.127.net/2018/12/31/5c439473451d47189525e1dccfa02e7d.jpeg\",\"width\":null}],\"ptime\":\"2018-12-31 16:02:54\",\"source\":\"视觉中国\",\"tag\":\"图集\",\"tcount\":2483,\"title\":\"村民卖雪人起价20元 有人赚千元\",\"type\":\"photoset\",\"typeid\":\"00AP0001|2298825\",\"unlikeReason\":null,\"videoInfo\":null},{\"addata\":null,\"category\":\"推荐\",\"channel\":null,\"digest\":\"\",\"docid\":\"E4C30A9Mbjguying\",\"imgsrc3gtype\":3,\"imgsrcFrom\":null,\"isTop\":null,\"link\":\"https://3g.163.com/all/photoview/0001/2298822.html\",\"liveInfo\":null,\"picInfo\":[{\"height\":null,\"ref\":null,\"url\":\"http://cms-bucket.nosdn.127.net/2018/12/31/474dd83810c844e28f3b8b171cb643c9.jpeg\",\"width\":null}],\"ptime\":\"2018-12-31 14:18:33\",\"source\":\"视觉中国\",\"tag\":\"图集\",\"tcount\":2661,\"title\":\"济南一酒店拆违现场:18台挖掘机作业\",\"type\":\"photoset\",\"typeid\":\"00AP0001|2298822\",\"unlikeReason\":null,\"videoInfo\":null},{\"addata\":null,\"category\":\"推荐\",\"channel\":null,\"digest\":\"\",\"docid\":\"E4BV0QGMbjguying\",\"imgsrc3gtype\":3,\"imgsrcFrom\":null,\"isTop\":null,\"link\":\"https://3g.163.com/all/photoview/0001/2298812.html\",\"liveInfo\":null,\"picInfo\":[{\"height\":null,\"ref\":null,\"url\":\"http://cms-bucket.nosdn.127.net/2018/12/31/3d2ddb4ea5a94855a72cf6a8513d61ec.jpeg\",\"width\":null}],\"ptime\":\"2018-12-31 13:08:56\",\"source\":\"中国新闻网\",\"tag\":\"图集\",\"tcount\":887,\"title\":\"确认过眼神 南方这场雪下的很\\\"认真\\\"\",\"type\":\"photoset\",\"typeid\":\"00AN0001|2298812\",\"unlikeReason\":null,\"videoInfo\":null}],\"code\":200,\"live\":[{\"addata\":null,\"category\":\"推荐\",\"channel\":null,\"digest\":\"\",\"docid\":\"docid-live199068\",\"imgsrc3gtype\":3,\"imgsrcFrom\":null,\"isTop\":null,\"link\":\"http://3g.163.com/touch/live.html?roomid=199068\",\"liveInfo\":null,\"picInfo\":[{\"height\":null,\"ref\":null,\"url\":\"http://cms-bucket.nosdn.127.net/2018/12/27/b8f60f8cd5c8446db9a122f926af6589.jpg\",\"width\":null}],\"ptime\":\"2019-01-05 18:30:00\",\"source\":\"\",\"tag\":\"LIVE\",\"tcount\":0,\"title\":\"专家在线解答，关注乳腺那些事\",\"type\":\"live\",\"typeid\":\"199068\",\"unlikeReason\":null,\"videoInfo\":null},{\"addata\":null,\"category\":\"推荐\",\"channel\":null,\"digest\":\"\",\"docid\":\"docid-live199123\",\"imgsrc3gtype\":3,\"imgsrcFrom\":null,\"isTop\":null,\"link\":\"http://3g.163.com/touch/live.html?roomid=199123\",\"liveInfo\":null,\"picInfo\":[{\"height\":null,\"ref\":null,\"url\":\"http://cms-bucket.nosdn.127.net/2018/12/28/d1e323127f3a4ec992400a1c2e4d58d1.png\",\"width\":null}],\"ptime\":\"2019-01-05 19:00:00\",\"source\":\"\",\"tag\":\"LIVE\",\"tcount\":0,\"title\":\"拳王争夺战，中国铁拳冲击银腰带\",\"type\":\"live\",\"typeid\":\"199123\",\"unlikeReason\":null,\"videoInfo\":null},{\"addata\":null,\"category\":\"推荐\",\"channel\":null,\"digest\":\"\",\"docid\":\"docid-live198468\",\"imgsrc3gtype\":3,\"imgsrcFrom\":null,\"isTop\":null,\"link\":\"http://3g.163.com/touch/live.html?roomid=198468\",\"liveInfo\":null,\"picInfo\":[{\"height\":null,\"ref\":null,\"url\":\"http://cms-bucket.nosdn.127.net/2018/12/20/67b3d028f7bf438e825ef8e21d214427.png\",\"width\":null}],\"ptime\":\"2019-01-05 20:00:00\",\"source\":\"\",\"tag\":\"LIVE\",\"tcount\":0,\"title\":\"骑行视角 带你领略世界经济中心曼哈顿\",\"type\":\"live\",\"typeid\":\"198468\",\"unlikeReason\":null,\"videoInfo\":null},{\"addata\":null,\"category\":\"推荐\",\"channel\":null,\"digest\":\"\",\"docid\":\"docid-live174866\",\"imgsrc3gtype\":3,\"imgsrcFrom\":null,\"isTop\":null,\"link\":\"http://3g.163.com/touch/live.html?roomid=174866\",\"liveInfo\":null,\"picInfo\":[{\"height\":null,\"ref\":null,\"url\":\"http://cms-bucket.nosdn.127.net/2018/12/14/ccd04a39484546a9a942965a6399f1f0.jpg\",\"width\":null}],\"ptime\":\"2019-01-06 07:30:37\",\"source\":\"\",\"tag\":\"LIVE\",\"tcount\":0,\"title\":\"出发！乘火车去寻找角落里最美的风景\",\"type\":\"live\",\"typeid\":\"174866\",\"unlikeReason\":null,\"videoInfo\":null},{\"addata\":null,\"category\":\"推荐\",\"channel\":null,\"digest\":\"\",\"docid\":\"docid-live178298\",\"imgsrc3gtype\":3,\"imgsrcFrom\":null,\"isTop\":null,\"link\":\"http://3g.163.com/touch/live.html?roomid=178298\",\"liveInfo\":null,\"picInfo\":[{\"height\":null,\"ref\":null,\"url\":\"http://cms-bucket.nosdn.127.net/2018/12/14/2b3ed6f0587f4fe9ac5746b2a4e2e704.jpg\",\"width\":null}],\"ptime\":\"2019-01-06 07:30:50\",\"source\":\"\",\"tag\":\"LIVE\",\"tcount\":0,\"title\":\"奔跑跳跃 看最可爱猫咪如何萌化你心\",\"type\":\"live\",\"typeid\":\"178298\",\"unlikeReason\":null,\"videoInfo\":null},{\"addata\":null,\"category\":\"推荐\",\"channel\":null,\"digest\":\"\",\"docid\":\"docid-live175036\",\"imgsrc3gtype\":3,\"imgsrcFrom\":null,\"isTop\":null,\"link\":\"http://3g.163.com/touch/live.html?roomid=175036\",\"liveInfo\":null,\"picInfo\":[{\"height\":null,\"ref\":null,\"url\":\"http://cms-bucket.nosdn.127.net/2018/09/25/f0134bed6f264f9e84886203b45bc1f2.jpg\",\"width\":null}],\"ptime\":\"2019-01-06 07:31:24\",\"source\":\"\",\"tag\":\"LIVE\",\"tcount\":0,\"title\":\"探秘海底最深处 和鱼儿起舞与珊瑚共眠\",\"type\":\"live\",\"typeid\":\"175036\",\"unlikeReason\":null,\"videoInfo\":null},{\"addata\":null,\"category\":\"推荐\",\"channel\":null,\"digest\":\"\",\"docid\":\"docid-live199498\",\"imgsrc3gtype\":3,\"imgsrcFrom\":null,\"isTop\":null,\"link\":\"http://3g.163.com/touch/live.html?roomid=199498\",\"liveInfo\":null,\"picInfo\":[{\"height\":null,\"ref\":null,\"url\":\"http://cms-bucket.nosdn.127.net/2019/01/04/2ba4f760f4f941ba8463434a71fe1615.png\",\"width\":null}],\"ptime\":\"2019-01-06 10:00:00\",\"source\":\"\",\"tag\":\"LIVE\",\"tcount\":0,\"title\":\"1个月一张罚单？纽约开车到底多可怕\",\"type\":\"live\",\"typeid\":\"199498\",\"unlikeReason\":null,\"videoInfo\":null},{\"addata\":null,\"category\":\"推荐\",\"channel\":null,\"digest\":\"\",\"docid\":\"docid-live178302\",\"imgsrc3gtype\":3,\"imgsrcFrom\":null,\"isTop\":null,\"link\":\"http://3g.163.com/touch/live.html?roomid=178302\",\"liveInfo\":null,\"picInfo\":[{\"height\":null,\"ref\":null,\"url\":\"http://cms-bucket.nosdn.127.net/2018/11/13/b74247672e614340b417dc847c1047c9.jpg\",\"width\":null}],\"ptime\":\"2019-01-06 11:00:00\",\"source\":\"\",\"tag\":\"LIVE\",\"tcount\":0,\"title\":\"非洲公认的危险动物 独闯无人荒野\",\"type\":\"live\",\"typeid\":\"178302\",\"unlikeReason\":null,\"videoInfo\":null},{\"addata\":null,\"category\":\"推荐\",\"channel\":null,\"digest\":\"\",\"docid\":\"docid-live199075\",\"imgsrc3gtype\":3,\"imgsrcFrom\":null,\"isTop\":null,\"link\":\"http://3g.163.com/touch/live.html?roomid=199075\",\"liveInfo\":null,\"picInfo\":[{\"height\":null,\"ref\":null,\"url\":\"http://cms-bucket.nosdn.127.net/2018/12/27/ea565e3797b74c2ca049d6f39702a818.png\",\"width\":null}],\"ptime\":\"2019-01-06 11:30:00\",\"source\":\"\",\"tag\":\"LIVE\",\"tcount\":0,\"title\":\"画风彪悍！看战斗民族如何拆解火车\",\"type\":\"live\",\"typeid\":\"199075\",\"unlikeReason\":null,\"videoInfo\":null},{\"addata\":null,\"category\":\"推荐\",\"channel\":null,\"digest\":\"\",\"docid\":\"docid-live199499\",\"imgsrc3gtype\":3,\"imgsrcFrom\":null,\"isTop\":null,\"link\":\"http://3g.163.com/touch/live.html?roomid=199499\",\"liveInfo\":null,\"picInfo\":[{\"height\":null,\"ref\":null,\"url\":\"http://cms-bucket.nosdn.127.net/2019/01/04/3ef903fb93de47438bc29ed0d8f0f0c7.png\",\"width\":null}],\"ptime\":\"2019-01-06 13:00:00\",\"source\":\"\",\"tag\":\"LIVE\",\"tcount\":0,\"title\":\"航拍大赛重磅来袭 一起解锁新世界！\",\"type\":\"live\",\"typeid\":\"199499\",\"unlikeReason\":null,\"videoInfo\":null}],\"banner\":[{\"addata\":{\"activityADInfo\":null,\"adposition\":0,\"cbnum\":2609,\"prevent\":\"\",\"url\":\"https://g.163.com/ur?site=netease&affiliate=3g&cat=homepage&type=wap_column&location=1\"},\"category\":null,\"channel\":null,\"digest\":null,\"docid\":null,\"imgsrc3gtype\":null,\"imgsrcFrom\":null,\"isTop\":null,\"link\":null,\"liveInfo\":null,\"picInfo\":[],\"ptime\":null,\"source\":null,\"tag\":null,\"tcount\":null,\"title\":null,\"type\":null,\"typeid\":null,\"unlikeReason\":null,\"videoInfo\":null}]}";
    //    return res;
    //}
}
