package es.dws.JVBt03e02.service;

import java.util.List;

import org.springframework.stereotype.Service;

import es.dws.JVBt03e02.model.Palmares;

/**
 * PalmaresServiceImpl
 */
@Service
public class PalmaresServiceImpl implements PalmaresService {

    @Override
    public List<Palmares> getPalmares() {
        return List.of(
            Palmares.builder()
                .year(1989)
                .award("Premio Grammy por Mejor Interpretación Metal")
                .note("Por 'One'")
                .build(),
            Palmares.builder()
                .year(1991)
                .award("Premio Grammy por Mejor Interpretación Metal")
                .note("Por 'Stone Cold Crazy'")
                .build(),
            Palmares.builder()
                .year(1992)
                .award("Premio Grammy por Mejor Interpretación Metal")
                .note("Por Metallica (The Black Album)")
                .build(),
            Palmares.builder()
                .year(1992)
                .award("MTV Video Music Awards: Mejor Video musical")
                .note("Por 'Enter Sandman'")
                .build(),
            Palmares.builder()
                .year(1996)
                .award("MTV Video Music Awards: Mejor Video musical")
                .note("Por 'Until it Sleeps'")
                .build(),
            Palmares.builder()
                .year(1996)
                .award("American Music Awards: Canción Metal favorita")
                .note("'Until it Sleeps'")
                .build(),
            Palmares.builder()
                .year(1996)
                .award("American Music Awards: Artista Heavy Metal favorito")
                .note("ReLoad")
                .build(),
            Palmares.builder()
                .year(1997)
                .award("Billboard Music Awards")
                .note("Artista del año: Metallica (RIAA Diamond Award)")
                .build(),
            Palmares.builder()
                .year(1999)
                .award("Premio Grammy por Mejor Interpretación Metal")
                .note("Por 'Better than You'")
                .build(),
            Palmares.builder()
                .year(2000)
                .award("Premio Grammy por Mejor Interpretación Hard Rock")
                .note("Por 'Whiskey in the Jar'")
                .build(),
            Palmares.builder()
                .year(2001)
                .award("Premio Grammy por Mejor interpretación Rock instrumental")
                .note("Por 'The Call of Ktulu' (S&M)")
                .build(),
            Palmares.builder()
                .year(2003)
                .award("Premios Kerrang!")
                .note("Paseo de la fama")
                .build(),
            Palmares.builder()
                .year(2004)
                .award("Premio Grammy por Mejor Interpretación Metal")
                .note("Por 'St. Anger'")
                .build(),
            Palmares.builder()
                .year(2004)
                .award("Premios Governor")
                .note("Governor's Award - Metallica")
                .build(),
            Palmares.builder()
                .year(2009)
                .award("Premio Grammy por Mejor Interpretación Metal")
                .note("Por 'My Apocalypse'")
                .build(),
            Palmares.builder()
                .year(2009)
                .award("Premio Grammy por Mejor diseño artístico")
                .note("Por Death Magnetic")
                .build(),
            Palmares.builder()
                .year(2017)
                .award("Billboard Music Awards")
                .note("Top Rock Album: Hardwired... to Self-Destruct")
                .build(),
            Palmares.builder()
                .year(null)
                .award("Bammie: Baterista")
                .note("Lars Ulrich")
                .build(),
            Palmares.builder()
                .year(null)
                .award("Bammie: Álbum Metal destacado:")
                .note("ReLoad")
                .build(),
            Palmares.builder()
                .year(2018)
                .award("Polar Music Prize")
                .note("Metallica")
                .build(),
            Palmares.builder()
                .year(2019)
                .award("Kerrang! Awards")
                .note("Best International Live Act")
                .build(),
            Palmares.builder()
                .year(2019)
                .award("Kerrang! Awards")
                .note("Best International Act")
                .build(),
            Palmares.builder()
                .year(2024)
                .award("Premio Grammy por Mejor Interpretación Metal")
                .note("Por '72 Seasons'")
                .build()
        );
    }


}
