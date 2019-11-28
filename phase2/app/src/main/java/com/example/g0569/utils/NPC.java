package com.example.g0569.utils;

import com.example.g0569.base.model.BaseGame;
import com.example.g0569.base.model.Item;

public abstract class NPC extends Item {

  private String name;
  private int damage;
  private String power;
  private Coordinate throwDirection;
  private DoBehavior behavior;
  /**
   * Instantiates a new Item.
   *
   * @param game the game it corresponding to
   */
  public NPC(BaseGame game, String Name, DoBehavior behave) {
    super(game);
    this.name = Name;
    this.behavior = behave;
  }

  public String getName() {
    return name;
  }

  public int getDamage() {
    return damage;
  }

  public String getPower() {
    return power;
  }

  public Coordinate getThrowDirection() {
    return throwDirection;
  }

  /** Update */
  @Override
  public void update() {}

  public interface DoBehavior {
    void action();
  }
}
