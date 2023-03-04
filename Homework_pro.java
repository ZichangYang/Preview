package preMath;

import java.util.Scanner;

public class Homework_pro {
    public static void main(String[] args) {
        BigDecimalDemo bigDecimalDemo = new BigDecimalDemo();
        boolean tmp = true;
        while (tmp) {
            System.out.println("请输入您要进行的运算：\t1.加法\t2.减法\t3.乘法\t4.除法\t5.退出");
            Scanner scanner = new Scanner(System.in);
            int choose = 0;
            while (true) {
                try {
                    choose = scanner.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("请输入1-5之间的整数！");
                    scanner = new Scanner(System.in);
                }
            }
            switch (choose)
            {
                case 1:
                    bigDecimalDemo.add();
                    break;
                case 2:
                    bigDecimalDemo.sub();
                    break;
                case 3:
                    bigDecimalDemo.mul();
                    break;
                case 4:
                    bigDecimalDemo.div();
                    break;
                case 5:
                    tmp = false;
                    break;
                default:
                    System.out.println("请输入正确的数字！");
                    break;
            }

        }

    }

    static class BigDecimalDemo
    {
        /**
         * 加法类
         */
        void add()
        {
            System.out.println("请输入您要进行计算的等式：");
            Scanner scanner = new Scanner(System.in);
            String x;
            while (true) {
                try {
                    x = scanner.next();
                    if (x.contains("+") && ! x.contains("-") && !x.contains("*") && !x.contains("/"))
                        break;
                    else
                    {
                        System.out.println("请输入只含有+的式子");
                    }
                }catch (Exception e)
                {
                    System.out.println("请输入只含有+的式子");
                    scanner = new Scanner(System.in);
                }
            }
            String[] result = x.split("[+]");
            double sum = 0;
            for (String s : result) {
                sum = sum + Double.parseDouble(s);
//                System.out.println(sum);
            }
            System.out.println(sum);
        }

        /**
         * 减法
         */
        void sub()
        {
            System.out.println("请输入您要进行计算的等式：");
            Scanner scanner = new Scanner(System.in);
            String x;
            while (true) {
                try {
                    x = scanner.next();
                    if (x.contains("-") && ! x.contains("+") && !x.contains("*") && !x.contains("/"))
                        break;
                    else
                    {
                        System.out.println("请输入只含有-的式子");
                    }
                }catch (Exception e)
                {
                    System.out.println("请输入只含有-的式子");
                    scanner = new Scanner(System.in);
                }
            }
            String[] result = x.split("[-]");
            double sum = Double.parseDouble(result[0]);
            for (int i = 1; i < result.length; i++) {
                sum = sum - Double.parseDouble(result[i]);
//                System.out.println(sum);
            }
            System.out.println(sum);
        }

        /**
         * 乘法
         */
        void mul()
        {
            System.out.println("请输入您要进行计算的等式：");
            Scanner scanner = new Scanner(System.in);
            String x;
            while (true) {
                try {
                    x = scanner.next();
                    if (x.contains("*") && ! x.contains("-") && !x.contains("+") && !x.contains("/"))
                        break;
                    else
                    {
                        System.out.println("请输入只含有*的式子");
                    }
                }catch (Exception e)
                {
                    System.out.println("请输入只含有*的式子");
                    scanner = new Scanner(System.in);
                }
            }
            String[] result = x.split("[*]");
            double sum = Double.parseDouble(result[0]);
            for (int i = 1; i < result.length; i++) {
                sum = sum * Double.parseDouble(result[i]);
//                System.out.println(sum);
            }
            System.out.println(sum);
        }

        /**
         * 除法
         */
        void div()
        {
            System.out.println("请输入您要进行计算的等式：");
            Scanner scanner = new Scanner(System.in);
            String x;
            while (true) {
                try {
                    x = scanner.next();
                    if (x.contains("/") && ! x.contains("-") && !x.contains("*") && !x.contains("+"))
                        break;
                    else
                    {
                        System.out.println("请输入只含有/的式子");
                    }
                }catch (Exception e)
                {
                    System.out.println("请输入只含有/的式子");
                    scanner = new Scanner(System.in);
                }
            }            System.out.println("请输入您要精确的位数：");
            int weishu = scanner.nextInt();
            String[] result = x.split("[/]");
            double sum = Double.parseDouble(result[0]);
            for (int i = 1; i < result.length; i++) {
                sum = sum / Double.parseDouble(result[i]);
//                System.out.println(sum);
            }
            double t = Math.pow(10, weishu);
            double result1 = Math.round(sum * t) / t;
            System.out.println(result1);
        }
    }
}
