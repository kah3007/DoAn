// Generated by data binding compiler. Do not edit!
package com.example.foodie.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.foodie.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class AccountCardBinding extends ViewDataBinding {
  @NonNull
  public final CardView cardViewAccount;

  @NonNull
  public final ImageView ivAccountCard;

  @NonNull
  public final ImageView ivAccountCardRight;

  @NonNull
  public final TextView tvAccountCard;

  @Bindable
  protected String mItemTitle;

  protected AccountCardBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CardView cardViewAccount, ImageView ivAccountCard, ImageView ivAccountCardRight,
      TextView tvAccountCard) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cardViewAccount = cardViewAccount;
    this.ivAccountCard = ivAccountCard;
    this.ivAccountCardRight = ivAccountCardRight;
    this.tvAccountCard = tvAccountCard;
  }

  public abstract void setItemTitle(@Nullable String itemTitle);

  @Nullable
  public String getItemTitle() {
    return mItemTitle;
  }

  @NonNull
  public static AccountCardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.account_card, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static AccountCardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<AccountCardBinding>inflateInternal(inflater, R.layout.account_card, root, attachToRoot, component);
  }

  @NonNull
  public static AccountCardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.account_card, null, false, component)
   */
  @NonNull
  @Deprecated
  public static AccountCardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<AccountCardBinding>inflateInternal(inflater, R.layout.account_card, null, false, component);
  }

  public static AccountCardBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static AccountCardBinding bind(@NonNull View view, @Nullable Object component) {
    return (AccountCardBinding)bind(component, view, R.layout.account_card);
  }
}
