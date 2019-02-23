package com.generatecode;

//import com.twodfire.util.MD5Util;

/**
 * Created by Administrator on 2016/5/31 0031.
 */
public class GenCode {

//    private static final String action = "http://developer.waimai.meituan.com/erp/login";
//
//    private static final String callbackUrl = ".../meituan/order/submit.do";
//
//    private static final String appSecret = "";
//
//    public static void main(String[] args) {
//        Map<String, String> params = new HashMap<>();
//
//        params.put("app_id", "");
//        params.put("callback_url", callbackUrl);
//        Long time = System.currentTimeMillis() / 1000;
//        params.put("timestamp", time.toString());
//
//        // 计算签名
//        String paramStr = MapUtil.connectAsString(params);
//        String urlForGenSig = action + "?" + paramStr + appSecret;
//        String sign = MD5Util.MD5(urlForGenSig);
//
//        // 拼接字符串
//        String tmpStr = paramStr + "&sig=" + sign;
//        System.out.println(tmpStr);
//
//        // todo 对tmpStr进行res加密
//
//        // todo 对tmpStr进行utf-8编码
//
//    }
//
//    /**
//            * 加密
//    *
//            * @param content
//    * @param enCodeKey
//    * @return
//            */
//    public static byte[] encrypt(String content, byte[] enCodeKey) {
//        try {
//            SecretKeySpec key = new SecretKeySpec(enCodeKey, "AES");
//            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");// 创建密码器
//            byte[] byteContent = content.getBytes("UTF-8");
//            cipher.init(Cipher.ENCRYPT_MODE, key, new IvParameterSpec(new byte[16]));// 初始化
//            byte[] result = cipher.doFinal(byteContent);
//            return result; // 加密
//        } catch (NoSuchAlgorithmException e) {
//            LOG.error("AESEncryptUtil.encrypt content={}", content, e);
//        } catch (NoSuchPaddingException e) {
//            LOG.error("AESEncryptUtil.encrypt content={}", content, e);
//        } catch (InvalidKeyException e) {
//            LOG.error("AESEncryptUtil.encrypt content={}", content, e);
//        } catch (UnsupportedEncodingException e) {
//            LOG.error("AESEncryptUtil.encrypt content={}", content, e);
//        } catch (IllegalBlockSizeException e) {
//            LOG.error("AESEncryptUtil.encrypt content={}", content, e);
//        } catch (BadPaddingException e) {
//            LOG.error("AESEncryptUtil.encrypt content={}", content, e);
//        } catch (InvalidAlgorithmParameterException e) {
//            LOG.error("AESEncryptUtil.encrypt content={}", content, e);
//        }
//        return null;
//    }
//
//    public static String encode(byte[] buf) {
//        int size = buf.length;
//        char[] ar = new char[(size + 2) / 3 * 4];
//        int a = 0;
//
//        byte b2;
//        byte mask;
//        for(int i = 0; i < size; ar[a++] = ALPHABET[b2 & mask]) {
//            byte b0 = buf[i++];
//            byte b1 = i < size?buf[i++]:0;
//            b2 = i < size?buf[i++]:0;
//            mask = 63;
//            ar[a++] = ALPHABET[b0 >> 2 & mask];
//            ar[a++] = ALPHABET[(b0 << 4 | (b1 & 255) >> 4) & mask];
//            ar[a++] = ALPHABET[(b1 << 2 | (b2 & 255) >> 6) & mask];
//        }
//
//        switch(size % 3) {
//            case 1:
//                —a;
//                ar[a] = 61;
//            case 2:
//                —a;
//                ar[a] = 61;
//            default:
//                return new String(ar);
//        }
//    }
}
