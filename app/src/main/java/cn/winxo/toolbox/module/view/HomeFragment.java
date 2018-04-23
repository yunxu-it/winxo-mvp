package cn.winxo.toolbox.module.view;

import android.os.Bundle;
import cn.winxo.toolbox.R;
import cn.winxo.toolbox.base.BaseMvpFragment;
import cn.winxo.toolbox.module.conract.HomeContract;
import cn.winxo.toolbox.module.presenter.HomePresenter;

public class HomeFragment extends BaseMvpFragment<HomeContract.Presenter>
    implements HomeContract.View {

  public static HomeFragment newInstance() {
    return new HomeFragment();
  }

  @Override protected void init(Bundle savedInstanceState) {
    super.init(savedInstanceState);
  }

  @Override protected void initView() {

  }

  @Override protected void initData() {

  }

  @Override protected HomeContract.Presenter onLoadPresenter() {
    return new HomePresenter(getActivity());
  }

  @Override protected int setLayoutResourceID() {
    return R.layout.fragment_index;
  }
}
  
