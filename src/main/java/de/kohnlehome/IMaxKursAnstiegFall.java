package de.kohnlehome;

public interface IMaxKursAnstiegFall {
    double maxKursanstieg(String aktiename, int jahr);

    double maxKursfall(String aktiename, int jahr);
}
