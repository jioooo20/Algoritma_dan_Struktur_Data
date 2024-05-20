package Quiz2.F1;

import java.util.Scanner;

public class GrandPrix {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Klasemen GPBahrain = new Klasemen();
        GPBahrain.addTanggal("20 Mar 2022");

        // Urutan driver berdasarkan Start pos tiap GP
        Driver GPBahrain_Charles_Leclerc = new Driver(1, "Charles Leclerc", 0, 1);
        Driver GPBahrain_Max_Verstappen = new Driver(2, "Max Verstappen", 0, 19);
        Driver GPBahrain_Carlos_Sainz = new Driver(3, "Carlos Sainz", 0, 2);
        Driver GPBahrain_Sergio_Perez = new Driver(4, "Sergio Perez", 0, 18);
        Driver GPBahrain_Lewis_Hamilton = new Driver(5, "Lewis Hamilton", 0, 3);
        Driver GPBahrain_Valtteri_Bottas = new Driver(6, "Valtteri Bottas", 0, 6);
        Driver GPBahrain_Kevin_Magnussen = new Driver(7, "Kevin Magnussen", 0, 5);
        Driver GPBahrain_Fernando_Alonso = new Driver(8, "Fernando Alonso", 0, 9);
        Driver GPBahrain_George_Russell = new Driver(9, "George Russell", 0, 4);
        Driver GPBahrain_Pierre_Gaslyz = new Driver(10, "Pierre Gasly", 0, 0);
        Driver GPBahrain_Esteban_Ocon = new Driver(11, "Esteban Ocon", 0, 7);
        Driver GPBahrain_Mick_Schumacherz = new Driver(12, "Mick Schumacher", 0, 11);
        Driver GPBahrain_Lando_Norris = new Driver(13, "Lando Norris", 0, 15);
        Driver GPBahrain_Alexander_Albon = new Driver(14, "Alexander Albon", 0, 13);
        Driver GPBahrain_Zhou_Guanyu = new Driver(15, "Zhou Guanyu", 0, 10);
        Driver GPBahrain_Yuki_Tsunoda = new Driver(16, "Yuki Tsunoda", 0, 8);
        Driver GPBahrain_Nico_Hulkenberg = new Driver(17, "Nico Hulkenberg", 0, 17);
        Driver GPBahrain_Daniel_Ricciardo = new Driver(18, "Daniel Ricciardo", 0, 14);
        Driver GPBahrain_Lance_Stroll = new Driver(19, "Lance Stroll", 0, 12);
        Driver GPBahrain_Nicholas_Latifi = new Driver(20, "Nicholas Latifi", 0, 16);

        GPBahrain_Charles_Leclerc.BonusFastestLaps();
        GPBahrain.add(GPBahrain_Charles_Leclerc);
        GPBahrain.add(GPBahrain_Max_Verstappen);
        GPBahrain.add(GPBahrain_Carlos_Sainz);
        GPBahrain.add(GPBahrain_Sergio_Perez);
        GPBahrain.add(GPBahrain_Lewis_Hamilton);
        GPBahrain.add(GPBahrain_Valtteri_Bottas);
        GPBahrain.add(GPBahrain_Kevin_Magnussen);
        GPBahrain.add(GPBahrain_Fernando_Alonso);
        GPBahrain.add(GPBahrain_George_Russell);
        GPBahrain.add(GPBahrain_Pierre_Gaslyz);
        GPBahrain.add(GPBahrain_Esteban_Ocon);
        GPBahrain.add(GPBahrain_Mick_Schumacherz);
        GPBahrain.add(GPBahrain_Lando_Norris);
        GPBahrain.add(GPBahrain_Alexander_Albon);
        GPBahrain.add(GPBahrain_Zhou_Guanyu);
        GPBahrain.add(GPBahrain_Yuki_Tsunoda);
        GPBahrain.add(GPBahrain_Nico_Hulkenberg);
        GPBahrain.add(GPBahrain_Daniel_Ricciardo);
        GPBahrain.add(GPBahrain_Lance_Stroll);
        GPBahrain.add(GPBahrain_Nicholas_Latifi);


        Klasemen GPArabSaudi = new Klasemen();
        GPArabSaudi.addTanggal("27 Mar 2022");

        Driver GPArabSaudi_Sergio_Perez = new Driver(1, "Sergio Perez", GPBahrain_Sergio_Perez.getPoin(), 4);
        Driver GPArabSaudi_Charles_Leclerc = new Driver(2, "Charles Leclerc", GPBahrain_Charles_Leclerc.getPoin(), 2);
        Driver GPArabSaudi_Carlos_Sainz = new Driver(3, "Carlos Sainz", GPBahrain_Carlos_Sainz.getPoin(), 3);
        Driver GPArabSaudi_Max_Verstappen = new Driver(4, "Max Verstappen", GPBahrain_Max_Verstappen.getPoin(), 1);
        Driver GPArabSaudi_Esteban_Ocon = new Driver(5, "Esteban Ocon", GPBahrain_Esteban_Ocon.getPoin(), 6);
        Driver GPArabSaudi_George_Russell = new Driver(6, "George Russell", GPBahrain_George_Russell.getPoin(), 5);
        Driver GPArabSaudi_Fernando_Alonso = new Driver(7, "Fernando Alonso", GPBahrain_Fernando_Alonso.getPoin(), 0);
        Driver GPArabSaudi_Valtteri_Bottas = new Driver(8, "Valtteri Bottas", GPBahrain_Valtteri_Bottas.getPoin(), 0);
        Driver GPArabSaudi_Pierre_Gasly = new Driver(9, "Pierre Gasly", GPBahrain_Pierre_Gaslyz.getPoin(), 8);
        Driver GPArabSaudi_Kevin_Magnussen = new Driver(10, "Kevin Magnussen", GPBahrain_Kevin_Magnussen.getPoin(), 9);
        Driver GPArabSaudi_Lando_Norris = new Driver(11, "Lando Norris", GPBahrain_Lando_Norris.getPoin(), 7);
        Driver GPArabSaudi_Zhou_Guanyu = new Driver(12, "Zhou Guanyu", GPBahrain_Zhou_Guanyu.getPoin(), 11);
        Driver GPArabSaudi_Lance_Stroll = new Driver(13, "Lance Stroll", GPBahrain_Lance_Stroll.getPoin(), 13);
        Driver GPArabSaudi_Daniel_Ricciardo = new Driver(14, "Daniel Ricciardo", GPBahrain_Daniel_Ricciardo.getPoin(), 17);
        Driver GPArabSaudi_Lewis_Hamilton = new Driver(15, "Lewis Hamilton", GPBahrain_Lewis_Hamilton.getPoin(), 10);
        Driver GPArabSaudi_Alexander_Albon = new Driver(16, "Alexander Albon", GPBahrain_Alexander_Albon.getPoin(), 14);
        Driver GPArabSaudi_Nico_Hulkenberg = new Driver(17, "Nico Hulkenberg", GPBahrain_Nico_Hulkenberg.getPoin(), 12);
        Driver GPArabSaudi_Nicholas_Latifi = new Driver(18, "Nicholas Latifi", GPBahrain_Nicholas_Latifi.getPoin(), 0);
        Driver GPArabSaudi_Yuki_Tsunoda = new Driver(19, "Yuki Tsunoda", GPBahrain_Yuki_Tsunoda.getPoin(), 0);

        GPArabSaudi_Charles_Leclerc.BonusFastestLaps();
        GPArabSaudi.add(GPArabSaudi_Sergio_Perez);
        GPArabSaudi.add(GPArabSaudi_Charles_Leclerc);
        GPArabSaudi.add(GPArabSaudi_Carlos_Sainz);
        GPArabSaudi.add(GPArabSaudi_Max_Verstappen);
        GPArabSaudi.add(GPArabSaudi_Esteban_Ocon);
        GPArabSaudi.add(GPArabSaudi_George_Russell);
        GPArabSaudi.add(GPArabSaudi_Fernando_Alonso);
        GPArabSaudi.add(GPArabSaudi_Valtteri_Bottas);
        GPArabSaudi.add(GPArabSaudi_Pierre_Gasly);
        GPArabSaudi.add(GPArabSaudi_Kevin_Magnussen);
        GPArabSaudi.add(GPArabSaudi_Lando_Norris);
        GPArabSaudi.add(GPArabSaudi_Zhou_Guanyu);
        GPArabSaudi.add(GPArabSaudi_Lance_Stroll);
        GPArabSaudi.add(GPArabSaudi_Daniel_Ricciardo);
        GPArabSaudi.add(GPArabSaudi_Lewis_Hamilton);
        GPArabSaudi.add(GPArabSaudi_Alexander_Albon);
        GPArabSaudi.add(GPArabSaudi_Nico_Hulkenberg);
        GPArabSaudi.add(GPArabSaudi_Nicholas_Latifi);
        GPArabSaudi.add(GPArabSaudi_Yuki_Tsunoda);

        // GPArabSaudi.Result();
        // GPArabSaudi.insertionSortAscFinish();
        // GPArabSaudi.Result();
        // GPArabSaudi.insertionSortDescPTS();
        // GPArabSaudi.Result();

        Klasemen GPAustralia = new Klasemen();
        GPAustralia.addTanggal("10 Apr 2022");

        Driver GPAustralia_Charles_Leclerc = new Driver(1, "Charles Leclerc", GPArabSaudi_Charles_Leclerc.getPoin(), 1);
        Driver GPAustralia_Max_Verstappen = new Driver(2, "Max Verstappen", GPArabSaudi_Max_Verstappen.getPoin(), 0);
        Driver GPAustralia_Sergio_Perez = new Driver(3, "Sergio Perez", GPArabSaudi_Sergio_Perez.getPoin(), 2);
        Driver GPAustralia_Lando_Norris = new Driver(4, "Lando Norris", GPArabSaudi_Lando_Norris.getPoin(), 5);
        Driver GPAustralia_Lewis_Hamilton = new Driver(5, "Lewis Hamilton", GPArabSaudi_Lewis_Hamilton.getPoin(), 4);
        Driver GPAustralia_George_Russell = new Driver(6, "George Russell", GPArabSaudi_George_Russell.getPoin(), 3);
        Driver GPAustralia_Daniel_Ricciardo = new Driver(7, "Daniel Ricciardo", GPArabSaudi_Daniel_Ricciardo.getPoin(), 6);
        Driver GPAustralia_Esteban_Ocon = new Driver(8, "Esteban Ocon", GPArabSaudi_Esteban_Ocon.getPoin(), 7);
        Driver GPAustralia_Carlos_Sainz = new Driver(9, "Carlos Sainz", GPArabSaudi_Carlos_Sainz.getPoin(), 0);
        Driver GPAustralia_Fernando_Alonso = new Driver(10, "Fernando Alonso", GPArabSaudi_Fernando_Alonso.getPoin(), 17);
        Driver GPAustralia_Pierre_Gasly = new Driver(11, "Pierre Gasly", GPArabSaudi_Pierre_Gasly.getPoin(), 9);
        Driver GPAustralia_Valtteri_Bottas = new Driver(12, "Valtteri Bottas", GPArabSaudi_Valtteri_Bottas.getPoin(), 8);
        Driver GPAustralia_Yuki_Tsunoda = new Driver(13, "Yuki Tsunoda", GPArabSaudi_Yuki_Tsunoda.getPoin(), 15);
        Driver GPAustralia_Zhou_Guanyu = new Driver(14, "Zhou Guanyu", GPArabSaudi_Zhou_Guanyu.getPoin(), 11);
        Driver GPAustralia_Mick_Schumacher = new Driver(15, "Mick Schumacher", GPBahrain_Mick_Schumacherz.getPoin(), 13);
        Driver GPAustralia_Kevin_Magnussen = new Driver(16, "Kevin Magnussen", GPArabSaudi_Kevin_Magnussen.getPoin(), 14);
        Driver GPAustralia_Sebastian_Vettel = new Driver(17, "Sebastian Vettel", 0, 0);
        Driver GPAustralia_Nicholas_Latifi = new Driver(18, "Nicholas Latifi", GPArabSaudi_Nicholas_Latifi.getPoin(), 16);
        Driver GPAustralia_Lance_Stroll = new Driver(19, "Lance Stroll", GPArabSaudi_Lance_Stroll.getPoin(), 12);
        Driver GPAustralia_Alexander_Albon = new Driver(20, "Alexander Albon", GPArabSaudi_Alexander_Albon.getPoin(), 10);

        GPAustralia_Charles_Leclerc.BonusFastestLaps();
        GPAustralia.add(GPAustralia_Charles_Leclerc);
        GPAustralia.add(GPAustralia_Max_Verstappen);
        GPAustralia.add(GPAustralia_Sergio_Perez);
        GPAustralia.add(GPAustralia_Lando_Norris);
        GPAustralia.add(GPAustralia_Lewis_Hamilton);
        GPAustralia.add(GPAustralia_George_Russell);
        GPAustralia.add(GPAustralia_Daniel_Ricciardo);
        GPAustralia.add(GPAustralia_Esteban_Ocon);
        GPAustralia.add(GPAustralia_Carlos_Sainz);
        GPAustralia.add(GPAustralia_Fernando_Alonso);
        GPAustralia.add(GPAustralia_Pierre_Gasly);
        GPAustralia.add(GPAustralia_Valtteri_Bottas);
        GPAustralia.add(GPAustralia_Yuki_Tsunoda);
        GPAustralia.add(GPAustralia_Zhou_Guanyu);
        GPAustralia.add(GPAustralia_Mick_Schumacher);
        GPAustralia.add(GPAustralia_Kevin_Magnussen);
        GPAustralia.add(GPAustralia_Sebastian_Vettel);
        GPAustralia.add(GPAustralia_Nicholas_Latifi);
        GPAustralia.add(GPAustralia_Lance_Stroll);
        GPAustralia.add(GPAustralia_Alexander_Albon);

        Klasemen GPEmiliaRomagna = new Klasemen();
        GPEmiliaRomagna.addTanggal("24 Apr 2022");

