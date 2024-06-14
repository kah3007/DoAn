// Generated by data binding compiler. Do not edit!
package com.example.foodie.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.foodie.R;
import com.example.foodie.data.entity.CartFood;
import com.example.foodie.ui.fragment.ProductDetailFragment;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentProductDetailBinding extends ViewDataBinding {
  @NonNull
  public final Button buttonDetailAddCart;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final ImageView ivDetailBackButton;

  @NonNull
  public final ImageView ivDetailDecrease;

  @NonNull
  public final ImageView ivDetailFavoriteButton;

  @NonNull
  public final ImageView ivDetailFood;

  @NonNull
  public final ImageView ivDetailIncrease;

  @NonNull
  public final ImageView ivDetailStar;

  @NonNull
  public final ImageView ivDetailTime;

  @NonNull
  public final TextView tvDetailCargo;

  @NonNull
  public final TextView tvDetailFoodName;

  @NonNull
  public final TextView tvDetailPrice;

  @NonNull
  public final TextView tvDetailQuantity;

  @NonNull
  public final TextView tvDetailStar;

  @NonNull
  public final TextView tvDetailTime;

  @NonNull
  public final TextView tvDetailTitle;

  @Bindable
  protected ProductDetailFragment mProductDetailFragment;

  @Bindable
  protected CartFood mCartFoodObject;

  protected FragmentProductDetailBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button buttonDetailAddCart, CardView cardView, ImageView ivDetailBackButton,
      ImageView ivDetailDecrease, ImageView ivDetailFavoriteButton, ImageView ivDetailFood,
      ImageView ivDetailIncrease, ImageView ivDetailStar, ImageView ivDetailTime,
      TextView tvDetailCargo, TextView tvDetailFoodName, TextView tvDetailPrice,
      TextView tvDetailQuantity, TextView tvDetailStar, TextView tvDetailTime,
      TextView tvDetailTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.buttonDetailAddCart = buttonDetailAddCart;
    this.cardView = cardView;
    this.ivDetailBackButton = ivDetailBackButton;
    this.ivDetailDecrease = ivDetailDecrease;
    this.ivDetailFavoriteButton = ivDetailFavoriteButton;
    this.ivDetailFood = ivDetailFood;
    this.ivDetailIncrease = ivDetailIncrease;
    this.ivDetailStar = ivDetailStar;
    this.ivDetailTime = ivDetailTime;
    this.tvDetailCargo = tvDetailCargo;
    this.tvDetailFoodName = tvDetailFoodName;
    this.tvDetailPrice = tvDetailPrice;
    this.tvDetailQuantity = tvDetailQuantity;
    this.tvDetailStar = tvDetailStar;
    this.tvDetailTime = tvDetailTime;
    this.tvDetailTitle = tvDetailTitle;
  }

  public abstract void setProductDetailFragment(
      @Nullable ProductDetailFragment productDetailFragment);

  @Nullable
  public ProductDetailFragment getProductDetailFragment() {
    return mProductDetailFragment;
  }

  public abstract void setCartFoodObject(@Nullable CartFood cartFoodObject);

  @Nullable
  public CartFood getCartFoodObject() {
    return mCartFoodObject;
  }

  @NonNull
  public static FragmentProductDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_product_detail, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentProductDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentProductDetailBinding>inflateInternal(inflater, R.layout.fragment_product_detail, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentProductDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_product_detail, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentProductDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentProductDetailBinding>inflateInternal(inflater, R.layout.fragment_product_detail, null, false, component);
  }

  public static FragmentProductDetailBinding bind(@NonNull View view) {
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
  public static FragmentProductDetailBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentProductDetailBinding)bind(component, view, R.layout.fragment_product_detail);
  }
}