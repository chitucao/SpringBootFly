package cn.chitucao.starter.format;

public interface FormatProcessor {

    //定义一个格式化的方法
    <T> String format(T obj);
}
