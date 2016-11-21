package sk.upjs.ics.kopr.rest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChocolateDao {
    private List<Chocolate> chocolates = new ArrayList<Chocolate>();

    public ChocolateDao() {
        chocolates.add(new Chocolate("lindt", "Lindt", 72));
        chocolates.add(new Chocolate("choc-o-crap", "Choc'o'crap", 10));
        chocolates.add(new Chocolate("brownella", "Brownella", 52));
    }

    public Chocolate findById(String id) {
        for (final Chocolate chocolate : chocolates) {
            if(chocolate.getId().equals(id)) {
                return chocolate;
            }
        }
        return null;
    }

    public List<Chocolate> findAll() {
        return Collections.unmodifiableList(this.chocolates);
    }

    public void save(Chocolate chocolate) {
        this.chocolates.add(chocolate);
    }
}
