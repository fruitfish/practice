package com.number;

import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;

/**
 * @ClassName NumConvert
 * @Description
 * @Author GANSHU
 * @Date 2019/3/12 0012
 * @Version 1.0
 */
public class NumConvert {

    /**
     * 分转成元
     * @param intVal
     * @return
     */
    public static final Float convertIntCentToFloat(Integer intVal) {
        return intVal == null ? 0f : intVal.floatValue() / 100;
    }

    /**
     * 元转成分
     * @param floatVal
     * @return
     */
    public static final Integer convertFloatToIntCent(Float floatVal) {
        return floatVal == null ? 0 : new BigDecimal(floatVal).scaleByPowerOfTen(2).setScale(0, BigDecimal.ROUND_HALF_UP).intValue();
    }

    /**
     * 元转成分
     * @param doubleVal
     * @return
     */
    public static final Integer convertDoubleToIntCent(Double doubleVal) {
        return doubleVal == null ? 0 : new BigDecimal(doubleVal).scaleByPowerOfTen(2).setScale(0, BigDecimal.ROUND_HALF_UP).intValue();
    }

    /**
     * 元转成分
     * @param price
     * @return
     */
    public static final Integer convertYuanToCent(String price) {
        return StringUtils.isBlank(price) ? 0 : new BigDecimal(price).scaleByPowerOfTen(2).setScale(0, BigDecimal.ROUND_HALF_UP).intValue();
    }

}