        Driver GPEmiliaRomagna_Max_Verstappen = new Driver(1, "Max Verstappen", GPAustralia_Max_Verstappen.getPoin(), 1);
        Driver GPEmiliaRomagna_Charles_Leclerc = new Driver(2, "Charles Leclerc", GPAustralia_Charles_Leclerc.getPoin(), 6);
        Driver GPEmiliaRomagna_Sergio_Perez = new Driver(3, "Sergio Perez", GPAustralia_Sergio_Perez.getPoin(), 2);
        Driver GPEmiliaRomagna_Carlos_Sainz = new Driver(4, "Carlos Sainz", GPAustralia_Carlos_Sainz.getPoin(), 0);
        Driver GPEmiliaRomagna_Lando_Norris = new Driver(5, "Lando Norris", GPAustralia_Lando_Norris.getPoin(), 3);
        Driver GPEmiliaRomagna_Daniel_Ricciardo = new Driver(6, "Daniel Ricciardo", GPAustralia_Daniel_Ricciardo.getPoin(), 18);
        Driver GPEmiliaRomagna_Valtteri_Bottas = new Driver(7, "Valtteri Bottas", GPAustralia_Valtteri_Bottas.getPoin(), 5);
        Driver GPEmiliaRomagna_Kevin_Magnussen = new Driver(8, "Kevin Magnussen", GPAustralia_Kevin_Magnussen.getPoin()
        , 9);
        Driver GPEmiliaRomagna_Fernando_Alonso = new Driver(9, "Fernando Alonso", GPAustralia_Fernando_Alonso.getPoin(), 0);
        Driver GPEmiliaRomagna_Mick_Schumacher = new Driver(10, "Mick Schumacher", GPAustralia_Mick_Schumacher.getPoin(), 17);
        Driver GPEmiliaRomagna_George_Russell = new Driver(11, "George Russell", GPAustralia_George_Russell.getPoin(), 4);
        Driver GPEmiliaRomagna_Yuki_Tsunoda = new Driver(12, "Yuki Tsunoda", GPAustralia_Yuki_Tsunoda.getPoin(), 7);
        Driver GPEmiliaRomagna_Sebastian_Vettel = new Driver(13, "Sebastian Vettel", GPAustralia_Sebastian_Vettel.getPoin(), 8);
        Driver GPEmiliaRomagna_Lewis_Hamilton = new Driver(14, "Lewis Hamilton", GPAustralia_Lewis_Hamilton.getPoin(), 13);
        Driver GPEmiliaRomagna_Lance_Stroll = new Driver(15, "Lance Stroll", GPAustralia_Lance_Stroll.getPoin(), 10);
        Driver GPEmiliaRomagna_Esteban_Ocon = new Driver(16, "Esteban Ocon", GPAustralia_Esteban_Ocon.getPoin(), 14);
        Driver GPEmiliaRomagna_Pierre_Gasly = new Driver(17, "Pierre Gasly", GPAustralia_Pierre_Gasly.getPoin(), 12);
        Driver GPEmiliaRomagna_Alexander_Albon = new Driver(18, "Alexander Albon", GPAustralia_Alexander_Albon.getPoin(), 11);
        Driver GPEmiliaRomagna_Nicholas_Latifi = new Driver(19, "Nicholas Latifi", GPAustralia_Nicholas_Latifi.getPoin(), 16);

        GPEmiliaRomagna_Max_Verstappen.BonusFastestLaps();
        GPEmiliaRomagna.add(GPEmiliaRomagna_Max_Verstappen);
        GPEmiliaRomagna.add(GPEmiliaRomagna_Charles_Leclerc);
        GPEmiliaRomagna.add(GPEmiliaRomagna_Sergio_Perez);
        GPEmiliaRomagna.add(GPEmiliaRomagna_Carlos_Sainz);
        GPEmiliaRomagna.add(GPEmiliaRomagna_Lando_Norris);
        GPEmiliaRomagna.add(GPEmiliaRomagna_Daniel_Ricciardo);
        GPEmiliaRomagna.add(GPEmiliaRomagna_Valtteri_Bottas);
        GPEmiliaRomagna.add(GPEmiliaRomagna_Kevin_Magnussen);
        GPEmiliaRomagna.add(GPEmiliaRomagna_Fernando_Alonso);
        GPEmiliaRomagna.add(GPEmiliaRomagna_Mick_Schumacher);
        GPEmiliaRomagna.add(GPEmiliaRomagna_George_Russell);
        GPEmiliaRomagna.add(GPEmiliaRomagna_Yuki_Tsunoda);
        GPEmiliaRomagna.add(GPEmiliaRomagna_Sebastian_Vettel);
        GPEmiliaRomagna.add(GPEmiliaRomagna_Lewis_Hamilton);
        GPEmiliaRomagna.add(GPEmiliaRomagna_Lance_Stroll);
        GPEmiliaRomagna.add(GPEmiliaRomagna_Esteban_Ocon);
        GPEmiliaRomagna.add(GPEmiliaRomagna_Pierre_Gasly);
        GPEmiliaRomagna.add(GPEmiliaRomagna_Alexander_Albon);
        GPEmiliaRomagna.add(GPEmiliaRomagna_Nicholas_Latifi);

        Klasemen GPMiami = new Klasemen();
        GPMiami.addTanggal("08 May 2022");

        Driver GPMiami_Charles_Leclerc = new Driver(1, "Charles Leclerc", GPEmiliaRomagna_Charles_Leclerc.getPoin(), 2);
        Driver GPMiami_Carlos_Sainz = new Driver(2, "Carlos Sainz", GPEmiliaRomagna_Carlos_Sainz.getPoin(), 3);
        Driver GPMiami_Max_Verstappen = new Driver(3, "Max Verstappen", GPEmiliaRomagna_Max_Verstappen.getPoin(), 1);
        Driver GPMiami_Sergio_Perez = new Driver(4, "Sergio Perez", GPEmiliaRomagna_Sergio_Perez.getPoin(), 4);
        Driver GPMiami_Valtteri_Bottas = new Driver(5, "Valtteri Bottas", GPEmiliaRomagna_Valtteri_Bottas.getPoin(), 7);
        Driver GPMiami_Lewis_Hamilton = new Driver(6, "Lewis Hamilton", GPEmiliaRomagna_Lewis_Hamilton.getPoin(), 6);
        Driver GPMiami_Pierre_Gasly = new Driver(7, "Pierre Gasly", GPEmiliaRomagna_Pierre_Gasly.getPoin(), 0);
        Driver GPMiami_Lando_Norris = new Driver(8, "Lando Norris", GPEmiliaRomagna_Lando_Norris.getPoin(), 0);
        Driver GPMiami_Yuki_Tsunoda = new Driver(9, "Yuki Tsunoda", GPEmiliaRomagna_Yuki_Tsunoda.getPoin(), 12);
        Driver GPMiami_Lance_Stroll = new Driver(10, "Lance Stroll", GPEmiliaRomagna_Lance_Stroll.getPoin(), 10);
        Driver GPMiami_Fernando_Alonso = new Driver(11, "Fernando Alonso", GPEmiliaRomagna_Fernando_Alonso.getPoin(), 11);
        Driver GPMiami_George_Russell = new Driver(12, "George Russell", GPEmiliaRomagna_George_Russell.getPoin(), 5);
        Driver GPMiami_Sebastian_Vettel = new Driver(13, "Sebastian Vettel", GPEmiliaRomagna_Sebastian_Vettel.getPoin(), 17);
        Driver GPMiami_Daniel_Ricciardo = new Driver(14, "Daniel Ricciardo", GPEmiliaRomagna_Daniel_Ricciardo.getPoin(), 13);
        Driver GPMiami_Mick_Schumacher = new Driver(15, "Mick Schumacher", GPEmiliaRomagna_Mick_Schumacher.getPoin(), 15);
        Driver GPMiami_Kevin_Magnussen = new Driver(16, "Kevin Magnussen", GPEmiliaRomagna_Kevin_Magnussen.getPoin(), 16);
        Driver GPMiami_Zhou_Guanyu = new Driver(17, "Zhou Guanyu", GPAustralia_Zhou_Guanyu.getPoin(), 0);
        Driver GPMiami_Alexander_Albon = new Driver(18, "Alexander Albon", GPEmiliaRomagna_Alexander_Albon.getPoin(), 9);
        Driver GPMiami_Nicholas_Latifi = new Driver(19, "Nicholas Latifi", GPEmiliaRomagna_Nicholas_Latifi.getPoin(), 14);
        Driver GPMiami_Esteban_Ocon = new Driver(20, "Esteban Ocon", GPEmiliaRomagna_Esteban_Ocon.getPoin(), 8);
        
        GPMiami_Max_Verstappen.BonusFastestLaps();
        GPMiami.add(GPMiami_Charles_Leclerc);
        GPMiami.add(GPMiami_Carlos_Sainz);
        GPMiami.add(GPMiami_Max_Verstappen);
        GPMiami.add(GPMiami_Sergio_Perez);
        GPMiami.add(GPMiami_Valtteri_Bottas);
        GPMiami.add(GPMiami_Lewis_Hamilton);
        GPMiami.add(GPMiami_Pierre_Gasly);
        GPMiami.add(GPMiami_Lando_Norris);
        GPMiami.add(GPMiami_Yuki_Tsunoda);
        GPMiami.add(GPMiami_Lance_Stroll);
        GPMiami.add(GPMiami_Fernando_Alonso);
        GPMiami.add(GPMiami_George_Russell);
        GPMiami.add(GPMiami_Sebastian_Vettel);
        GPMiami.add(GPMiami_Daniel_Ricciardo);
        GPMiami.add(GPMiami_Mick_Schumacher);
        GPMiami.add(GPMiami_Kevin_Magnussen);
        GPMiami.add(GPMiami_Zhou_Guanyu);
        GPMiami.add(GPMiami_Alexander_Albon);
        GPMiami.add(GPMiami_Nicholas_Latifi);
        GPMiami.add(GPMiami_Esteban_Ocon);

        Klasemen GPSpain = new Klasemen();
        GPSpain.addTanggal("08 May 2022");

        Driver GPSpain_Charles_Leclerc = new Driver(1, "Charles Leclerc", GPMiami_Charles_Leclerc.getPoin(), 0);
        Driver GPSpain_Max_Verstappen = new Driver(2, "Max Verstappen", GPMiami_Max_Verstappen.getPoin(), 1);
        Driver GPSpain_Carlos_Sainz = new Driver(3, "Carlos Sainz", GPMiami_Carlos_Sainz.getPoin(), 4);
        Driver GPSpain_George_Russell = new Driver(4, "George Russell", GPMiami_George_Russell.getPoin(), 3);
        Driver GPSpain_Sergio_Perez = new Driver(5, "Sergio Perez", GPMiami_Sergio_Perez.getPoin(), 2);
        Driver GPSpain_Lewis_Hamilton = new Driver(6, "Lewis Hamilton", GPMiami_Lewis_Hamilton.getPoin(), 5);
        Driver GPSpain_Valtteri_Bottas = new Driver(7, "Valtteri Bottas", GPMiami_Valtteri_Bottas.getPoin(), 6);
        Driver GPSpain_Kevin_Magnussen = new Driver(8, "Kevin Magnussen", GPMiami_Kevin_Magnussen.getPoin(), 17);
        Driver GPSpain_Daniel_Ricciardo = new Driver(9, "Daniel Ricciardo", GPMiami_Daniel_Ricciardo.getPoin(), 12);
        Driver GPSpain_Mick_Schumacher = new Driver(10, "Mick Schumacher", GPMiami_Mick_Schumacher.getPoin(), 14);
        Driver GPSpain_Lando_Norris = new Driver(11, "Lando Norris", GPMiami_Lando_Norris.getPoin(), 8);
        Driver GPSpain_Esteban_Ocon = new Driver(12, "Esteban Ocon", GPMiami_Esteban_Ocon.getPoin(), 7);
        Driver GPSpain_Yuki_Tsunoda = new Driver(13, "Yuki Tsunoda", GPMiami_Yuki_Tsunoda.getPoin(), 10);
        Driver GPSpain_Pierre_Gasly = new Driver(14, "Pierre Gasly", GPMiami_Pierre_Gasly.getPoin(), 13);
        Driver GPSpain_Zhou_Guanyu = new Driver(15, "Zhou Guanyu", GPMiami_Zhou_Guanyu.getPoin(), 0);
        Driver GPSpain_Sebastian_Vettel = new Driver(16, "Sebastian Vettel", GPMiami_Sebastian_Vettel.getPoin(), 11);
        Driver GPSpain_Lance_Stroll = new Driver(17, "Lance Stroll", GPMiami_Lance_Stroll.getPoin(), 15);
        Driver GPSpain_Alexander_Albon = new Driver(18, "Alexander Albon", GPMiami_Alexander_Albon.getPoin(), 18);
        Driver GPSpain_Nicholas_Latifi = new Driver(19, "Nicholas Latifi", GPMiami_Nicholas_Latifi.getPoin(), 16);
        Driver GPSpain_Fernando_Alonso = new Driver(20, "Fernando Alonso", GPMiami_Fernando_Alonso.getPoin(), 9);

        GPSpain_Sergio_Perez.BonusFastestLaps();
        GPSpain.add(GPSpain_Charles_Leclerc);
        GPSpain.add(GPSpain_Max_Verstappen);
        GPSpain.add(GPSpain_Carlos_Sainz);
        GPSpain.add(GPSpain_George_Russell);
        GPSpain.add(GPSpain_Sergio_Perez);
        GPSpain.add(GPSpain_Lewis_Hamilton);
        GPSpain.add(GPSpain_Valtteri_Bottas);
        GPSpain.add(GPSpain_Kevin_Magnussen);
        GPSpain.add(GPSpain_Daniel_Ricciardo);
        GPSpain.add(GPSpain_Mick_Schumacher);
        GPSpain.add(GPSpain_Lando_Norris);
        GPSpain.add(GPSpain_Esteban_Ocon);
        GPSpain.add(GPSpain_Yuki_Tsunoda);
        GPSpain.add(GPSpain_Pierre_Gasly);
        GPSpain.add(GPSpain_Zhou_Guanyu);
        GPSpain.add(GPSpain_Sebastian_Vettel);
        GPSpain.add(GPSpain_Lance_Stroll);
        GPSpain.add(GPSpain_Alexander_Albon);
        GPSpain.add(GPSpain_Nicholas_Latifi);
        GPSpain.add(GPSpain_Fernando_Alonso);

        Klasemen GPMonaco = new Klasemen();
        GPMonaco.addTanggal("29 May 2022");

        Driver GPMonaco_Charles_Leclerc = new Driver(1, "Charles Leclerc", GPSpain_Charles_Leclerc.getPoin(), 4);
        Driver GPMonaco_Carlos_Sainz = new Driver(2, "Carlos Sainz", GPSpain_Carlos_Sainz.getPoin(), 2);
        Driver GPMonaco_Sergio_Perez = new Driver(3, "Sergio Perez", GPSpain_Sergio_Perez.getPoin(), 1);
        Driver GPMonaco_Max_Verstappen = new Driver(4, "Max Verstappen", GPSpain_Max_Verstappen.getPoin(), 3);
        Driver GPMonaco_Lando_Norris = new Driver(5, "Lando Norris", GPSpain_Lando_Norris.getPoin(), 6);
        Driver GPMonaco_George_Russell = new Driver(6, "George Russell", GPSpain_George_Russell.getPoin(), 5);
        Driver GPMonaco_Fernando_Alonso = new Driver(7, "Fernando Alonso", GPSpain_Fernando_Alonso.getPoin(), 7);
        Driver GPMonaco_Lewis_Hamilton = new Driver(8, "Lewis Hamilton", GPSpain_Lewis_Hamilton.getPoin(), 8);
        Driver GPMonaco_Sebastian_Vettel = new Driver(9, "Sebastian Vettel", GPSpain_Sebastian_Vettel.getPoin(), 10);
        Driver GPMonaco_Esteban_Ocon = new Driver(10, "Esteban Ocon", GPSpain_Esteban_Ocon.getPoin(), 12);
        Driver GPMonaco_Yuki_Tsunoda = new Driver(11, "Yuki Tsunoda", GPSpain_Yuki_Tsunoda.getPoin(), 17);
        Driver GPMonaco_Valtteri_Bottas = new Driver(12, "Valtteri Bottas", GPSpain_Valtteri_Bottas.getPoin(), 9);
        Driver GPMonaco_Kevin_Magnussen = new Driver(13, "Kevin Magnussen", GPSpain_Kevin_Magnussen.getPoin(), 0);
        Driver GPMonaco_Daniel_Ricciardo = new Driver(14, "Daniel Ricciardo", GPSpain_Daniel_Ricciardo.getPoin(), 13);
        Driver GPMonaco_Mick_Schumacher = new Driver(15, "Mick Schumacher", GPSpain_Mick_Schumacher.getPoin(), 15);
        Driver GPMonaco_Alexander_Albon = new Driver(16, "Alexander Albon", GPSpain_Alexander_Albon.getPoin(), 16);
        Driver GPMonaco_Pierre_Gasly = new Driver(17, "Pierre Gasly", GPSpain_Pierre_Gasly.getPoin(), 11);
        Driver GPMonaco_Lance_Stroll = new Driver(18, "Lance Stroll", GPSpain_Lance_Stroll.getPoin(), 14);
        Driver GPMonaco_Nicholas_Latifi = new Driver(19, "Nicholas Latifi", GPSpain_Nicholas_Latifi.getPoin(), 0);
        Driver GPMonaco_Zhou_Guanyu = new Driver(20, "Zhou Guanyu", GPSpain_Zhou_Guanyu.getPoin(), 0);

