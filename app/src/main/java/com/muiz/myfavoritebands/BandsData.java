package com.muiz.myfavoritebands;

import java.util.ArrayList;

public class BandsData {
    private static String[] bandNames = {
            "Adele",
            "Aerosmith",
            "Arctic Monkeys",
            "Coldplay",
            "Dewa 19",
            "Habib Syech",
            "Jamrud",
            "Keane",
            "Muse",
            "Sheila On 7"
    };

    private static String[] bandDetails = {
            "Adele Laurie Blue Adkins MBE, lahir 5 Mei 1988; umur 31 tahun adalah seorang penyanyi dan penulis lagu berkebangsaan Inggris. Lulus dari BRIT School pada tahun 2006, Adele pertama kali mendapatkan kontrak rekaman oleh XL Recordings setelah seorang teman mengunggah demo lagunya di MySpace pada tahun yang sama. Pada tahun 2007, ia menerima penghargaan Critics' Choice di Brit Awards dan memenangkan poling BBC Sound of 2008. Album debutnya, 19, yang dirilis pada tahun 2008 berhasil meraih kesuksesan baik secara komersial maupun kritikal. Album ini menerima sertifikasi tujuh kali platinum di Britania Raya dan platinum ganda di Amerika Serikat. Kemunculannya dalam program Saturday Night Live pada penghujung tahun 2008 semakin mendorong kariernya di Amerika Serikat. Pada Penghargaan Tahunan Grammy ke-51 pada tahun 2009, Adele menerima penghargaan untuk kategori Pendatang Baru Terbaik dan Penampilan Vokal Pop Wanita Terbaik.",
            "Aerosmith adalah kelompok musik rock terkenal dari Amerika Serikat. Walaupun mereka dibentuk di Boston, Massachusetts, tidak ada anggotanya yang berasal dari sana. Tiga anggotanya, Steven Tallarico (Tyler), Joe Perry, dan Tom Hamilton bertemu di Sunapee, New Hampshire di akhir 1960-an namun belum membentuk sebuah band. Tyler berasal dari Yonkers, New York, Perry dari Hopedale, Massachusetts, dan Hamilton dari New London, New Hampshire. Pada 1970, ketiganya memutuskan untuk membentuk band, dan pindah ke Boston, Massachusetts.",
            "Arctic Monkeys merupakan grup musik rock asal Inggris, band ini juga dikenal dengan nama The Death Ramps. Dibentuk tahun 2002 di High Green, distrik Sheffield, Inggris. Arctic Monkeys beranggotakan Alex Turner (vokal utama, gitar utama, keyboard), Jamie Cook (rhythm gitar), Nick O'Malley (bass, backing vokal), Matt Helders (drum, perkusi, backing vokal). Anggota band sebelumnya Andy Nicholson (bass) dan Glyn Jones (vokal utama).",
            "Coldplay adalah grup musik rock yang dibentuk di London, Britania Raya, pada tahun 1996. Grup musik ini terdiri dari Chris Martin sebagai vokalis utama, Jonny Buckland sebagai gitaris utama, Guy Berryman sebagai bassis, dan Will Champion sebagai drummer. Gaya rock alternatif Coldplay telah dibandingkan dengan Radiohead dan Oasis. Chris Martin pernah memprokalamasikan musik band ini sebagai \"limestone rock\" dibandingkan dengan \"hard rock\". Dalam Viva la Vida or Death And All His Friends, gaya grup ini bergerak ke arah art rock, dan bereksperimen dengan berbagai instrumen berbeda termasuk orkestra, piano honky-tonk dan lainnya.",
            "Dewa 19 adalah sebuah grup musik yang dibentuk pada tahun 1986 di Surabaya, Indonesia. Grup ini telah beberapa kali mengalami pergantian personel dan formasi terakhirnya sebelum dibubarkan pada tahun 2011 adalah Ahmad Dhani (kibor), Andra Junaidi (gitar), Once Mekel (vokal utama), Yuke Sampurna (bass) dan Agung Yudha (drum). Setelah merajai panggung-panggung festival di akhir era 1980-an, Dewa 19 kemudian hijrah ke Jakarta dan merilis album pertamanya pada tahun 1992 di bawah label Team Records.",
            "Habib Syech Abdul Qodir Assegaf (lahir di Kota Surakarta, 20 September 1961; umur 58 tahun)merupakan putra Habib Abdul qadir bin Abdurrahman Assegaf, seorang tokoh alim yg pernah berguru terhadap sejumlah habaib di Kota Surakarta yaitu Al Habib Anis bin Alwi al-Habsyi beliau juga adik kandung dari imam Masjid Jami' Assegaf di Kecamatan Pasar Kliwon Kota Surakarta yaitu Al Habib Muhammad Jamal bin Abdul Qodir bin Abdurrahman Assegaf. Beliau merupakan penyanyi sholawat religius bersama grup Ahbaabul Musthofa.",
            "Jamrud adalah band cadas yang berasal dari Indonesia, pertama kali terbentuk pada tahun 1984 di Cimahi, Jawa Barat dengan nama Jamrock. Jamrud sejak terbentuknya dibentuk oleh Azis Mangasi Siagian (gitar), Ricky Teddy (bass) dan Krisyanto (Vokal) serta dikenal sebagai grup musik yang sukses mengusung musik cadas sebagai musik populer di Indonesia pada tahun 1990-an.",
            "Keane adalah band piano-rock dan alternative rock dari Inggris yang dibentuk pada tahun 1997. Mereka berasal dari Battle, East Sussex. Thomas Oliver Chaplin atau dikenal sebagai Tom Chaplin merupakan seorang vokalis utama dan pernah memainkan gitar dihadapan publik seperti pada saat konser War Child ketika mengiringi Lily Allen menyanyikan lagu Everybody's Changing. Timothy James Rice-Oxley atau Tim merupakan seorang komposer utama di dalam perjalanan band ini dan ia merupakan seorang kibordis. Richard Davis Hughes atau Rich adalah seorang drummer yang lahir pada 8 September 1975. Jesse Quin merupakan anggota tambahan untuk Keane, resmi diperkenalkan kepada para penggemar Keane pada saat tour album Night Train. ",
            "Muse adalah grup musik rock alternatif asal Inggris. Band ini dibentuk di Devon pada tahun 1994 dengan anggota terdiri dari Matthew Bellamy (vokal, gitar, piano, keytar), Christopher Wolstenholme (bass, backing vokal, keyboard, gitar), dan Dominic Howard (drum, perkusi). Muse memiliki genre musik yang memadukan rock, rock progresif, musik klasik, dan elektronika. Muse juga dikenal dengan konser live yang memukau, bercirikan permainan yang energik dan efek visual yang mengagumkan.",
            "Sheila on 7 adalah salah satu grup musik populer Indonesia dengan personel Duta (Akhdiyat Duta Modjo, vokal), Eross (Eross Candra, gitar), Adam (Adam Muhammad Subarkah, bass), serta Brian (Brian Kresna Putro, drum). Grup yang berdiri di Yogyakarta, 6 Mei 1996 itu, awalnya bernama Sheila Gank yang diambil dari kata Sheila dari bahasa Celtic yang berarti musikal. Nama ini pun kemudian diubah menjadi On Seven, yang berarti tujuh tangga nada dalam musik."
    };

