/*
dos命令 md创建目录 rd删除目录
清屏cls
相对路径 从当前目录开始 
绝对路径 从顶级目录开始 cd ../
echo ok > hello.text
 */
//gbk不显示 右击文件用记事本打开 另存为编译改成asni 替换原文件 重新编译
//JDK = JRE + java开发工具
//JRE = JVM + 核心类库
//变量类型：数值型：整数型（byte1\short2\int4\long8）默认int
//浮点数 float4\double8 符号位+指数位+尾数位 尾数备份可能丢失 默认double
//字符型char 布尔型 true
long n3 = 1L
// 1 byte= 8 bit
// char ='' 也可以char c1 =88
// 如果赋值数字不加引号 会输出对应的字母或汉字
// 如果赋值字母或者汉字 （int）会输出数字
// char c1 = 97 ;
// System.out.println(c1);会输出 a
// char c2 = 'a';
// System.out.println((int)c2);输出97
// 字符型用的是''单引号
// chr c5 = 'b' + 1 输出99
// 精度小的自动转换为精度大的 自动类型转换
// char int long float double
// byte short int long float double
// 自动类型转换1.多种数据混合运算 先转换为容量最大的再计算
// 2.精度小到精度大自动类型转换
// 3.（byte short）、char不能相互自动转换
// 4.byte short char计算会转换成int
// 强制转换细节 精度从大到小
// double a1 = 1.1；
// int a = （int）1.1
// char保存int常量而不能是变量
// String s1 = n1 + "";
// int num1 = Interger.parsaInt(s5);
// double num2 = Double.parseDouble(s5);