        GPMonaco_Lando_Norris.BonusFastestLaps();
        GPMonaco.add(GPMonaco_Charles_Leclerc);
        GPMonaco.add(GPMonaco_Carlos_Sainz);
        GPMonaco.add(GPMonaco_Sergio_Perez);
        GPMonaco.add(GPMonaco_Max_Verstappen);
        GPMonaco.add(GPMonaco_Lando_Norris);
        GPMonaco.add(GPMonaco_George_Russell);
        GPMonaco.add(GPMonaco_Fernando_Alonso);
        GPMonaco.add(GPMonaco_Lewis_Hamilton);
        GPMonaco.add(GPMonaco_Sebastian_Vettel);
        GPMonaco.add(GPMonaco_Esteban_Ocon);
        GPMonaco.add(GPMonaco_Yuki_Tsunoda);
        GPMonaco.add(GPMonaco_Valtteri_Bottas);
        GPMonaco.add(GPMonaco_Kevin_Magnussen);
        GPMonaco.add(GPMonaco_Daniel_Ricciardo);
        GPMonaco.add(GPMonaco_Mick_Schumacher);
        GPMonaco.add(GPMonaco_Alexander_Albon);
        GPMonaco.add(GPMonaco_Pierre_Gasly);
        GPMonaco.add(GPMonaco_Lance_Stroll);
        GPMonaco.add(GPMonaco_Nicholas_Latifi);
        GPMonaco.add(GPMonaco_Zhou_Guanyu);

        Klasemen GPAzerbaijan = new Klasemen();
        GPAzerbaijan.addTanggal("12 Jun 2022");

        Driver GPAzerbaijan_Charles_Leclerc = new Driver(1, "Charles Leclerc", GPMonaco_Charles_Leclerc.getPoin(), 0);
        Driver GPAzerbaijan_Sergio_Perez = new Driver(2, "Sergio Perez", GPMonaco_Sergio_Perez.getPoin(), 2);
        Driver GPAzerbaijan_Max_Verstappen = new Driver(3, "Max Verstappen", GPMonaco_Max_Verstappen.getPoin(), 1);
        Driver GPAzerbaijan_Carlos_Sainz = new Driver(4, "Carlos Sainz", GPMonaco_Carlos_Sainz.getPoin(), 0);
        Driver GPAzerbaijan_George_Russell = new Driver(5, "George Russell", GPMonaco_George_Russell.getPoin(), 3);
        Driver GPAzerbaijan_Pierre_Gasly = new Driver(6, "Pierre Gasly", GPMonaco_Pierre_Gasly.getPoin(), 5);
        Driver GPAzerbaijan_Lewis_Hamilton = new Driver(7, "Lewis Hamilton", GPMonaco_Lewis_Hamilton.getPoin(), 4);
        Driver GPAzerbaijan_Yuki_Tsunoda = new Driver(8, "Yuki Tsunoda", GPMonaco_Yuki_Tsunoda.getPoin(), 13);
        Driver GPAzerbaijan_Sebastian_Vettel = new Driver(9, "Sebastian Vettel", GPMonaco_Sebastian_Vettel.getPoin(), 6);
        Driver GPAzerbaijan_Fernando_Alonso = new Driver(10, "Fernando Alonso", GPMonaco_Fernando_Alonso.getPoin(), 7);
        Driver GPAzerbaijan_Lando_Norris = new Driver(11, "Lando Norris", GPMonaco_Lando_Norris.getPoin(), 9);
        Driver GPAzerbaijan_Daniel_Ricciardo = new Driver(12, "Daniel Ricciardo", GPMonaco_Daniel_Ricciardo.getPoin(), 8);
        Driver GPAzerbaijan_Esteban_Ocon = new Driver(13, "Esteban Ocon", GPMonaco_Esteban_Ocon.getPoin(), 10);
        Driver GPAzerbaijan_Zhou_Guanyu = new Driver(14, "Zhou Guanyu", GPMonaco_Zhou_Guanyu.getPoin(), 0);
        Driver GPAzerbaijan_Valtteri_Bottas = new Driver(15, "Valtteri Bottas", GPMonaco_Valtteri_Bottas.getPoin(), 11);
        Driver GPAzerbaijan_Kevin_Magnussen = new Driver(16, "Kevin Magnussen", GPMonaco_Kevin_Magnussen.getPoin(), 0);
        Driver GPAzerbaijan_Alexander_Albon = new Driver(17, "Alexander Albon", GPMonaco_Alexander_Albon.getPoin(), 12);
        Driver GPAzerbaijan_Nicholas_Latifi = new Driver(18, "Nicholas Latifi", GPMonaco_Nicholas_Latifi.getPoin(), 15);
        Driver GPAzerbaijan_Lance_Stroll = new Driver(19, "Lance Stroll", GPMonaco_Lance_Stroll.getPoin(), 16);
        Driver GPAzerbaijan_Mick_Schumacher = new Driver(20, "Mick Schumacher", GPMonaco_Mick_Schumacher.getPoin(), 14);

        GPAzerbaijan_Sergio_Perez.BonusFastestLaps();
        GPAzerbaijan.add(GPAzerbaijan_Charles_Leclerc);
        GPAzerbaijan.add(GPAzerbaijan_Sergio_Perez);
        GPAzerbaijan.add(GPAzerbaijan_Max_Verstappen);
        GPAzerbaijan.add(GPAzerbaijan_Carlos_Sainz);
        GPAzerbaijan.add(GPAzerbaijan_George_Russell);
        GPAzerbaijan.add(GPAzerbaijan_Pierre_Gasly);
        GPAzerbaijan.add(GPAzerbaijan_Lewis_Hamilton);
        GPAzerbaijan.add(GPAzerbaijan_Yuki_Tsunoda);
        GPAzerbaijan.add(GPAzerbaijan_Sebastian_Vettel);
        GPAzerbaijan.add(GPAzerbaijan_Fernando_Alonso);
        GPAzerbaijan.add(GPAzerbaijan_Lando_Norris);
        GPAzerbaijan.add(GPAzerbaijan_Daniel_Ricciardo);
        GPAzerbaijan.add(GPAzerbaijan_Esteban_Ocon);
        GPAzerbaijan.add(GPAzerbaijan_Zhou_Guanyu);
        GPAzerbaijan.add(GPAzerbaijan_Valtteri_Bottas);
        GPAzerbaijan.add(GPAzerbaijan_Kevin_Magnussen);
        GPAzerbaijan.add(GPAzerbaijan_Alexander_Albon);
        GPAzerbaijan.add(GPAzerbaijan_Nicholas_Latifi);
        GPAzerbaijan.add(GPAzerbaijan_Lance_Stroll);
        GPAzerbaijan.add(GPAzerbaijan_Mick_Schumacher);

        Klasemen GPCanada = new Klasemen();
        GPCanada.addTanggal("19 Jun 2022");

        Driver GPCanada_Max_Verstappen = new Driver(1, "Max Verstappen", GPAzerbaijan_Max_Verstappen.getPoin(), 1);
        Driver GPCanada_Fernando_Alonso = new Driver(2, "Fernando Alonso", GPAzerbaijan_Fernando_Alonso.getPoin(), 9);
        Driver GPCanada_Carlos_Sainz = new Driver(3, "Carlos Sainz", GPAzerbaijan_Carlos_Sainz.getPoin(), 2);
        Driver GPCanada_Lewis_Hamilton = new Driver(4, "Lewis Hamilton", GPAzerbaijan_Lewis_Hamilton.getPoin(), 3);
        Driver GPCanada_Kevin_Magnussen = new Driver(5, "Kevin Magnussen", GPAzerbaijan_Kevin_Magnussen.getPoin(), 17);
        Driver GPCanada_Mick_Schumacher = new Driver(6, "Mick Schumacher", GPAzerbaijan_Mick_Schumacher.getPoin(), 0);
        Driver GPCanada_Esteban_Ocon = new Driver(7, "Esteban Ocon", GPAzerbaijan_Esteban_Ocon.getPoin(), 6);
        Driver GPCanada_George_Russell = new Driver(8, "George Russell", GPAzerbaijan_George_Russell.getPoin(), 4);
        Driver GPCanada_Daniel_Ricciardo = new Driver(9, "Daniel Ricciardo", GPAzerbaijan_Daniel_Ricciardo.getPoin(), 11);
        Driver GPCanada_Zhou_Guanyu = new Driver(10, "Zhou Guanyu", GPAzerbaijan_Zhou_Guanyu.getPoin(), 8);
        Driver GPCanada_Valtteri_Bottas = new Driver(11, "Valtteri Bottas", GPAzerbaijan_Valtteri_Bottas.getPoin(), 7);
        Driver GPCanada_Alexander_Albon = new Driver(12, "Alexander Albon", GPAzerbaijan_Alexander_Albon.getPoin(), 13);
        Driver GPCanada_Sergio_Perez = new Driver(13, "Sergio Perez", GPAzerbaijan_Sergio_Perez.getPoin(), 0);
        Driver GPCanada_Lando_Norris = new Driver(14, "Lando Norris", GPAzerbaijan_Lando_Norris.getPoin(), 15);
        Driver GPCanada_Pierre_Gasly = new Driver(15, "Pierre Gasly", GPAzerbaijan_Pierre_Gasly.getPoin(), 14);
        Driver GPCanada_Sebastian_Vettel = new Driver(16, "Sebastian Vettel", GPAzerbaijan_Sebastian_Vettel.getPoin(), 12);
        Driver GPCanada_Lance_Stroll = new Driver(17, "Lance Stroll", GPAzerbaijan_Lance_Stroll.getPoin(), 10);
        Driver GPCanada_Nicholas_Latifi = new Driver(18, "Nicholas Latifi", GPAzerbaijan_Nicholas_Latifi.getPoin(), 16);
        Driver GPCanada_Charles_Leclerc = new Driver(19, "Charles Leclerc", GPAzerbaijan_Charles_Leclerc.getPoin(), 5);
        Driver GPCanada_Yuki_Tsunoda = new Driver(20, "Yuki Tsunoda", GPAzerbaijan_Yuki_Tsunoda.getPoin(), 0);

        GPCanada_Carlos_Sainz.BonusFastestLaps();
        GPCanada.add(GPCanada_Max_Verstappen);
        GPCanada.add(GPCanada_Fernando_Alonso);
        GPCanada.add(GPCanada_Carlos_Sainz);
        GPCanada.add(GPCanada_Lewis_Hamilton);
        GPCanada.add(GPCanada_Kevin_Magnussen);
        GPCanada.add(GPCanada_Mick_Schumacher);
        GPCanada.add(GPCanada_Esteban_Ocon);
        GPCanada.add(GPCanada_George_Russell);
        GPCanada.add(GPCanada_Daniel_Ricciardo);
        GPCanada.add(GPCanada_Zhou_Guanyu);
        GPCanada.add(GPCanada_Valtteri_Bottas);
        GPCanada.add(GPCanada_Alexander_Albon);
        GPCanada.add(GPCanada_Sergio_Perez);
        GPCanada.add(GPCanada_Lando_Norris);
        GPCanada.add(GPCanada_Pierre_Gasly);
        GPCanada.add(GPCanada_Sebastian_Vettel);
        GPCanada.add(GPCanada_Lance_Stroll);
        GPCanada.add(GPCanada_Nicholas_Latifi);
        GPCanada.add(GPCanada_Charles_Leclerc);
        GPCanada.add(GPCanada_Yuki_Tsunoda);

        Klasemen GPGreatBritanian = new Klasemen();
        GPGreatBritanian.addTanggal("03 Jul 2022");

        Driver GPGreatBritanian_Carlos_Sainz = new Driver(1, "Carlos Sainz", GPCanada_Carlos_Sainz.getPoin(), 1);
        Driver GPGreatBritanian_Max_Verstappen = new Driver(2, "Max Verstappen", GPCanada_Max_Verstappen.getPoin(), 7);
        Driver GPGreatBritanian_Charles_Leclerc = new Driver(3, "Charles Leclerc", GPCanada_Charles_Leclerc.getPoin(), 4);
        Driver GPGreatBritanian_Sergio_Perez = new Driver(4, "Sergio Perez", GPCanada_Sergio_Perez.getPoin(), 2);
        Driver GPGreatBritanian_Lewis_Hamilton = new Driver(5, "Lewis Hamilton", GPCanada_Lewis_Hamilton.getPoin(), 3);
        Driver GPGreatBritanian_Lando_Norris = new Driver(6, "Lando Norris", GPCanada_Lando_Norris.getPoin(), 6);
        Driver GPGreatBritanian_Fernando_Alonso = new Driver(7, "Fernando Alonso", GPCanada_Fernando_Alonso.getPoin(), 5);
        Driver GPGreatBritanian_George_Russell = new Driver(8, "George Russell", GPCanada_George_Russell.getPoin(), 0);
        Driver GPGreatBritanian_Zhou_Guanyu = new Driver(9, "Zhou Guanyu", GPCanada_Zhou_Guanyu.getPoin(), 0);
        Driver GPGreatBritanian_Nicholas_Latifi = new Driver(10, "Nicholas Latifi", GPCanada_Nicholas_Latifi.getPoin(), 12);
        Driver GPGreatBritanian_Pierre_Gasly = new Driver(11, "Pierre Gasly", GPCanada_Pierre_Gasly.getPoin(), 0);
        Driver GPGreatBritanian_Valtteri_Bottas = new Driver(12, "Valtteri Bottas", GPCanada_Valtteri_Bottas.getPoin(), 0);
        Driver GPGreatBritanian_Yuki_Tsunoda = new Driver(13, "Yuki Tsunoda", GPCanada_Yuki_Tsunoda.getPoin(), 14);
        Driver GPGreatBritanian_Daniel_Ricciardo = new Driver(14, "Daniel Ricciardo", GPCanada_Daniel_Ricciardo.getPoin(), 13);
        Driver GPGreatBritanian_Esteban_Ocon = new Driver(15, "Esteban Ocon", GPCanada_Esteban_Ocon.getPoin(), 0);
        Driver GPGreatBritanian_Alexander_Albon = new Driver(16, "Alexander Albon", GPCanada_Alexander_Albon.getPoin(), 0);
        Driver GPGreatBritanian_Kevin_Magnussen = new Driver(17, "Kevin Magnussen", GPCanada_Kevin_Magnussen.getPoin(), 10);
        Driver GPGreatBritanian_Sebastian_Vettel = new Driver(18, "Sebastian Vettel", GPCanada_Sebastian_Vettel.getPoin(), 9);
        Driver GPGreatBritanian_Mick_Schumacher = new Driver(19, "Mick Schumacher", GPCanada_Mick_Schumacher.getPoin(), 8);
        Driver GPGreatBritanian_Lance_Stroll = new Driver(20, "Lance Stroll", GPCanada_Lance_Stroll.getPoin(), 11);

