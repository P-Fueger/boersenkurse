package de.kohnlehome;

public class MaxKursAnstiegFall implements IMaxKursAnstiegFall {
    private IBoersenReader boersenReader;

    public MaxKursAnstiegFall(IBoersenReader boersenReader) {
        this.boersenReader = boersenReader;
    }

    @Override
    public double maxKursanstieg(String aktienname, int jahr) {
        return 0;
    }

    @Override
    public double maxKursfall(String aktienname, int jahr) {
        return 0;
    }


}
