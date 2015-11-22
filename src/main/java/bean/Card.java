package bean;

/**
 * Save the data of a game card.
 */
public class Card {

    private String name;
    private int grade;
    private String unitType;
    private String skill;
    private int power;
    private int critical;
    private int shield;
    private String nation;
    private String clan;
    private String race;
    private String trigger;
    private String boosterSet;
    private String boosterSetId;

    private String effect;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getBoosterSet() {
        return boosterSet;
    }

    public void setBoosterSet(String boosterSet) {
        this.boosterSet = boosterSet;
    }

    public String getBoosterSetId() {
        return boosterSetId;
    }

    public void setBoosterSetId(String boosterSetId) {
        this.boosterSetId = boosterSetId;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public int getCritical() {
        return critical;
    }

    public void setCritical(int critical) {
        this.critical = critical;
    }

    public int getShield() {
        return shield;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getClan() {
        return clan;
    }

    public void setClan(String clan) {
        this.clan = clan;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getTrigger() {
        return trigger;
    }

    public void setTrigger(String trigger) {
        this.trigger = trigger;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Card card = (Card) o;

        if (critical != card.critical) return false;
        if (grade != card.grade) return false;
        if (power != card.power) return false;
        if (shield != card.shield) return false;
        if (boosterSet != null ? !boosterSet.equals(card.boosterSet) : card.boosterSet != null) return false;
        if (boosterSetId != null ? !boosterSetId.equals(card.boosterSetId) : card.boosterSetId != null) return false;
        if (clan != null ? !clan.equals(card.clan) : card.clan != null) return false;
        if (name != null ? !name.equals(card.name) : card.name != null) return false;
        if (nation != null ? !nation.equals(card.nation) : card.nation != null) return false;
        if (race != null ? !race.equals(card.race) : card.race != null) return false;
        if (skill != null ? !skill.equals(card.skill) : card.skill != null) return false;
        if (trigger != null ? !trigger.equals(card.trigger) : card.trigger != null) return false;
        if (unitType != null ? !unitType.equals(card.unitType) : card.unitType != null) return false;
        if (effect != null ? !effect.equals(card.effect) : card.effect != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + grade;
        result = 31 * result + (unitType != null ? unitType.hashCode() : 0);
        result = 31 * result + (skill != null ? skill.hashCode() : 0);
        result = 31 * result + power;
        result = 31 * result + critical;
        result = 31 * result + shield;
        result = 31 * result + (nation != null ? nation.hashCode() : 0);
        result = 31 * result + (clan != null ? clan.hashCode() : 0);
        result = 31 * result + (race != null ? race.hashCode() : 0);
        result = 31 * result + (trigger != null ? trigger.hashCode() : 0);
        result = 31 * result + (boosterSet != null ? boosterSet.hashCode() : 0);
        result = 31 * result + (boosterSetId != null ? boosterSetId.hashCode() : 0);
        result = 31 * result + (effect != null ? effect.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", unitType='" + unitType + '\'' +
                ", skill='" + skill + '\'' +
                ", power=" + power +
                ", critical=" + critical +
                ", shield=" + shield +
                ", nation='" + nation + '\'' +
                ", clan='" + clan + '\'' +
                ", race='" + race + '\'' +
                ", trigger='" + trigger + '\'' +
                ", boosterSet='" + boosterSet + '\'' +
                ", boosterSetId='" + boosterSetId + '\'' +
                ", effect='" + effect + '\'' +
                '}';
    }

    public static class Builder {

        private Card card;

        public Builder() {
            card = new Card();
        }

        public Builder name(String name) {
            card.name = name;
            return this;
        }

        public Builder power(int power) {
            card.power = power;
            return this;
        }

        public Builder boosterSet(String boosterSet) {
            card.boosterSet = boosterSet;
            return this;
        }

        public Builder boosterSetId(String boosterSetId) {
            card.boosterSetId = boosterSetId;
            return this;
        }

        public Builder grade(int grade) {
            card.grade = grade;
            return this;
        }

        public Builder unitType(String unitType) {
            card.unitType = unitType;
            return this;
        }

        public Builder skill(String skill) {
            card.skill = skill;
            return this;
        }

        public Builder critical(int critical) {
            card.critical = critical;
            return this;
        }

        public Builder shield(int shield) {
            card.shield = shield;
            return this;
        }

        public Builder nation(String nation) {
            card.nation = nation;
            return this;
        }

        public Builder clan(String clan) {
            card.clan = clan;
            return this;
        }

        public Builder race(String race) {
            card.race = race;
            return this;
        }

        public Builder trigger(String trigger) {
            card.trigger = trigger;
            return this;
        }

        public Builder effect(String effect) {
            card.effect = effect;
            return this;
        }


        public Card build() {
            return card;
        }
    }
}
