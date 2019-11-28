package com.example.g0569.main;

import com.example.g0569.base.BasePresenter;
import com.example.g0569.base.BaseView;

public interface MainContract {
  interface View extends BaseView<Presenter> {}

  interface Presenter extends BasePresenter {}
}
