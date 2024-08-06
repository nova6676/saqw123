package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Ocean1 {
    // тут через аннотации над классом и полем

    @Autowired
    private Island2 island;

    @Override
    public String toString() {
        return "на океане остров " + island.toString();
    }
}
