package com.example.g0569.chessgame;

import com.example.g0569.base.BasePresenter;
import com.example.g0569.base.BaseView;
import com.example.g0569.chessgame.model.ChessPiece;
import com.example.g0569.utils.Coordinate;

import java.util.List;

public interface ChessContract {
  interface View extends BaseView<Presenter> {
    void initView();

    void drawChessPiece(Coordinate coordinate, String type);
  }

  interface Presenter extends BasePresenter {
//    void drawChessPiece(ChessPiece chessPiece);
    void drawChessPiece();

    boolean startAutoFight();

    Coordinate boardCoordinateToViewCoordinate(Coordinate coordinate);

    void placePlayerChess(Coordinate coordinate, String type);

    String InventoryCoordinateToChessType(Coordinate coordinate);

    Coordinate viewCoordinateToInventoryCoordinate(Coordinate coordinate);

    Coordinate viewCoordinateToBoardCoordinate(Coordinate coordinate);
  }
}
