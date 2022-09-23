package hotciv.standard;

import hotciv.framework.*;

import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.*;

public class TestUnit {
    private Unit unit;

    @Test
    public void unitTypeShouldBeArcher() {
        unit = new UnitImpl(GameConstants.ARCHER, Player.RED);
        assertThat(unit.getTypeString(), is(GameConstants.ARCHER));
    }

    @Test
    public void unitTypeShouldBeLegion() {
        unit = new UnitImpl(GameConstants.LEGION, Player.BLUE);
        assertThat(unit.getTypeString(), is(GameConstants.LEGION));
    }

    @Test
    public void unitTypeShouldBeSettler() {
        unit = new UnitImpl(GameConstants.SETTLER, Player.RED);
        assertThat(unit.getTypeString(), is(GameConstants.SETTLER));
    }

    @Test
    public void unitTypeShouldBelongToRed() {
        unit = new UnitImpl(GameConstants.SETTLER, Player.RED);
        assertThat(unit.getOwner(), is(Player.RED));
    }

    @Test
    public void unitTypeShouldBelongToBlue() {
        unit = new UnitImpl(GameConstants.SETTLER, Player.BLUE);
        assertThat(unit.getOwner(), is(Player.BLUE));
    }
}