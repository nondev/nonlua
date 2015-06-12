package com.mylua.project.android;

import android.app.Activity;
import android.os.Bundle;
import io.nondev.nonlua.Lua;
import io.nondev.nonlua.LuaConfiguration;
import io.nondev.nonlua.LuaLoader;
import com.mylua.project.MyLuaProject;

public class AndroidLauncher extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LuaConfiguration cfg = new LuaConfiguration();

        cfg.loader = new LuaLoader() {
            public String path() {
                return "assets";
            }
        };
        
        new MyLuaProject(cfg);
    }
}