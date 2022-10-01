package hotciv.variants;

import hotciv.common.SettlerActionStrategy;
import hotciv.framework.City;
import hotciv.framework.Position;
import hotciv.framework.Unit;

import java.util.Map;

public class NoSettlerActionStrategy implements SettlerActionStrategy {

    @Override
    public void buildCity(Map<Position, City> city, Map<Position, Unit> units) {
        /*
        No action taken for this
         */
    }
    // TODO: Step 2, Implement AlphaCiv behavior here

}
