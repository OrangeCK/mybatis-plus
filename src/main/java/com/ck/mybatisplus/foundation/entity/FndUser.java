package com.ck.mybatisplus.foundation.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户基础表
 * </p>
 *
 * @author ck
 * @since 2019-07-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class FndUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("id")
    private String id;

    /**
     * 登录名称
     */
    @TableField("login_name")
    private String loginName;

    /**
     * 用户名称
     */
    @TableField("user_name")
    private String userName;

    /**
     * 密码
     */
    @TableField("password")
    private String password;

    /**
     * 工号
     */
    @TableField("job_number")
    private String jobNumber;

    /**
     * 年龄
     */
    @TableField("age")
    private Integer age;

    /**
     * 性别
     */
    @TableField("sex")
    private String sex;

    /**
     * 用户电话
     */
    @TableField("user_phone")
    private String userPhone;

    /**
     * 是否有效标志
     */
    @TableField("enable_flag")
    private String enableFlag;

    @TableField("s_cid")
    private String sCid;

    /**
     * 创建时间
     */
    @TableField("s_ct")
    private LocalDateTime sCt;

    @TableField("s_uid")
    private String sUid;

    /**
     * 最后更新时间
     */
    @TableField("s_ut")
    private LocalDateTime sUt;


}
