package qianfeng.a5_3aidl_remoteserviceapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/*
* 服务端开发步骤：
 * 1.创建一个aidl文件夹，NEW->FOLDER->AIDL FOLDER
 * 2.创建一个AIDL 文件，两种创建方式：
 * 2.1 创建一个Java接口文件，删掉修饰符，将文件后缀名改为aidl
 * 2.2 NEW->AIDL->AIDL FILE
 * 3.rebuild project,检查是否生成对应的Java文件，app->build->generated->source->aidl->debug->
 * 4.创建一个Service，在Service中定义内部类继承自AIDL所生成的Java类中的Stub类，并实现该类中的方法
 * 5.在清单文件中注册Service，注意添加exported属性和action
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}
