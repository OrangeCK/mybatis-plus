package com.ck.util;
import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.IColumnType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.ck.mybatisplus.foundation.entity.FndUser;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CodeGeneratorDemo {

    public static void main(String[] args) {
        try {
            //测试.class
            Class testTypeClass=FndUser.class;
            System.out.println("testTypeClass---"+testTypeClass);
            //测试Class.forName()
            Class testTypeForName=Class.forName("com.ck.mybatisplus.foundation.entity.FndUser");
            System.out.println("testTypeForName---"+testTypeForName);
            //测试Object.getClass()
            FndUser testTypeGetClass= new FndUser();
            System.out.println("testTypeGetClass---"+testTypeGetClass.getClass());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
