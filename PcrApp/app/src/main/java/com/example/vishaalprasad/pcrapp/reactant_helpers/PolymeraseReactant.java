package com.example.vishaalprasad.pcrapp.reactant_helpers;

import android.content.res.Resources;

import com.example.vishaalprasad.pcrapp.R;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Polymerase Reactant in PCR
 * Typical Concentration reactant except Polymerase allows the custom unit "units per reaction"
 */
public class PolymeraseReactant extends ConcentrationReactant implements Serializable {

    @Override
    public List<? extends UnitHelper.Unit> getPossibleUnits() {
        List<UnitHelper.Unit> possibleUnits = new ArrayList<>();
        possibleUnits.addAll(super.getPossibleUnits());
        possibleUnits.addAll(Arrays.asList(PolymeraseUnit.values()));
        return possibleUnits;
    }

    @Override
    double getFinalValueInMicroMolar(ReactionVolume reactionVolume)
            throws MissingStockConcentrationException, UnitMismatchException {

        if (getUnit() instanceof PolymeraseUnit) {

            if (getStockConcentration() == null) {
                throw new MissingStockConcentrationException(this);
            }

            if (!(getStockConcentration().getUnit() instanceof PolymeraseStockConcUnit)) {
                throw new UnitMismatchException();
            }

            return getAmount() / getStockConcentration().getAmount();

        } else return super.getFinalValueInMicroMolar(reactionVolume);
    }

    @Override
    public String getName(Resources res) {
        return res.getString(R.string.polymerase);
    }

    @Override
    public List<? extends UnitHelper.Unit> getPossibleStockConcUnits() {

        if (getUnit() == PolymeraseUnit.UNIT_PER_REACTION) {
            return Arrays.asList(PolymeraseStockConcUnit.UNITS_PER_MICROLITER);
        } else {
            return super.getPossibleStockConcUnits();
        }
    }

    enum PolymeraseUnit implements UnitHelper.Unit {UNIT_PER_REACTION;

        @Override
        public String getDisplayName(Resources res) {
            return res.getString(R.string.unit_per_reaction);
        }
    }

    enum PolymeraseStockConcUnit implements UnitHelper.Unit {UNITS_PER_MICROLITER;

        @Override
        public String getDisplayName(Resources res) {
            return res.getString(R.string.unit_per_microliter);
        }
    }
}
