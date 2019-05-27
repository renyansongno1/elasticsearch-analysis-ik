package org.wltea.analyzer.dic;

/**
 * @program: elasticsearch-analysis-ik
 * @description: 从mysql中定时获取新添加的词
 * @author: Renyansong
 * @create: 2019-05-25 22:48
 **/
public class HotDicReloadThread implements Runnable{

    @Override
    public void run() {
        while (true){
            Dictionary.getSingleton().reLoadMainDict();
        }
    }

}

    