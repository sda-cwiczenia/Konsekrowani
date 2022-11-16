package konsekrowani;

import java.time.LocalDate;

public class EtapWspolnotowy {
    private Etap nazwaEtapu;
    private LocalDate dataEtapu;

    public EtapWspolnotowy(Etap nazwaEtapu, int year, int month, int day) {
        this.nazwaEtapu = nazwaEtapu;
        dataEtapu = LocalDate.of(year, month, day);
    }

    public Etap getNazwaEtapu() {
        return nazwaEtapu;
    }

    public LocalDate getDataEtapu() {
        return dataEtapu;
    }

    @Override
    public String toString() {
        return nazwaEtapu.name() + " " + dataEtapu; //w enumie metoda name jest domyslna


    }


}



