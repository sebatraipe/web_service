package main;

import io.javalin.Javalin;
import jdbc.JdbcCursos;
import jdbc.JdbcEstudiantes;
import web.WebAPI;

public class Main {
    public static void main(String[] args) {
        WebAPI service = new WebAPI(new JdbcEstudiantes(), new JdbcCursos(), 1234);
        service.start();
    }
}