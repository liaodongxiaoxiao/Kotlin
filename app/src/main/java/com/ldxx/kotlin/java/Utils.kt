package com.ldxx.kotlin.java

/**
 * Created by wangzhuo-neu
 * on 2017/3/14.
 */
object Utils {
    // JavaScript Document
    /*function change02(obj)
    {
        for (var i= 0;i < 2;i++){
        document.getElementById("hot_new" + i).className = "navv02";
        document.getElementById("hot_content_" + i).style.display = "none";
    }
        document.getElementById("hot_new" + obj).className = "navv01";
        document.getElementById("hot_content_" + obj).style.display = "";
    }

    function doChangeNumber(form,tableID)
    {
        var redBallCount = form.elements["redBallCount"];
        var blueBallCount = form.elements["blueBallCount"];
        var table = document.getElementById(tableID);

        var rows = table.rows;

        var castMoney = document.getElementById("castMoney");



        castMoney.innerText = comp(6, redBallCount.value) * blueBallCount.value * 2 + "元";


        var rowLen = rows.length;

        for (var i = 1;i < rowLen;i++){

        var tr = rows[i];


        var td0 = tr.cells[0];

        var td1 = tr.cells[1];

        var td2 = tr.cells[2];

        var td3 = tr.cells[3];

        var td4 = tr.cells[4];

        var td5 = tr.cells[5];

        var td6 = tr.cells[6];

        var td7 = tr.cells[7];

        var td8 = tr.cells[8];

        var td9 = tr.cells[9];

        var td10 = tr.cells[10];

        var td11 = tr.cells[11];



        td0.innerText = redBallCount.value;

        td1.innerText = blueBallCount.value;

        td2.innerText = comp(6, redBallCount.value) * (blueBallCount.value * 2);


        var a = td0.innerText;

        var b = td1.innerText;

        var c = td3.innerText;

        var d = td4.innerText;



        if (blueBallCount.value == 16 && d == 0) {

            tr.style.display = "none";

        } else {

            tr.style.display = "";

        }



        td5.innerText = calFirst(a, b, c, d);

        td6.innerText = calSecond(a, b, c, d);

        td7.innerText = calThird(a, b, c, d);

        td8.innerText = calFourth(a, b, c, d);

        td9.innerText = calFiveth(a, b, c, d);

        td10.innerText = calSixth(a, b, c, d);

        td11.innerText = getMoney(td5.innerText, "A") + getMoney(td6.innerText, "B") + (cal(td7.innerText, 3000) + cal(td8.innerText, 200) + cal(td9.innerText, 10) + cal(td10.innerText, 5));


    }

    }*/

