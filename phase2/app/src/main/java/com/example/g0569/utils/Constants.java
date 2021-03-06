package com.example.g0569.utils;

import com.example.g0569.R;

import java.util.HashMap;

public interface Constants {
  String TO_LOGIN_VIEW = "1";
  String TO_SIGNUP_VIEW = "3";

  int GRID_WIDTH = 20;
  int GRID_HEIGHT = 10;

  String STAR_TYPE = "type1";
  String TRIANGLE_TYPE = "type2";
  String CIRCLE_TYPE = "type3";
  String DIAMOND_TYPE = "type4";
  String HEART_TYPE = "type5";
  String SQUARE_TYPE = "type6";

  String BUNDLE_USER_KEY = "BUNDLE_USER_KEY";
  String BUNDLE_INVENTORY_KEY = "BUNDLE_INVENTORY_KEY";
  String BUNDLE_SELECTEDNPC_KEY = "BUNDLE_SELECTEDNPC_KEY";
  String CHESS_GAME_OVER = "CHESS_GAME_OVER";

  HashMap<String, Integer> NPCIMAGELOOKUPTABLE =
      new HashMap<String, Integer>() {
        {
          put("type1", R.drawable.npc_l1);
          put("type2", R.drawable.npc_l2);
          put("type3", R.drawable.npc_l3);
          put("type4", R.drawable.npc_l4);
          put("type5", R.drawable.npc_l5);
          put("type6", R.drawable.npc_l6);
        }
      };
  //
  HashMap<String, Integer> NONSELECTEDNPCIMAGELOOKUPTABLE =
      new HashMap<String, Integer>() {
        {
          put("type1", R.drawable.npc_l1_nonselected);
          put("type2", R.drawable.npc_l2_nonselected);
          put("type3", R.drawable.npc_l3_nonselected);
          put("type4", R.drawable.npc_l4_nonselected);
          put("type5", R.drawable.npc_l5_nonselected);
          put("type6", R.drawable.npc_l6_nonselected);
        }
      };

  String BUNDLE_SAVEGAME_KEY = "BUNDLE_SAVEGAME_KEY";
  int MAZETIMER = 90;
  String BUNDLE_BOSSSCORE_KEY = "BUNDLE_BOSSSCORE_KEY";
}
