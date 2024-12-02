package com.yupi.oj.model.enums;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 判题信息枚举
 */
public enum JudgeInfoMessageEnum {
    COMPILE_ERROR("编译错误", "Compile Error"),
    ACCEPTED("答案正确", "Accepted"),
    WRONG_ANSWER("答案错误", "Wrong Answer"),
    TIME_LIMIT_EXCEEDED("超出时间限制", "CPU Time Limit Exceeded"),
    MEMORY_LIMIT_EXCEEDED("超出内存限制", "Memory Limit Exceeded"),
    RUNTIME_ERROR("运行时错误", "Runtime Error"),
    SYSTEM_ERROR("系统错误", "System Error"),
    DANGEROUS_OPERATION("危险操作", "Dangerous Operation"),
    WAITING("等待中", "Waiting"),
    OUTPUT_LIMIT_EXCEEDED("输出溢出", "Output Limit Exceeded"),
    SUBMITTED("已提交", "Submitted");

    private final String text;
    private final String value;

    JudgeInfoMessageEnum(String text, String value) {
        this.text = text;
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public String getValue() {
        return value;
    }

    public static JudgeInfoMessageEnum getEnumByValue(String value) {
        for (JudgeInfoMessageEnum anEnum : JudgeInfoMessageEnum.values()) {
            if (anEnum.value.equals(value)) {
                return anEnum;
            }
        }
        return null;
    }


    public static List<String> getValues() {
        return Arrays.stream(JudgeInfoMessageEnum.values())
                .map(JudgeInfoMessageEnum::getValue)
                .collect(Collectors.toList());
    }


}
