package com.ohjiraffers.project02springtextrpggame.command.application.view;

import com.ohjiraffers.project02springtextrpggame.command.application.controller.FrontController;

public class Application {

    public static void main(String[] args) {

        FrontController frontController = new FrontController();
        frontController.gameStart();
    }
}