        GPGreatBritanian_Lewis_Hamilton.BonusFastestLaps();
        GPGreatBritanian.add(GPGreatBritanian_Carlos_Sainz);
        GPGreatBritanian.add(GPGreatBritanian_Max_Verstappen);
        GPGreatBritanian.add(GPGreatBritanian_Charles_Leclerc);
        GPGreatBritanian.add(GPGreatBritanian_Sergio_Perez);
        GPGreatBritanian.add(GPGreatBritanian_Lewis_Hamilton);
        GPGreatBritanian.add(GPGreatBritanian_Lando_Norris);
        GPGreatBritanian.add(GPGreatBritanian_Fernando_Alonso);
        GPGreatBritanian.add(GPGreatBritanian_George_Russell);
        GPGreatBritanian.add(GPGreatBritanian_Zhou_Guanyu);
        GPGreatBritanian.add(GPGreatBritanian_Nicholas_Latifi);
        GPGreatBritanian.add(GPGreatBritanian_Pierre_Gasly);
        GPGreatBritanian.add(GPGreatBritanian_Valtteri_Bottas);
        GPGreatBritanian.add(GPGreatBritanian_Yuki_Tsunoda);
        GPGreatBritanian.add(GPGreatBritanian_Daniel_Ricciardo);
        GPGreatBritanian.add(GPGreatBritanian_Esteban_Ocon);
        GPGreatBritanian.add(GPGreatBritanian_Alexander_Albon);
        GPGreatBritanian.add(GPGreatBritanian_Kevin_Magnussen);
        GPGreatBritanian.add(GPGreatBritanian_Sebastian_Vettel);
        GPGreatBritanian.add(GPGreatBritanian_Mick_Schumacher);
        GPGreatBritanian.add(GPGreatBritanian_Lance_Stroll);

        Klasemen GPAustria = new Klasemen();
        GPAustria.addTanggal("03 Jul 2022");

        Driver GPAustria_Max_Verstappen = new Driver(1, "Max Verstappen", GPGreatBritanian_Max_Verstappen.getPoin(), 2);
        Driver GPAustria_Charles_Leclerc = new Driver(2, "Charles Leclerc", GPGreatBritanian_Charles_Leclerc.getPoin(), 1);
        Driver GPAustria_Carlos_Sainz = new Driver(3, "Carlos Sainz", GPGreatBritanian_Carlos_Sainz.getPoin(), 0);
        Driver GPAustria_George_Russell = new Driver(4, "George Russell", GPGreatBritanian_George_Russell.getPoin(), 4);
        Driver GPAustria_Sergio_Perez = new Driver(5, "Sergio Perez", GPGreatBritanian_Sergio_Perez.getPoin(), 0);
        Driver GPAustria_Esteban_Ocon = new Driver(6, "Esteban Ocon", GPGreatBritanian_Esteban_Ocon.getPoin(), 5);
        Driver GPAustria_Kevin_Magnussen = new Driver(7, "Kevin Magnussen", GPGreatBritanian_Kevin_Magnussen.getPoin(), 8);
        Driver GPAustria_Lewis_Hamilton = new Driver(8, "Lewis Hamilton", GPGreatBritanian_Lewis_Hamilton.getPoin(), 3);
        Driver GPAustria_Mick_Schumacher = new Driver(9, "Mick Schumacher", GPGreatBritanian_Mick_Schumacher.getPoin(), 6);
        Driver GPAustria_Lando_Norris = new Driver(10, "Lando Norris", GPGreatBritanian_Lando_Norris.getPoin(), 7);
        Driver GPAustria_Daniel_Ricciardo = new Driver(11, "Daniel Ricciardo", GPGreatBritanian_Daniel_Ricciardo.getPoin(), 9);
        Driver GPAustria_Lance_Stroll = new Driver(12, "Lance Stroll", GPGreatBritanian_Lance_Stroll.getPoin(), 13);
        Driver GPAustria_Zhou_Guanyu = new Driver(13, "Zhou Guanyu", GPGreatBritanian_Zhou_Guanyu.getPoin(), 14);
        Driver GPAustria_Pierre_Gasly = new Driver(14, "Pierre Gasly", GPGreatBritanian_Pierre_Gasly.getPoin(), 15);
        Driver GPAustria_Alexander_Albon = new Driver(15, "Alexander Albon", GPGreatBritanian_Alexander_Albon.getPoin(), 12);
        Driver GPAustria_Yuki_Tsunoda = new Driver(16, "Yuki Tsunoda", GPGreatBritanian_Yuki_Tsunoda.getPoin(), 16);
        Driver GPAustria_Nicholas_Latifi = new Driver(17, "Nicholas Latifi", GPGreatBritanian_Nicholas_Latifi.getPoin(), 0);
        Driver GPAustria_Sebastian_Vettel = new Driver(18, "Sebastian Vettel", GPGreatBritanian_Sebastian_Vettel.getPoin(), 17);
        Driver GPAustria_Fernando_Alonso = new Driver(19, "Fernando Alonso", GPGreatBritanian_Fernando_Alonso.getPoin(), 10);

        GPAustria_Max_Verstappen.BonusFastestLaps();
        GPAustria.add(GPAustria_Max_Verstappen);
        GPAustria.add(GPAustria_Charles_Leclerc);
        GPAustria.add(GPAustria_Carlos_Sainz);
        GPAustria.add(GPAustria_George_Russell);
        GPAustria.add(GPAustria_Sergio_Perez);
        GPAustria.add(GPAustria_Esteban_Ocon);
        GPAustria.add(GPAustria_Kevin_Magnussen);
        GPAustria.add(GPAustria_Lewis_Hamilton);
        GPAustria.add(GPAustria_Mick_Schumacher);
        GPAustria.add(GPAustria_Lando_Norris);
        GPAustria.add(GPAustria_Daniel_Ricciardo);
        GPAustria.add(GPAustria_Lance_Stroll);
        GPAustria.add(GPAustria_Zhou_Guanyu);
        GPAustria.add(GPAustria_Pierre_Gasly);
        GPAustria.add(GPAustria_Alexander_Albon);
        GPAustria.add(GPAustria_Yuki_Tsunoda);
        GPAustria.add(GPAustria_Nicholas_Latifi);
        GPAustria.add(GPAustria_Sebastian_Vettel);
        GPAustria.add(GPAustria_Fernando_Alonso);

        Klasemen GPFrance = new Klasemen();
        GPFrance.addTanggal("24 Jul 2022");

        Driver GPFrance_Charles_Leclerc = new Driver(1, "Charles Leclerc", GPAustria_Charles_Leclerc.getPoin(), 0);
        Driver GPFrance_Max_Verstappen = new Driver(2, "Max Verstappen", GPAustria_Max_Verstappen.getPoin(), 1);
        Driver GPFrance_Sergio_Perez = new Driver(3, "Sergio Perez", GPAustria_Sergio_Perez.getPoin(), 4);
        Driver GPFrance_Lewis_Hamilton = new Driver(4, "Lewis Hamilton", GPAustria_Lewis_Hamilton.getPoin(), 2);
        Driver GPFrance_Lando_Norris = new Driver(5, "Lando Norris", GPAustria_Lando_Norris.getPoin(), 7);
        Driver GPFrance_George_Russell = new Driver(6, "George Russell", GPAustria_George_Russell.getPoin(), 3);
        Driver GPFrance_Fernando_Alonso = new Driver(7, "Fernando Alonso", GPAustria_Fernando_Alonso.getPoin(), 6);
        Driver GPFrance_Yuki_Tsunoda = new Driver(8, "Yuki Tsunoda", GPAustria_Yuki_Tsunoda.getPoin(), 0);
        Driver GPFrance_Daniel_Ricciardo = new Driver(9, "Daniel Ricciardo", GPAustria_Daniel_Ricciardo.getPoin(), 9);
        Driver GPFrance_Esteban_Ocon = new Driver(10, "Esteban Ocon", GPAustria_Esteban_Ocon.getPoin(), 8);
        Driver GPFrance_Valtteri_Bottas = new Driver(11, "Valtteri Bottas", GPGreatBritanian_Valtteri_Bottas.getPoin(), 14);
        Driver GPFrance_Sebastian_Vettel = new Driver(12, "Sebastian Vettel", GPAustria_Sebastian_Vettel.getPoin(), 11);
        Driver GPFrance_Alexander_Albon = new Driver(13, "Alexander Albon", GPAustria_Alexander_Albon.getPoin(), 13);
        Driver GPFrance_Pierre_Gasly = new Driver(14, "Pierre Gasly", GPAustria_Pierre_Gasly.getPoin(), 12);
        Driver GPFrance_Lance_Stroll = new Driver(15, "Lance Stroll", GPAustria_Lance_Stroll.getPoin(), 10);
        Driver GPFrance_Zhou_Guanyu = new Driver(16, "Zhou Guanyu", GPAustria_Zhou_Guanyu.getPoin(), 16);
        Driver GPFrance_Mick_Schumacher = new Driver(17, "Mick Schumacher", GPAustria_Mick_Schumacher.getPoin(), 15);
        Driver GPFrance_Nicholas_Latifi = new Driver(18, "Nicholas Latifi", GPAustria_Nicholas_Latifi.getPoin(), 0);
        Driver GPFrance_Carlos_Sainz = new Driver(19, "Carlos Sainz", GPAustria_Carlos_Sainz.getPoin(), 5);
        Driver GPFrance_Kevin_Magnussen = new Driver(20, "Kevin Magnussen", GPAustria_Kevin_Magnussen.getPoin(), 0);

        GPFrance_Carlos_Sainz.BonusFastestLaps();
        GPFrance.add(GPFrance_Charles_Leclerc);
        GPFrance.add(GPFrance_Max_Verstappen);
        GPFrance.add(GPFrance_Sergio_Perez);
        GPFrance.add(GPFrance_Lewis_Hamilton);
        GPFrance.add(GPFrance_Lando_Norris);
        GPFrance.add(GPFrance_George_Russell);
        GPFrance.add(GPFrance_Fernando_Alonso);
        GPFrance.add(GPFrance_Yuki_Tsunoda);
        GPFrance.add(GPFrance_Daniel_Ricciardo);
        GPFrance.add(GPFrance_Esteban_Ocon);
        GPFrance.add(GPFrance_Valtteri_Bottas);
        GPFrance.add(GPFrance_Sebastian_Vettel);
        GPFrance.add(GPFrance_Alexander_Albon);
        GPFrance.add(GPFrance_Pierre_Gasly);
        GPFrance.add(GPFrance_Lance_Stroll);
        GPFrance.add(GPFrance_Zhou_Guanyu);
        GPFrance.add(GPFrance_Mick_Schumacher);
        GPFrance.add(GPFrance_Nicholas_Latifi);
        GPFrance.add(GPFrance_Carlos_Sainz);
        GPFrance.add(GPFrance_Kevin_Magnussen);

        Klasemen GPHungary = new Klasemen();
        GPHungary.addTanggal("31 Jul 2022");

        Driver GPHungary_George_Russell = new Driver(1, "George Russell", GPFrance_George_Russell.getPoin(), 3);
        Driver GPHungary_Carlos_Sainz = new Driver(2, "Carlos Sainz", GPFrance_Carlos_Sainz.getPoin(), 4);
        Driver GPHungary_Charles_Leclerc = new Driver(3, "Charles Leclerc", GPFrance_Charles_Leclerc.getPoin(), 6);
        Driver GPHungary_Lando_Norris = new Driver(4, "Lando Norris", GPFrance_Lando_Norris.getPoin(), 7);
        Driver GPHungary_Esteban_Ocon = new Driver(5, "Esteban Ocon", GPFrance_Esteban_Ocon.getPoin(), 9);
        Driver GPHungary_Fernando_Alonso = new Driver(6, "Fernando Alonso", GPFrance_Fernando_Alonso.getPoin(), 8);
        Driver GPHungary_Lewis_Hamilton = new Driver(7, "Lewis Hamilton", GPFrance_Lewis_Hamilton.getPoin(), 2);
        Driver GPHungary_Valtteri_Bottas = new Driver(8, "Valtteri Bottas", GPFrance_Valtteri_Bottas.getPoin(), 20);
        Driver GPHungary_Daniel_Ricciardo = new Driver(9, "Daniel Ricciardo", GPFrance_Daniel_Ricciardo.getPoin(), 15);
        Driver GPHungary_Max_Verstappen = new Driver(10, "Max Verstappen", GPFrance_Max_Verstappen.getPoin(), 1);
        Driver GPHungary_Sergio_Perez = new Driver(11, "Sergio Perez", GPFrance_Sergio_Perez.getPoin(), 5);
        Driver GPHungary_Zhou_Guanyu = new Driver(12, "Zhou Guanyu", GPFrance_Zhou_Guanyu.getPoin(), 13);
        Driver GPHungary_Kevin_Magnussen = new Driver(13, "Kevin Magnussen", GPFrance_Kevin_Magnussen.getPoin(), 16);
        Driver GPHungary_Lance_Stroll = new Driver(14, "Lance Stroll", GPFrance_Lance_Stroll.getPoin(), 11);
        Driver GPHungary_Mick_Schumacher = new Driver(15, "Mick Schumacher", GPFrance_Mick_Schumacher.getPoin(), 15);
        Driver GPHungary_Yuki_Tsunoda = new Driver(16, "Yuki Tsunoda", GPFrance_Yuki_Tsunoda.getPoin(), 19);
        Driver GPHungary_Alexander_Albon = new Driver(17, "Alexander Albon", GPFrance_Alexander_Albon.getPoin(), 17);
        Driver GPHungary_Sebastian_Vettel = new Driver(18, "Sebastian Vettel", GPFrance_Sebastian_Vettel.getPoin(), 10);
        Driver GPHungary_Nicholas_Latifi = new Driver(19, "Nicholas Latifi", GPFrance_Nicholas_Latifi.getPoin(), 18);
        Driver GPHungary_Pierre_Gasly = new Driver(20, "Pierre Gasly", GPFrance_Pierre_Gasly.getPoin(), 12);

        GPHungary_Lewis_Hamilton.BonusFastestLaps();
        GPHungary.add(GPHungary_George_Russell);
        GPHungary.add(GPHungary_Carlos_Sainz);
        GPHungary.add(GPHungary_Charles_Leclerc);
        GPHungary.add(GPHungary_Lando_Norris);
        GPHungary.add(GPHungary_Esteban_Ocon);
        GPHungary.add(GPHungary_Fernando_Alonso);
        GPHungary.add(GPHungary_Lewis_Hamilton);
        GPHungary.add(GPHungary_Valtteri_Bottas);
        GPHungary.add(GPHungary_Daniel_Ricciardo);
        GPHungary.add(GPHungary_Max_Verstappen);
        GPHungary.add(GPHungary_Sergio_Perez);
        GPHungary.add(GPHungary_Zhou_Guanyu);
        GPHungary.add(GPHungary_Kevin_Magnussen);
        GPHungary.add(GPHungary_Lance_Stroll);
        GPHungary.add(GPHungary_Mick_Schumacher);
        GPHungary.add(GPHungary_Yuki_Tsunoda);
        GPHungary.add(GPHungary_Alexander_Albon);
        GPHungary.add(GPHungary_Sebastian_Vettel);
        GPHungary.add(GPHungary_Nicholas_Latifi);
        GPHungary.add(GPHungary_Pierre_Gasly);

        Klasemen GPBelgium = new Klasemen();
        GPBelgium.addTanggal("28 Aug 2022");

