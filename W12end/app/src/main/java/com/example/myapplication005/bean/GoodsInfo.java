package com.example.myapplication005.bean;

import com.example.myapplication005.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "眼睛", "漫画", "可爱", "动漫", "手绘", "二次元","美术生","鬼灭之刃"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "适用于OPPOace2手机壳二次元reno4pro可爱91少女琴子K漫画",
            "Lolita眼睛适用于oppor17p手机壳美术生23三星",
            "网红适用于小米10手机壳cc9手绘mix3红米k30pro可爱漫画",
            "动漫适用于华为mate20日系手机壳荣耀9x眼睛p30一加7pro",
            "适用于VIVOx50手机壳NE3X可爱Xplay6美术生Y71s",
            "美术生玻璃壳lolita适用于华为p30pro自cc9红米k20荣耀10",
            "iphone12手机壳MAX可爱Xr漫画8plus美少女5二次元7苹果pro",
            "鬼灭之刃适用于Phone华为OPPO祢豆子手机壳炭治郎"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {19, 49, 29, 99, 39,29, 19,29};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.oo, R.drawable.tt, R.drawable.thth,
            R.drawable.ff,R.drawable.fifi, R.drawable.ss,
            R.drawable.sese, R.drawable.ee
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.o, R.drawable.t, R.drawable.th,
            R.drawable.f, R.drawable.fi, R.drawable.s,
            R.drawable.se, R.drawable.e
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}