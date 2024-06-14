package com.example.foodie;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.foodie.databinding.AccountCardBindingImpl;
import com.example.foodie.databinding.CartCardBindingImpl;
import com.example.foodie.databinding.FavoriteCardBindingImpl;
import com.example.foodie.databinding.FoodCardBindingImpl;
import com.example.foodie.databinding.FragmentAccountBindingImpl;
import com.example.foodie.databinding.FragmentAccountDetailBindingImpl;
import com.example.foodie.databinding.FragmentCartBindingImpl;
import com.example.foodie.databinding.FragmentFavoritesBindingImpl;
import com.example.foodie.databinding.FragmentHomePageBindingImpl;
import com.example.foodie.databinding.FragmentLoginBindingImpl;
import com.example.foodie.databinding.FragmentProductDetailBindingImpl;
import com.example.foodie.databinding.FragmentSignUpBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACCOUNTCARD = 1;

  private static final int LAYOUT_CARTCARD = 2;

  private static final int LAYOUT_FAVORITECARD = 3;

  private static final int LAYOUT_FOODCARD = 4;

  private static final int LAYOUT_FRAGMENTACCOUNT = 5;

  private static final int LAYOUT_FRAGMENTACCOUNTDETAIL = 6;

  private static final int LAYOUT_FRAGMENTCART = 7;

  private static final int LAYOUT_FRAGMENTFAVORITES = 8;

  private static final int LAYOUT_FRAGMENTHOMEPAGE = 9;

  private static final int LAYOUT_FRAGMENTLOGIN = 10;

  private static final int LAYOUT_FRAGMENTPRODUCTDETAIL = 11;

  private static final int LAYOUT_FRAGMENTSIGNUP = 12;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(12);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.foodie.R.layout.account_card, LAYOUT_ACCOUNTCARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.foodie.R.layout.cart_card, LAYOUT_CARTCARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.foodie.R.layout.favorite_card, LAYOUT_FAVORITECARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.foodie.R.layout.food_card, LAYOUT_FOODCARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.foodie.R.layout.fragment_account, LAYOUT_FRAGMENTACCOUNT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.foodie.R.layout.fragment_account_detail, LAYOUT_FRAGMENTACCOUNTDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.foodie.R.layout.fragment_cart, LAYOUT_FRAGMENTCART);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.foodie.R.layout.fragment_favorites, LAYOUT_FRAGMENTFAVORITES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.foodie.R.layout.fragment_home_page, LAYOUT_FRAGMENTHOMEPAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.foodie.R.layout.fragment_login, LAYOUT_FRAGMENTLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.foodie.R.layout.fragment_product_detail, LAYOUT_FRAGMENTPRODUCTDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.foodie.R.layout.fragment_sign_up, LAYOUT_FRAGMENTSIGNUP);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACCOUNTCARD: {
          if ("layout/account_card_0".equals(tag)) {
            return new AccountCardBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for account_card is invalid. Received: " + tag);
        }
        case  LAYOUT_CARTCARD: {
          if ("layout/cart_card_0".equals(tag)) {
            return new CartCardBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for cart_card is invalid. Received: " + tag);
        }
        case  LAYOUT_FAVORITECARD: {
          if ("layout/favorite_card_0".equals(tag)) {
            return new FavoriteCardBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for favorite_card is invalid. Received: " + tag);
        }
        case  LAYOUT_FOODCARD: {
          if ("layout/food_card_0".equals(tag)) {
            return new FoodCardBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for food_card is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTACCOUNT: {
          if ("layout/fragment_account_0".equals(tag)) {
            return new FragmentAccountBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_account is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTACCOUNTDETAIL: {
          if ("layout/fragment_account_detail_0".equals(tag)) {
            return new FragmentAccountDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_account_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCART: {
          if ("layout/fragment_cart_0".equals(tag)) {
            return new FragmentCartBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_cart is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFAVORITES: {
          if ("layout/fragment_favorites_0".equals(tag)) {
            return new FragmentFavoritesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_favorites is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOMEPAGE: {
          if ("layout/fragment_home_page_0".equals(tag)) {
            return new FragmentHomePageBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home_page is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLOGIN: {
          if ("layout/fragment_login_0".equals(tag)) {
            return new FragmentLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_login is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPRODUCTDETAIL: {
          if ("layout/fragment_product_detail_0".equals(tag)) {
            return new FragmentProductDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_product_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSIGNUP: {
          if ("layout/fragment_sign_up_0".equals(tag)) {
            return new FragmentSignUpBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_sign_up is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(26);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "accountCardAdapter");
      sKeys.put(2, "accountDetailFragment");
      sKeys.put(3, "accountDetailTitle");
      sKeys.put(4, "cartCardAdapter");
      sKeys.put(5, "cartFoodObject");
      sKeys.put(6, "cartFragment");
      sKeys.put(7, "currentText");
      sKeys.put(8, "favoriteCardAdapter");
      sKeys.put(9, "favoriteFoodObject");
      sKeys.put(10, "foodCardAdapter");
      sKeys.put(11, "foodObject");
      sKeys.put(12, "hasFavoriteItem");
      sKeys.put(13, "hintText");
      sKeys.put(14, "isErrorEnabled");
      sKeys.put(15, "isPassword");
      sKeys.put(16, "isSignUp");
      sKeys.put(17, "itemTitle");
      sKeys.put(18, "loginFragment");
      sKeys.put(19, "loginStatus");
      sKeys.put(20, "passwordEyeDrawable");
      sKeys.put(21, "productDetailFragment");
      sKeys.put(22, "signUpFragment");
      sKeys.put(23, "totalPrice");
      sKeys.put(24, "username");
      sKeys.put(25, "visibilityAction");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(12);

    static {
      sKeys.put("layout/account_card_0", com.example.foodie.R.layout.account_card);
      sKeys.put("layout/cart_card_0", com.example.foodie.R.layout.cart_card);
      sKeys.put("layout/favorite_card_0", com.example.foodie.R.layout.favorite_card);
      sKeys.put("layout/food_card_0", com.example.foodie.R.layout.food_card);
      sKeys.put("layout/fragment_account_0", com.example.foodie.R.layout.fragment_account);
      sKeys.put("layout/fragment_account_detail_0", com.example.foodie.R.layout.fragment_account_detail);
      sKeys.put("layout/fragment_cart_0", com.example.foodie.R.layout.fragment_cart);
      sKeys.put("layout/fragment_favorites_0", com.example.foodie.R.layout.fragment_favorites);
      sKeys.put("layout/fragment_home_page_0", com.example.foodie.R.layout.fragment_home_page);
      sKeys.put("layout/fragment_login_0", com.example.foodie.R.layout.fragment_login);
      sKeys.put("layout/fragment_product_detail_0", com.example.foodie.R.layout.fragment_product_detail);
      sKeys.put("layout/fragment_sign_up_0", com.example.foodie.R.layout.fragment_sign_up);
    }
  }
}
