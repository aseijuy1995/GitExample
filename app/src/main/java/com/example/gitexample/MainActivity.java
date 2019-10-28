package com.example.gitexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //入門
        //查看個人設定 git config --list
        //設定痊癒使用者名稱 git config --global user.name "XXX"
        //設定痊癒使用者郵件 git config --global user.email "xxx@gmail.com"
        //取得說明 git <verb> --help
        /***Git更新(Window) git update-git-for-windows***/
        //取得git安裝路徑(Window) where git

        //Git基礎
        //初始化專案 git init
        //追蹤檔案 git add (git add . / git add --all)追蹤所有已有add過的檔案
        //複製遠端專案 git clone https://github.com/aseijuy1995/GitExample.git
        //複製遠端專案並重新命名專案 git clone https://github.com/aseijuy1995/GitExample.git GitProject
        //檢查目前檔案狀態 git status
        //未追蹤過的檔案 Untracked files
        //等逮遞交的更改 Changes to be committed
        //已更改但未增加到暫存區 Changes not staged for commit
        //簡潔顯示狀態資訊 git status -s
            //左邊表示已暫存,右邊表示已修改
            //未追蹤過 ??
            //已暫存的新檔案 A_
            //已暫存過的檔案 M_
            //已修改尚未暫存 _M
            //已修改已暫存,並且又有修改過 MM
        //檢視亦暫存和未暫存的變更 git diff
        //檢視與上一次遞交與暫存內容的差異 git diff --staged
        //遞交變更 git commit -m ""
        //跳過暫存區將以修改過的檔案遞交變更 git commit -am ""
        //移除檔案 git rm
        //移動檔案 git mv 'file_go' 'file_to'
        





    }
}
