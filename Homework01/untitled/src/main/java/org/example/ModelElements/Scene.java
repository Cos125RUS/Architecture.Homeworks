package org.example.ModelElements;

import java.lang.reflect.Type;
import java.util.List;

public class Scene {
    public int id;
    public List<PoligonalModel> models;
    public List<Flash> flashes;
    public List<Camera> cameras;

    public Scene(List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) {
        this.models = models;
        this.flashes = flashes;
        this.cameras = cameras;
    }

    public Type method1(Type type){
//        TODO: Какая-то логика
        return type;
    }

    public Type method2(Type type1, Type type2) {
//        TODO: Какая-то логика
        return type1;
    }
}
