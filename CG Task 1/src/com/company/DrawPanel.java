package com.company;

import Elements.*;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    private final int TREEi = 5;
    private final int CLOUDi = 5;
    private final int SMOKEi = 10;
    private boolean called = false;
    private int width = 500, height = 500;
    private Sky sky;
    private Ground ground;
    private Sun sun;
    private Lake lake;
    private Home home;
    private BackgroundForest backgroundForest;
    private Trees trees;
    private Cloud cloud;
    private Smoke smoke;

    int[] TREExNumerator = new int[TREEi];
    int[] TREEyNumerator = new int[TREEi];
    int[] CLOUDxNumerator = new int[CLOUDi];
    int[] CLOUDyNumerator = new int[CLOUDi];
    int[] SMOKExNumerator = new int[SMOKEi];
    int[] SMOKEyNumerator = new int[SMOKEi];

    public int getTREEi(){
        return TREEi;
    }

    public int getCLOUDi(){ return CLOUDi; }

    public int getSMOKEi(){ return SMOKEi; }



    private void fillTreeArray(){
        for (int i = 0; i < TREEi; i++){
            TREExNumerator[i] = 10 + (int) (Math.random() * 40 );
            TREEyNumerator[i] = 35 + (int) (Math.random() * 27);
        }
    }

    private void fillCLoudArray(){
        for (int i = 0; i < CLOUDi; i++){
            CLOUDxNumerator[i] = 1 + (int) (Math.random() * 100);
            CLOUDyNumerator[i] = 1 + (int) (Math.random() * 23);
        }
    }

    private void fillSmokeArray(){
        for (int i = 0; i < SMOKEi; i++){
            SMOKExNumerator[i] = 63 + (int) (Math.random() * 15 );
            SMOKEyNumerator[i] = 1 + (int) (Math.random() * 27);
        }
    }

    private void Changes(Graphics g){
        width = getWidth();
        height = getHeight();

        sky = new Sky(height * 4 / 10, width, 0, 0);
        ground = new Ground(height, width, 0, height * 4 / 10);
        sun = new Sun(width * 8 / 10, height / 9, 25, 60, 50);
        lake = new Lake(height, width, width / 8, height * 7 / 10);
        home = new Home(height / 4, width / 3, width * 65 / 100, height * 45 / 100);
        backgroundForest = new BackgroundForest(height / 9, width, 0, height * 37 / 100);
        trees = new Trees(height, width, TREExNumerator, TREEyNumerator);
        cloud = new Cloud(height, width, CLOUDxNumerator, CLOUDyNumerator);
        smoke = new Smoke(height, width, SMOKExNumerator, SMOKEyNumerator);

        /////////////////////////////

        sky.draw((Graphics2D) g);
        backgroundForest.draw((Graphics2D) g);
        ground.draw((Graphics2D) g);
        sun.draw((Graphics2D) g);
        lake.draw((Graphics2D) g);
        cloud.draw((Graphics2D) g);
        trees.draw((Graphics2D) g);
        home.draw((Graphics2D) g);
        smoke.draw((Graphics2D) g);

    }





    @Override
    public void paint(Graphics g){
        if(!called) {
            this.called = true;
            fillTreeArray();
            fillCLoudArray();
            fillSmokeArray();
        }
        Changes(g);
    }
}