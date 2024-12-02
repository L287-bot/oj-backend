package com.yupi.oj.model.dto.judgeinfo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.yupi.oj.model.dto.question.JudgeCase;
import com.yupi.oj.model.dto.question.JudgeConfig;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 创建请求
 *
 * 
 * 
 */
@Data
public class QuestionSubmitAddRequest implements Serializable {


    /**
     * 编程语言
     */
    private String language;

    /**
     * 用户输入代码
     */
    private String code;


    /**
     * 题目 id
     */
    private Long questionId;


    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}