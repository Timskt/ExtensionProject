package com.sky.toolkit.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/***
 @author sky
 @date 2022/10/22
 @version 1.0
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("UserInfo")
public class UserInfo {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String nickname;

    private String avatar;

    private String intro;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;

}
