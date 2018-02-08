package cn.winxo.mvp.library.mvp.base;

/**
 * Global: winxo
 * Date: 2016/8/25
 */
public abstract class BaseMainActivity extends BaseActivity {
  private long lastBackKeyDownTick = 0;
  private static final long MAX_DOUBLE_BACK_DURATION = 1500;

  @Override public void onBackPressed() {
    beforeOnBackPressed();
    long currentTick = System.currentTimeMillis();
    if (currentTick - lastBackKeyDownTick > MAX_DOUBLE_BACK_DURATION) {
      //            ToastUtils.getInstance().showToast("再按一次退出");
      lastBackKeyDownTick = currentTick;
    } else {
      finish();
      System.exit(0);
    }
  }

  protected void beforeOnBackPressed() {

  }
}