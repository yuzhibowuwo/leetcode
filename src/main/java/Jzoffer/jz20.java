package Jzoffer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//表示数值的字符串
public class jz20 {
/*
* 通常方法
* 1、过滤空格
* 2、判断是否为空
*
* 整数部分
* 1、符号位
* 2、数字
* 3、可以带小数点
* 4、可以带eE 可以紧接着数字后，也可以紧接着小数点后
*
* 小数
* 1、符号位
* 2、可以没有整数部分，.开头
* 3、可以带eE，但是前面必然有数字
* */
    public boolean isNumber(String s) {
//正则表达式匹配 ^(-?\d+)(\.\d+)?$ 浮点数 ^(\-|\+)?\d+(\.\d+)?$ 正数、负数和小数
        //^(\-|\+)?\d+(\.\d{0,})?([Ee][+-]?[\d]+)?$
        //科学计数法 ^(\-|\+)?\d+(\.\d+)?([Ee][+-]?[\d]+)?$
        s=s.trim();
        if(s==null||s.length()==0)
            return false;
        String patterString="^(\\-|\\+)?\\d+(\\.\\d{0,})?([Ee][+-]?[\\d]+)?$";//完整的正负号数字小数点数字科学计数法
        String patterSpecialString="^(\\-|\\+)?(\\d{0,})?(\\.\\d+)?([Ee][+-]?[\\d]+)?$";//特殊小数 +-.xxx 存在eD的情况，该正则无法规避
        String ereString="^([Ee][+-]?[\\d]+)?$";
        String patterSpecialString1="^(\\-|\\+)?\\d+(\\.)?$";//特殊整数 xxx.
        Pattern error=Pattern.compile(ereString);
        Matcher e=error.matcher(s);
        if(e.matches())
            return false;
        Pattern r = Pattern.compile(patterString);
        Matcher m = r.matcher(s);
        Pattern p1=Pattern.compile(patterSpecialString);
        Matcher n=p1.matcher(s);
        Pattern p2=Pattern.compile(patterSpecialString1);
        Matcher o=p2.matcher(s);
        System.out.println("完整校验"+m.matches());
        System.out.println("小数结果"+n.matches());
        System.out.println("特殊整数结果"+o.matches());
        return m.matches()||n.matches()||o.matches();

    }
}


//