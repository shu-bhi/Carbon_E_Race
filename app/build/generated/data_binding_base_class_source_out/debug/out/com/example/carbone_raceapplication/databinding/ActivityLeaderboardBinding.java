// Generated by view binder compiler. Do not edit!
package com.example.carbone_raceapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.carbone_raceapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLeaderboardBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView boardtext;

  @NonNull
  public final Button createleague;

  @NonNull
  public final TextView eighthplace;

  @NonNull
  public final TextView error;

  @NonNull
  public final TextView fifthplace;

  @NonNull
  public final TextView firstplace;

  @NonNull
  public final Button foodButton4;

  @NonNull
  public final TextView fourthplace;

  @NonNull
  public final Button homeButton4;

  @NonNull
  public final Button joinleague;

  @NonNull
  public final EditText leaguename;

  @NonNull
  public final Button leaveleague;

  @NonNull
  public final Button rankButton4;

  @NonNull
  public final EditText room;

  @NonNull
  public final TextView secondplace;

  @NonNull
  public final Button settingsButton4;

  @NonNull
  public final TextView seventhplace;

  @NonNull
  public final TextView sixthplace;

  @NonNull
  public final TextView thirdplace;

  @NonNull
  public final Button travelButton4;

  private ActivityLeaderboardBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView boardtext, @NonNull Button createleague, @NonNull TextView eighthplace,
      @NonNull TextView error, @NonNull TextView fifthplace, @NonNull TextView firstplace,
      @NonNull Button foodButton4, @NonNull TextView fourthplace, @NonNull Button homeButton4,
      @NonNull Button joinleague, @NonNull EditText leaguename, @NonNull Button leaveleague,
      @NonNull Button rankButton4, @NonNull EditText room, @NonNull TextView secondplace,
      @NonNull Button settingsButton4, @NonNull TextView seventhplace, @NonNull TextView sixthplace,
      @NonNull TextView thirdplace, @NonNull Button travelButton4) {
    this.rootView = rootView;
    this.boardtext = boardtext;
    this.createleague = createleague;
    this.eighthplace = eighthplace;
    this.error = error;
    this.fifthplace = fifthplace;
    this.firstplace = firstplace;
    this.foodButton4 = foodButton4;
    this.fourthplace = fourthplace;
    this.homeButton4 = homeButton4;
    this.joinleague = joinleague;
    this.leaguename = leaguename;
    this.leaveleague = leaveleague;
    this.rankButton4 = rankButton4;
    this.room = room;
    this.secondplace = secondplace;
    this.settingsButton4 = settingsButton4;
    this.seventhplace = seventhplace;
    this.sixthplace = sixthplace;
    this.thirdplace = thirdplace;
    this.travelButton4 = travelButton4;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLeaderboardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLeaderboardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_leaderboard, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLeaderboardBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.boardtext;
      TextView boardtext = ViewBindings.findChildViewById(rootView, id);
      if (boardtext == null) {
        break missingId;
      }

      id = R.id.createleague;
      Button createleague = ViewBindings.findChildViewById(rootView, id);
      if (createleague == null) {
        break missingId;
      }

      id = R.id.eighthplace;
      TextView eighthplace = ViewBindings.findChildViewById(rootView, id);
      if (eighthplace == null) {
        break missingId;
      }

      id = R.id.error;
      TextView error = ViewBindings.findChildViewById(rootView, id);
      if (error == null) {
        break missingId;
      }

      id = R.id.fifthplace;
      TextView fifthplace = ViewBindings.findChildViewById(rootView, id);
      if (fifthplace == null) {
        break missingId;
      }

      id = R.id.firstplace;
      TextView firstplace = ViewBindings.findChildViewById(rootView, id);
      if (firstplace == null) {
        break missingId;
      }

      id = R.id.foodButton4;
      Button foodButton4 = ViewBindings.findChildViewById(rootView, id);
      if (foodButton4 == null) {
        break missingId;
      }

      id = R.id.fourthplace;
      TextView fourthplace = ViewBindings.findChildViewById(rootView, id);
      if (fourthplace == null) {
        break missingId;
      }

      id = R.id.homeButton4;
      Button homeButton4 = ViewBindings.findChildViewById(rootView, id);
      if (homeButton4 == null) {
        break missingId;
      }

      id = R.id.joinleague;
      Button joinleague = ViewBindings.findChildViewById(rootView, id);
      if (joinleague == null) {
        break missingId;
      }

      id = R.id.leaguename;
      EditText leaguename = ViewBindings.findChildViewById(rootView, id);
      if (leaguename == null) {
        break missingId;
      }

      id = R.id.leaveleague;
      Button leaveleague = ViewBindings.findChildViewById(rootView, id);
      if (leaveleague == null) {
        break missingId;
      }

      id = R.id.rankButton4;
      Button rankButton4 = ViewBindings.findChildViewById(rootView, id);
      if (rankButton4 == null) {
        break missingId;
      }

      id = R.id.room;
      EditText room = ViewBindings.findChildViewById(rootView, id);
      if (room == null) {
        break missingId;
      }

      id = R.id.secondplace;
      TextView secondplace = ViewBindings.findChildViewById(rootView, id);
      if (secondplace == null) {
        break missingId;
      }

      id = R.id.settingsButton4;
      Button settingsButton4 = ViewBindings.findChildViewById(rootView, id);
      if (settingsButton4 == null) {
        break missingId;
      }

      id = R.id.seventhplace;
      TextView seventhplace = ViewBindings.findChildViewById(rootView, id);
      if (seventhplace == null) {
        break missingId;
      }

      id = R.id.sixthplace;
      TextView sixthplace = ViewBindings.findChildViewById(rootView, id);
      if (sixthplace == null) {
        break missingId;
      }

      id = R.id.thirdplace;
      TextView thirdplace = ViewBindings.findChildViewById(rootView, id);
      if (thirdplace == null) {
        break missingId;
      }

      id = R.id.travelButton4;
      Button travelButton4 = ViewBindings.findChildViewById(rootView, id);
      if (travelButton4 == null) {
        break missingId;
      }

      return new ActivityLeaderboardBinding((ConstraintLayout) rootView, boardtext, createleague,
          eighthplace, error, fifthplace, firstplace, foodButton4, fourthplace, homeButton4,
          joinleague, leaguename, leaveleague, rankButton4, room, secondplace, settingsButton4,
          seventhplace, sixthplace, thirdplace, travelButton4);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