        Driver GPBelgium_Carlos_Sainz = new Driver(1, "Carlos Sainz", GPHungary_Carlos_Sainz.getPoin(), 3);
        Driver GPBelgium_Sergio_Perez = new Driver(2, "Sergio Perez", GPHungary_Sergio_Perez.getPoin(), 2);
        Driver GPBelgium_Fernando_Alonso = new Driver(3, "Fernando Alonso", GPHungary_Fernando_Alonso.getPoin(), 5);
        Driver GPBelgium_Lewis_Hamilton = new Driver(4, "Lewis Hamilton", GPHungary_Lewis_Hamilton.getPoin(), 0);
        Driver GPBelgium_George_Russell = new Driver(5, "George Russell", GPHungary_George_Russell.getPoin(), 4);
        Driver GPBelgium_Alexander_Albon = new Driver(6, "Alexander Albon", GPHungary_Alexander_Albon.getPoin(), 10);
        Driver GPBelgium_Daniel_Ricciardo = new Driver(7, "Daniel Ricciardo", GPHungary_Daniel_Ricciardo.getPoin(), 15);
        Driver GPBelgium_Pierre_Gasly = new Driver(8, "Pierre Gasly", GPHungary_Pierre_Gasly.getPoin(), 9);
        Driver GPBelgium_Lance_Stroll = new Driver(9, "Lance Stroll", GPHungary_Lance_Stroll.getPoin(), 11);
        Driver GPBelgium_Sebastian_Vettel = new Driver(10, "Sebastian Vettel", GPHungary_Sebastian_Vettel.getPoin(), 8);
        Driver GPBelgium_Nicholas_Latifi = new Driver(11, "Nicholas Latifi", GPHungary_Nicholas_Latifi.getPoin(), 18);
        Driver GPBelgium_Kevin_Magnussen = new Driver(12, "Kevin Magnussen", GPHungary_Kevin_Magnussen.getPoin(), 16);
        Driver GPBelgium_Valtteri_Bottas = new Driver(13, "Valtteri Bottas", GPHungary_Valtteri_Bottas.getPoin(), 0);
        Driver GPBelgium_Max_Verstappen = new Driver(14, "Max Verstappen", GPHungary_Max_Verstappen.getPoin(), 1);
        Driver GPBelgium_Charles_Leclerc = new Driver(15, "Charles Leclerc", GPHungary_Charles_Leclerc.getPoin(), 6);
        Driver GPBelgium_Esteban_Ocon = new Driver(16, "Esteban Ocon", GPHungary_Esteban_Ocon.getPoin(), 7);
        Driver GPBelgium_Lando_Norris = new Driver(17, "Lando Norris", GPHungary_Lando_Norris.getPoin(), 12);
        Driver GPBelgium_Zhou_Guanyu = new Driver(18, "Zhou Guanyu", GPHungary_Zhou_Guanyu.getPoin(), 14);
        Driver GPBelgium_Mick_Schumacher = new Driver(19, "Mick Schumacher", GPHungary_Mick_Schumacher.getPoin(), 17);
        Driver GPBelgium_Yuki_Tsunoda = new Driver(20, "Yuki Tsunoda", GPHungary_Yuki_Tsunoda.getPoin(), 13);

        GPBelgium_Max_Verstappen.BonusFastestLaps();
        GPBelgium.add(GPBelgium_Carlos_Sainz);
        GPBelgium.add(GPBelgium_Sergio_Perez);
        GPBelgium.add(GPBelgium_Fernando_Alonso);
        GPBelgium.add(GPBelgium_Lewis_Hamilton);
        GPBelgium.add(GPBelgium_George_Russell);
        GPBelgium.add(GPBelgium_Alexander_Albon);
        GPBelgium.add(GPBelgium_Daniel_Ricciardo);
        GPBelgium.add(GPBelgium_Pierre_Gasly);
        GPBelgium.add(GPBelgium_Lance_Stroll);
        GPBelgium.add(GPBelgium_Sebastian_Vettel);
        GPBelgium.add(GPBelgium_Nicholas_Latifi);
        GPBelgium.add(GPBelgium_Kevin_Magnussen);
        GPBelgium.add(GPBelgium_Valtteri_Bottas);
        GPBelgium.add(GPBelgium_Max_Verstappen);
        GPBelgium.add(GPBelgium_Charles_Leclerc);
        GPBelgium.add(GPBelgium_Esteban_Ocon);
        GPBelgium.add(GPBelgium_Lando_Norris);
        GPBelgium.add(GPBelgium_Zhou_Guanyu);
        GPBelgium.add(GPBelgium_Mick_Schumacher);
        GPBelgium.add(GPBelgium_Yuki_Tsunoda);

        Klasemen GPNetherlands = new Klasemen();
        GPNetherlands.addTanggal("04 Sep 2022");

        Driver GPNetherlands_Max_Verstappen = new Driver(1, "Max Verstappen", GPBelgium_Max_Verstappen.getPoin(), 1);
        Driver GPNetherlands_Charles_Leclerc = new Driver(2, "Charles Leclerc", GPBelgium_Charles_Leclerc.getPoin(), 3);
        Driver GPNetherlands_Carlos_Sainz = new Driver(3, "Carlos Sainz", GPBelgium_Carlos_Sainz.getPoin(), 8);
        Driver GPNetherlands_Lewis_Hamilton = new Driver(4, "Lewis Hamilton", GPBelgium_Lewis_Hamilton.getPoin(), 4);
        Driver GPNetherlands_Sergio_Perez = new Driver(5, "Sergio Perez", GPBelgium_Sergio_Perez.getPoin(), 5);
        Driver GPNetherlands_George_Russell = new Driver(6, "George Russell", GPBelgium_George_Russell.getPoin(), 2);
        Driver GPNetherlands_Lando_Norris = new Driver(7, "Lando Norris", GPBelgium_Lando_Norris.getPoin(), 7);
        Driver GPNetherlands_Mick_Schumacher = new Driver(8, "Mick Schumacher", GPBelgium_Mick_Schumacher.getPoin(), 13);
        Driver GPNetherlands_Yuki_Tsunoda = new Driver(9, "Yuki Tsunoda", GPBelgium_Yuki_Tsunoda.getPoin(), 0);
        Driver GPNetherlands_Lance_Stroll = new Driver(10, "Lance Stroll", GPBelgium_Lance_Stroll.getPoin(), 10);
        Driver GPNetherlands_Pierre_Gasly = new Driver(11, "Pierre Gasly", GPBelgium_Pierre_Gasly.getPoin(), 11);
        Driver GPNetherlands_Esteban_Ocon = new Driver(12, "Esteban Ocon", GPBelgium_Esteban_Ocon.getPoin(), 9);
        Driver GPNetherlands_Fernando_Alonso = new Driver(13, "Fernando Alonso", GPBelgium_Fernando_Alonso.getPoin(), 6);
        Driver GPNetherlands_Zhou_Guanyu = new Driver(14, "Zhou Guanyu", GPBelgium_Zhou_Guanyu.getPoin(), 16);
        Driver GPNetherlands_Alexander_Albon = new Driver(15, "Alexander Albon", GPBelgium_Alexander_Albon.getPoin(), 12);
        Driver GPNetherlands_Valtteri_Bottas = new Driver(16, "Valtteri Bottas", GPBelgium_Valtteri_Bottas.getPoin(), 0);
        Driver GPNetherlands_Daniel_Ricciardo = new Driver(17, "Daniel Ricciardo", GPBelgium_Daniel_Ricciardo.getPoin(), 17);
        Driver GPNetherlands_Kevin_Magnussen = new Driver(18, "Kevin Magnussen", GPBelgium_Kevin_Magnussen.getPoin(), 15);
        Driver GPNetherlands_Sebastian_Vettel = new Driver(19, "Sebastian Vettel", GPBelgium_Sebastian_Vettel.getPoin(), 5);
        Driver GPNetherlands_Nicholas_Latifi = new Driver(20, "Nicholas Latifi", GPBelgium_Nicholas_Latifi.getPoin(), 18);

        GPNetherlands_Max_Verstappen.BonusFastestLaps();
        GPNetherlands.add(GPNetherlands_Max_Verstappen);
        GPNetherlands.add(GPNetherlands_Charles_Leclerc);
        GPNetherlands.add(GPNetherlands_Carlos_Sainz);
        GPNetherlands.add(GPNetherlands_Lewis_Hamilton);
        GPNetherlands.add(GPNetherlands_Sergio_Perez);
        GPNetherlands.add(GPNetherlands_George_Russell);
        GPNetherlands.add(GPNetherlands_Lando_Norris);
        GPNetherlands.add(GPNetherlands_Mick_Schumacher);
        GPNetherlands.add(GPNetherlands_Yuki_Tsunoda);
        GPNetherlands.add(GPNetherlands_Lance_Stroll);
        GPNetherlands.add(GPNetherlands_Pierre_Gasly);
        GPNetherlands.add(GPNetherlands_Esteban_Ocon);
        GPNetherlands.add(GPNetherlands_Fernando_Alonso);
        GPNetherlands.add(GPNetherlands_Zhou_Guanyu);
        GPNetherlands.add(GPNetherlands_Alexander_Albon);
        GPNetherlands.add(GPNetherlands_Valtteri_Bottas);
        GPNetherlands.add(GPNetherlands_Daniel_Ricciardo);
        GPNetherlands.add(GPNetherlands_Kevin_Magnussen);
        GPNetherlands.add(GPNetherlands_Sebastian_Vettel);
        GPNetherlands.add(GPNetherlands_Nicholas_Latifi);

        Klasemen GPItaly = new Klasemen();
        GPItaly.addTanggal("11 Sep 2022");

        Driver GPItaly_Charles_Leclerc = new Driver(1, "Charles Leclerc", GPNetherlands_Charles_Leclerc.getPoin(), 2);
        Driver GPItaly_George_Russell = new Driver(2, "George Russell", GPNetherlands_George_Russell.getPoin(), 3);
        Driver GPItaly_Lando_Norris = new Driver(3, "Lando Norris", GPNetherlands_Lando_Norris.getPoin(), 7);
        Driver GPItaly_Daniel_Ricciardo = new Driver(4, "Daniel Ricciardo", GPNetherlands_Daniel_Ricciardo.getPoin(), 0);
        Driver GPItaly_Pierre_Gasly = new Driver(5, "Pierre Gasly", GPNetherlands_Pierre_Gasly.getPoin(), 8);
        Driver GPItaly_Fernando_Alonso = new Driver(6, "Fernando Alonso", GPNetherlands_Fernando_Alonso.getPoin(), 0);
        Driver GPItaly_Max_Verstappen = new Driver(7, "Max Verstappen", GPNetherlands_Max_Verstappen.getPoin(), 1);
        Driver GPItaly_Nyck_De_Vries = new Driver(8, "Nyck De Vries", 0, 9); // anyaran jir, main gur pisan
        Driver GPItaly_Zhou_Guanyu = new Driver(9, "Zhou Guanyu", GPNetherlands_Zhou_Guanyu.getPoin(), 10);
        Driver GPItaly_Nicholas_Latifi = new Driver(10, "Nicholas Latifi", GPNetherlands_Nicholas_Latifi.getPoin(), 15);
        Driver GPItaly_Sebastian_Vettel = new Driver(11, "Sebastian Vettel", GPNetherlands_Sebastian_Vettel.getPoin(), 0);
        Driver GPItaly_Lance_Stroll = new Driver(12, "Lance Stroll", GPNetherlands_Lance_Stroll.getPoin(), 0);
        Driver GPItaly_Sergio_Perez = new Driver(13, "Sergio Perez", GPNetherlands_Sergio_Perez.getPoin(), 6);
        Driver GPItaly_Esteban_Ocon = new Driver(14, "Esteban Ocon", GPNetherlands_Esteban_Ocon.getPoin(), 11);
        Driver GPItaly_Valtteri_Bottas = new Driver(15, "Valtteri Bottas", GPNetherlands_Valtteri_Bottas.getPoin(), 13);
        Driver GPItaly_Kevin_Magnussen = new Driver(16, "Kevin Magnussen", GPNetherlands_Kevin_Magnussen.getPoin(), 16);
        Driver GPItaly_Mick_Schumacher = new Driver(17, "Mick Schumacher", GPNetherlands_Mick_Schumacher.getPoin(), 12);
        Driver GPItaly_Carlos_Sainz = new Driver(18, "Carlos Sainz", GPNetherlands_Carlos_Sainz.getPoin(), 4);
        Driver GPItaly_Lewis_Hamilton = new Driver(19, "Lewis Hamilton", GPNetherlands_Lewis_Hamilton.getPoin(), 5);
        Driver GPItaly_Yuki_Tsunoda = new Driver(20, "Yuki Tsunoda", GPNetherlands_Yuki_Tsunoda.getPoin(), 14);

        GPItaly_Sergio_Perez.BonusFastestLaps();
        GPItaly.add(GPItaly_Charles_Leclerc);
        GPItaly.add(GPItaly_George_Russell);
        GPItaly.add(GPItaly_Lando_Norris);
        GPItaly.add(GPItaly_Daniel_Ricciardo);
        GPItaly.add(GPItaly_Pierre_Gasly);
        GPItaly.add(GPItaly_Fernando_Alonso);
        GPItaly.add(GPItaly_Max_Verstappen);
        GPItaly.add(GPItaly_Nyck_De_Vries);
        GPItaly.add(GPItaly_Zhou_Guanyu);
        GPItaly.add(GPItaly_Nicholas_Latifi);
        GPItaly.add(GPItaly_Sebastian_Vettel);
        GPItaly.add(GPItaly_Lance_Stroll);
        GPItaly.add(GPItaly_Sergio_Perez);
        GPItaly.add(GPItaly_Esteban_Ocon);
        GPItaly.add(GPItaly_Valtteri_Bottas);
        GPItaly.add(GPItaly_Kevin_Magnussen);
        GPItaly.add(GPItaly_Mick_Schumacher);
        GPItaly.add(GPItaly_Carlos_Sainz);
        GPItaly.add(GPItaly_Lewis_Hamilton);
        GPItaly.add(GPItaly_Yuki_Tsunoda);

        Klasemen GPSingapore = new Klasemen();
        GPSingapore.addTanggal("02 Oct 2022");

