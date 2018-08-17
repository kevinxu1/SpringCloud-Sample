package com.kevin.common.core.model;

import com.alibaba.fastjson.JSON;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Kevin.xu
 * @date 2018/8/5/23:51
 * @description :
 */
@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
public class BaseModel implements Serializable {

  private String id;
  private Date createdDate;
  private Date updatedDate;
  private int status;

  public String toJson() {
    return JSON.toJSONString(this);
  }

}
