package com.example.foodie.room;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.foodie.data.entity.FavoriteFood;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class FavoriteFoodDao_Impl implements FavoriteFoodDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<FavoriteFood> __insertionAdapterOfFavoriteFood;

  private final EntityDeletionOrUpdateAdapter<FavoriteFood> __deletionAdapterOfFavoriteFood;

  public FavoriteFoodDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfFavoriteFood = new EntityInsertionAdapter<FavoriteFood>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `favorite_food` (`favorite_food_id`,`food_id`,`food_name`,`food_image_name`,`food_price`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @Nullable final FavoriteFood entity) {
        statement.bindLong(1, entity.getFavoriteFoodId());
        statement.bindLong(2, entity.getFoodId());
        if (entity.getFoodName() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getFoodName());
        }
        if (entity.getFoodImageName() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getFoodImageName());
        }
        statement.bindLong(5, entity.getFoodPrice());
      }
    };
    this.__deletionAdapterOfFavoriteFood = new EntityDeletionOrUpdateAdapter<FavoriteFood>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `favorite_food` WHERE `favorite_food_id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @Nullable final FavoriteFood entity) {
        statement.bindLong(1, entity.getFavoriteFoodId());
      }
    };
  }

  @Override
  public Object addFavoriteFood(final FavoriteFood favoriteFood,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfFavoriteFood.insert(favoriteFood);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteFavoriteFood(final FavoriteFood favoriteFood,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfFavoriteFood.handle(favoriteFood);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object loadFavoriteFood(final Continuation<? super List<FavoriteFood>> $completion) {
    final String _sql = "SELECT * FROM favorite_food ORDER BY food_name";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<FavoriteFood>>() {
      @Override
      @NonNull
      public List<FavoriteFood> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfFavoriteFoodId = CursorUtil.getColumnIndexOrThrow(_cursor, "favorite_food_id");
          final int _cursorIndexOfFoodId = CursorUtil.getColumnIndexOrThrow(_cursor, "food_id");
          final int _cursorIndexOfFoodName = CursorUtil.getColumnIndexOrThrow(_cursor, "food_name");
          final int _cursorIndexOfFoodImageName = CursorUtil.getColumnIndexOrThrow(_cursor, "food_image_name");
          final int _cursorIndexOfFoodPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "food_price");
          final List<FavoriteFood> _result = new ArrayList<FavoriteFood>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final FavoriteFood _item;
            final int _tmpFavoriteFoodId;
            _tmpFavoriteFoodId = _cursor.getInt(_cursorIndexOfFavoriteFoodId);
            final int _tmpFoodId;
            _tmpFoodId = _cursor.getInt(_cursorIndexOfFoodId);
            final String _tmpFoodName;
            if (_cursor.isNull(_cursorIndexOfFoodName)) {
              _tmpFoodName = null;
            } else {
              _tmpFoodName = _cursor.getString(_cursorIndexOfFoodName);
            }
            final String _tmpFoodImageName;
            if (_cursor.isNull(_cursorIndexOfFoodImageName)) {
              _tmpFoodImageName = null;
            } else {
              _tmpFoodImageName = _cursor.getString(_cursorIndexOfFoodImageName);
            }
            final int _tmpFoodPrice;
            _tmpFoodPrice = _cursor.getInt(_cursorIndexOfFoodPrice);
            _item = new FavoriteFood(_tmpFavoriteFoodId,_tmpFoodId,_tmpFoodName,_tmpFoodImageName,_tmpFoodPrice);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