    private static int[] bandImages = {
            R.drawable.adele,
            R.drawable.aerosmith,
            R.drawable.arctic_monkeys,
            R.drawable.coldplay,
            R.drawable.dewa19,
            R.drawable.habib_syech,
            R.drawable.jamrud,
            R.drawable.keane,
            R.drawable.muse,
            R.drawable.sheila
    };

    private static String[] bandGenres = {
            "Pop, Soul, R&B, Blue-eyed",
            "Hard rock, Blues rock, Rock and roll, Glam Metal, Heavy metal",
            "Indie rock, Garage rock, Post-punk revival, Rock psychedelic",
            "Rock alternative, Pop rock, Post-Britpop, Musik pop",
            "Music rok, Pop rock",
            "Sholawat, Religi",
            "Heavy metal, Hard rock, Thrash metal, Groove Metal, Nu Metal",
            "Piano Rock, Alternative Rock, Pop Rock, Post-Britpop",
            "Rock alternative, Progressive rock, Art rock, Hard rock, Space rock, Electrical",
            "Pop, Pop Rock, Rock Alternative"
    };

    static ArrayList<Band> getListData(){
        ArrayList<Band> list = new ArrayList<>();
        for (int position = 0; position < bandNames.length; position++){
            Band band = new Band();
            band.setGenre(bandGenres[position]);
            band.setName(bandNames[position]);
            band.setDetail(bandDetails[position]);
            band.setPhoto(bandImages[position]);
            list.add(band);
        }
        return list;
    };
}