        Driver GPSingapore_Charles_Leclerc = new Driver(1, "Charles Leclerc", GPItaly_Charles_Leclerc.getPoin(), 2);
        Driver GPSingapore_Sergio_Perez = new Driver(2, "Sergio Perez", GPItaly_Sergio_Perez.getPoin(), 1);
        Driver GPSingapore_Lewis_Hamilton = new Driver(3, "Lewis Hamilton", GPItaly_Lewis_Hamilton.getPoin(), 9);
        Driver GPSingapore_Carlos_Sainz = new Driver(4, "Carlos Sainz", GPItaly_Carlos_Sainz.getPoin(), 3);
        Driver GPSingapore_Fernando_Alonso = new Driver(5, "Fernando Alonso", GPItaly_Fernando_Alonso.getPoin(), 0);
        Driver GPSingapore_Lando_Norris = new Driver(6, "Lando Norris", GPItaly_Lando_Norris.getPoin(), 4);
        Driver GPSingapore_Pierre_Gasly = new Driver(7, "Pierre Gasly", GPItaly_Pierre_Gasly.getPoin(), 10);
        Driver GPSingapore_Max_Verstappen = new Driver(8, "Max Verstappen", GPItaly_Max_Verstappen.getPoin(), 7);
        Driver GPSingapore_Kevin_Magnussen = new Driver(9, "Kevin Magnussen", GPItaly_Kevin_Magnussen.getPoin(), 12);
        Driver GPSingapore_Yuki_Tsunoda = new Driver(10, "Yuki Tsunoda", GPItaly_Yuki_Tsunoda.getPoin(), 0);
        Driver GPSingapore_Lance_Stroll = new Driver(11, "Lance Stroll", GPItaly_Lance_Stroll.getPoin(), 6);
        Driver GPSingapore_Mick_Schumacher = new Driver(12, "Mick Schumacher", GPItaly_Mick_Schumacher.getPoin(), 13);
        Driver GPSingapore_Sebastian_Vettel = new Driver(13, "Sebastian Vettel", GPItaly_Sebastian_Vettel.getPoin(), 8);
        Driver GPSingapore_Zhou_Guanyu = new Driver(14, "Zhou Guanyu", GPItaly_Zhou_Guanyu.getPoin(), 0);
        Driver GPSingapore_Valtteri_Bottas = new Driver(15, "Valtteri Bottas", GPItaly_Valtteri_Bottas.getPoin(), 11);
        Driver GPSingapore_Daniel_Ricciardo = new Driver(16, "Daniel Ricciardo", GPItaly_Daniel_Ricciardo.getPoin(), 5);
        Driver GPSingapore_Esteban_Ocon = new Driver(17, "Esteban Ocon", GPItaly_Esteban_Ocon.getPoin(), 0);
        Driver GPSingapore_Alexander_Albon = new Driver(18, "Alexander Albon", GPNetherlands_Alexander_Albon.getPoin(), 0);
        Driver GPSingapore_Nicholas_Latifi = new Driver(19, "Nicholas Latifi", GPItaly_Nicholas_Latifi.getPoin(), 0);
        Driver GPSingapore_George_Russell = new Driver(20, "George Russell", GPItaly_George_Russell.getPoin(), 14);

        GPSingapore.add(GPSingapore_Charles_Leclerc);
        GPSingapore.add(GPSingapore_Sergio_Perez);
        GPSingapore.add(GPSingapore_Lewis_Hamilton);
        GPSingapore.add(GPSingapore_Carlos_Sainz);
        GPSingapore.add(GPSingapore_Fernando_Alonso);
        GPSingapore.add(GPSingapore_Lando_Norris);
        GPSingapore.add(GPSingapore_Pierre_Gasly);
        GPSingapore.add(GPSingapore_Max_Verstappen);
        GPSingapore.add(GPSingapore_Kevin_Magnussen);
        GPSingapore.add(GPSingapore_Yuki_Tsunoda);
        GPSingapore.add(GPSingapore_Lance_Stroll);
        GPSingapore.add(GPSingapore_Mick_Schumacher);
        GPSingapore.add(GPSingapore_Sebastian_Vettel);
        GPSingapore.add(GPSingapore_Zhou_Guanyu);
        GPSingapore.add(GPSingapore_Valtteri_Bottas);
        GPSingapore.add(GPSingapore_Daniel_Ricciardo);
        GPSingapore.add(GPSingapore_Esteban_Ocon);
        GPSingapore.add(GPSingapore_Alexander_Albon);
        GPSingapore.add(GPSingapore_Nicholas_Latifi);
        GPSingapore.add(GPSingapore_George_Russell);

        Klasemen GPJapan = new Klasemen();
        GPJapan.addTanggal("09 Oct 2022");

        Driver GPJapan_Max_Verstappen = new Driver(1, "Max Verstappen", GPSingapore_Max_Verstappen.getPoin(), 1);
        Driver GPJapan_Charles_Leclerc = new Driver(2, "Charles Leclerc", GPSingapore_Charles_Leclerc.getPoin(), 3);
        Driver GPJapan_Carlos_Sainz = new Driver(3, "Carlos Sainz", GPSingapore_Carlos_Sainz.getPoin(), 0);
        Driver GPJapan_Sergio_Perez = new Driver(4, "Sergio Perez", GPSingapore_Sergio_Perez.getPoin(), 2);
        Driver GPJapan_Esteban_Ocon = new Driver(5, "Esteban Ocon", GPSingapore_Esteban_Ocon.getPoin(), 4);
        Driver GPJapan_Lewis_Hamilton = new Driver(6, "Lewis Hamilton", GPSingapore_Lewis_Hamilton.getPoin(), 5);
        Driver GPJapan_Fernando_Alonso = new Driver(7, "Fernando Alonso", GPSingapore_Fernando_Alonso.getPoin(), 7);
        Driver GPJapan_George_Russell = new Driver(8, "George Russell", GPSingapore_George_Russell.getPoin(), 8);
        Driver GPJapan_Sebastian_Vettel = new Driver(9, "Sebastian Vettel", GPSingapore_Sebastian_Vettel.getPoin(), 6);
        Driver GPJapan_Lando_Norris = new Driver(10, "Lando Norris", GPSingapore_Lando_Norris.getPoin(), 10);
        Driver GPJapan_Daniel_Ricciardo = new Driver(11, "Daniel Ricciardo", GPSingapore_Daniel_Ricciardo.getPoin(), 11);
        Driver GPJapan_Valtteri_Bottas = new Driver(12, "Valtteri Bottas", GPSingapore_Valtteri_Bottas.getPoin(), 15);
        Driver GPJapan_Yuki_Tsunoda = new Driver(13, "Yuki Tsunoda", GPSingapore_Yuki_Tsunoda.getPoin(), 13);
        Driver GPJapan_Zhou_Guanyu = new Driver(14, "Zhou Guanyu", GPSingapore_Zhou_Guanyu.getPoin(), 16);
        Driver GPJapan_Mick_Schumacher = new Driver(15, "Mick Schumacher", GPSingapore_Zhou_Guanyu.getPoin(), 17);
        Driver GPJapan_Alexander_Albon = new Driver(16, "Alexander Albon", GPSingapore_Alexander_Albon.getPoin(), 0);
        Driver GPJapan_Kevin_Magnussen = new Driver(17, "Kevin Magnussen", GPSingapore_Kevin_Magnussen.getPoin(), 14);
        Driver GPJapan_Lance_Stroll = new Driver(18, "Lance Stroll", GPSingapore_Lance_Stroll.getPoin(), 12);
        Driver GPJapan_Nicholas_Latifi = new Driver(19, "Nicholas Latifi", GPSingapore_Nicholas_Latifi.getPoin(), 9);

        GPJapan.add(GPJapan_Max_Verstappen);
        GPJapan.add(GPJapan_Charles_Leclerc);
        GPJapan.add(GPJapan_Carlos_Sainz);
        GPJapan.add(GPJapan_Sergio_Perez);
        GPJapan.add(GPJapan_Esteban_Ocon);
        GPJapan.add(GPJapan_Lewis_Hamilton);
        GPJapan.add(GPJapan_Fernando_Alonso);
        GPJapan.add(GPJapan_George_Russell);
        GPJapan.add(GPJapan_Sebastian_Vettel);
        GPJapan.add(GPJapan_Lando_Norris);
        GPJapan.add(GPJapan_Daniel_Ricciardo);
        GPJapan.add(GPJapan_Valtteri_Bottas);
        GPJapan.add(GPJapan_Yuki_Tsunoda);
        GPJapan.add(GPJapan_Zhou_Guanyu);
        GPJapan.add(GPJapan_Mick_Schumacher);
        GPJapan.add(GPJapan_Alexander_Albon);
        GPJapan.add(GPJapan_Kevin_Magnussen);
        GPJapan.add(GPJapan_Lance_Stroll);
        GPJapan.add(GPJapan_Nicholas_Latifi);

        Klasemen GPUnitedStates = new Klasemen();
        GPUnitedStates.addTanggal("23 Oct 2022");

        Driver GPUnitedStates_Carlos_Sainz = new Driver(1, "Carlos Sainz", GPJapan_Carlos_Sainz.getPoin(), 0);
        Driver GPUnitedStates_Max_Verstappen = new Driver(2, "Max Verstappen", GPJapan_Max_Verstappen.getPoin(), 1);
        Driver GPUnitedStates_Lewis_Hamilton = new Driver(3, "Lewis Hamilton", GPJapan_Lewis_Hamilton.getPoin(), 2);
        Driver GPUnitedStates_George_Russell = new Driver(4, "George Russell", GPJapan_George_Russell.getPoin(), 5);
        Driver GPUnitedStates_Lance_Stroll = new Driver(5, "Lance Stroll", GPJapan_Lance_Stroll.getPoin(), 0);
        Driver GPUnitedStates_Lando_Norris = new Driver(6, "Lando Norris", GPJapan_Lando_Norris.getPoin(), 6);
        Driver GPUnitedStates_Valtteri_Bottas = new Driver(7, "Valtteri Bottas", GPJapan_Valtteri_Bottas.getPoin(), 0);
        Driver GPUnitedStates_Alexander_Albon = new Driver(8, "Alexander Albon", GPJapan_Alexander_Albon.getPoin(), 13);
        Driver GPUnitedStates_Sergio_Perez = new Driver(9, "Sergio Perez", GPJapan_Sergio_Perez.getPoin(), 4);
        Driver GPUnitedStates_Sebastian_Vettel = new Driver(10, "Sebastian Vettel", GPJapan_Sebastian_Vettel.getPoin(), 8);
        Driver GPUnitedStates_Pierre_Gasly = new Driver(11, "Pierre Gasly", GPSingapore_Pierre_Gasly.getPoin(), 14);
        Driver GPUnitedStates_Charles_Leclerc = new Driver(12, "Charles Leclerc", GPJapan_Charles_Leclerc.getPoin(), 3);
        Driver GPUnitedStates_Kevin_Magnussen = new Driver(13, "Kevin Magnussen", GPJapan_Kevin_Magnussen.getPoin(), 9);
        Driver GPUnitedStates_Fernando_Alonso = new Driver(14, "Fernando Alonso", GPJapan_Fernando_Alonso.getPoin(), 7);
        Driver GPUnitedStates_Daniel_Ricciardo = new Driver(15, "Daniel Ricciardo", GPJapan_Daniel_Ricciardo.getPoin(), 17);
        Driver GPUnitedStates_Mick_Schumacher = new Driver(16, "Mick Schumacher", GPJapan_Mick_Schumacher.getPoin(), 15);
        Driver GPUnitedStates_Nicholas_Latifi = new Driver(17, "Nicholas Latifi", GPJapan_Nicholas_Latifi.getPoin(), 17);
        Driver GPUnitedStates_Zhou_Guanyu = new Driver(18, "Zhou Guanyu", GPJapan_Zhou_Guanyu.getPoin(), 12);
        Driver GPUnitedStates_Yuki_Tsunoda = new Driver(19, "Yuki Tsunoda", GPJapan_Yuki_Tsunoda.getPoin(), 10);
        Driver GPUnitedStates_Esteban_Ocon = new Driver(20, "Esteban Ocon", GPJapan_Esteban_Ocon.getPoin(), 11);

        GPUnitedStates_George_Russell.BonusFastestLaps();
        GPUnitedStates.add(GPUnitedStates_Carlos_Sainz);
        GPUnitedStates.add(GPUnitedStates_Max_Verstappen);
        GPUnitedStates.add(GPUnitedStates_Lewis_Hamilton);
        GPUnitedStates.add(GPUnitedStates_George_Russell);
        GPUnitedStates.add(GPUnitedStates_Lance_Stroll);
        GPUnitedStates.add(GPUnitedStates_Lando_Norris);
        GPUnitedStates.add(GPUnitedStates_Valtteri_Bottas);
        GPUnitedStates.add(GPUnitedStates_Alexander_Albon);
        GPUnitedStates.add(GPUnitedStates_Sergio_Perez);
        GPUnitedStates.add(GPUnitedStates_Sebastian_Vettel);
        GPUnitedStates.add(GPUnitedStates_Pierre_Gasly);
        GPUnitedStates.add(GPUnitedStates_Charles_Leclerc);
        GPUnitedStates.add(GPUnitedStates_Kevin_Magnussen);
        GPUnitedStates.add(GPUnitedStates_Fernando_Alonso);
        GPUnitedStates.add(GPUnitedStates_Daniel_Ricciardo);
        GPUnitedStates.add(GPUnitedStates_Mick_Schumacher);
        GPUnitedStates.add(GPUnitedStates_Nicholas_Latifi);
        GPUnitedStates.add(GPUnitedStates_Zhou_Guanyu);
        GPUnitedStates.add(GPUnitedStates_Yuki_Tsunoda);
        GPUnitedStates.add(GPUnitedStates_Esteban_Ocon);

        Klasemen GPMexico = new Klasemen();
        GPMexico.addTanggal("30 Oct 2022");

        Driver GPMexico_Max_Verstappen = new Driver(1, "Max Verstappen", GPUnitedStates_Max_Verstappen.getPoin(), 1);
        Driver GPMexico_George_Russell = new Driver(2, "George Russell", GPUnitedStates_George_Russell.getPoin(), 4);
        Driver GPMexico_Lewis_Hamilton = new Driver(3, "Lewis Hamilton", GPUnitedStates_Lewis_Hamilton.getPoin(), 2);
        Driver GPMexico_Sergio_Perez = new Driver(4, "Sergio Perez", GPUnitedStates_Sergio_Perez.getPoin(), 3);
        Driver GPMexico_Carlos_Sainz = new Driver(5, "Carlos Sainz", GPUnitedStates_Carlos_Sainz.getPoin(), 5);
        Driver GPMexico_Valtteri_Bottas = new Driver(6, "Valtteri Bottas", GPUnitedStates_Valtteri_Bottas.getPoin(), 10);
        Driver GPMexico_Charles_Leclerc = new Driver(7, "Charles Leclerc", GPUnitedStates_Charles_Leclerc.getPoin(), 6);
        Driver GPMexico_Lando_Norris = new Driver(8, "Lando Norris", GPUnitedStates_Lando_Norris.getPoin(), 9);
        Driver GPMexico_Fernando_Alonso = new Driver(9, "Fernando Alonso", GPUnitedStates_Fernando_Alonso.getPoin(), 19);
        Driver GPMexico_Esteban_Ocon = new Driver(10, "Esteban Ocon", GPUnitedStates_Esteban_Ocon.getPoin(), 8);
        Driver GPMexico_Daniel_Ricciardo = new Driver(11, "Daniel Ricciardo", GPUnitedStates_Daniel_Ricciardo.getPoin(), 7);
        Driver GPMexico_Zhou_Guanyu = new Driver(12, "Zhou Guanyu", GPUnitedStates_Zhou_Guanyu.getPoin(), 13);
        Driver GPMexico_Yuki_Tsunoda = new Driver(13, "Yuki Tsunoda", GPUnitedStates_Yuki_Tsunoda.getPoin(), 0);
        Driver GPMexico_Pierre_Gasly = new Driver(14, "Pierre Gasly", GPUnitedStates_Pierre_Gasly.getPoin(), 11);
        Driver GPMexico_Mick_Schumacher = new Driver(15, "Mick Schumacher", GPUnitedStates_Mick_Schumacher.getPoin(), 16);
        Driver GPMexico_Sebastian_Vettel = new Driver(16, "Sebastian Vettel", GPUnitedStates_Sebastian_Vettel.getPoin(), 14);
        Driver GPMexico_Alexander_Albon = new Driver(17, "Alexander Albon", GPUnitedStates_Alexander_Albon.getPoin(), 12);
        Driver GPMexico_Nicholas_Latifi = new Driver(18, "Nicholas Latifi", GPUnitedStates_Nicholas_Latifi.getPoin(), 18);
        Driver GPMexico_Kevin_Magnussen = new Driver(19, "Kevin Magnussen", GPUnitedStates_Kevin_Magnussen.getPoin(), 17);
        Driver GPMexico_Lance_Stroll = new Driver(20, "Lance Stroll", GPUnitedStates_Lance_Stroll.getPoin(), 15);

