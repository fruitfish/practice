package com.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;

/**
 * Created by GanShu on 2016/10/13 0013.
 */
public class JsonTest {

    // 饿了么订单信息
    private static String orderInfo = "{\"message\":\"ok\",\"code\":200,\"data\":{\"original_price\":25,\"restaurant_name\":\"小丑鱼测试店085\",\"refund_code\":0,\"status_code\":0,\"restaurant_id\":1414046,\"service_fee\":0,\"consignee\":\"何 先生\",\"invoice\":\"\",\"description\":\"\",\"tp_restaurant_id\":\"00031144\",\"user_id\":106651060,\"delivery_geo\":\"30.2961,120.13664\",\"detail\":{\"abandoned_extra\":[],\"group\":[[{\"category_id\":1,\"name\":\"鸡爪\",\"price\":6,\"sale_mode\":0,\"id\":146247050,\"garnish\":[],\"specs\":[],\"quantity\":2},{\"category_id\":1,\"name\":\"丝瓜炒肉\",\"price\":8,\"sale_mode\":0,\"id\":149551315,\"garnish\":[],\"specs\":[],\"quantity\":1}]],\"extra\":[{\"description\":\"\",\"price\":2,\"name\":\"餐盒\",\"category_id\":102,\"id\":-70000,\"quantity\":1},{\"description\":\"\",\"price\":3,\"name\":\"配送费\",\"category_id\":2,\"id\":-10,\"quantity\":1}]},\"active_at\":\"2016-10-13 17:07:56\",\"invoiced\":0,\"user_name\":\"45e9b542c\",\"deliver_fee\":3,\"is_book\":0,\"restaurant_part\":0,\"order_id\":\"101350210623782252\",\"eleme_part\":0,\"income\":25,\"restaurant_number\":3,\"address\":\"塘河新村教工路552号308\",\"hongbao\":0,\"is_online_paid\":0,\"delivery_poi_address\":\"塘河新村教工路552号308(浙江省杭州市拱墅区塘河路14号附近)\",\"total_price\":25,\"created_at\":\"2016-10-13 17:07:55\",\"service_rate\":0,\"package_fee\":2,\"activity_total\":0,\"phone_list\":[\"18767107116\"]},\"request_id\":\"cb1afd4b856045958a59c00abfd1f094\"}";


    public static void main(String[] args) {

        Object object = JSON.parse(orderInfo);
        Map map  =  (Map)object;
        System.out.println(map);
        ((Map)((Map)map.get("data")).get("detail")).get("extra");
        String extra = JSON.toJSONString(((Map)((Map)map.get("data")).get("detail")).get("extra"));

        Double outFee = 0d;  //  配送费
        Double packageFee = 0d;  //  打包盒费
        if (!StringUtils.isBlank(extra)) {
            JSONArray jArray = JSONArray.parseArray(extra);
            JSONObject jsonObject;
            for (Object o : jArray) {
                jsonObject = (JSONObject) o;
                if (jsonObject.get("category_id").toString().equals("2")) {  //  category_id = 2 表示 配送费
                    Object price = jsonObject.get("price");
                    System.out.println(price);
                    continue;
                }
                if (jsonObject.get("category_id").toString().equals("102")) {  //  category_id = 102 表示餐盒费
                    Object price = jsonObject.get("price");
                    System.out.println(price);
                }
            }
        }
    }



}
