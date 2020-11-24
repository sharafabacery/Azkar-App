package com.bayoumi.util.gui;

import com.bayoumi.util.Utilities;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.util.HashMap;

public class HelperMethods {
    public static void ExitKeyCodeCombination(Scene scene, Stage stage) {
        HashMap<KeyCombination, Runnable> hashMap = new HashMap<>();
        // CTRL + Q
        KeyCombination kc1 = new KeyCodeCombination(KeyCode.Q, KeyCombination.CONTROL_DOWN);
        Runnable rn1 = () -> {
            Utilities.exitProgramAction();
            stage.close();
        };
        hashMap.put(kc1, rn1);
        scene.getAccelerators().putAll(hashMap);
    }

    public static void setStageToBottom(Stage s, double w, double h) {
        Rectangle2D bounds = Screen.getPrimary().getVisualBounds();
        s.setX(bounds.getWidth() - (w));
        s.setY(bounds.getHeight() - (h));
    }

    public static void SetAppDecoration(Stage stage) {
        stage.setTitle("Azkar");
        SetIcon(stage);
    }

    public static void SetIcon(Stage stage) {
        stage.getIcons().clear();
        stage.getIcons().add(new Image("/com/bayoumi/images/icon.png"));
    }
}