    fun doChangeNumber(redBallCount: Int, blueBallCount: Int) {
        //var redBallCount  = form.elements["redBallCount"];
        //var blueBallCount = form.elements["blueBallCount"];
        //var table = document.getElementById(tableID);

        //var rows = table.rows;

        //var castMoney = document.getElementById("castMoney");


        //castMoney.innerText = comp(6, redBallCount.value) * blueBallCount.value * 2 + "元";
        println((comp(6, redBallCount) * blueBallCount * 2 ).toString()+ "元")


        //var rowLen = rows.length;

         for (  i in 1..10) {

             /*var tr = rows[i];


        var td0 = tr.cells[0];

        var td1 = tr.cells[1];

        var td2 = tr.cells[2];

        var td3 = tr.cells[3];

        var td4 = tr.cells[4];

        var td5 = tr.cells[5];

        var td6 = tr.cells[6];

        var td7 = tr.cells[7];

        var td8 = tr.cells[8];

        var td9 = tr.cells[9];

        var td10 = tr.cells[10];

        var td11 = tr.cells[11];*/


             //td0.innerText = redBallCount.value;

             //td1.innerText = blueBallCount.value;

             //td2.innerText = comp(6, redBallCount.value) * (blueBallCount.value * 2);


             //var a = td0.innerText;

             //var b = td1.innerText;

             //var c = td3.innerText;

             //var d = td4.innerText;
             var a = redBallCount
             var b = blueBallCount
             var c = 0
             var d = comp(6, redBallCount) * (blueBallCount * 2)

/*

        if (blueBallCount == 16 && d == 0) {

            tr.style.display = "none";

        } else {

            tr.style.display = "";

        }*/


             //td5.innerText = calFirst(a, b, c, d);
             val td5: Int = calFirst(a, b, c, d)
             println(td5)
             //td6.innerText = calSecond(a, b, c, d);
             val td6: Int = calSecond(a, b, c, d)
             println(td6)
             //td7.innerText = calThird(a, b, c, d);
             val td7: Int = calThird(a, b, c, d)
             println(td7)
             //td8.innerText = calFourth(a, b, c, d);
             val td8: Int = calFourth(a, b, c, d)
             println(td8)
             //td9.innerText = calFiveth(a, b, c, d);
             val td9: Int = calFiveth(a, b, c, d)
             println(td9)
             //td10.innerText = calSixth(a, b, c, d);
             val td10: Int = calSixth(a, b, c, d)
             println(td10)

             //td11.innerText = getMoney(td5.innerText, "A") + getMoney(td6.innerText, "B") + (cal(td7.innerText, 3000) + cal(td8.innerText, 200) + cal(td9.innerText, 10) + cal(td10.innerText, 5));
             println(getMoney(td5, "A") + getMoney(td6, "B") + (cal(td7, 3000) + cal(td8, 200) + cal(td9, 10) + cal(td10, 5)))
         }
    }

    fun getMoney(num: Int, text: String): String {
        if (num > 0) {
            return num.toString() + text + "+"
        } else {
            return ""
        }

    }


    fun cal(a: Int, b: Int): Int = a * b

    fun comp(a: Int, b: Int): Int {
        var c = 1
        for (i in (b - a + 1)..b) {
            c *= i
        }

        for (i in 2..a) {
            c /= i
        }

        return c
    }

    fun calFirst(a: Int, b: Int, c: Int, d: Int): Int = d * comp(6, c) * comp(0, a - c)

    fun calSecond(a: Int, b: Int, c: Int, d: Int): Int = (b - d) * comp(6, c) * comp(0, a - c)

    fun calThird(a: Int, b: Int, c: Int, d: Int): Int = d * comp(5, c) * comp(1, a - c)


    fun calFourth(a: Int, b: Int, c: Int, d: Int): Int = d * comp(4, c) * comp(2, a - c) + (b - d) * comp(5, c) * comp(1, a - c)

    fun calFiveth(a: Int, b: Int, c: Int, d: Int): Int = d * comp(3, c) * comp(3, a - c) + (b - d) * comp(4, c) * comp(2, a - c)

    fun calSixth(a: Int, b: Int, c: Int, d: Int): Int = d * comp(2, c) * comp(4, a - c) + d * comp(1, c) * comp(5, a - c) + d * comp(0, c) * comp(6, a - c)


    /*var num;

    var i;

    var tempNum;

    tempNum=0;

    function show(num)

    {

        if (fm1.rednum.value < 20 && eval(fm1.RedGlob1[num - 1]).style.display == "none") {//选择的红球

            eval(fm1.RedGlob1[num - 1]).style.display = "";

            eval(fm1.RedGlob2[num - 1]).disabled = false;

            fm1.rednum.value++;

            myrednum.innerHTML = fm1.rednum.value;

            num = getNum(fm1.rednum.value, fm1.bluenum.value);

            myallnum.innerHTML = num;

            mymoney.innerHTML = 2 * num;

        }

    }*/

