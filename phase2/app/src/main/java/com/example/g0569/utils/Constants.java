package com.example.g0569.utils;

import com.example.g0569.R;

import java.util.HashMap;

public interface Constants {
  int TO_MENU_VIEW = 0;
  String TO_LOGIN_VIEW = "1";
  int TO_END_VIEW = 2;
  String TO_SIGNUP_VIEW = "3";
  int TO_BOSS_VIEW = 4;
  int TO_CHESS_VIEW = 5;
  int TO_MAZE_VIEW = 6;
  int END_GAME = 9;
  int TO_STATISTIC_VIEW = 7;

  int MazeGame = 10;
  int ChessGame = 11;
  int BossGame = 12;

  int AT_LEFT_BOUNDARY = 1;
  int AT_RIGHT_BOUNDARY = -1;
  int AT_TOP_BOUNDARY = 1;
  int AT_BOTTOM_BOUNDARY = -1;

  int GRID_WIDTH = 20;
  int GRID_HEIGHT = 20;

  int TO_DEMO_VIEW = 999;

  int NPC_NUM = 6;
  String starType = "star";
  String triangleType = "triangle";
  String circleType = "circle";


  String BUNDLE_USER_KEY = "BUNDLE_USER_KEY";
  String BUNDLE_INVENTORY_KEY = "BUNDLE_INVENTORY_KEY";
  String BUNDLE_SELECTEDNPC_KEY = "BUNDLE_SELECTEDNPC_KEY";

  HashMap<String, Integer> TYPELOOKUPMAP =
      new HashMap<String, Integer>() {
        {
          TYPELOOKUPMAP.put("type1", R.drawable.npc_l1);
          TYPELOOKUPMAP.put("type2", R.drawable.npc_l2);
          TYPELOOKUPMAP.put("type3", R.drawable.npc_l3);
          TYPELOOKUPMAP.put("type4", R.drawable.npc_l4);
          TYPELOOKUPMAP.put("type5", R.drawable.npc_l5);
          TYPELOOKUPMAP.put("type6", R.drawable.npc_l6);
        }
      };
}
