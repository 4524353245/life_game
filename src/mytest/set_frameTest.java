package mytest;

import org.junit.Before;
import org.junit.Test;
import life_game.set_frame;

import javax.swing.*;

import java.awt.*;

import static org.junit.Assert.*;

/**
 * @Author: Shawn
 * @Date: 2018/09/18 22:23
 */
public class set_frameTest extends Thread{

    @Before
    public void setUp() throws Exception {
    }

    @Test
//    因为在set_frame类里面没有单独的方法，主题是在设计界面，所以在这个测试类中，我们自己添加了测试函数，
    public void test(){
        int pattern=1;
        JPanel jPanel [][] ;
        int life;
        set_frame set=new set_frame(30,30);
        jPanel=set.jPanel;
        life=set.life;
        //测试是否初始化life成功
        System.out.println(life);
        //测试是否将所有界面初始化为白色
        for(int i=0;i<30;i++)
        {
            for(int j=0;j<30;j++)
            {
                assertEquals(true,jPanel[i][j].getBackground()==Color.white);
            }
        }

    }

}