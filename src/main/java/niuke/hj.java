package niuke;


import java.util.*;

public class hj {

    public static void hj01()
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String []spit=str.split(" ");
        if(spit.length==1)
            System.out.println( str.length());
        else
            System.out.println( spit[spit.length-1].length());
    }
//入门5
//十六进制转换十进制,公式 16的n位次幂*当前位数据相加 高转低，低转高的话，使用除法取商从低位到高位，直到余数小于进制大小
    public static void hj05()
    {
        Scanner sc=new Scanner(System.in);
        String in=sc.nextLine();
        Map<Character,Integer> inint=new HashMap(){{
            put('0', 0);
            put('1', 1);
            put('2', 2);
            put('3', 3);
            put('4', 4);
            put('5', 5);
            put('6', 6);
            put('7', 7);
            put('8', 8);
            put('9', 9);
            put('A', 10);
            put('B', 11);
            put('C', 12);
            put('D', 13);
            put('E', 14);
            put('F', 15);
            put('a', 10);
            put('b', 11);
            put('c', 12);
            put('d', 13);
            put('e', 14);
            put('f', 15);
        }};
        int len=in.length()-1;
        int res=0;
        //由于头两位是0x因此从第三位开始，index坐标从2开始。
        for(int index=2;index<=len;index++) {
            res = (int) (res + Math.pow(16.0, index - 2) * inint.get(in.charAt(len - index + 2)));
            System.out.println(res);
        }
        System.out.println(res);
    }
    //输出两个数字之和是目标值的数字坐标，按照升序返回，坐标从1开始。
    public static int[] nc61(int[] numbers, int target)
    {
        //暴力方法算出所有两个叠加的数据，或者算出目标减去一个值是否存在的情况
        //使用减法的时候用hash表用空间换时间
        int[] res = new int[0];
        //创建哈希表,两元组分别表示值、下标
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        //在哈希表中查找target-numbers[i]
        for(int i = 0; i < numbers.length; i++){
            int temp = target - numbers[i];
            //若是没找到，将此信息计入哈希表
            if(!hash.containsKey(temp))
                hash.put(numbers[i], i);
                //否则返回两个下标+1
            else
                return new int[] {hash.get(temp) + 1, i + 1};
        }
        return res;

    }
    //随机数排序问题
    public static void hj03()
    {
        Scanner sc = new Scanner(System.in);
        //获取个数
        int num = sc.nextInt();
        //创建TreeSet进行去重排序
        TreeSet set = new TreeSet();
        //输入
        for(int i =0 ; i < num ;i++){
            set.add(sc.nextInt());
        }

        //输出
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    //计算字符串中含有的不同字符的个数
    public static void hj10()
    {
        //暴力方式，因为字符是0-127，因此遍历每一位，但是时间复杂度过高。
        //使用map进行统计，初始化k=0-127，v=0，存在一位，v+1
        //map判断是否由key，如果不存在put，存在continue
        Scanner in=new Scanner(System.in);
        String str=in.next();
        Map<Character,Integer> hm=new HashMap<>();
        for(int index=0;index<str.length();index++) {
            if(hm.get(str.charAt(index))!=null)
                continue;
            else
                hm.put(str.charAt(index),0);
        }
        System.out.println(hm.size());
    }
    //跳台阶 斐波那契问题
    public static void nc68()
    {}

    //字符串9

    public static void main(String[] args) {
        hj05();
    }
}