    /*function show2(num)

    {//取消红球

        eval(fm1.RedGlob1[num - 1]).style.display = "none";

        eval(fm1.RedGlob2[num - 1]).disabled = true;

        fm1.rednum.value--;

        myrednum.innerHTML = fm1.rednum.value;

        num = getNum(fm1.rednum.value, fm1.bluenum.value);

        myallnum.innerHTML = num;

        mymoney.innerHTML = 2 * num;

    }*/

    /*function show3(num)

    {

        if (fm1.bluenum.value < 17 && eval(fm1.BlueGlob1[num - 1]).style.display == "none") {//选择篮球

            eval(fm1.BlueGlob1[num - 1]).style.display = "";

            eval(fm1.BlueGlob2[num - 1]).disabled = false;

            fm1.bluenum.value++;

            mybluenum.innerHTML = fm1.bluenum.value;

            num = getNum(fm1.rednum.value, fm1.bluenum.value);

            myallnum.innerHTML = num;

            mymoney.innerHTML = 2 * num;

        }

    }*/

    //取消篮球
    /*function show4(num)

    {

        eval(fm1.BlueGlob1[num - 1]).style.display = "none";

        eval(fm1.BlueGlob2[num - 1]).disabled = true;

        fm1.bluenum.value--;

        mybluenum.innerHTML = fm1.bluenum.value;

        num = getNum(fm1.rednum.value, fm1.bluenum.value);

        myallnum.innerHTML = num;

        mymoney.innerHTML = 2 * num;

    }*/


    fun getNum(rn: Int, bn: Int): Int {

        if (rn < 6)
            return 0

        if (bn == 0)
            return 0

        if (rn == 6) {
            //fm1.tempnum.value = bn;
            return bn
        }

        var tempNum = 1

        for (i in 7..rn) {
            tempNum *= i
        }

        for (i in 2..(rn - 6)) {
            tempNum /= i
        }

        tempNum *= bn

        //fm1.tempnum.value = tempNum;

        if (tempNum > 620160) {
            println("方案注数最大不得超过620160注")
            return 0
        }
        return tempNum

    }


