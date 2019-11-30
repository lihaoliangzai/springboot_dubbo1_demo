package com.qf;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author 靓仔
 * @date 2019/11/29 21:54
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@TableName("classes")
public class Classess extends Baeatity {
     private String cname;
     private Integer cnum;
}
