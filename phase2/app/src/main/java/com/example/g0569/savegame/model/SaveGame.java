package com.example.g0569.savegame.model;

import com.example.g0569.utils.Inventory;
import com.example.g0569.utils.Utils;

import java.util.Date;

public class SaveGame {
  private Date createdTime;
  private int saveId;
  private int progress;
  private int uid;
  private Inventory inventory;
  private boolean isNewGame;

  public SaveGame(Date createdTime, int saveId, int progress, String inventoryData, int uid) {
    this.createdTime = createdTime;
    this.saveId = saveId;
    this.progress = progress;
    this.uid = uid;
    this.isNewGame = false;
  }

  public SaveGame(Date createdTime, int saveId, int progress, int uid, boolean isNewGame) {
    this.createdTime = createdTime;
    this.saveId = saveId;
    this.progress = progress;
    this.uid = uid;
    this.isNewGame = isNewGame;
  }

  public Date getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Date createdTime) {
    this.createdTime = createdTime;
  }

  public int getSaveId() {
    return saveId;
  }

  public void setSaveId(int saveId) {
    this.saveId = saveId;
  }

  public Inventory getInventory() {
    return inventory;
  }

  public void setInventory(Inventory inventory) {
    this.inventory = inventory;
  }

  public String getStringInventory() {
    String serializedInventory = null;
    try {
      serializedInventory = Utils.serializeToString(this);
    } catch (Exception e) {
      e.printStackTrace();
    }
    finally{
      return serializedInventory;
    }
  }

  public int getProgress() {
    return progress;
  }

  public void setProgress(int progress) {
    this.progress = progress;
  }

  public int getUid() {
    return uid;
  }

  public boolean isNewGame() {
    return isNewGame;
  }

  public void setNewGame(boolean newGame) {
    isNewGame = newGame;
  }
}