    /*function mysubmit()

    {

        var length = fm1.RedGlob2.length;

        var chooseRed = '';

        for (i= 0;i < length;i++)

        {

            if (eval(fm1.RedGlob1[i]).style.display == "")//选择的红球
            {

                chooseRed += fm1.RedGlob2[i].value + ',';

            }

        }

        fm1.choosered.value = chooseRed;


        var length = fm1.BlueGlob2.length;

        var chooseBlue = '';

        for (i= 0;i < length;i++)

        {

            if (eval(fm1.BlueGlob1[i]).style.display == "")//选择的红球
            {

                chooseBlue += fm1.BlueGlob2[i].value + ',';

            }

        }

        fm1.chooseblue.value = chooseBlue;

        var tempNum = fm1.tempnum.value;

        if (tempNum <= 3) {

            println("合买最少1注,即6个红球,1个蓝球");

            return false;

        }

        if (tempNum > 620160) {

            println("方案注数最大不得超过620160注");

            return false;

        }



        if (fm1.title.value == "") {

            println("请输入方案标题");

            return false;

        }

        if (fm1.content.value == "") {

            println("请输入方案内容");

            return false;

        }

    }*/


//dantuo
//显示红球胆码
    /* function showhqdm(obj)
     {
         //println(obj.value);

         var aa = Number(obj.value);
         var bb = "hqdmtz" + aa;
         var dd = "hqtmxz" + aa;
         var ff = "hqdmxz" + aa;

         obj.disabled = "false";
         //显示计算结果
         var hqdm_count = 0;
         for (i= 1;i <= 33;i++){
         var a = "hqdmtz" + i;
         var b = document.getElementById(a);
         if (b.style.display == "") {
             hqdm_count++;
         }
     }
         if (hqdm_count >= 5) {
             println("胆码不能超过5个!");
             var gg = document.getElementById(ff);
             gg.disabled = "";
         } else {
             var cc = document.getElementById(bb);
             cc.style.display = "";
             //println(dd);
             var ee = document.getElementById(dd);
             //println(ee.value);
             ee.disabled = "false";
         }


         var hqdmtj = document.getElementById("hqdmtj");
         hqdmtj.innerText = hqdm_count + 1;

     }*/

//显示红球拖码
    /*  function showhqtm(obj)
      {
          //println(obj.value);
          obj.disabled = "false";
          var aa = Number(obj.value);
          var bb = "hqtmtz" + aa;
          //println(b);
          var cc = document.getElementById(bb);
          cc.style.display = "";

          var objzhi = Number(obj.value);
          var dd = "hqdmxz" + objzhi;
          var ee = document.getElementById(dd);
          //println(ee.value);
          ee.disabled = "false";

          //显示计算结果
          var hqtm_count = 0;
          for (i= 1;i <= 33;i++){
          var a = "hqtmtz" + i;
          var b = document.getElementById(a);
          if (b.style.display == "") {
              hqtm_count++;
          }
      }
          var hqtmtj = document.getElementById("hqtmtj");
          hqtmtj.innerText = hqtm_count;


      }*/
//显示篮球拖码
    /* function showlqtm(obj)
     {
         //println(obj.value);
         obj.disabled = "false";
         var aa = Number(obj.value);
         var bb = "lqtmtz" + aa;
         //println(b);
         var cc = document.getElementById(bb);
         cc.style.display = "";

         //显示计算结果
         var lqtm_count = 0;

         for (i= 1;i <= 16;i++){
         var a = "lqtmtz" + i;
         var b = document.getElementById(a);
         if (b.style.display == "") {
             lqtm_count++;
         }
     }
         var lqtmtj = document.getElementById("lqtmtj");
         lqtmtj.innerText = lqtm_count;

     }*/
//隐藏选中号码
    /*function yincanghao_hqdm(obj)
    {
        obj.style.display = "none";
        var objzhi = Number(obj.value);
        var dd1 = "hqtmxz" + objzhi;
        var dd2 = "hqdmxz" + objzhi;
        var jhhqtm1 = document.getElementById(dd1);
        var jhhqtm2 = document.getElementById(dd2);
        jhhqtm1.disabled = "";
        jhhqtm2.disabled = "";

        //显示计算结果
        var hqdm_count = 0;
        for (i= 1;i <= 33;i++){
        var a = "hqdmtz" + i;
        var b = document.getElementById(a);
        if (b.style.display == "") {
            hqdm_count++;
        }
    }

        var hqdmtj = document.getElementById("hqdmtj");
        hqdmtj.innerText = hqdm_count;
    }*/


//隐藏选中号码
    /*  function yincanghao_hqtm(obj)
      {
          obj.style.display = "none";
          var objzhi = Number(obj.value);
          var dd1 = "hqdmxz" + objzhi;
          var dd2 = "hqtmxz" + objzhi;
          var jhhqdm1 = document.getElementById(dd1);
          var jhhqdm2 = document.getElementById(dd2);
          jhhqdm1.disabled = "";
          jhhqdm2.disabled = "";

          //显示计算结果
          var hqtm_count = 0;


          var hqtm_count = 0;
          for (i= 1;i <= 33;i++){
          var a = "hqtmtz" + i;
          var b = document.getElementById(a);
          if (b.style.display == "") {
              hqtm_count++;
          }
      }

          var hqtmtj = document.getElementById("hqtmtj");
          hqtmtj.innerText = hqtm_count;

      }*/

//隐藏选中号码
    /* function yincanghao_lqtm(obj)
     {
         obj.style.display = "none";
         var objzhi = Number(obj.value);
         var dd1 = "lqtmxz" + objzhi;
         var jhlqtm1 = document.getElementById(dd1);
         jhlqtm1.disabled = "";

         //显示计算结果
         var lqtm_count = 0;
         for (i= 1;i <= 16;i++){
         var a = "lqtmtz" + i;
         var b = document.getElementById(a);
         if (b.style.display == "") {
             lqtm_count++;
         }
     }
         var lqtmtj = document.getElementById("lqtmtj");
         lqtmtj.innerText = lqtm_count;
     }*/


//重新选择
    /* function resert()
     {
         for (i= 1;i <= 33;i++){
         var a = "hqdmtz" + i;
         var b = document.getElementById(a);
         if (b.style.display == "") {
             b.style.display = "none"
         }
     }

         for (i= 1;i <= 33;i++){
         var a = "hqtmtz" + i;
         var b = document.getElementById(a);
         if (b.style.display == "") {
             b.style.display = "none"
         }
     }

         for (i= 1;i <= 16;i++){
         var a = "lqtmtz" + i;
         var b = document.getElementById(a);
         if (b.style.display == "") {
             b.style.display = "none"
         }
     }

         for (i= 1;i <= 33;i++){
         var a = "hqdmxz" + i;
         var b = document.getElementById(a);
         b.disabled = "";
     }

         for (i= 1;i <= 33;i++){
         var a = "hqtmxz" + i;
         var b = document.getElementById(a);
         b.disabled = "";
     }

         for (i= 1;i <= 16;i++){
         var a = "lqtmxz" + i;
         var b = document.getElementById(a);
         b.disabled = "";
     }


         var hqdmtj = document.getElementById("hqdmtj");
         var hqtmtj = document.getElementById("hqtmtj");
         var lqtmtj = document.getElementById("lqtmtj");
         var fazs = document.getElementById("fazs");
         var tzje = document.getElementById("tzje");
         hqdmtj.innerText = 0;
         hqtmtj.innerText = 0;
         lqtmtj.innerText = 0;
         fazs.innerText = 0;
         tzje.innerText = 0;
     }*/


//统计投注
    /*function count_betting()
    {
        //显示计算结果
        var hqdm_count = 0;
        var hqtm_count = 0;
        var lqtm_count = 0;

        var fazs = 0;
        var tzje = 0;
        for (i= 1;i <= 33;i++){
        var a = "hqdmtz" + i;
        var b = document.getElementById(a);
        if (b.style.display == "") {
            hqdm_count++;
        }
    }

        var hqtm_count = 0;
        for (i= 1;i <= 33;i++){
        var a = "hqtmtz" + i;
        var b = document.getElementById(a);
        if (b.style.display == "") {
            hqtm_count++;
        }
    }

        for (i= 1;i <= 16;i++){
        var a = "lqtmtz" + i;
        var b = document.getElementById(a);
        if (b.style.display == "") {
            lqtm_count++;
        }
    }
        if (hqdm_count > 5) {
            println("红球胆码数不可超过5个!");
        } else if (hqdm_count < 1) {
            println("未选中红球胆码!");
        } else if (hqtm_count < 1) {
            println("未选中红球拖码!");
        } else if (lqtm_count < 1) {
            println("未选中蓝球拖码!");
        } else if ((hqdm_count + hqtm_count) < 6) {
            println("选中的红球不够6个!");
        } else {
            var r = 6 - hqdm_count;
            var n = hqtm_count;
            fazs = (jiecheng(n) / (jiecheng(r) * jiecheng(n - r))) * lqtm_count;
            //println(jiecheng(3));


        }

        var fazs1 = document.getElementById("fazs");
        var tzje1 = document.getElementById("tzje");
        fazs1.innerText = fazs;
        tzje1.innerText = fazs * 2;

    }*/

    //求M的阶乘
    fun jiecheng(m: Int): Int { //求阶乘
        if (m == 1 || m == 0) return 1
        else return m * (jiecheng(m - 1)) //递归算:法n!=n*(n-1)!
    }
}

fun main(args: Array<String>) {
    println(Utils.doChangeNumber(7, 3))
    println(Utils.getMoney(Utils.getNum(7, 3), "jj"))
}