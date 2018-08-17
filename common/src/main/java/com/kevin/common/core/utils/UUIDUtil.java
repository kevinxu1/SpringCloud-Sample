package com.kevin.common.core.utils;

import java.util.UUID;
import org.apache.commons.lang3.StringUtils;

/**
 * @author Kevin.xu
 * @date 2018/8/9/3:13
 * @description :生成统一UUID格式
 */
public class UUIDUtil {

  /**
   * 生成主键Id
   * @param head 在头部添加数据
   * @param tail 在尾部添加数据
   * @return String
   */
  public static String generateKey(String head, String tail) {
    StringBuffer key = new StringBuffer();
    key.append(UUID.randomUUID().toString().replaceAll("-", ""));
    if (StringUtils.isNotEmpty(head)) {
      key.insert(0, head);
    }
    if (StringUtils.isNotEmpty(tail)) {
      key.append(tail);
    }
    return key.toString();
  }

  /**
   * 生成主键id
   * @return String
   */
  public static String generateKey() {
    return generateKey(null,null);
  }



}
