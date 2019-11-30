package com.qf;

import com.baomidou.mybatisplus.annotation.TableField;
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
@TableName("student")
public class Student  extends Baeatity{
    private  String sname;
    private Integer age;
    private Integer cid;
    @TableField(exist = false)
    private  Classess c;
}
