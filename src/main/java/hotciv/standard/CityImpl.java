package hotciv.standard;

import hotciv.framework.GameConstants;
import hotciv.framework.MutableCity;
import hotciv.framework.Player;

public class CityImpl implements MutableCity {

  public CityImpl(Player owner) {
    this.owner = owner;
    treasury = 0;
    production = "";
  }

  Player owner;
  int treasury;
  String production;

  @Override
  public Player getOwner() {
    return owner;
  }

  @Override
  public int getSize() {
    return 1;
  }

  @Override
  public int getTreasury() {
    return treasury;
  }

  @Override
  public String getProduction() {
    return production;
  }

  @Override
  public String getWorkforceFocus() {
    return null;
  }

  public void setOwner(Player player) {
    owner = player;
  }

  public void setProduction(String unitType) {
    production = unitType;
  }

  public void fillTreasury() {
    treasury += 6;
  }

  public boolean unitCostMet() {
    if (production.equals(GameConstants.ARCHER) && treasury >= 10) {
      return true;
    } else if (production.equals(GameConstants.LEGION) && treasury >= 15) {
      return true;
    } else if (production.equals(GameConstants.SETTLER) && treasury >= 30) {
      return true;
    } else {
      return false;
    }
  }

  public void produceUnit() {
    if (production.equals(GameConstants.ARCHER)) {
      treasury -= 10;
    } else if (production.equals(GameConstants.LEGION)) {
      treasury -= 15;
    } else if (production.equals(GameConstants.SETTLER)) {
      treasury -= 30;
    }
  }
}