package com.example.lectoescritura.BaseDatos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class ClaseBaseDatos extends SQLiteOpenHelper {

    public ClaseBaseDatos(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase BaseDatos) {

        BaseDatos.execSQL("create table tb_simulacion(usuario text, score int, pregunta int, notafinal int)");
        BaseDatos.execSQL("create table tb_notas(nombre text, notafinal int)");

        BaseDatos.execSQL("create table tb_evaluacion1(usuario text, score int, pregunta int, notafinal int)");
        BaseDatos.execSQL("create table tb_notaseval1(nombre text, notafinal int)");

        BaseDatos.execSQL("create table tb_evaluacion2(usuario text, score int, pregunta int, notafinal int)");
        BaseDatos.execSQL("create table tb_notaseval2(nombre text, notafinal int)");

        BaseDatos.execSQL("create table tb_evaluacion3(usuario text, score int, pregunta int, notafinal int)");
        BaseDatos.execSQL("create table tb_notaseval3(nombre text, notafinal int)");

        BaseDatos.execSQL("create table tb_evaluacion4(usuario text, score int, pregunta int, notafinal int)");
        BaseDatos.execSQL("create table tb_notaseval4(nombre text, notafinal int)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
