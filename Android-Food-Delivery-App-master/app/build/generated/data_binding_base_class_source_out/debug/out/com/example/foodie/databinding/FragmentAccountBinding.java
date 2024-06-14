// Generated by data binding compiler. Do not edit!
package com.example.foodie.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.example.foodie.R;
import com.example.foodie.ui.adapter.AccountCardAdapter;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentAccountBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView rvAccountCard;

  @NonNull
  public final TextView tvAccountTitle;

  @Bindable
  protected AccountCardAdapter mAccountCardAdapter;

  protected FragmentAccountBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView rvAccountCard, TextView tvAccountTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.rvAccountCard = rvAccountCard;
    this.tvAccountTitle = tvAccountTitle;
  }

  public abstract void setAccountCardAdapter(@Nullable AccountCardAdapter accountCardAdapter);

  @Nullable
  public AccountCardAdapter getAccountCardAdapter() {
    return mAccountCardAdapter;
  }

  @NonNull
  public static FragmentAccountBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_account, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentAccountBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentAccountBinding>inflateInternal(inflater, R.layout.fragment_account, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentAccountBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_account, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentAccountBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentAccountBinding>inflateInternal(inflater, R.layout.fragment_account, null, false, component);
  }

  public static FragmentAccountBinding bind(@NonNull View view) {
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
  public static FragmentAccountBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentAccountBinding)bind(component, view, R.layout.fragment_account);
  }
}
