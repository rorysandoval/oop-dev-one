package io.training.idp;

import java.util.HashMap;
import java.util.Map;

public class DIContainer {
    Map<String, Object> instances = new HashMap<>();


    public void initialize() {
        instances.put(DieselEngine.class.getSimpleName(), new DieselEngine());
        instances.put(ElectricalEngine.class.getSimpleName(), new ElectricalEngine());
        instances.put(GasolineEngine.class.getSimpleName(), new GasolineEngine());
    }

    public Object findOrCreateInstance(String name) {
        if (instances.containsKey(name))
            return instances.get(name);
        return createInstanceByName(name);
    }

    private Object createInstanceByName(String name) {
        return new DieselEngine(); // create the instance by the name of the class
    }

}
