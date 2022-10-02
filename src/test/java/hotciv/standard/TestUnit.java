package hotciv.standard;

import hotciv.framework.*;

import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

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

    @Test
    public void unitCanHaveMovementChanged() {
        unit = new UnitImpl(GameConstants.SETTLER, Player.BLUE);
        assertThat(unit.getMoveCount(), is(1));
        unit.setMoveCount(0);
        assertThat(unit.getMoveCount(), is(0));
    }

    @Test
    public void archerShouldHave3Defense() {
        unit = new UnitImpl(GameConstants.ARCHER, Player.RED);
        assertThat(unit.getDefensiveStrength(), is(3));
    }

    @Test
    public void legionShouldHave2Defense() {
        unit = new UnitImpl(GameConstants.LEGION, Player.RED);
        assertThat(unit.getDefensiveStrength(), is(2));
    }

    @Test
    public void settlerShouldHave3Defense() {
        unit = new UnitImpl(GameConstants.SETTLER, Player.RED);
        assertThat(unit.getDefensiveStrength(), is(3));
    }

    @Test
    public void archerShouldHave2Attack() {
        unit = new UnitImpl(GameConstants.ARCHER, Player.RED);
        assertThat(unit.getAttackingStrength(), is(2));
    }

    @Test
    public void legionShouldHave4Attack() {
        unit = new UnitImpl(GameConstants.LEGION, Player.RED);
        assertThat(unit.getAttackingStrength(), is(4));
    }

    @Test
    public void settlerShouldHave0Attack() {
        unit = new UnitImpl(GameConstants.SETTLER, Player.RED);
        assertThat(unit.getAttackingStrength(), is(0));
    }
}
