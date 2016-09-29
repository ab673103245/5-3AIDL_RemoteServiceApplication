package qianfeng.a5_3aidl_remoteserviceapplication;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.util.Log;

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
public class MyService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return new MyBinder(); // 传给绑定式Service客户端的是这个new MyBinder()对象
    }

    class MyBinder extends MyAIDL.Stub { // 服务端的一个内部类继承了Stub的抽象类，里面有个抽象方法add，在继承抽象类的过程中，重写这个add方法即可

        @Override
        public int add(int a, int b) throws RemoteException { // 这个add方法将会被绑定它的客户端使用
            Log.d("google-my:", "add: a:" + a + ";b:" + b);
            return a + b;
        }
    }

}
