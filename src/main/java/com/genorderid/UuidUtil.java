package com.genorderid;

import org.apache.commons.lang.StringUtils;

import java.util.UUID;

/**
 * @ClassName UuidUtil
 * @Description
 * @Author GANSHU
 * @Date 2019/4/26 0026
 * @Version 1.0
 */
public class UuidUtil {

    private static final int ID_LENGTH = 32;
    private static final int INT_BIT = 8;
    private static final int STR_BIT = 8;
    private static final int SHORT_BIT = 4;
    private static final int JVM_BIT = 8;
    private static final int HI = 32;

    private static short counter = (short) 0;

    private static final int JVM = (int) (System.currentTimeMillis() >>> JVM_BIT);

    /**
     * 构造ID生成器.
     */
    public UuidUtil() {
    }

    /**
     * 得到JVM相关信息. <br>
     * 这里是JVM启动时间.
     *
     * @return JVM相关信息.
     */
    protected static int getJVM() {
        return JVM;
    }

    /**
     * 得到当前计数. <br>
     * 可防重复.
     *
     * @return 当前计数.
     */
    protected static short getCount() {
        synchronized (com.twodfire.util.UuidUtil.class) {
            if (counter < 0) {
                counter = 0;
            }
            return counter++;
        }
    }

    /**
     * 得到高位时间.
     *
     * @return 高位时间.
     */
    protected static short getHiTime() {
        return (short) (System.currentTimeMillis() >>> HI);
    }

    /**
     * 得到低位时间.
     *
     * @return 低位时间.
     */
    protected static int getLoTime() {
        return (int) System.currentTimeMillis();
    }

    /**
     * 格式化int型数据. <br>
     * 占八位.
     *
     * @param intval
     *            int型的值.
     * @return 格式化后的字符串.
     */
    protected static String format(int intval) {
        String formatted = Integer.toHexString(intval);
        StringBuilder buf = new StringBuilder("00000000"); //$NON-NLS-1$
        buf.replace(INT_BIT - formatted.length(), INT_BIT, formatted);
        return buf.toString();
    }

    /**
     * 格式化short型数据. <br>
     * 占四位.
     *
     * @param shortval
     *            short型的值.
     * @return 格式化后的字符串.
     */
    protected static String format(short shortval) {
        String formatted = Integer.toHexString(shortval);
        StringBuilder buf = new StringBuilder("0000"); //$NON-NLS-1$
        buf.replace(SHORT_BIT - formatted.length(), SHORT_BIT, formatted);
        return buf.toString();
    }

    /**
     * 得到一个UUID.
     *
     * @return 新的UUID.
     */
    public static String generate(String entityId) {
        if (StringUtils.isNotBlank(entityId)){
            return new StringBuilder(ID_LENGTH).append(
                    format(entityId)).append(format(getJVM()))
                    .append(format(getHiTime())).append(format(getLoTime()))
                    .append(format(getCount())).toString();
        }
        else{
//			StringBuilder buf = new StringBuilder().append(Platform.getMacString()).append(format(getHiTime()))
//					.append(format(getLoTime()))
//					.append(format(getCount()));
//			String md5String = MD5Util.MD5(buf.toString());
//			if (md5String.length() > 32){
//				return md5String.substring(md5String.length() - 32);
//			}
//			else{
//				return md5String;
//			}
            return getUUID();
        }
    }

    /**
     * uuid
     * @return
     */
    public static String getUUID(){
        String s = UUID.randomUUID().toString();
        return s.replaceAll("-","");
        //去掉“-”符号
    }

    /**
     * 格式化字符串型数据. <br>
     * 占八位.
     *
     * @param stringval
     *            字符串型的值.
     * @return 格式化后的结果.
     */
    protected static String format(String stringval) {
        if (stringval == null) {
            stringval = ""; //$NON-NLS-1$
        }
        stringval = stringval.length() > STR_BIT ? stringval.substring(
                stringval.length() - STR_BIT, stringval.length()) : stringval;
        StringBuilder buf = new StringBuilder("00000000"); //$NON-NLS-1$
        buf.replace(STR_BIT - stringval.length(), STR_BIT, stringval);
        return buf.toString();
    }

    public static void main(String args[]){
        System.out.println(generate("12345678"));
    }



}
