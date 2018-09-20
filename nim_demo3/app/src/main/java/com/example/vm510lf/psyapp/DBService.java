package com.example.vm510lf.psyapp;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * 连接数据库.
 */
public class DBService {

    private SQLiteDatabase db;

    //构造方法
    public DBService() {
        //连接数据库
        db = SQLiteDatabase.openDatabase("/data/data/com.example.vm510lf.psyapp/databases/question.db", null, SQLiteDatabase.OPEN_READWRITE);

    }

    //获取数据库的数据
    public List<Question2> getQuestion2() {
        List<Question2> list = new ArrayList<>();
        //执行sql语句
        Cursor cursor = db.rawQuery("select * from question", null);
        if (cursor.getCount() > 0) {
            cursor.moveToFirst();
            int count = cursor.getCount();
            //遍历
            for (int i = 0; i < count; i++) {
                cursor.moveToPosition(i);
                Question2 question = new Question2();
                //ID
                question.ID = cursor.getInt(cursor.getColumnIndex("ID"));
                //问题
                question.question = cursor.getString(cursor.getColumnIndex("question"));
                //四个选择
                question.answerA = cursor.getString(cursor.getColumnIndex("answerA"));
                question.answerB = cursor.getString(cursor.getColumnIndex("answerB"));
                question.answerC = cursor.getString(cursor.getColumnIndex("answerC"));
                question.answerD = cursor.getString(cursor.getColumnIndex("answerD"));

                //设置为没有选择任何选项
                question.selectedAnswer = -1;
                list.add(question);
            }
        }
        return list;

    }
}