        GPMexico_George_Russell.BonusFastestLaps();
        GPMexico.add(GPMexico_Max_Verstappen);
        GPMexico.add(GPMexico_George_Russell);
        GPMexico.add(GPMexico_Lewis_Hamilton);
        GPMexico.add(GPMexico_Sergio_Perez);
        GPMexico.add(GPMexico_Carlos_Sainz);
        GPMexico.add(GPMexico_Valtteri_Bottas);
        GPMexico.add(GPMexico_Charles_Leclerc);
        GPMexico.add(GPMexico_Lando_Norris);
        GPMexico.add(GPMexico_Fernando_Alonso);
        GPMexico.add(GPMexico_Esteban_Ocon);
        GPMexico.add(GPMexico_Daniel_Ricciardo);
        GPMexico.add(GPMexico_Zhou_Guanyu);
        GPMexico.add(GPMexico_Yuki_Tsunoda);
        GPMexico.add(GPMexico_Pierre_Gasly);
        GPMexico.add(GPMexico_Mick_Schumacher);
        GPMexico.add(GPMexico_Sebastian_Vettel);
        GPMexico.add(GPMexico_Alexander_Albon);
        GPMexico.add(GPMexico_Nicholas_Latifi);
        GPMexico.add(GPMexico_Kevin_Magnussen);
        GPMexico.add(GPMexico_Lance_Stroll);

        Klasemen GPBrazil = new Klasemen();
        GPBrazil.addTanggal("13 Nov 2022");

        Driver GPBrazil_George_Russell = new Driver(1, "George Russell", GPMexico_George_Russell.getPoin(), 1);
        Driver GPBrazil_Lewis_Hamilton = new Driver(2, "Lewis Hamilton", GPMexico_Lewis_Hamilton.getPoin(), 2);
        Driver GPBrazil_Max_Verstappen = new Driver(3, "Max Verstappen", GPMexico_Max_Verstappen.getPoin(), 6);
        Driver GPBrazil_Sergio_Perez = new Driver(4, "Sergio Perez", GPMexico_Sergio_Perez.getPoin(), 7);
        Driver GPBrazil_Charles_Leclerc = new Driver(5, "Charles Leclerc", GPMexico_Charles_Leclerc.getPoin(), 4);
        Driver GPBrazil_Lando_Norris = new Driver(6, "Lando Norris", GPMexico_Lando_Norris.getPoin(), 0);
        Driver GPBrazil_Carlos_Sainz = new Driver(7, "Carlos Sainz", GPMexico_Carlos_Sainz.getPoin(), 3);
        Driver GPBrazil_Kevin_Magnussen = new Driver(8, "Kevin Magnussen", GPMexico_Kevin_Magnussen.getPoin(), 0);
        Driver GPBrazil_Sebastian_Vettel = new Driver(9, "Sebastian Vettel", GPMexico_Sebastian_Vettel.getPoin(), 11);
        Driver GPBrazil_Pierre_Gasly = new Driver(10, "Pierre Gasly", GPMexico_Pierre_Gasly.getPoin(), 14);
        Driver GPBrazil_Daniel_Ricciardo = new Driver(11, "Daniel Ricciardo", GPMexico_Daniel_Ricciardo.getPoin(), 0);
        Driver GPBrazil_Mick_Schumacher = new Driver(12, "Mick Schumacher", GPMexico_Daniel_Ricciardo.getPoin(), 13);
        Driver GPBrazil_Zhou_Guanyu = new Driver(13, "Zhou Guanyu", GPMexico_Zhou_Guanyu.getPoin(), 12);
        Driver GPBrazil_Valtteri_Bottas = new Driver(14, "Valtteri Bottas", GPMexico_Valtteri_Bottas.getPoin(), 9);
        Driver GPBrazil_Lance_Stroll = new Driver(15, "Lance Stroll", GPMexico_Lance_Stroll.getPoin(), 10);
        Driver GPBrazil_Esteban_Ocon = new Driver(16, "Esteban Ocon", GPMexico_Esteban_Ocon.getPoin(), 8);
        Driver GPBrazil_Fernando_Alonso = new Driver(17, "Fernando Alonso", GPMexico_Fernando_Alonso.getPoin(), 5);
        Driver GPBrazil_Nicholas_Latifi = new Driver(18, "Nicholas Latifi", GPMexico_Nicholas_Latifi.getPoin(), 16);
        Driver GPBrazil_Alexander_Albon = new Driver(19, "Alexander Albon", GPMexico_Alexander_Albon.getPoin(), 15);
        Driver GPBrazil_Yuki_Tsunoda = new Driver(20, "Yuki Tsunoda", GPMexico_Yuki_Tsunoda.getPoin(), 17);

        GPBrazil_George_Russell.BonusFastestLaps();
        GPBrazil.add(GPBrazil_George_Russell);
        GPBrazil.add(GPBrazil_Lewis_Hamilton);
        GPBrazil.add(GPBrazil_Max_Verstappen);
        GPBrazil.add(GPBrazil_Sergio_Perez);
        GPBrazil.add(GPBrazil_Charles_Leclerc);
        GPBrazil.add(GPBrazil_Lando_Norris);
        GPBrazil.add(GPBrazil_Carlos_Sainz);
        GPBrazil.add(GPBrazil_Kevin_Magnussen);
        GPBrazil.add(GPBrazil_Sebastian_Vettel);
        GPBrazil.add(GPBrazil_Pierre_Gasly);
        GPBrazil.add(GPBrazil_Daniel_Ricciardo);
        GPBrazil.add(GPBrazil_Mick_Schumacher);
        GPBrazil.add(GPBrazil_Zhou_Guanyu);
        GPBrazil.add(GPBrazil_Valtteri_Bottas);
        GPBrazil.add(GPBrazil_Lance_Stroll);
        GPBrazil.add(GPBrazil_Esteban_Ocon);
        GPBrazil.add(GPBrazil_Fernando_Alonso);
        GPBrazil.add(GPBrazil_Nicholas_Latifi);
        GPBrazil.add(GPBrazil_Alexander_Albon);
        GPBrazil.add(GPBrazil_Yuki_Tsunoda);

        Klasemen GPAbuDhabi = new Klasemen();
        GPAbuDhabi.addTanggal("20 Nov 2022");

        Driver GPAbuDhabi_Max_Verstappen = new Driver(1, "Max Verstappen", GPBrazil_Max_Verstappen.getPoin(), 1);
        Driver GPAbuDhabi_Sergio_Perez = new Driver(2, "Sergio Perez", GPBrazil_Sergio_Perez.getPoin(), 3);
        Driver GPAbuDhabi_Charles_Leclerc = new Driver(3, "Charles Leclerc", GPBrazil_Charles_Leclerc.getPoin(), 2);
        Driver GPAbuDhabi_Carlos_Sainz = new Driver(4, "Carlos Sainz", GPBrazil_Carlos_Sainz.getPoin(), 4);
        Driver GPAbuDhabi_Lewis_Hamilton = new Driver(5, "Lewis Hamilton", GPBrazil_Lewis_Hamilton.getPoin(), 18);
        Driver GPAbuDhabi_George_Russell = new Driver(6, "George Russell", GPBrazil_George_Russell.getPoin(), 5);
        Driver GPAbuDhabi_Lando_Norris = new Driver(7, "Lando Norris", GPBrazil_Lando_Norris.getPoin(), 6);
        Driver GPAbuDhabi_Esteban_Ocon = new Driver(8, "Esteban Ocon", GPBrazil_Esteban_Ocon.getPoin(), 7);
        Driver GPAbuDhabi_Sebastian_Vettel = new Driver(9, "Sebastian Vettel", GPBrazil_Sebastian_Vettel.getPoin(), 10);
        Driver GPAbuDhabi_Fernando_Alonso = new Driver(10, "Fernando Alonso", GPBrazil_Sebastian_Vettel.getPoin(), 0);
        Driver GPAbuDhabi_Yuki_Tsunoda = new Driver(11, "Yuki Tsunoda", GPBrazil_Yuki_Tsunoda.getPoin(), 11);
        Driver GPAbuDhabi_Mick_Schumacher = new Driver(12, "Mick Schumacher", GPBrazil_Mick_Schumacher.getPoin(), 16);
        Driver GPAbuDhabi_Daniel_Ricciardo = new Driver(13, "Daniel Ricciardo", GPBrazil_Daniel_Ricciardo.getPoin(), 8);
        Driver GPAbuDhabi_Lance_Stroll = new Driver(14, "Lance Stroll", GPBrazil_Lance_Stroll.getPoin(), 8);
        Driver GPAbuDhabi_Zhou_Guanyu = new Driver(15, "Zhou Guanyu", GPBrazil_Zhou_Guanyu.getPoin(), 12);
        Driver GPAbuDhabi_Kevin_Magnussen = new Driver(16, "Kevin Magnussen", GPBrazil_Kevin_Magnussen.getPoin(), 17);
        Driver GPAbuDhabi_Pierre_Gasly = new Driver(17, "Pierre Gasly", GPBrazil_Pierre_Gasly.getPoin(), 14);
        Driver GPAbuDhabi_Valtteri_Bottas = new Driver(18, "Valtteri Bottas", GPBrazil_Valtteri_Bottas.getPoin(), 15);
        Driver GPAbuDhabi_Alexander_Albon = new Driver(19, "Alexander Albon", GPBrazil_Alexander_Albon.getPoin(), 13);
        Driver GPAbuDhabi_Nicholas_Latifi = new Driver(20, "Nicholas Latifi", GPBrazil_Nicholas_Latifi.getPoin(), 19);

        GPAbuDhabi_Lando_Norris.BonusFastestLaps();
        GPAbuDhabi.add(GPAbuDhabi_Max_Verstappen);
        GPAbuDhabi.add(GPAbuDhabi_Sergio_Perez);
        GPAbuDhabi.add(GPAbuDhabi_Charles_Leclerc);
        GPAbuDhabi.add(GPAbuDhabi_Carlos_Sainz);
        GPAbuDhabi.add(GPAbuDhabi_Lewis_Hamilton);
        GPAbuDhabi.add(GPAbuDhabi_George_Russell);
        GPAbuDhabi.add(GPAbuDhabi_Lando_Norris);
        GPAbuDhabi.add(GPAbuDhabi_Esteban_Ocon);
        GPAbuDhabi.add(GPAbuDhabi_Sebastian_Vettel);
        GPAbuDhabi.add(GPAbuDhabi_Fernando_Alonso);
        GPAbuDhabi.add(GPAbuDhabi_Yuki_Tsunoda);
        GPAbuDhabi.add(GPAbuDhabi_Mick_Schumacher);
        GPAbuDhabi.add(GPAbuDhabi_Daniel_Ricciardo);
        GPAbuDhabi.add(GPAbuDhabi_Lance_Stroll);
        GPAbuDhabi.add(GPAbuDhabi_Zhou_Guanyu);
        GPAbuDhabi.add(GPAbuDhabi_Kevin_Magnussen);
        GPAbuDhabi.add(GPAbuDhabi_Pierre_Gasly);
        GPAbuDhabi.add(GPAbuDhabi_Valtteri_Bottas);
        GPAbuDhabi.add(GPAbuDhabi_Alexander_Albon);
        GPAbuDhabi.add(GPAbuDhabi_Nicholas_Latifi);

