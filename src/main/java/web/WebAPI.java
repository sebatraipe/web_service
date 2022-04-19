package web;

import io.javalin.Javalin;
import io.javalin.http.Handler;
import model.Curso;
import model.Estudiante;
import model.EstudianteException;
import servicios.Cursos;
import servicios.Estudiantes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class WebAPI {

    private Estudiantes estudiantes;
    private Cursos cursos;
    private int webPort;

    public WebAPI(Estudiantes estudiantes, Cursos cursos, int webPort) {
        this.estudiantes = estudiantes;
        this.cursos = cursos;
        this.webPort = webPort;
    }

    public void start() {
        Javalin app = Javalin.create(config -> {
            config.enableCorsForAllOrigins();
        }).start(this.webPort);
        app.get("/estudiantes", traerEstudiantes());
        app.get("/cursos", traerCursos());

        app.exception(EstudianteException.class, (e, ctx) -> {
            ctx.json(Map.of("result", "error", "message", e.getMessage()));
            // log error in a stream...
        });

        app.exception(Exception.class, (e, ctx) -> {
            ctx.json(Map.of("result", "error", "message", "Ups... algo se rompió.: " + e.getMessage()));
            // log error in a stream...
        });
    }

    private Handler traerCursos() {
        return ctx -> {
            var cursos = this.cursos.cursos();
            var list = new ArrayList<Map<String, Object>>();
            for (Curso c : cursos) {
                list.add(c.toMap());
            }
            ctx.json(Map.of("result", "success", "cursos", list));
        };
    }

    private Handler traerEstudiantes() {
        return ctx -> {
            String id = ctx.queryParam("id");
            List<Estudiante> estudiante = this.estudiantes.estudiantes(id);
            var list = new ArrayList<Map<String, Object>>();
            for (Estudiante e : estudiante) {
                list.add(e.toMap());
            }
            ctx.json(Map.of("result", "success", "estudiantes", list));
        };
    }
}