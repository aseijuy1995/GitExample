package com.example.gitexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //chg not staged for commit
        //chg to be committed
        //git diff
        //git diff --staged (only show is add file)
        //git commit
        //git commit -a
        //git mv (renamed)
        //git log
        //git log -p -1
        //git log --stat
        //git log --pretty=format:"%h - %ar : %s"
        //%H 遞交物件的雜湊值
        //%h 遞交物件的簡短雜湊值
        //%T 樹物件的雜湊值
        //%t 樹物件的簡短雜湊值
        //%P 父物件的雜湊值
        //%p 父物件的簡短雜湊值
        //%an 作者名字
        //%ae 作者email
        //%ad 創作日期(可使用-date指定日期格式)
        //%ar 相對於目前日期的創作日期
        //%cn 遞交者名字
        //%cn 遞交者email
        //%cd 遞交日期
        //%cr 相對於目前日期的遞交日期
        //%s 遞交資訊主題
        //git log --shortstat
        //git log --name-only
        //git log --name-status
        //git log --abbrev-commit
        //git log --relative-date
        //git log --oneline --graph
        //git log --since=1.days
        //git log --author=Jie
        //git log --author=Jie
        //git log --grep=commit
        //git log --author=Jie --grep=commit --all-match
        //git log -Smv
        //--util, --after
        //--committer
        //--amend
        //git reset head <file>
        //git checkout -- <file>
        //git remote
        //git remote -v
        //git remote add <shortname> <url>
        //git fetch <remote-name>
        //git push origin master
        //git remote show origin
        //git remote rename origin2 origin2-2
        //git tag -l "v1.0.0"
        //git show v1.0.0
        //git tag -a v1.0.1 -m "v1.0.1" 798378d
        //git checkout -b master2 v1.0.2
        //git config --global alias.cm commit
        //git k
        //git branch master2
        //git log --oneline --decorate
        //git checkout master2
        //git commit in master branch
        //git log --oneline --graph --all
        //git checkout -b master3
        //git commit in master2 branch
        //git merge master2
        //git branch -d master3
        //git branch
        //git branch -v
        //git branch --merged
        //git branch --no-merged
        //git branch -D master2
        //git config --global credential.helper cache
    }
}
