package org.example.InMemoryModel;

import org.example.ModelElements.Camera;
import org.example.ModelElements.Flash;
import org.example.ModelElements.PoligonalModel;
import org.example.ModelElements.Scene;

import java.util.List;

public class ModelStore implements IModelChanger{
    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private List<IModelChangedObserver> changeObservers;

    public Scene getScene(int id) {
        return scenes.stream().filter(s -> s.id == id).findFirst().orElse(null);
    }

    @Override
    public void notifyChange(IModelChanger sender) {

    }
}