        System.out.println("\n");
        int menu = -1;
        while (menu != 0) {
            System.out.println("=====================================================");
            System.out.println("|            GRAND PRIX FORMULA 1 2022              |");
            System.out.println("=====================================================");
            System.out.printf("| %-50s|\n", "1. Grand Prix Race");
            System.out.printf("| %-50s|\n", "2. Grand Prix 2022 Race Result");
            System.out.printf("| %-50s|\n", "0. Exit");
            System.out.println("=====================================================");
            System.out.print("Pilih Menu : ");
            menu = input.nextInt();
            input.nextLine();

            switch (menu) {
                case 1:
                    int menuGP = -1;
                    while (menuGP != 0) {
                        System.out.println("=====================================================");
                        System.out.println("|            GRAND PRIX FORMULA 1 2022              |");
                        System.out.println("=====================================================");
                        System.out.printf("| %-50s|\n", "1. Bahrain Grand Prix");
                        System.out.printf("| %-50s|\n", "2. Saudi Arabia Grand Prix");
                        System.out.printf("| %-50s|\n", "3. Australia Grand Prix");
                        System.out.printf("| %-50s|\n", "4. Emilia Romagna Grand Prix");
                        System.out.printf("| %-50s|\n", "5. Miami Grand Prix");
                        System.out.printf("| %-50s|\n", "6. Spain Grand Prix");
                        System.out.printf("| %-50s|\n", "7. Monaco Grand Prix");
                        System.out.printf("| %-50s|\n", "8. Azerbaijan Grand Prix");
                        System.out.printf("| %-50s|\n", "9. Canada Grand Prix");
                        System.out.printf("| %-50s|\n", "10. Great Britain Grand Prix");
                        System.out.printf("| %-50s|\n", "11. Austria Grand Prix");
                        System.out.printf("| %-50s|\n", "12. France Grand Prix");
                        System.out.printf("| %-50s|\n", "13. Hungary Grand Prix");
                        System.out.printf("| %-50s|\n", "14. Belgium Grand Prix");
                        System.out.printf("| %-50s|\n", "15. Netherlands Grand Prix");
                        System.out.printf("| %-50s|\n", "16. Italy Grand Prix");
                        System.out.printf("| %-50s|\n", "17. Singapore Grand Prix");
                        System.out.printf("| %-50s|\n", "18. Japan Grand Prix");
                        System.out.printf("| %-50s|\n", "19. United States Grand Prix");
                        System.out.printf("| %-50s|\n", "20. Mexico Grand Prix");
                        System.out.printf("| %-50s|\n", "21. Brasil Grand Prix");
                        System.out.printf("| %-50s|\n", "22. Abu Dhabi Grand Prix");
                        System.out.printf("| %-50s|\n", "0. Back");
                        System.out.println("=====================================================");
                        System.out.print("Pilih Menu : ");
                        menuGP = input.nextInt();
                        input.nextLine();

                        switch (menuGP) {
                            case 1:
                                System.out.println("=====================================================");
                                System.out.println("|           Bahrain Grand Prix F1 2022              |");
                                System.out.println("=====================================================");
                                System.out.println(" Date : " + GPBahrain.tanggal);
                                GPBahrain.insertionSortAscFinish();
                                GPBahrain.Result();
                                break;
                            case 2:
                                System.out.println("=====================================================");
                                System.out.println("|         Saudi Arabia Grand Prix F1 2022           |");
                                System.out.println("=====================================================");
                                System.out.println(" Date : " + GPArabSaudi.tanggal);
                                GPArabSaudi.insertionSortAscFinish();
                                GPArabSaudi.Result();
                                break;
                            case 3:
                                System.out.println("=====================================================");
                                System.out.println("|          Australia  Grand Prix F1 2022             |");
                                System.out.println("=====================================================");
                                System.out.println(" Date : " + GPAustralia.tanggal);
                                GPAustralia.insertionSortAscFinish();
                                GPAustralia.Result();
                                break;
                            case 4:
                                System.out.println("=====================================================");
                                System.out.println("|        Emilia Romagna Grand Prix F1 2022          |");
                                System.out.println("=====================================================");
                                System.out.println(" Date : " + GPEmiliaRomagna.tanggal);
                                GPEmiliaRomagna.insertionSortAscFinish();
                                GPEmiliaRomagna.Result();
                                break;
                            case 5:
                                System.out.println("=====================================================");
                                System.out.println("|             Miami Grand Prix F1 2022              |");
                                System.out.println("=====================================================");
                                System.out.println(" Date : " + GPMiami.tanggal);
                                GPMiami.insertionSortAscFinish();
                                GPMiami.Result();
                                break;

                            case 6:
                                System.out.println("=====================================================");
                                System.out.println("|             Spain Grand Prix F1 2022              |");
                                System.out.println("=====================================================");
                                System.out.println(" Date : " + GPSpain.tanggal);
                                GPSpain.insertionSortAscFinish();
                                GPSpain.Result();
                                break;
                            case 7:
                                System.out.println("=====================================================");
                                System.out.println("|           Monaco Grand Prix F1 2022               |");
                                System.out.println("=====================================================");
                                System.out.println(" Date : " + GPMonaco.tanggal);
                                GPMonaco.insertionSortAscFinish();
                                GPMonaco.Result();
                                break;
                            case 8:
                                System.out.println("=====================================================");
                                System.out.println("|        Azerbaijan Grand Prix F1 2022              |");
                                System.out.println("=====================================================");
                                System.out.println(" Date : " + GPAzerbaijan.tanggal);
                                GPAzerbaijan.insertionSortAscFinish();
                                GPAzerbaijan.Result();
                                break;
                            case 9:
                                System.out.println("=====================================================");
                                System.out.println("|         Canada Grand Prix F1 2022                 |");
                                System.out.println("=====================================================");
                                System.out.println(" Date : " + GPCanada.tanggal);
                                GPCanada.insertionSortAscFinish();
                                GPCanada.Result();
                                break;
                            case 10:
                                System.out.println("=====================================================");
                                System.out.println("|        Great Britain Grand Prix F1 2022           |");
                                System.out.println("=====================================================");
                                System.out.println(" Date : " + GPGreatBritanian.tanggal);
                                GPGreatBritanian.insertionSortAscFinish();
                                GPGreatBritanian.Result();
                                break;
                            case 11:
                                System.out.println("=====================================================");
                                System.out.println("|         Austria Grand Prix F1 2022                |");
                                System.out.println("=====================================================");
                                System.out.println(" Date : " + GPAustria.tanggal);
                                GPAustria.insertionSortAscFinish();
                                GPAustria.Result();
                                break;
                            case 12:
                                System.out.println("=====================================================");
                                System.out.println("|         France Grand Prix F1 2022                 |");
                                System.out.println("=====================================================");
                                System.out.println(" Date : " + GPFrance.tanggal);
                                GPFrance.insertionSortAscFinish();
                                GPFrance.Result();
                                break;
                            case 13:
                                System.out.println("=====================================================");
                                System.out.println("|         Hungary Grand Prix F1 2022                |");
                                System.out.println("=====================================================");
                                System.out.println(" Date : " + GPHungary.tanggal);
                                GPHungary.insertionSortAscFinish();
                                GPHungary.Result();
                                break;
                            case 14:
                                System.out.println("=====================================================");
                                System.out.println("|         Belgium Grand Prix F1 2022                |");
                                System.out.println("=====================================================");
                                System.out.println(" Date : " + GPBelgium.tanggal);
                                GPBelgium.insertionSortAscFinish();
                                GPBelgium.Result();
                                break;
                            case 15:
                                System.out.println("=====================================================");
                                System.out.println("|       Netherlands Grand Prix F1 2022              |");
                                System.out.println("=====================================================");
                                System.out.println(" Date : " + GPNetherlands.tanggal);
                                GPNetherlands.insertionSortAscFinish();
                                GPNetherlands.Result();
                                break;
                            case 16:
                                System.out.println("=====================================================");
                                System.out.println("|         Italy Grand Prix F1 2022                  |");
                                System.out.println("=====================================================");
                                System.out.println(" Date : " + GPItaly.tanggal);
                                GPItaly.insertionSortAscFinish();
                                GPItaly.Result();
                                break;
                            case 17:
                                System.out.println("=====================================================");
                                System.out.println("|      Singapore Grand Prix F1 2022                 |");
                                System.out.println("=====================================================");
                                System.out.println(" Date : " + GPSingapore.tanggal);
                                GPSingapore.insertionSortAscFinish();
                                GPSingapore.Result();
                                break;
                            case 18:
                                System.out.println("=====================================================");
                                System.out.println("|         Japan Grand Prix F1 2022                  |");
                                System.out.println("=====================================================");
                                System.out.println(" Date : " + GPJapan.tanggal);
                                GPJapan.insertionSortAscFinish();
                                GPJapan.Result();
                                break;
                            case 19:
                                System.out.println("=====================================================");
                                System.out.println("|      United States Grand Prix F1 2022             |");
                                System.out.println("=====================================================");
                                System.out.println(" Date : " + GPUnitedStates.tanggal);
                                GPUnitedStates.insertionSortAscFinish();
                                GPUnitedStates.Result();
                                break;
                            case 20:
                                System.out.println("=====================================================");
                                System.out.println("|         Mexico Grand Prix F1 2022                 |");
                                System.out.println("=====================================================");
                                System.out.println(" Date : " + GPMexico.tanggal);
                                GPMexico.insertionSortAscFinish();
                                GPMexico.Result();
                                break;
                            case 21:
                                System.out.println("=====================================================");
                                System.out.println("|        Brazil Grand Prix F1 2022                  |");
                                System.out.println("=====================================================");
                                System.out.println(" Date : " + GPBrazil.tanggal);
                                GPBrazil.insertionSortAscFinish();
                                GPBrazil.Result();
                                break;
                            case 22:
                                System.out.println("=====================================================");
                                System.out.println("|        Abu Dhabi Grand Prix F1 2022               |");
                                System.out.println("=====================================================");
                                System.out.println(" Date : " + GPAbuDhabi.tanggal);
                                GPAbuDhabi.insertionSortAscFinish();
                                GPAbuDhabi.Result();
                                break;

                            default:
                                System.out.println("Piihan tidak Valid");
                                break;
                        }
                    }

                    break;

                case 2:
                
                System.out.println("=====================================================");
                System.out.println("|         Final Result Grand Prix F1 2022           |");
                System.out.println("=====================================================");
                System.out.printf("| %-3s | %-37s | %-3s |\n", "NO", "DRIVER", "PTS");
                System.out.println("-----------------------------------------------------");
                GPAbuDhabi.insertionSortDescPTS();
                GPAbuDhabi.ResultFinal();

                


                    break;

                default:
                    break;
            }
        }
        input.close();
    }
}


// int Max_Verstapen = Klasemen.SumAllPts(GPBahrain_Max_Verstappen,GPArabSaudi_Max_Verstappen,GPAustralia_Max_Verstappen,GPEmiliaRomagna_Max_Verstappen,GPMiami_Max_Verstappen,GPSpain_Max_Verstappen,GPMonaco_Max_Verstappen,GPAzerbaijan_Max_Verstappen,GPCanada_Max_Verstappen,GPGreatBritanian_Max_Verstappen,GPAustria_Max_Verstappen,GPFrance_Max_Verstappen,GPHungary_Max_Verstappen,GPBelgium_Max_Verstappen,GPNetherlands_Max_Verstappen,GPItaly_Max_Verstappen,GPSingapore_Max_Verstappen,GPJapan_Max_Verstappen,GPUnitedStates_Max_Verstappen,GPMexico_Max_Verstappen,GPBrazil_Max_Verstappen,GPAbuDhabi_Max_Verstappen);

                // int Sergio_Perez = Klasemen.SumAllPts(GPBahrain_Sergio_Perez,GPArabSaudi_Sergio_Perez,GPAustralia_Sergio_Perez,GPEmiliaRomagna_Sergio_Perez,GPMiami_Sergio_Perez,GPSpain_Sergio_Perez,GPMonaco_Sergio_Perez,GPAzerbaijan_Sergio_Perez,GPCanada_Sergio_Perez,GPGreatBritanian_Sergio_Perez,GPAustria_Sergio_Perez,GPFrance_Sergio_Perez,GPHungary_Sergio_Perez,GPBelgium_Sergio_Perez,GPNetherlands_Sergio_Perez,GPItaly_Sergio_Perez,GPSingapore_Sergio_Perez,GPJapan_Sergio_Perez,GPUnitedStates_Sergio_Perez,GPMexico_Sergio_Perez,GPBrazil_Sergio_Perez,GPAbuDhabi_Sergio_Perez);

                // int Charles_Leclerc = Klasemen.SumAllPts(GPBahrain_Charles_Leclerc,GPArabSaudi_Charles_Leclerc,GPAustralia_Charles_Leclerc,GPEmiliaRomagna_Charles_Leclerc,GPMiami_Charles_Leclerc,GPSpain_Charles_Leclerc,GPMonaco_Charles_Leclerc,GPAzerbaijan_Charles_Leclerc,GPCanada_Charles_Leclerc,GPGreatBritanian_Charles_Leclerc,GPAustria_Charles_Leclerc,GPFrance_Charles_Leclerc,GPHungary_Charles_Leclerc,GPBelgium_Charles_Leclerc,GPNetherlands_Charles_Leclerc,GPItaly_Charles_Leclerc,GPSingapore_Charles_Leclerc,GPJapan_Charles_Leclerc,GPUnitedStates_Charles_Leclerc,GPMexico_Charles_Leclerc,GPBrazil_Charles_Leclerc,GPAbuDhabi_Charles_Leclerc);
                
                // int Carlos_Sainz = Klasemen.SumAllPts(GPBahrain_ Nico Hülkenberg,GPArabSaudi_Carlos_Sainz,GPAustralia_Carlos_Sainz,GPEmiliaRomagna_Carlos_Sainz,GPMiami_Carlos_Sainz,GPSpain_Carlos_Sainz,GPMonaco_Carlos_Sainz,GPAzerbaijan_Carlos_Sainz,GPCanada_Carlos_Sainz,GPGreatBritanian_Carlos_Sainz,GPAustria_Carlos_Sainz,GPFrance_Carlos_Sainz,GPHungary_Carlos_Sainz,GPBelgium_Carlos_Sainz,GPNetherlands_Carlos_Sainz,GPItaly_Carlos_Sainz,GPSingapore_Carlos_Sainz,GPJapan_Carlos_Sainz,GPUnitedStates_Carlos_Sainz,GPMexico_Carlos_Sainz,GPBrazil_Carlos_Sainz,GPAbuDhabi_Carlos_Sainz);
                
                // int Lewis_Hamilton = Klasemen.SumAllPts(GPBahrain_Lewis_Hamilton,GPArabSaudi_Lewis_Hamilton,GPAustralia_Lewis_Hamilton,GPEmiliaRomagna_Lewis_Hamilton,GPMiami_Lewis_Hamilton,GPSpain_Lewis_Hamilton,GPMonaco_Lewis_Hamilton,GPAzerbaijan_Lewis_Hamilton,GPCanada_Lewis_Hamilton,GPGreatBritanian_Lewis_Hamilton,GPAustria_Lewis_Hamilton,GPFrance_Lewis_Hamilton,GPHungary_Lewis_Hamilton,GPBelgium_Lewis_Hamilton,GPNetherlands_Lewis_Hamilton,GPItaly_Lewis_Hamilton,GPSingapore_Lewis_Hamilton,GPJapan_Lewis_Hamilton,GPUnitedStates_Lewis_Hamilton,GPMexico_Lewis_Hamilton,GPBrazil_Lewis_Hamilton,GPAbuDhabi_Lewis_Hamilton);

                // int George_Russell= Klasemen.SumAllPts(GPBahrain_George_Russell,GPArabSaudi_George_Russell,GPAustralia_George_Russell,GPEmiliaRomagna_George_Russell,GPMiami_George_Russell,GPSpain_George_Russell,GPMonaco_George_Russell,GPAzerbaijan_George_Russell,GPCanada_George_Russell,GPGreatBritanian_George_Russell,GPAustria_George_Russell,GPFrance_George_Russell,GPHungary_George_Russell,GPBelgium_George_Russell,GPNetherlands_George_Russell,GPItaly_George_Russell,GPSingapore_George_Russell,GPJapan_George_Russell,GPUnitedStates_George_Russell,GPMexico_George_Russell,GPBrazil_George_Russell,GPAbuDhabi_George_Russell);

                // int Lando_Norris = Klasemen.SumAllPts(GPBahrain_Lando_Norris,GPArabSaudi_Lando_Norris,GPAustralia_Lando_Norris,GPEmiliaRomagna_Lando_Norris,GPMiami_Lando_Norris,GPSpain_Lando_Norris,GPMonaco_Lando_Norris,GPAzerbaijan_Lando_Norris,GPCanada_Lando_Norris,GPGreatBritanian_Lando_Norris,GPAustria_Lando_Norris,GPFrance_Lando_Norris,GPHungary_Lando_Norris,GPBelgium_Lando_Norris,GPNetherlands_Lando_Norris,GPItaly_Lando_Norris,GPSingapore_Lando_Norris,GPJapan_Lando_Norris,GPUnitedStates_Lando_Norris,GPMexico_Lando_Norris,GPBrazil_Lando_Norris,GPAbuDhabi_Lando_Norris);

                // int Esteban_Ocon = Klasemen.SumAllPts(GPBahrain_Esteban_Ocon,GPArabSaudi_Esteban_Ocon,GPAustralia_Esteban_Ocon,GPEmiliaRomagna_Esteban_Ocon,GPMiami_Esteban_Ocon,GPSpain_Esteban_Ocon,GPMonaco_Esteban_Ocon,GPAzerbaijan_Esteban_Ocon,GPCanada_Esteban_Ocon,GPGreatBritanian_Esteban_Ocon,GPAustria_Esteban_Ocon,GPFrance_Esteban_Ocon,GPHungary_Esteban_Ocon,GPBelgium_Esteban_Ocon,GPNetherlands_Esteban_Ocon,GPItaly_Esteban_Ocon,GPSingapore_Esteban_Ocon,GPJapan_Esteban_Ocon,GPUnitedStates_Esteban_Ocon,GPMexico_Esteban_Ocon,GPBrazil_Esteban_Ocon,GPAbuDhabi_Esteban_Ocon);

                // int Sebastian_Vettel = Klasemen.SumAllPts(null,null,GPAustralia_Sebastian_Vettel,GPEmiliaRomagna_Sebastian_Vettel,GPMiami_Sebastian_Vettel,GPSpain_Sebastian_Vettel,GPMonaco_Sebastian_Vettel,GPAzerbaijan_Sebastian_Vettel,GPCanada_Sebastian_Vettel,GPGreatBritanian_Sebastian_Vettel,GPAustria_Sebastian_Vettel,GPFrance_Sebastian_Vettel,GPHungary_Sebastian_Vettel,GPBelgium_Sebastian_Vettel,GPNetherlands_Sebastian_Vettel,GPItaly_Sebastian_Vettel,GPSingapore_Sebastian_Vettel,GPJapan_Sebastian_Vettel,GPUnitedStates_Sebastian_Vettel,GPMexico_Sebastian_Vettel,GPBrazil_Sebastian_Vettel,GPAbuDhabi_Sebastian_Vettel);

                // System.out.println(Sebastian_Vettel);