package com.ohjiraffers.project02springtextrpggame.command.application.view;

import com.ohjiraffers.project02springtextrpggame.command.application.controller.FrontController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.ohjiraffers.project02springtextrpggame.command.application.controller");
        FrontController frontController = context.getBean("frontController", FrontController.class);

        frontController.gameStart();
    }
}
