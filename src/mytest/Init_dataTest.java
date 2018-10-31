package mytest;

import life_game.Init_data;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author: Shawn
 * @Date: 2018/09/14 10:37
 */
public class Init_dataTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
//    Init_data类主要是对数据进行初始化，因此本测试用例用来检验数据初始化是否成功
//    挑选一个活细胞数据和一个死细胞数据进行测试
//    测试结果  ALL Tests Passed
    public void init_one() {
        boolean[][] state=new boolean[30][30];;
        for(int i=1;i<state.length;i++){
            for(int j=1;j<state[i].length-1;j++)
            {
                state[i][j] = false;
            }
        }
        Init_data init=new Init_data(state);
        init.init_one();
        assertEquals(state[10][3],true);
        assertEquals(state[29][29],false);
    }

    @Test
    //    测试结果  ALL Tests Passed
    public void init_two() {
        boolean[][] state=new boolean[30][30];;
        for(int i=1;i<state.length;i++){
            for(int j=1;j<state[i].length-1;j++)
            {
                state[i][j] = false;
            }
        }
        Init_data init=new Init_data(state);
        init.init_two();
        assertEquals(state[9][15],true);
        assertEquals(state[29][29],false);
    }

    @Test
    public void init_three() {
        boolean[][] state=new boolean[30][30];
        for(int i=1;i<state.length;i++){
            for(int j=1;j<state[i].length-1;j++)
            {
                state[i][j] = false;
            }
        }
        Init_data init=new Init_data(state);
        init.init_two();
        assertEquals(state[2][2],true);// BUG 因为本测试代码的活细胞位置使随机生成的，所以直接判定为
        assertEquals(state[29][29],false);
    }


}