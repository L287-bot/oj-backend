package com.yupi.oj.model.dto.post;

import java.io.Serializable;
import java.util.List;

import com.yupi.oj.model.dto.question.JudgeCase;
import com.yupi.oj.model.dto.question.JudgeConfig;
import lombok.Data;

/**
 * 更新请求
 *
 * 
 * 
 */
@Data
public class PostUpdateRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;
    /**
     * 判题用例（json 数组）
     */
    private List<JudgeCase> judgeCase;

    /**
     * 判题配置（json 对象）
     */
    private List<JudgeConfig> judgeConfig;
    /**
     * 标签列表
     */
    private List<String> tags;

    private static final long serialVersionUID = 1L;
}